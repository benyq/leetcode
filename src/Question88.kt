import java.util.*

/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/1/4
 * description:
 * 第三天
 * 088
 * https://leetcode.com/problems/merge-sorted-array/description/
 * 整体思路就是从后往前插入，这样避免了从前往后插入时，数组下标的改变
 */
fun main(args: Array<String>) {
    var nums1 = arrayOf(0)
    var nums2 = arrayOf(1)
    mergeSorted(nums1, 1, nums2, 0)
    mergeSorted2(nums1, 1, nums2, 0)
    mergeSorted3(nums1, 0, nums2, 1)
}


fun mergeSorted(nums1: Array<Int>, m: Int, nums2: Array<Int>, n: Int) {
    var indexM = m - 1
    var indexN = n - 1
    var current = m + n - 1

    while (indexM >= 0 || indexN >= 0) {
        if (indexN < 0) {
            break
        }
        if (indexM >= 0 && nums1[indexM] > nums2[indexN]) {
            nums1[current--] = nums1[indexM--]
        }else {
            nums1[current--] = nums2[indexN--]
        }
    }
    println(Arrays.toString(nums1))
}

//m = 1, n = 0
fun mergeSorted2(nums1: Array<Int>, m: Int, nums2: Array<Int>, n: Int) {
    var i = m - 1
    var j = n - 1
    var k = m + n - 1
    while (i >= 0 && j >= 0) {
        nums1[k--] = if (nums1[i] >= nums2[j]) nums1[i--] else nums2[j--]
    }
    while (j >= 0) {
        nums1[k--] = nums2[j--]
    }
    println(Arrays.toString(nums1))
}



//m = 1, n = 0
fun mergeSorted3(nums1: Array<Int>, m: Int, nums2: Array<Int>, n: Int) {
    var current = m + n - 1
    var indexM = m
    var indexN = n

    while (current >= 0) {
        // 没必要继续了
        if (indexN == 0) break

        // 为了方便大家理解，这里代码有点赘余
        if (indexM < 1) {
            nums1[current--] = nums2[--indexN]
            continue
        }

        if (indexN < 1) {
            nums1[current--] = nums1[--indexM]
            continue
        }
        // 取大的填充 nums1的末尾
        // 然后更新 m 或者 n
        if (nums1[indexM - 1] > nums2[indexN - 1]) {
            nums1[current--] = nums1[--indexM]
        } else {
            nums1[current--] = nums2[--indexN]
        }
    }
    println(Arrays.toString(nums1))
}
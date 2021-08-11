/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2021/08/11
 * description:
 * 2021/08/11
 * 题目 349
 * https://leetcode-cn.com/problems/intersection-of-two-arrays/
 *
 */

fun main() {
    println(intersection(intArrayOf(1,2,2,1), intArrayOf(2,2)).contentToString())
    println(intersection(intArrayOf(4,9,5), intArrayOf(9,4,9,8,4)).contentToString())
}

//时间复杂度 O(n), 空间复杂度 O(n)
fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
    val set = mutableSetOf<Int>()
    val result = mutableSetOf<Int>()

    nums1.forEach {
        set.add(it)
    }

    nums2.forEach {
        if (set.contains(it)) {
            result.add(it)
        }
    }
    return result.toIntArray()
}




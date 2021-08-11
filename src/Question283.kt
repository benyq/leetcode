/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2021/08/11
 * description:
 * 2021/08/11
 * 题目 283
 * https://leetcode-cn.com/problems/move-zeroes/
 * 双指针
 */





fun main() {
    val array = intArrayOf(0,1,0,3,12)
    moveZeroes(array)
    println(array.contentToString())
}

//错误写法，没考虑连续是0的情况
fun moveZeroes_error(nums: IntArray): Unit {
    var start = 0
    var end = nums.size - 1

    while (start < end) {
        if (nums[start] == 0) {
            for (i in start until end) {
                nums[i] = nums[i+1]
            }
            nums[end] = 0
            end--
        }
        start++
    }
}

fun moveZeroes(nums: IntArray): Unit {
    var index = 0
    for (i in nums.indices) {
        if (nums[i] != 0) {
            val temp = nums[index]
            nums[index] = nums[i]
            nums[i] = temp
            index++
        }
    }
}
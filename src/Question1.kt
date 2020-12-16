/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/07/01
 * description:
 * 2020/12/14
 * 题目 1
 * https://leetcode-cn.com/problems/two-sum/
 */

fun main() {
    println(twoSum(intArrayOf(2, 11, 7, 15), 9).contentToString())
}

private fun twoSum(nums: IntArray, target: Int): IntArray {
    if (nums.size == 2) {
        return intArrayOf(0, 1)
    }
    val map = mutableMapOf<Int, Int>()
    nums.forEachIndexed { index, it ->
        val value = target - it
        if (map[value] == null) {
            map[it] = index
        } else {
            return intArrayOf(map[value]!!, index)
        }
    }
    return intArrayOf(0, 1)
}

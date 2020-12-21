import java.util.*

/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/1/2
 * description:
 * 2020/12/16
 * 题目 27
 * https://leetcode-cn.com/problems/remove-element/
 */

fun main() {
    println(removeElement(intArrayOf(3,2,2,3), 3))
    println(removeElement(intArrayOf(0,1,2,2,3,0,4,2), 2))
}

private fun removeElement(nums: IntArray, `val`: Int): Int {
    var pos = 0
    nums.forEach {
        if (it != `val`) {
            nums[pos++] = it
        }
    }
    println(nums.contentToString())
    return pos
}
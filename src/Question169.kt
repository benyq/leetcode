/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/06/08
 * description:
 * 2020/06/10
 * 题目 169
 * https://leetcode-cn.com/problems/majority-element/
 * 这个题目的话,一种是用HashMap存放；另一种是摩尔投票算法
 */

fun main() {
    print(majorityElement(intArrayOf(10,9,9,9,10)))
}

/**
 * 摩尔投票算法
 * 思想是不相同的数字抵消，这样留下来的就是超过半数的那个数字，但前提是一定存在
 */
fun majorityElement(nums: IntArray): Int {
    var count = 1
    var major = nums[0]
    for (i in 1 until nums.size){
        if (count == 0){
            major = nums[i]
        }
        if (major == nums[i]){
            count++
        }else {
            count--
        }
    }
    return major
}
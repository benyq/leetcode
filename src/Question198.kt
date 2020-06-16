import kotlin.math.max

/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/06/13
 * description:
 * 2020/06/13
 * 题目 198
 * https://leetcode-cn.com/problems/house-robber/description/
 * 动态规划思想
 */


fun main() {
    println(rob(intArrayOf(2,7,9,3,1)))
    println(rob2(intArrayOf(2,1,1,2)))
}

fun rob(nums: IntArray): Int {
    val dp = arrayListOf<Int>()
    dp.add(0)
    dp.add(0)
    for (i in 2 until nums.size + 2){
        dp.add(max(dp[i - 1], dp[i - 2] + nums[i - 2]))
        println("$i    ${dp[i]}")
    }
    return dp[nums.size + 1]
}

fun rob2(nums: IntArray): Int {
    if (nums.isEmpty()){
        return 0
    }
    if (nums.size == 1){
        return nums[0]
    }
    if (nums.size == 2){
        return max(nums[0], nums[1])
    }
    val dp = IntArray(nums.size)
    dp[0] = nums[0]
    dp[1] = max(nums[0], nums[1])
    for (i in 2 until nums.size){
        dp[i] = max(dp[i - 1], dp[i - 2] + nums[i])
        println("$i    ${dp[i]}")
    }
    return dp[nums.size - 1]
}
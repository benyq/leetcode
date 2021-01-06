/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/1/2
 * description:
 * 2020/05/24
 * 题目 122
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
 */

fun main() {
    println(maxProfit(intArrayOf(7,1,5,3,6,4)))
}

private fun maxProfit(prices: IntArray): Int {
    if (prices.size <= 1) {
        return 0
    }
    var total = 0
    for (index in 1 until prices.size) {
        if (prices[index] > prices[index - 1]) {
            total += (prices[index] - prices[index - 1])
        }
    }
    return total
}
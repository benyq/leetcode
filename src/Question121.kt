/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/1/10
 * description:
 * 0121
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 * 求波峰浪谷的差值的最大值。
 *
 */

fun main(args: Array<String>) {

}

//在遍历过程中，缓存最大值；如果小于最小值，则从当前位置重新计算，与缓存的最大值比较，算出最大值
fun maxProfit(prices: Array<Int>): Int{
    if (prices.isEmpty()) {
        return 0
    }
    var min = prices[0]
    var profit = 0
    for (i in 1 until prices.size) {
        if (prices[i] > prices[i - 1]) {
            profit = maxOf(profit, prices[i] - min)
        }else {
            min = minOf(min, prices[i])
        }
    }
    return profit
}
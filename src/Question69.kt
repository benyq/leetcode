/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/12/17
 * description:
 * 2020/12/25
 * 题目 69
 * https://leetcode-cn.com/problems/sqrtx/
 */
fun main() {
    println(mySqrt(21))
}

private fun mySqrt(x: Int): Int {
    if (x == 1) {
        return x
    }
    var min = 0
    var max = x
    while (max - min > 1) {
        val m = (max + min) / 2
        if (x < m * m) {
            max = m
        }else {
            min = m
        }
    }
    return min
}
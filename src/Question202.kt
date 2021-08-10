import java.lang.Math.pow
import java.math.BigDecimal
import kotlin.math.pow
import kotlin.math.sqrt

/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/06/13
 * description:
 * 2021/01/20
 * 题目 202
 * https://leetcode-cn.com/problems/happy-number/
 */

fun main() {
    print(isHappy(22))
}

private fun isHappy(n: Int): Boolean {
    val set = mutableSetOf<Int>()
    var result = n
    while (!set.contains(result)) {
        set.add(result)

        result = getSum(result)
        println(result)
        if (result == 1) {
            return true
        }
    }
    return false
}

private fun getSum(n: Int):Int {
    var sum = 0
    var param = n
    while(param > 0) {
        val s = param % 10
        param /= 10
        sum += s * s
    }
    return sum
}
/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2021/08/10
 * description:
 * 2021/08/10
 * 题目 263
 * https://leetcode-cn.com/problems/ugly-number/
 */

fun main() {
    println(isUgly(1))
    println(isUgly(6))
    println(isUgly(8))
    println(isUgly(14))
    println(isUgly(111))
    println(35 % 2)
}

//这个居然没过，离谱
fun isUgly(n: Int): Boolean {
    var result = n
    val params = intArrayOf(2, 3, 5)

    for (param in params) {
        while (result % param == 0) {
            result /= param
        }
    }

    return result == 1
}


fun isUgly2(n: Int): Boolean {
    var num = n
    if (num < 1) return false
    while (num % 5 == 0) {
        num /= 5
    }
    while (num % 3 == 0) {
        num /= 3
    }
    while (num % 2 == 0) {
        num = num shr 1
    }
    return num == 1
}

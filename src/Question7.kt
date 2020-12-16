/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/07/01
 * description:
 * 2020/12/14
 * 题目 7
 * https://leetcode-cn.com/problems/reverse-integer/
 */

fun main() {
    println(reverse(12324332))
    println(reverse2(-12324332))
}

private fun reverse(x: Int): Int {
    var num = x
    val sb = StringBuilder()
    if (x < 0) {
        sb.append("-")
        num = -x
    }
    while (num > 0) {
        sb.append(num % 10)
        num /= 10
    }
    return try {
        sb.toString().toInt()
    } catch (e: Exception) {
        0
    }
}

private fun reverse2(x: Int): Int {
    var num = x
    var n: Long = 0
    while (num != 0) {
        n = n * 10 + num % 10
        num /= 10
    }
    Int.MAX_VALUE

    return if (n.compareTo(n.toInt()) == 0) n.toInt() else 0
}



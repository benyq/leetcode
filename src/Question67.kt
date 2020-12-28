import java.lang.StringBuilder
import kotlin.math.max

/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/12/17
 * description:
 * 2020/12/25
 * 题目 67
 * https://leetcode-cn.com/problems/add-binary/
 */

fun main() {
//    println(addBinary("11", "1"))
//    println(addBinary(a = "1010", b = "1011"))
    println(addBinary(a = "1111", b = "1111"))
}

private fun addBinary(a: String, b: String): String {
    val s = a.reversed().toCharArray()
    val t = b.reversed().toCharArray()

    val result = StringBuilder()

    var index = 0
    var dd = 0
    while (index < max(s.size, t.size)) {
        val tmpS = if (index < s.size) s[index] else '0'
        val tmpB = if (index < t.size) t[index] else '0'
        val tmp = add(tmpS, tmpB) + dd
        if (tmp == 3) {
            result.append("1")
            dd = 1
        }else if (tmp == 2) {
            result.append("0")
            dd = 1
        }else {
            result.append(tmp)
            dd = 0
        }
        index++
    }
    if (dd > 0) {
        result.append(dd)
    }
    return result.reverse().toString()
}

private fun add(s: Char, t: Char) :Int{
    return s.toInt() + t.toInt() - 96
}
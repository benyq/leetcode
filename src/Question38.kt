/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/12/17
 * description:
 * 2020/12/21
 * 题目 38
 * https://leetcode-cn.com/problems/count-and-say/
 */

fun main() {
    println(countAndSay(2))
    println(countAndSay(3))
    println(countAndSay(4))
    println(countAndSay(5))
}

private fun countAndSay(n: Int): String {
    if (n == 1) {
        return "1"
    }
    var time = n
    var result = "1"
    for (i in 2 .. n) {
        result = countAndSay(result)
    }
    return result
}

private fun countAndSay(s: String): String {
    if (s.isEmpty()) {
        return s
    }
    var result = ""
    var num = 1
    var flag : Char = s[0]
    for (i in 1 until s.length) {
        if (flag == s[i]) {
            num++
        }else {
            result += "$num$flag"

            num = 1
            flag = s[i]
        }
    }
    result += "$num$flag"
    return result
}
/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/1/2
 * description:
 * 2020/05/24
 * 题目 125
 * https://leetcode-cn.com/problems/valid-palindrome/
 */

fun main() {
    print(isPalindrome(" "))
}

fun isPalindrome(s: String): Boolean {
    val str = s.toLowerCase()
    var start = 0
    var end = str.length - 1

    while (start < end) {
        if (!isValid(str[start])) {
            start++
            continue
        }
        if (!isValid(str[end])) {
            end--
            continue
        }
        if (str[start++] != str[end--]) {
            return false
        }
    }
    return true
}

fun isValid(c: Char): Boolean {
    return c.isLetterOrDigit()
}
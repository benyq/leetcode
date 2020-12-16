/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/07/01
 * description:
 * 2020/12/15
 * 题目 9
 * https://leetcode-cn.com/problems/palindrome-number/comments/
 */
fun main() {
    println(isPalindrome(11))
    println(isPalindrome(-11))
    println(isPalindrome(123456545))
    println(isPalindrome(1234554321))
}

private fun isPalindrome(x: Int): Boolean {
    if(x < 0) {
        return false
    }
    var num = x
    var y = 0
    while (num > 0) {
        y = y * 10 + num % 10
        num /= 10
    }
    return y == x
}
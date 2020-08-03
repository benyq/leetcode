import java.util.*
import kotlin.math.max

/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/07/20
 * description:
 * 2020/07/20
 * 题目 5
 * https://leetcode-cn.com/problems/longest-palindromic-substring/
 */

fun main() {
//    println(longestPalindrome("babad"))
//    println(longestPalindrome("cbbd"))
    println(longestPalindrome("bb"))
}

/**
 * 动态规划
 *
 *          if (s[i] === s[j] && dp[i + 1][j - 1]) {
                dp[i][j] = true;
            }
 *
 */
fun longestPalindrome(s: String): String {
    if (s.isEmpty()) {
        return ""
    }
    val dp = Array(s.length) {BooleanArray(s.length){false} }
    var res : String = s.substring(0, 0)

    for (i in s.length - 1 downTo 0) {
        for (j in i until s.length) {
            if (i == j) dp[i][j] = true
            else if (j - i == 1 && s[i] == s[j]) dp[i][j] = true
            else if (s[i] == s[j] && dp[i + 1][j - 1]) dp[i][j] = true
            println("$i  $j  ${s.substring(i, j + 1)}  ${dp[i][j]}  $res")
            if (dp[i][j] && j - i + 1 > res.length) {
                res = s.substring(i, j + 1)
            }
        }
    }
    return res
}
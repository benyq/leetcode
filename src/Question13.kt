/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/07/01
 * description:
 * 2020/12/15
 * 题目 13
 * https://leetcode-cn.com/problems/roman-to-integer/comments/
 * 首先建立一个HashMap来映射符号和值，然后对字符串从左到右来，如果当前字符代表的值不小于其右边，就加上该值；否则就减去该值。以此类推到最左边的数，最终得到的结果即是答案
 */

fun main() {
    println(romanToInt("IV"))
    println(romanToInt("III"))
    println(romanToInt("LVIII"))
    println(romanToInt("MCMXCIV"))
}

private fun romanToInt(s: String): Int {
    val map = mapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
    var sum = 0
    for (i in s.indices) {
        if (i == s.length - 1 || map[s[i]]!! >= map[s[i + 1]]!!) {
            sum += map[s[i]] ?: 0
        }else {
            sum -= map[s[i]] ?: 0
        }
    }
    return sum
}
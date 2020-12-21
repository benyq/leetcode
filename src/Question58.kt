/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/12/17
 * description:
 * 2020/12/21
 * 题目 58
 * https://leetcode-cn.com/problems/length-of-last-word/
 * 最后一个单词，"sss aaa " 这个字符串，最后出现的是 "aaa" ~_~
 */

fun main() {
    println(lengthOfLastWord("a"))
    println(lengthOfLastWord(" "))
    println(lengthOfLastWord(" a"))
    println(lengthOfLastWord("a "))
    println(lengthOfLastWord("Hello"))
    println(lengthOfLastWord("1 2"))
    println(lengthOfLastWord("Hello World"))
    println(lengthOfLastWord("Hello World ddd"))
}

private fun lengthOfLastWord(s: String): Int {
    var ns = s.trim()
    if (ns.indexOf(" ") != -1) {
        val startIndex = s.lastIndexOf(" ")
        ns = ns.substring(startIndex + 1)
    }
    return ns.length
}
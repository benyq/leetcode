/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/12/17
 * description:
 * 2020/12/16
 * 题目 28
 * https://leetcode-cn.com/problems/implement-strstr/
 */

fun main() {
    println(strStr("hello", "ll"))
    println(strStr("aaaaa", "bba"))
}

private fun strStr(haystack: String, needle: String): Int {
    val length = needle.length
    var index = 0
    while (index + length <= haystack.length){
        if (needle == haystack.substring(index, index + length)) {
            return index
        }
        index ++
    }
    return -1
}
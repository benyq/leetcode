import kotlin.math.max

/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/07/01
 * description:
 * 2020/07/01
 * 题目 3
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/description/
 */

fun main() {
//    println(lengthOfLongestSubstring("abcabcbb"))
//    println(lengthOfLongestSubstring("bbbbb"))
//    println(lengthOfLongestSubstring("pwwkew"))
//    println(lengthOfLongestSubstring(" "))
//    println(lengthOfLongestSubstring("dvavf"))
//    println(lengthOfLongestSubstring("dvdf"))
    println(lengthOfLongestSubstring("ajgjpa"))
}


//循环
fun lengthOfLongestSubstring(s: String): Int {
    if (s.isEmpty()){
        return 0
    }
    var ans = 0
    var map = mutableSetOf<Char>()
    for (i in s.indices) {
        for (j in i until s.length) {
            val it = s[j]
            if (map.contains(it)){
                ans = max(ans, map.size)
                println(map)
                map.clear()
                break
            }else {
                map.add(it)
            }
        }
    }
    ans = max(ans, map.size)
    return ans
}

//另一种，当往右遇到重复数字时，左边边界往右直到区域中不在含有右边边界的重读数字
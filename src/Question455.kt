/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/06/27
 * description:
 * 2020/06/27
 * 题目 455
 * https://leetcode-cn.com/problems/assign-cookies/
 * 分发饼干
 */


fun main() {
    println(findContentChildren(intArrayOf(1,2, 3), intArrayOf(1,1)))
    println(findContentChildren(intArrayOf(1,2), intArrayOf(1,2, 3)))

}

fun findContentChildren(g: IntArray, s: IntArray): Int {
    g.sort()
    s.sort()
    var gi = 0
    var si = 0

    while (gi < g.size && si < s.size) {
        if (s[si] >= g[gi]){
            gi++
        }
        si++
    }
    return gi
}
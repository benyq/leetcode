/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/06/13
 * description:
 * 2021/01/12
 * 题目 190
 * https://leetcode-cn.com/problems/reverse-bits/comments/
 */
fun main() {
    println(reverseBits(43261596))
}

private fun reverseBits(n: Int): Int {
    var a = 0
    for (i in 0..31) {
        a += (1 and (n shr i) shl 31 - i)
    }
    return a
}
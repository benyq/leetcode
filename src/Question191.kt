/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/06/13
 * description:
 * 2020/06/13
 * 题目 191
 * https://leetcode-cn.com/problems/number-of-1-bits/description/
 * 位运算 n & (n - 1)
 */

fun main() {
    print(hammingWeight(11))
}

fun hammingWeight(n:Int):Int {
    var count = 0
    var num = n
    while (num != 0){
        num = num and (num - 1)
        count++
    }
    return count
}
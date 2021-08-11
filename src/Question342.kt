/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2021/08/11
 * description:
 * 2021/08/11
 * 题目 342
 * https://leetcode-cn.com/problems/power-of-four/
 *
 * 普通方法就是 不停除以 4
 *
 * 进阶方法 二进制
 * 4 : 100
 * 16: 10000
 * 64: 1000000
 */

fun main() {
    println(isPowerOfFour(1111))
    println(isPowerOfFour(64))
}

// 转化为二进制，只会出现 一个 `1` , 且 在 奇数位置上
fun isPowerOfFour(n: Int): Boolean {
    return n > 0 && (n and (n - 1)) == 0 && n and 0x55555555 == n
}


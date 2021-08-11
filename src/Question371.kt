/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2021/08/11
 * description:
 * 2021/08/11
 * 题目 371
 * https://leetcode-cn.com/problems/sum-of-two-integers/
 *
 */


fun main() {
    println(getSum(3, 5))
    println(getSum(6, 8))
}

fun getSum(a: Int, b: Int): Int {
    val sum = a xor b //异或这里可看做是相加但是不显现进位，比如5 ^ 3
    /* 0 1 0 1
       0 0 1 1
     ------------
       0 1 1 0
       上面的如果看成传统的加法，不就是1+1=2，进1得0，但是这里没有显示进位出来，仅是相加，0+1或者是1+0都不用进位*/
    val carry = a and b shl 1  //相与为了让进位显现出来，比如5 & 3
    /* 0 1 0 1
       0 0 1 1
     ------------
       0 0 0 1
       上面的最低位1和1相与得1，而在二进制加法中，这里1+1也应该是要进位的，所以刚好吻合，但是这个进位1应该要再往前一位，所以左移一位*/
    return if (carry != 0) {
        getSum(sum, carry)
    } else sum
}
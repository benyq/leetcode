/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/12/17
 * description:
 * 2020/12/28
 * 题目 70
 * https://leetcode-cn.com/problems/climbing-stairs/
 */

fun main() {
    println(climbStairs(2))
    println(climbStairs(3))
    println(climbStairs(45))
    println(climbStairs2(45))
}


// 递归可以实现，但超时了 (●ˇ∀ˇ●)
private fun climbStairs(n: Int): Int {
    if (n == 1) {
        return 1
    }
    if (n == 2) {
        return 2
    }
    return climbStairs(n - 1) + climbStairs(n - 2)
}

//准备动态规划
private fun climbStairs2(n: Int): Int {
    if (n == 1) {
        return 1
    }
    if (n == 2) {
        return 2
    }
    var i1 = 1
    var i2 = 2
    for (i in 3 .. n) {
        val tmp = i1 + i2
        i1 = i2
        i2 = tmp
    }
    return i2
}


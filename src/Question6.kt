import java.util.*
import kotlin.math.max
import kotlin.math.min

/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/07/20
 * description:
 * 2020/07/20
 * 题目 11
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。

说明：你不能倾斜容器，且 n 的值至少为 2。
 * https://leetcode-cn.com/problems/container-with-most-water/description/
 */

fun main() {
    println(maxArea(intArrayOf(1,8,6,2,5,4,8,3,7)))
    println(maxArea(intArrayOf(1,2)))
}

fun maxArea(height: IntArray): Int {
    var start = 0
    var end = height.size - 1
    var size = 0
    while (start < end) {
        val area = min(height[start], height[end]) * (end - start)
        if (area > size) {
            size = area
        }
        if (height[start] < height[end]) {
            start++
        }else {
            end--
        }
    }
    return size
}
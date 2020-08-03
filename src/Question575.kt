import kotlin.math.max
import kotlin.math.min

/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/07/01
 * description:
 * 2020/07/01
 * 题目 575
 * https://leetcode-cn.com/problems/distribute-candies/description/
 */

fun main() {
    print(distributeCandies(intArrayOf(1,1,3,3,3,3)))
    print(distributeCandies(intArrayOf(1,1,2,3)))
}


/**
 * 如果糖果种类大于n / 2（糖果种类数为n），妹妹最多可以获得的糖果种类应该是n / 2(因为妹妹只有n / 2个糖).
 * 糖果种类数小于n / 2, 妹妹能够得到的糖果种类可以是糖果的种类数（糖果种类本身就这么多）.
 */
fun distributeCandies(candies: IntArray): Int {
    val set: Set<Int> = candies.toSet()
    return min(candies.size / 2, set.size)
}
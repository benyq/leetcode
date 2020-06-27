/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/06/19
 * description:
 * 2020/06/19
 * 题目 219
 * https://leetcode-cn.com/problems/contains-duplicate-ii/description/
 * 存在重复元素 II HashMap存放
 */



fun main() {
    println(containsNearbyDuplicate(intArrayOf(1,2, 3, 1), 3))
    println(containsNearbyDuplicate(intArrayOf(1,0, 1, 1), 1))
    println(containsNearbyDuplicate(intArrayOf(1,2,3,1,2,3), 2))
}


fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    val map = hashMapOf<Int, Int>()
    nums.forEachIndexed { index, i ->
        val j = map[i]
        if (j != null && index - j <= k){
            return true
        }else {
            map[i] = index
        }
    }
    return false
}
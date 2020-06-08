/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/1/2
 * description:
 * 2020/06/08
 * 题目 136
 * https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/description
 * 这个题目的话，头尾指针计算
 */

fun main() {
    twoSum(intArrayOf(2, 7, 11, 15), 9)
}

fun twoSum(numbers: IntArray, target: Int): IntArray {
    var start = 0
    var end = numbers.size - 1

    while (start < end) {
        if (numbers[start] + numbers[end] < target) {
            start++
        }
        if (numbers[start] + numbers[end] > target) {
            end--
        }
        if (numbers[start] + numbers[end] == target) {
            return intArrayOf(start + 1, end + 1)
        }
    }
    return intArrayOf()
}
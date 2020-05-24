/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/1/2
 * description:
 * 第一天
 * 026
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 *
 * 最普通版本（不符合题意）
 * 新建一个数组，将源数组的每一个遍历，不与新数组最后相同，则是不同的数字，加入新数组中，
 */
fun main(args: Array<String>) {
    val nums = arrayOf(1, 1, 2, 3, 3, 4)
    val length = remove_duplicates_from_sorted_array(nums)
    for (i in 0 until length) {
        print(nums[i])
    }
}



fun remove_duplicates_from_sorted_array(array: Array<Int>) : Int{
    if (array.size == 0) {
        return 0
    }

    var con = 0
    array.forEachIndexed { index, i ->
        if (index != 0) {
            if (i != array[index - 1]) {
                array[con] = i
                con += 1
            }
        }else {
            con += 1
        }
    }
    return con
}
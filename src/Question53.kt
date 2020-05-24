/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/1/3
 * description:
 * 第二天
 * 053
 * https://leetcode.com/problems/maximum-subarray/
 */

fun main(args: Array<String>) {
    val nums = arrayOf(-2,1,-3,4,-1,2,1,-5,4)
    println(maximumSubarray1(nums))
    println(maximumSubarray2(nums))
    println(maxSubArray(nums))
}

//暴力循环
fun maximumSubarray1(nums: Array<Int>): Int{
    if (nums.size == 1 && nums[0] > 0) {
        return nums[0]
    }
    var maxSum = Int.MIN_VALUE
    var sum = 0
    for (i in 0 until nums.size) {
        sum = 0
        for (j in i until nums.size) {
            sum += nums[j]
            maxSum = maxOf(maxSum, sum)
        }
    }
    return maxSum
}

//s[j] =  0..j之和，且是最大的数
//s[i] =  0..i之和，且是最小的数， i < j， 则s[j]-s[i]是最大的
fun maximumSubarray2(nums: Array<Int>): Int{
    var minSum = 0
    var maxSum = nums[0]
    var sum = 0

    nums.forEach {
        sum += it
        maxSum = maxOf(maxSum, sum - minSum)
        minSum = minOf(sum, minSum)
    }
    return maxSum
}

//来自leetcode
//当s[i - 1] + nums[i] < nums[i]， 则说明s[i - 1] < 0 , 此时就可以抛弃s[i - 1] , 重新从nums[i] 开始求和
fun maxSubArray(nums: Array<Int>): Int {
    var maxCurrent = nums[0]
    var maxGlobal = nums[0]
    arrayOf(-2,1,-3,4,-1,2,1,-5,4)
    for (i in 1 until nums.count()) {
        maxCurrent = maxOf(nums[i],maxCurrent + nums[i])
        if (maxCurrent > maxGlobal) {
            maxGlobal = maxCurrent
        }
    }
    return maxGlobal
}

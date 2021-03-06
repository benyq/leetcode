/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/1/2
 * description:
 * 2020/05/24
 * 题目 136
 * https://leetcode-cn.com/problems/single-number/submissions/
 * 异或操作
 *
 *
 */
fun main() {
    print(singleNumber(intArrayOf(2, 2, 1)))
}


fun singleNumber(nums: IntArray): Int {
    var res = 0
    nums.forEach {
        res = res xor it
    }
    return res
}
/**
 * 有一个 n 个元素的数组，除了两个数只出现一次外，其余元素都出现两次，让你找出这两个只出现一次的数分别是几，要求时间复杂度为 O(n) 且再开辟的内存空间固定(与 n 无关)。

和上面一样，只是这次不是一个数字，而是两个数字。还是按照上面的思路，我们进行一次全员异或操作， 得到的结果就是那两个只出现一次的不同的数字的异或结果。

我们刚才讲了异或的规律中有一个任何数和本身异或则为0， 因此我们的思路是能不能将这两个不同的数字分成两组 A 和 B。 分组需要满足两个条件.

两个独特的的数字分成不同组

相同的数字分成相同组

这样每一组的数据进行异或即可得到那两个数字。

问题的关键点是我们怎么进行分组呢？

由于异或的性质是，同一位相同则为 0，不同则为 1. 我们将所有数字异或的结果一定不是 0，也就是说至少有一位是 1.

我们随便取一个， 分组的依据就来了， 就是你取的那一位是 0 分成 1 组，那一位是 1 的分成一组。 这样肯定能保证2. 相同的数字分成相同组, 不同的数字会被分成不同组么。 很明显当然可以， 因此我们选择是 1，也就是 说两个独特的的数字在那一位一定是不同的，因此两个独特元素一定会被分成不同组。
 */
/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2021/1/5
 * description:
 * 108
 * https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/
 * 巧妙地利用了队列中的元素是按层排序的性质，每下一层的节点入完队，下一次的 queue.size() 就是下一层的数量
 */


fun main() {
    println(sortedArrayToBST(intArrayOf(-10,-3,0,5,9)))
}

private fun sortedArrayToBST(nums: IntArray): TreeNode? {
    return if (nums.isEmpty()) null else solve(nums, 0, nums.size - 1)
}

private fun solve(nums: IntArray, l :Int, r: Int): TreeNode? {
    if (l > r) {
        return null
    }
    val mid = l + (r - l) / 2
    val node = TreeNode(nums[mid])
    node.left = solve(nums, l, mid - 1)
    node.right = solve(nums, mid + 1, r)
    return node
}
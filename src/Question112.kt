/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2021/1/5
 * description:
 * 112
 * https://leetcode-cn.com/problems/path-sum/
 */

fun main() {

}

private fun hasPathSum(root: TreeNode?, sum: Int): Boolean {
    if (root == null) {
        return false
    }

    if (root.left == null && root.right == null) {
        return sum - root.`val` == 0
    }

    return hasPathSum(root.left, sum - root.`val`) || hasPathSum(root.right, sum - root.`val`)
}
/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2021/1/4
 * description:
 * 100
 * https://leetcode-cn.com/problems/same-tree/
 * 整体思路就是从后往前插入，这样避免了从前往后插入时，数组下标的改变
 */
fun main() {
    println()
}

private fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
    if (p == null && q == null) {
        return true
    }
    if (p == null || q == null) {
        return false
    }
    if (p.`val` == q.`val`) {
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
    }else {
        return false
    }

}

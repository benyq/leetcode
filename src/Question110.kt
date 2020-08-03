import com.sun.org.apache.xpath.internal.operations.Bool

/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/07/28
 * description:
 * 2020/07/28
 * 题目 110
 * https://leetcode-cn.com/problems/balanced-binary-tree/
 * 递归
 */

fun main() {
    val tree1 = TreeNode(3)
    val tree2 = TreeNode(9)
    val tree3 = TreeNode(20)
    val tree4= TreeNode(15)
    val tree5 = TreeNode(7)
    tree1.left = tree2
    tree1.right = tree3

    tree3.left = tree4
    tree3.right = tree5
    println(isBalanced(tree1))
}


fun isBalanced(root: TreeNode?): Boolean {
    return isBST(root).isB
}

fun isBST(root: TreeNode?): ReturnNode {
    if (root == null) {
        return ReturnNode(0, true)
    }
    val left = isBST(root.left)
    val right = isBST(root.right)

    if (!left.isB || !right.isB) {
        return ReturnNode(0, false)
    }

    if (Math.abs(left.depth - right.depth) > 1) {
        return ReturnNode(0, false)
    }

    return ReturnNode(Math.max(left.depth , right.depth) + 1, true)
}


data class ReturnNode(val depth: Int, val isB: Boolean)
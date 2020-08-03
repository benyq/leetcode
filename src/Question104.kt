import sun.reflect.generics.tree.Tree
import java.util.*
import kotlin.math.max

/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/1/6
 * description:
 * 0104
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
 * 二叉树深度
 */

fun main(args: Array<String>) {

}



//主要思想   二叉树层次遍历   迭代
fun maxDepth(root: TreeNode?): Int {
    var deepth = 0
    val queue : Queue<TreeNode> = LinkedList()
    if (root != null) {
        queue.add(root)
    }
    while (true) {
        val size = queue.size
        var treeNode: TreeNode?
        if (size == 0) {
            return deepth
        }
        for (i in 0 until size) {
            treeNode = queue.poll()
            if (treeNode.left != null) {
                queue.add(treeNode.left)
            }
            if (treeNode.right != null) {
                queue.add(treeNode.right)
            }
        }
        deepth++
    }
}

//递归
fun maxDepth2(root: TreeNode?): Int {
    if (root == null) return 0
    return maxOf(maxDepth2(root.left), maxDepth2(root.right)) + 1
}


class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null

    override fun toString(): String {
        return "TreeNode(`val`=$`val`, left=$left, right=$right)"
    }
}
import java.util.*


/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2021/1/4
 * description:
 * 107
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/
 * 巧妙地利用了队列中的元素是按层排序的性质，每下一层的节点入完队，下一次的 queue.size() 就是下一层的数量
 */


fun main() {


}


private fun levelOrderBottom(root: TreeNode?): List<List<Int>> {
    val result = LinkedList<List<Int>>()
    if (root == null) {
        return result
    }
    val queue: Queue<TreeNode> = LinkedList<TreeNode>()

    queue.add(root)

    while (!queue.isEmpty()) {
        val tmp = mutableListOf<Int>()
        val size = queue.size

        for (i in 0 until size) {
            val node = queue.poll()
            tmp.add(node.`val`)
            if (node.left != null) {
                queue.add(node.left)
            }
            if (node.right != null) {
                queue.add(node.right)
            }
        }
        result.addFirst(tmp)
    }
    return result
}


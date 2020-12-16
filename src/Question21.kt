/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/07/01
 * description:
 * 2020/12/16
 * 题目 21
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 */

fun main() {
    val node = mergeTwoLists(createNodeList(1,2,3), createNodeList(1,2,4))
    println(node)
}

private fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    if (l1 == null) return l2
    if (l2 == null) return l1
    val node : ListNode? = if (l1.`val` >= l2.`val`) l2 else l1
    node?.next = mergeTwoLists(node?.next, if (l1.`val` >= l2.`val`) l1 else l2)
    return node
}


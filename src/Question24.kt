import java.util.*

/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/07/28
 * description:
 * 2020/07/28
 * 题目 24
 * https://leetcode-cn.com/problems/swap-nodes-in-pairs/description/
 */

fun main() {
    val node1 = ListNode(1)
    val node2 = ListNode(2)
    val node3 = ListNode(3)
    val node4 = ListNode(4)
    val node5 = ListNode(5)
    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5
//    println(node1)
    println(swapPairs(node1))
}

fun swapPairs(head: ListNode?): ListNode? {
    val dummy = ListNode(0)
    dummy.next = head
    var cur = dummy
    while (cur.next != null && cur.next!!.next != null) {
        val first = cur.next!!
        val second = cur.next!!.next!!

        first.next = second.next
        second.next = first
        cur.next = second

        cur = first

    }
    return dummy.next
}

fun swapPairs2(head: ListNode?): ListNode? {
    //1、递归中止条件
    //2、找返回值
    //3、本级递归应该做什么
    if (head?.next == null) {
        return head
    }
    val next = head.next!!
    head.next = swapPairs2(next.next)
    next.next = head
    return next
}

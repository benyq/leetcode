package geek

import ListNode

/**
 * 极客时间
 * 链表操作作业
 */

fun main() {
    val node1 = ListNode(1)
    val node2 = ListNode(2)
    val node3 = ListNode(6)
    val node4 = ListNode(3)
    val node5 = ListNode(4)
    val node6 = ListNode(5)
    val node7 = ListNode(6)

    node1.next = node2
    node2.next = node3
//    node3.next = node4
//    node4.next = node5

    println(findMiddleNode(node1))
}

// 1 找到链表中间节点
// 快慢节点 这个应该是奇数
fun findMiddleNode(head: ListNode?): ListNode? {
    var fast = head
    var slow = head
    while (fast?.next != null && fast.next?.next != null){
        slow = slow?.next
        fast = fast.next?.next
    }
    return slow
}
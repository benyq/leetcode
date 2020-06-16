/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/06/15
 * description:
 * 2020/06/15
 * 题目 203
 * https://leetcode-cn.com/problems/remove-linked-list-elements/description/
 * 链表操作
 */

fun main() {
    val node1 = ListNode(1)
    val node2 = ListNode(1)
    val node3 = ListNode(6)
    val node4 = ListNode(3)
    val node5 = ListNode(4)
    val node6 = ListNode(5)
    val node7 = ListNode(6)
    node1.next = node2
//    node2.next = node3
//    node3.next = node4
//    node4.next = node5
//    node5.next = node6
//    node6.next = node7
    val node = removeElements(node1, 1)
    println(node)
}

fun removeElements(head: ListNode?, `val`: Int): ListNode? {
    val dummy = ListNode(0)
    dummy.next = head
    //cur 当前节点
    var cur : ListNode? = dummy
    while (cur?.next != null) {
        var next = cur.next
        if (next?.`val` == `val`) {
            cur.next = next.next
            next = next.next
        }
        //防止连续出现指定值
        if (next != null && next.`val` != `val`){
            cur =  next
        }
    }
    return dummy.next
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        return "ListNode(`val`=$`val`, next=$next)"
    }

}

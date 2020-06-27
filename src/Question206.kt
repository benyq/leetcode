/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/06/16
 * description:
 * 2020/06/16
 * 题目 206
 * https://leetcode-cn.com/problems/reverse-linked-list/description/
 * 反转链表
 */


fun main() {

}

/**
 * 逆向思维会简单一些
 */
fun reverseList(head: ListNode?): ListNode? {
    if (head?.next == null) {
        return head
    }
    var pre: ListNode? = null
    var cur: ListNode? = head
    while (cur != null) {
        val next = cur.next
        cur.next = pre
        pre = cur
        cur = next
    }
    return cur
}



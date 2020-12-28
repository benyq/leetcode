/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/12/17
 * description:
 * 2020/12/28
 * 题目 83
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 */


fun main() {
    println(deleteDuplicates(null))
    println(deleteDuplicates(createNodeList(1,1,2)))
    println(deleteDuplicates(createNodeList(1,1,2,3,3)))
    println(deleteDuplicates(createNodeList(1,1,2,2,2,2,2,3,3,3,3,4,10)))
}

private fun deleteDuplicates(head: ListNode?): ListNode? {
    var cur : ListNode? = head
    while (cur?.next != null) {
        val next = cur.next
        // 数值不一样，则可以移动当前节点到`next`
        if (next?.`val` != cur.`val`) {
            cur = next
        }else {
            // 数值一样，则移除 `next`节点
            cur.next = next.next
        }
    }
    return head
}
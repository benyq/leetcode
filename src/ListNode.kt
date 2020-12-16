
class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        return "ListNode(`val`=$`val`, next=$next)"
    }

}

fun createNodeList(vararg nums: Int) : ListNode?{
    if (nums.isEmpty()) {
        return null
    }
    val head = ListNode(nums[0])
    var cur : ListNode ? = head
    if (nums.size == 1) {
        return head
    }

    for (i in 1 until nums.size) {
        val node = ListNode(nums[i])
        cur?.next = node
        cur = cur?.next
    }
    return head
}
import java.util.*

/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2021/08/10
 * description:
 * 2021/08/10
 * 题目 232
 * https://leetcode-cn.com/problems/implement-queue-using-stacks/
 */

fun main() {
    val myQueue = MyQueue()
    myQueue.push(1)
    myQueue.push(2)

    println(myQueue.pop())

    myQueue.push(3)
    myQueue.push(4)

    while (!myQueue.empty()) {
        println(myQueue.pop())
    }
}


private class MyQueue() {

    val pushStack = Stack<Int>()
    val popStack = Stack<Int>()

    fun push(x: Int) {
        while (popStack.isNotEmpty()) {
            pushStack.push(popStack.pop())
        }
        pushStack.push(x)
    }

    fun pop(): Int {
        while (pushStack.isNotEmpty()) {
            popStack.push(pushStack.pop())
        }
        return popStack.pop()
    }

    fun peek(): Int {
        while (pushStack.isNotEmpty()) {
            popStack.push(pushStack.pop())
        }
        return popStack.peek()
    }

    fun empty(): Boolean {
        return popStack.isEmpty() && pushStack.isEmpty()
    }

}
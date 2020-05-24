import com.sun.org.apache.xpath.internal.operations.Bool
import java.util.*

/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/1/2
 * description:
 * 第一天
 * 题目 020
 * https://leetcode.com/problems/valid-parentheses/description
 */

fun main(args: Array<String>) {
    println(isValid("{({[]})}"))
    println(isValid("{({[])}"))
    println(isValid("{"))
    println(isValid("}"))
}

fun isValid(s: String) : Boolean{
    val stack =  Stack<Char>()
    val map = mapOf('[' to ']', '(' to ')', '{' to '}')
    s.forEach {
        if (it == '[' || it == '(' || it == '{') {
            stack.push(it)
        }else {
            if (stack.isEmpty()) {
                return false
            }
            val peek = stack.pop()
            if (peek == null || it != map[peek]) {
                return false
            }
        }
    }
    if (stack.size > 0) {
        return false
    }
    return true
}
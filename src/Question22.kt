import java.util.*

/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/07/28
 * description:
 * 2020/07/28
 * 题目 22
 * https://leetcode-cn.com/problems/generate-parentheses/
 */
fun main() {
    println(generateParenthesis(2))
}


fun generateParenthesis(n: Int): List<String> {
    val list = mutableListOf<String>()
    dfs(n, n, "", list)
    return list
}

private fun dfs(left: Int, right: Int, out: String, res: MutableList<String>) {
    if (left < 0 || right < 0 || left > right) return
    if (left == 0 && right == 0) {
        res.add(out)
        return
    }
    dfs(left - 1, right, "$out(", res)
    dfs(left, right - 1, "$out)", res)
}
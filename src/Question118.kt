/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2021/1/6
 * description:
 * 118
 * https://leetcode-cn.com/problems/pascals-triangle/
 */
fun main() {
    println(generate(5))
    println(generate(2))
}

private fun generate(numRows: Int): List<List<Int>> {
    if (numRows <= 0) {
        return emptyList()
    }
    val result: MutableList<List<Int>> = mutableListOf()
    for (i in 0 until numRows) {
        if (result.isEmpty()) {
            result.add(listOf(1))
            continue
        }
        val cache = result[i - 1]
        val tmp = MutableList(i + 1){0}
        tmp[0] = 1
        tmp[i] = 1
        for (j in 1 until i) {
            tmp[j] = cache[j - 1] + cache[j]
        }
        result.add(tmp)
    }
    return result
}
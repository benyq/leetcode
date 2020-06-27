import java.util.*

/**
 * @author benyq
 * @emil 1520063035@qq.com
 * create at 2020/06/19
 * description:
 * 2020/06/19
 * 题目 219
 * https://leetcode-cn.com/problems/invert-binary-tree/description/
 * 反转二叉树
 */


fun main() {
    test()
}


//递归
fun invertTree(root: TreeNode?): TreeNode? {
    if (root == null){
        return root
    }

    val left = root.left
    val right = root.right
    root.left = invertTree(right)
    root.right = invertTree(left)
    return root
}

fun test(){
    val tmpDeviceId = "IFECJ124Y9M1PC21AAPDICV8J7Q0CAPCBBM6P0CEF4QEI5PCSBVCD4L8I6BABFT1".toLowerCase()
    var deviceId = ""
    for (i in tmpDeviceId.indices){
        if (i % 2 == 1){
            deviceId += tmpDeviceId[i]
        }
    }
    print(deviceId)
}



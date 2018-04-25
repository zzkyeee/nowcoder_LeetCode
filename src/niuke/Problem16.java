package niuke;

/**
 * @Description:
 * 题目名称：same-tree
 * 题目描述：Given two binary trees, write a function to check if they are equal or not.
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 * @author: zhangzhikai
 * @date: 2018/4/25 下午1:31
 * @version: V1.0.0
 * @since: JDK 1.8
 */
public class Problem16 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) { return true; }
        if (p == null || q == null) { return false; }
        if (p.val != q.val) { return false; }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

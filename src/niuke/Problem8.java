package niuke;


/**
 * 题目名称：maximum-depth-of-binary-tree
 * 题目描述：Given a binary tree, find its maximum depth.
 The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class Problem8 {

    public int maxDepth(TreeNode root) {
        if (root == null) { return 0; }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return Math.max(l, r) + 1;
    }

    public static void main(String[] args) {
        Problem8 problem8 = new Problem8();
        TreeNode root = new TreeNode(0);

        System.out.println(problem8.maxDepth(root));
    }
}

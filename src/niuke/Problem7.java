package niuke;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Description: LeetCode算法题
 * @author: zhangzhikai
 * @date: 2018/4/22 下午3:42
 * @version: V1.0.0
 * @since: JDK 1.8
 */
/**
 * 题目名称：binary-tree-preorder-traversal
 * 题目描述：Given a binary tree, return the preorder traversal of its nodes' values.
 For example:
 Given binary tree{1,#,2,3},
 1
 \
 2
 /
 3

 return[1,2,3].
 Note: Recursive solution is trivial, could you do it iteratively?
 */

public class Problem7 {
    public ArrayList<Integer> preorderTraversal(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root, r = null;
        while (!stack.isEmpty() || cur != null) {
            while (cur != null) {
                stack.push(cur);
                list.add(cur.val);
                cur = cur.left;
            }
            cur = stack.peek();

            if (cur.right != null && cur.right != r) {
                cur = cur.right;
            } else {
                r = stack.pop();
                cur = null;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Problem7 problem7 = new Problem7();
        TreeNode root = new TreeNode(0);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        root.left = node1;
        root.right = node2;
        List list = problem7.preorderTraversal(root);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

package niuke;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 题目名称：binary-tree-postorder-traversal
 * 题目描述：Given a binary tree, return the postorder traversal of its nodes' values.
 For example:
 Given binary tree{1,#,2,3},
 1
 \
 2
 /
 3

 return[3,2,1].
 Note: Recursive solution is trivial, could you do it iteratively?
 */


public class Problem6 {
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        //stack.push(root);
        TreeNode cur = root, r = null;
        while (!stack.isEmpty() || cur != null) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();

            if (cur.right != null && cur.right != r) {
                cur = cur.right;
            } else {
                r = stack.pop();
                list.add(r.val);
                cur = null;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Problem6 problem6 = new Problem6();
        TreeNode root = new TreeNode(0);
//        TreeNode node1 = new TreeNode(1);
//        TreeNode node2 = new TreeNode(2);
//        root.left = node1;
//        root.right = node2;
        List list = problem6.postorderTraversal(root);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

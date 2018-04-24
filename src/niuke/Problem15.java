package niuke;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * 题目名称：sum-root-to-leaf-numbers
 * 题目描述：Given a binary tree containing digits from0-9only, each root-to-leaf path could represent a number.
 * An example is the root-to-leaf path1->2->3which represents the number123.
 * Find the total sum of all root-to-leaf numbers.
 * For example,
 *   1
 *  / \
 * 2   3
 * The root-to-leaf path1->2represents the number12.
 * The root-to-leaf path1->3represents the number13.
 * Return the sum = 12 + 13 =25.
 *
 * @author: zhangzhikai
 * @date: 2018/4/24 上午10:23
 * @version: V1.0.0
 * @since: JDK 1.8
 */

public class Problem15 {
    public int sumNumbers(TreeNode root) {
        if (root == null) { return 0; }
        int sum = traversal(root, 0);
        return sum;
    }

    public int traversal(TreeNode node, int sum) {
        if (node == null) { return 0; }
        sum = sum * 10 + node.val;
        if (node.left == null && node.right == null){
            return sum;
        }
        int l = traversal(node.left, sum);
        int r = traversal(node.right, sum);
        return l + r;
    }

    @Deprecated
//    public List<String> traversal(TreeNode node) {
//        List<String> list = new ArrayList<>();
//        if (node == null) { return null; }
//        if (node.left == null && node.right == null) {
//            list.add(String.valueOf(node.val));
//            return list;
//        }
//        if (node.left != null) {
//            List<String> l = traversal(node.left);
//            for (String i : l) {
//                list.add(String.valueOf(node.val) + i);
//            }
//        }
//        if (node.right != null) {
//            List<String> r = traversal(node.right);
//            for (String i : r) {
//                list.add(String.valueOf(node.val) + i);
//            }
//        }
//        return list;
//    }

    public static void main(String[] args) {
        Problem15 problem15 = new Problem15();
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        System.out.println(problem15.sumNumbers(root));
    }
}

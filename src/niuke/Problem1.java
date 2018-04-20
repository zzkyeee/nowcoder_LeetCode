package niuke;

import javax.swing.tree.TreeNode;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/**
 * 题目名称：minimum-depth-of-binary-tree
 * 题目描述：Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along the shortest path
 * from the root node down to the nearest leaf node.
 */

class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;
    TreeNode1(int x) { val = x; }

}

public class Problem1 {
    int x = 0;
    int min = 999;
    public int run(TreeNode1 root) {
        if(root == null) return 0;
        x++;
        int cur = x;
        if(root.left != null){
            run(root.left);
        }
        if(root.right != null){
            x = cur;
            run(root.right);
        }
        if(root.left == null && root.right == null)
            min = Math.min(x,min);
        return min;
    }


    public int run1(TreeNode1 root){
        if(root == null) return 0;
        int l = run1(root.left);
        int r = run1(root.right);
        if(l == 0 || r == 0){
            return l+r+1;
        }
        return Math.min(l,r)+1;
    }
    public static void main(String[] args){
        TreeNode1 root = new TreeNode1(0);
//        TreeNode1 node1 = new TreeNode1(1);
//        TreeNode1 node2 = new TreeNode1(2);
//        root.left = node1;
//        node1.right = node2;
//        root.left = node1;

//        TreeNode1 node3 = new TreeNode1(3);
//        root.left = node1;
//        root.right = node2;
//        node1.left = node3;
        Problem1 problem1 = new Problem1();
        System.out.println(problem1.run(root));
        System.out.println(problem1.run1(root));
    }

}


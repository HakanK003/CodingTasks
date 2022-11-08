package fromLeetCode.problems_Java.medium;

import java.util.LinkedList;
import java.util.Queue;

public class AddOneRowToTree_623 {

    public TreeNode addOneRow(TreeNode root, int val, int depth) {

        if (depth==1){
            return new TreeNode(val, root, null);
        }
        if (depth==2 && root.right!=null) {
            return new TreeNode(root.val,null, new TreeNode(val, null, root));
        }

        return new TreeNode(val,addOneRow(root.left, val, depth-1),addOneRow(root.right, val, depth-1));



//        TreeNode rightTreeNode= root;
//        TreeNode leftTreeNode= root;
//
//        for (int i = 0; i < depth - 1; i++) {
//
//            rightTreeNode=rightTreeNode.right;
//            leftTreeNode=leftTreeNode.left;
//
//        }



    }

    //Runtime: 1 ms, faster than 88.29% of Java online submissions for Add One Row to Tree.
    //Memory Usage: 44.6 MB, less than 82.68% of Java online submissions for Add One Row to Tree.
    public TreeNode addOneRow2(TreeNode root, int v, int d) {

        if (d == 1) {
            TreeNode newRoot = new TreeNode(v);
            newRoot.left = root;
            return newRoot;
        } else {
            dfs(root, v, d);
            return root;
        }

    }

    public void dfs(TreeNode root, int v, int d) {

        if (root == null) {
            return;
        }

        if (d == 2) {

            TreeNode newLeft = new TreeNode(v);
            TreeNode newRight = new TreeNode(v);
            newLeft.left = root.left;
            newRight.right = root.right;
            root.left = newLeft;
            root.right = newRight;

        } else {
            dfs(root.left, v, d - 1);
            dfs(root.right, v, d - 1);
        }
    }



    public TreeNode addOneRow3(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }
        int currDepth = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (currDepth < depth - 1) {
            Queue<TreeNode> temp = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode removed = queue.remove();
                if (removed.left != null) {
                    temp.add(removed.left);
                }
                if (removed.right != null) {
                    temp.add(removed.right);
                }
            }
            queue = temp;
            currDepth++;
        }
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            TreeNode temp = node.left;
            node.left = new TreeNode(val);
            node.left.left = temp;
            temp = node.right;
            node.right = new TreeNode(val);
            node.right.right = temp;
        }
        return root;
    }

}



class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

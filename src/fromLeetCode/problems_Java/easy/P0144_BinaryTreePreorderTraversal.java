package fromLeetCode.problems_Java.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
    Related Topics
    -> Stack
    -> Binary Tree
    -> Depth-First Search
    -> Tree

    Problem
    -> https://leetcode.com/problems/binary-tree-preorder-traversal/

        Given the root of a binary tree, return the preorder traversal of its nodes' values.


    Examples
    -> Example 1
            Input: root = [1,null,2,3]
            Output: [1,2,3]
    -> Example 2
            Input: root = []
            Output: []
    -> Example 3
            Input: root = [1]
            Output: [1]

    Constraints
    -> The number of nodes in the tree is in the range [0, 100].
    -> -100 <= Node.val <= 100

    Notes
     * Follow up: Recursive solution is trivial, could you do it iteratively?
 */


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


/**
 * Approach 1 ->
 *
 *
 *
 * Time Complexity ->
 *
 *
 * Space Complexity ->
 *
 *
 * Result
 *   Runtime 0 ms Beats 100% | Memory 40.7 MB Beats 62.3%
 */


class Solution0144_1_Recursion {
    public List<Integer> preorderTraversal(TreeNode root) {

        ArrayList<Integer> result = new ArrayList<>();
        visitPreorder(root, result);
        return result;
    }

    private void visitPreorder (TreeNode root, ArrayList<Integer> visited){
        if (root == null) return;
        else visited.add(root.val);
        if (root.left  != null) visitPreorder(root.left, visited);
        if (root.right != null) visitPreorder(root.right, visited);
    }
}


/**
 * Approach 1 ->
 *
 *
 *
 * Time Complexity ->
 *
 *
 * Space Complexity ->
 *
 *
 * Result
 *   Runtime 1 ms Beats 37.79% | Memory 40.9 MB Beats 58.30%
 */
class Solution0144_2_Stack_Iterative {
    public List<Integer> preorderTraversal(TreeNode root) {

        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> nodes = new Stack<>();
        nodes.add(root);
        while(!nodes.isEmpty()){
            TreeNode current = nodes.pop();
            if (current == null) continue;
            else result.add(current.val);
            if (current.right != null) nodes.push(current.right);
            if (current.left  != null) nodes.add(current.left);
        }

        return result;
    }
}
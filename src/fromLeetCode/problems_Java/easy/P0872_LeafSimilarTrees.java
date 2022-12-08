package fromLeetCode.problems_Java.easy;

import java.util.Stack;

/*
    Related Topics
    -> Tree
    -> Depth-First Search
    -> Binary Tree

    Problem
    -> https://leetcode.com/problems/leaf-similar-trees/

        Consider all the leaves of a binary tree, from left to right order,
        the values of those leaves form a leaf value sequence.
        For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).
        Two binary trees are considered leaf-similar if their leaf value sequence is the same.
        Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.

    Examples
    -> Example 1
            Input: root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
            Output: true
    -> Example 2
            Input: root1 = [1,2,3], root2 = [1,3,2]
            Output: false

    Constraints
    -> The number of nodes in each tree will be in the range [1, 200]
    -> Both of the given trees will have values in the range [0, 200]
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
 * Time Complexity ->
 *
 *
 * Space Complexity ->
 *
 *
 * Result
 *   Runtime 1 ms Beats 77.82% | Memory 39.9 MB Beats 94.20%
 *
 * Reference
 *   https://leetcode.com/problems/leaf-similar-trees/solutions/152329/c-java-python-o-h-space/?orderBy=most_votes
 */
class Solution0876_1_DFS {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Stack<TreeNode> s1 = new Stack<>(), s2 = new Stack<>();
        s1.push(root1); s2.push(root2);
        while (!s1.empty() && !s2.empty())
            if (dfs(s1) != dfs(s2)) return false;
        return s1.empty() && s2.empty();
    }

    public int dfs(Stack<TreeNode> s) {
        while (true) {
            TreeNode node = s.pop();
            if (node.right != null) s.push(node.right);
            if (node.left != null) s.push(node.left);
            if (node.left == null && node.right == null) return node.val;
        }
    }
}
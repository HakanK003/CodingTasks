package fromLeetCode.problems_Java.easy;

import java.util.Stack;

/*
    Related Topics
    -> Tree
    -> Depth-First Search
    -> Binary Search Tree
    -> Binary Tree

    Problem
    -> https://leetcode.com/problems/range-sum-of-bst/

        Given the root node of a binary search tree and two integers low and high,
        return the sum of values of all nodes with a value in the inclusive range [low, high].

    Examples
    -> Example 1
            Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
            Output: 32
            Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.
    -> Example 2
            Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
            Output: 23
            Explanation: Nodes 6, 7, and 10 are in the range [6, 10]. 6 + 7 + 10 = 23.

    Constraints
    -> The number of nodes in the tree is in the range [1, 2 * 10^4].
    -> 1 <= Node.val <= 10^5
    -> 1 <= low <= high <= 10^5
    -> All Node.val are unique.
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
 * Approach 1 -> Iterative
 *
 *
 * Time Complexity -> O(n), n = number of nodes
 *
 *
 * Space Complexity -> O(h), h = height of tree
 *
 *
 * Result
 *   Runtime 14 ms Beats 9.17% | Memory 67.6 MB Beats 20.67%
 *
 * Reference
 *   https://leetcode.com/problems/range-sum-of-bst/solutions/192019/java-python-3-3-similar-recursive-and-1-iterative-methods-w-comment-analysis/?orderBy=most_votes
 */
class Solution0938_1_TraverseDFS {
    public int rangeSumBST(TreeNode root, int low, int high) {

        Stack<TreeNode> stk = new Stack<>();
        stk.push(root);
        int sum = 0;
        while (!stk.isEmpty()) {
            TreeNode n = stk.pop();
            if (n == null)  continue;
            if (n.val > low)  stk.push(n.left);  // left child is a possible candidate.
            if (n.val < high)  stk.push(n.right); // right child is a possible candidate.
            if (low <= n.val && n.val <= high)  sum += n.val;
        }
        return sum;
    }
}


/**
 * Approach 2 -> Recursion
 *
 *
 * Time Complexity -> O(n), n = number of nodes
 *
 *
 * Space Complexity -> O(h), h = height of tree
 *
 *
 * Result
 *   Runtime 0 ms Beats 100% | Memory 65.1 MB Beats 72.7%
 *
 * Reference
 *   https://leetcode.com/problems/range-sum-of-bst/solutions/192019/java-python-3-3-similar-recursive-and-1-iterative-methods-w-comment-analysis/?orderBy=most_votes
 */
class Solution0938_2_RecursionDFS {
    public int rangeSumBST(TreeNode root, int low, int high) {

        if (root == null) return 0; // base case.
        if (root.val < low) return rangeSumBST(root.right, low, high); // left branch excluded.
        if (root.val > high) return rangeSumBST(root.left, low, high); // right branch excluded.
        return root.val + rangeSumBST(root.right, low, high) + rangeSumBST(root.left, low, high); // count in both children.

    }
}

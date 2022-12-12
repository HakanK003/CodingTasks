package fromLeetCode.problems_Java.hard;

/*
    Related Topics
    -> Dynamic Programming
    -> Tree
    -> Depth-First Search
    -> Binary Tree

    Problem
    -> https://leetcode.com/problems/binary-tree-maximum-path-sum/

        A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them.
        A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.
        The path sum of a path is the sum of the node's values in the path.
        Given the root of a binary tree, return the maximum path sum of any non-empty path.

    Examples
    -> Example 1
            Input: root = [1,2,3]
            Output: 6
            Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.
    -> Example 2
            Input: root = [-10,9,20,null,null,15,7]
            Output: 42
            Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.

    Constraints
    -> The number of nodes in the tree is in the range [1, 3 * 10^4].
    -> -1000 <= Node.val <= 1000
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}



/**
 * Approach 1 ->
 *
 *
 * Time Complexity ->
 *
 * Space Complexity ->
 *
 * Result
 *   Runtime 1 ms Beats 99.64% | Memory 47.9 MB Beats 35.85%
 *
 * Reference
 *   https://leetcode.com/problems/binary-tree-maximum-path-sum/solutions/39875/elegant-java-solution/
 */
class Solution0124_1 {
//    public int maxPathSum(TreeNode root) {
//
//    }
//
//    public int dfs (TreeNode root, int sum){
//        if (root == null) return sum;
//        sum = root.left.val + root.val + root.right.val;
//
//    }
}

class Solution0124_1_2 {
    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }

    // helper returns the max branch
    // plus current node's value
    int helper(TreeNode root) {
        if (root == null) return 0;

        int left = Math.max(helper(root.left), 0);
        int right = Math.max(helper(root.right), 0);

        max = Math.max(max, root.val + left + right);

        return root.val + Math.max(left, right);
    }
}
//        public int maxAncestorDiff(TreeNode root) {
//            return dfs(root, root.val, root.val);
//        }
//
//        public int dfs(TreeNode root, int mn, int mx) {
//            if (root == null) return mx - mn;
//            mx = Math.max(mx, root.val);
//            mn = Math.min(mn, root.val);
//            return Math.max(dfs(root.left, mn, mx), dfs(root.right, mn, mx));
//        }
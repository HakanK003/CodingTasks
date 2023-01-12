package fromLeetCode.problems_Java.easy;

/*
    Related Topics
    -> Binary Tree
    -> Depth-First Search
    -> Breath-First Search
    -> Tree

    Problem
    -> https://leetcode.com/problems/same-tree/

        Given the roots of two binary trees p and q, write a function to check if they are the same or not.
        Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.


    Examples
    -> Example 1
            Input: p = [1,2,3], q = [1,2,3]
            Output: true
    -> Example 2
            Input: p = [1,2], q = [1,null,2]
            Output: false
    -> Example 3
            Input: p = [1,2,1], q = [1,1,2]
            Output: false

    Constraints
    -> The number of nodes in both trees is in the range [0, 100].
    -> -10^4 <= Node.val <= 10^4
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


import java.util.Stack;

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
class Solution0100_1 {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        Stack<TreeNode> nodes = new Stack<>();

        nodes.push(p); nodes.push(q);

        while(!nodes.isEmpty()){

            TreeNode currentNode1 = nodes.pop() ,currentNode2 = nodes.pop();

            if(currentNode1 == null && currentNode2 == null) continue;
            else if ((currentNode1 != null && currentNode2 != null) && (currentNode1.val == currentNode2.val)) {

                if (currentNode1.left != null && currentNode2.left != null){
                    nodes.push(currentNode1.left);
                    nodes.push(currentNode2.left);
                }else if (currentNode1.left == null && currentNode2.left == null){
                    continue;
                }else{
                    return false;
                }

                if (currentNode1.right != null && currentNode2.right != null){
                    nodes.push(currentNode1.right);
                    nodes.push(currentNode2.right);
                }else if (currentNode1.right == null && currentNode2.right == null){
                    continue;
                }else{
                    return false;
                }


            } else return false;
        }

        return true;
    }
}

//https://leetcode.com/problems/same-tree/solutions/32687/five-line-java-solution-with-recursion/?orderBy=most_votes
class Solution0100_2_Recursion {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val == q.val)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        return false;

    }
}
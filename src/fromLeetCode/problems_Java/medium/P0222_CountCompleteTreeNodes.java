package fromLeetCode.problems_Java.medium;

/*
    Related Topics
    -> Binary Search
    -> Tree
    -> Depth-First Search
    -> Binary Tree

    Problem
    -> https://leetcode.com/problems/count-complete-tree-nodes/

        Given the root of a complete binary tree, return the number of the nodes in the tree.
        According to Wikipedia, every level, except possibly the last, is completely filled in a complete binary tree,
        and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.

        Design an algorithm that runs in less than O(n) time complexity.

    Examples
    -> Example 1
            Input: root = [1,2,3,4,5,6]
            Output: 6
    -> Example 2
            Input: root = []
            Output: 0
    -> Example 1
            Input: root = [1]
            Output: 1

    Constraints
    -> The number of nodes in the tree is in the range [0, 5 * 104].
    -> 0 <= Node.val <= 5 * 104
    -> The tree is guaranteed to be complete.
 */

//// * Definition for a binary tree node*
//class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode() {}
//     TreeNode(int val) { this.val = val; }
//     TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }
// }

/**
 * Approach 1 -> Binary Search
 *
 *    Check reference
 *
 * Time Complexity -> O(log(n)^2)
 *
 * Space Complexity -> O(1)
 *
 * Result
 *   Runtime: 0 ms, faster than 100.00% of Java online submissions for Count Complete Tree Nodes.
 *   Memory Usage: 50.5 MB, less than 11.61% of Java online submissions for Count Complete Tree Nodes.
 *
 * Reference
 *   https://leetcode.com/problems/count-complete-tree-nodes/discuss/61958/Concise-Java-solutions-O(log(n)2)
 */
class Solution0222_1 {
    public int countNodes(TreeNode root) {
        int nodes = 0, h = height(root);
        while (root != null) {
            if (height(root.right) == h - 1) {
                nodes += 1 << h;
                root = root.right;
            } else {
                nodes += 1 << h-1;
                root = root.left;
            }
            h--;
        }
        return nodes;
    }
    int height(TreeNode root) {
        return root == null ? -1 : 1 + height(root.left);
    }
}

class Solution0222_1_2 {
    int height(TreeNode root) {
        return root == null ? -1 : 1 + height(root.left);
    }
    public int countNodes(TreeNode root) {
        int h = height(root);
        return h < 0 ? 0 :
                height(root.right) == h-1 ? (1 << h) + countNodes(root.right)
                        : (1 << h-1) + countNodes(root.left);
    }
}

class Solution0222_2 {
    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        TreeNode left = root, right = root;
        int height = 0;
        while (right != null) {
            left = left.left;
            right = right.right;
            height++;
        }
        if (left == null)
            return (1 << height) - 1;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}

class Solution0222_2_2 {
    public int countNodes(TreeNode root) {
        if(root == null)return 0;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}



//C++
//// check the left subtree is perfect or not -> time complexity is also O(height^2)
//class Solution {
//    public:
//    int countNodes(TreeNode* root) {
//        if(!root) return 0;
//        int num=1;
//        TreeNode *curR(root->left), *curL(root->left);
//        while(curR) // curR is the rightmost edge, which has a height equal to or less than the leftmost edge
//        {
//            curL = curL->left;
//            curR = curR->right;
//            num = num<<1;
//        }
//        return  num + ( (!curL)?countNodes(root->right):countNodes(root->left) );
//    }
//};
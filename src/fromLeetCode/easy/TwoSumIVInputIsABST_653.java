package fromLeetCode.easy;

import javax.swing.tree.TreeCellRenderer;
import java.util.ArrayList;

public class TwoSumIVInputIsABST_653 {

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

    //Runtime: 26 ms, faster than 5.91% of Java online submissions for Two Sum IV - Input is a BST.
    //Memory Usage: 52.1 MB, less than 26.66% of Java online submissions for Two Sum IV - Input is a BST.
    public boolean findTarget(TreeNode root, int k) {

        if(root==null) return false;

        ArrayList<Integer> numbers = new ArrayList<>();

        NodeToArrayList(root, numbers);

        for (int i = 0; i < numbers.size(); i++) {

            int currentValue = numbers.get(i);
            numbers.remove(i);
            if (numbers.contains( k-currentValue) ) return true;
            numbers.add(i, currentValue);

        }

        return false;
    }

    public void NodeToArrayList(TreeNode current, ArrayList<Integer> values){

        values.add(current.val);
        if (current.right!=null) NodeToArrayList(current.right, values);
        if (current.left!=null) NodeToArrayList(current.left, values);

    }

}

//Runtime: 26 ms, faster than 5.91% of Java online submissions for Two Sum IV - Input is a BST.
//Memory Usage: 54.1 MB, less than 8.00% of Java online submissions for Two Sum IV - Input is a BST.
//    public boolean findTarget(TreeNode root, int k) {
//
//        LinkedList<Integer> numbers = new LinkedList<>();
//
//        NodeToLinkedList(root, numbers);
//
//        for (int i = 0; i < numbers.size(); i++) {
//
//            int currentValue = numbers.get(i);
//            numbers.remove(i);
//            if (numbers.contains( k-currentValue) ) return true;
//            numbers.add(i, currentValue);
//
//        }
//
//        return false;
//
//    }
//
//        public void NodeToLinkedList(TreeNode current, LinkedList<Integer> values){
//
//        values.add(current.val);
//        if (current.right!=null) NodeToLinkedList(current.right, values);
//        if (current.left!=null) NodeToLinkedList(current.left, values);
//
//    }

//        TreeNode currentRight = root;
//        TreeNode currentLeft = root;
//
//        while(root.right!=null || root.left!=null){
//
//            if (root.right!=null) currentRight=root.right;
//            if (root.left!=null) currentLeft=root.left;
//
//
//            if(differentNumber.contains(k-currentNodeValue)) return true;
//
//            if (!differentNumber.contains(currentNodeValue)) differentNumber.add(currentNodeValue);
//
//        }



/*
sample 7 ms submission

class Solution {
    HashMap<Integer, Integer> twoSum = new HashMap<>();
	public boolean findTarget(TreeNode root, int k) {
		return twoSum(root, k);
	}
    public boolean twoSum(TreeNode root,int k)
    {
        if(root==null)
        return false;
        if(twoSum.containsKey(k-root.val))
        return true;
        else
        twoSum.put(root.val,root.val);
        return twoSum(root.left,k)|| twoSum(root.right,k);
    }
}


----------------------------------------------------------------------------------------

TODO sample 1 ms submission

class Solution {
    public boolean findTarget(TreeNode root, int k) {

       return fun(root,root,k);


    }

    boolean fun(TreeNode root,TreeNode p, int k){

        if(p==null)
            return false;

          boolean v =   search(root,p,k-p.val);
            if(v)
                return true;

          v = fun(root,p.left,k);
            if(v)
                return true;

            v = fun(root,p.right,k);
            if(v)
                return true;

        return false;
    }

    boolean search(TreeNode root,TreeNode p,int k){

        if(root==null)
            return false;

        TreeNode c = root; boolean h=  false;
        while(c!=null&&h!=true){
            if(c.val==k&&p!=c){
                h=  true;
                return true;
            }
            else if(k<c.val)
                c = c.left;
            else
                c = c.right;
        }

       return false;
    }

}


----------------------------------------------------------------------------------------

TODO sample 42500 KB submission
class Solution {
    Set<Integer> map = new HashSet<>();
    // O(n) time | O(n) space
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        int y = k - root.val;
        if (map.contains(y))
            return true;
        map.add(root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}


----------------------------------------------------------------------------------------
sample 42000 KB submission

class Solution {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> hs = new HashSet<>();
        return helper(root, hs, k);
    }

    private static boolean helper(TreeNode root, HashSet<Integer> hs, int k) {
        //base case
        if (root == null) return false;

        boolean left = helper(root.left, hs, k);
        if (left) return true;
        if (hs.contains(k-root.val) && root.val != (k-root.val)){
            return true;
        }else {
            hs.add(root.val);
        }

        boolean right = helper(root.right, hs, k);
        if (right) return true;
        if (hs.contains(k-root.val) && root.val != (k-root.val)){
            return true;
        }
        hs.add(root.val);

        return false;
    }
}
*/
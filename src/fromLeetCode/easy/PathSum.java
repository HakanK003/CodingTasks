package fromLeetCode.easy;

public class PathSum {

    /**
     * class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *
     *     TreeNode() {
     *     }
     *
     *     TreeNode(int val) {
     *         this.val = val;
     *     }
     *
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     *
     */

    public boolean hasPathSum1_1(TreeNode root, int targetSum) {

        if(root==null) return false;

        int expect=targetSum-root.val;

        if(expect==0 && root.left==null && root.right==null) return true;

        boolean leftPart = hasPathSum1_1(root.left, expect);
        boolean rightPart = hasPathSum1_1(root.right, expect);

        return leftPart || rightPart;

    }

    //https://gist.github.com/guolinaileen/4703470
    public boolean hasPathSum1(TreeNode root, int sum) {
        if(root==null) return false;
        int expect=sum-root.val;
        if(expect==0 && root.left==null && root.right==null) return true;
        boolean left=hasPathSum1(root.left, expect);
        boolean right=hasPathSum1(root.right, expect);
        return left || right;
    }

//    public boolean hasPathSum(TreeNode root, int targetSum) {
//
//        if (root == null) return false;
//
//        if (root.left!=null || root.right!=null){
//            boolean left = false;
//            boolean right = false
//                    ;
//            if (root.left!=null) {
//
//                left = hasPathSum(root.left, targetSum- root.val);
//            }
//
//            if (root.right!=null) {
//
//                right = hasPathSum(root.right, targetSum- root.val);
//            }
//
//            return right || left;
//
//        }else{
//
//            return false;
//
//        }
//
////        TreeNode current = root.right;
////        TreeNode previeuosRoot = root.right;
//
//        int sumRight = root.val;
//        boolean patternRight = true;
//
//        while (patternRight) {
//
//  //          sumRight+=current.val;
//
////            patternRight = checkNode(sumRight, current.right, current.right!=null&&current.left!=null);
//
////            if ((current.right == null && current.left == null) || (current.right != null && current.left != null)) {
////
////                patternRight = false;
////                break;
////
////            }
////
////            if (current.right != null && current.left == null) {
////
////                current = current.right;
////
////            }
////
////            if (current.left !)
//
//
//        }
//
//        if (patternRight && (sumRight == targetSum)) return true;
//        else current=root.left;
//
//        int sumLeft = root.val;
//        boolean patternLeft = true;
//
////        do {
////
////            if (root.left != null) {
////
////
////            } else break;
////
////        }
//        while (current.left != null) {
//
//            if (current.left != null) {
//
//
//            }
//
//
//        }
//
//        return patternLeft && (sumLeft == targetSum);
//
//    }

//    public boolean checkNode(int sum, TreeNode current, boolean oddEven){
//
//        if (oddEven) {
//
//            if (current.right!=null){}
//
//        }
//
//
//
//    }

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
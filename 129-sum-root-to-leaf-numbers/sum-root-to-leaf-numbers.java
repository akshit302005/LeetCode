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
class Solution {
    int sum=0;
    public int sumNumbers(TreeNode root) {
        helper(root,"");
        return sum;
        
    }
    public void helper(TreeNode root , String res){
        if(root==null){
            return;
        }
        res+=root.val;
        if(root.left == null && root.right==null){
            sum+=Integer.parseInt(res);
            return;

        }
        helper(root.left,res);
        helper(root.right,res);
    }
}
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
    public int diameterOfBinaryTree(TreeNode root) {
        if( root == null )
        return 0;

        int left1 = height(root.left);
        int right1=height(root.right);
        int newdia=left1+right1;

        int dia=diameterOfBinaryTree(root.left);
        int dia1=diameterOfBinaryTree(root.right);
        int dia2=Math.max(dia,dia1);

        return Math.max(dia2,newdia);
        
    }

    static int height(TreeNode root){
        if( root == null )
        return 0;

        int l=height(root.left);
        int r=height(root.right);

        return 1+Math.max(l,r);
    }
}

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
         // jab dono null ho to same hi honge 
        if( p == null && q == null)
        return true;
        
        // jab dono me se koi ek null or dusra non-null ho then different ho jaye ga
        if( p == null || q == null)
        return false;
        
        // value fo node different
        if( p.val != q.val)
        return false;

    

      return  isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}

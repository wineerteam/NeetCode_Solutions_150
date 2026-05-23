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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
          List<List<Integer>> ans=new ArrayList<>();
          return ans(root, ans);
        
    }
    static List<List<Integer>> ans(TreeNode root, List<List<Integer>> ans){
        if( root == null )
        return ans;
        // for the level order traversal

        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);

        while( !q.isEmpty()){

            List<Integer> temp=new ArrayList<>();

            int size=q.size();

            for( int i=0; i<size; i++){
                TreeNode curr1 =  q.remove();
                temp.add(curr1.val);

                // move left 
            if( curr1.left != null)
            q.offer(curr1.left);
            // move right
            if(curr1.right != null)
            q.offer(curr1.right);
            }
           
           
            // add ans nested list
            ans.add(temp);
        }
        return ans;
    }
}

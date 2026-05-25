class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length; 
        int [] ans=new int[n-k+1];

        // brute force 
        for( int i=0; i<n-k+1; i++){
                int max=Integer.MIN_VALUE;
                for( int j=i; j<i+k; j++){
                        max=Math.max(max,nums[j]);
                }
             ans[i]=max;
        }
        return ans;
    }
}

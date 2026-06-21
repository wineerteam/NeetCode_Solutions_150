class Solution {
    public int maxProduct(int[] nums) {
        
        int maxPro=Integer.MIN_VALUE;
        int pro;
        for( int i=0; i<nums.length; i++){
             
            for( int j=i; j<nums.length; j++){
                 pro=1;
                // if( nums[j]==0) return 0;
                for( int k=i; k<=j; k++){
                 pro *=nums[k];
                 }
                maxPro=Math.max(maxPro,pro);
            }
        }

        return maxPro;
    }
}



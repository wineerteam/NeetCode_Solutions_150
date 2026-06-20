class Solution {
    public int missingNumber(int[] nums) {
        
        // 1 to n find sum use math formula
        int n=nums.length;
        
        // sum of n natural numbers 
        int total_sum = n*(n+1)/2;
        
        // calcualted sum 
        int cal_sum=0;

        for(int i=0; i<nums.length; i++){
            cal_sum +=nums[i];
        }

        return total_sum-cal_sum;
    }
}

class Solution {

    public boolean canJump(int[] nums) {
        int n=nums.length;
        return ans(nums,0,n);        
    }
    boolean ans (int [] arr,int ind, int n){
        if( ind == n-1) return true;

        // if( ind >= n) return false;
        
        //  until value of arr[ind] check it
        for( int i=1; i<=arr[ind]; i++){

            // ind increase karna h.i ki value to usi liye h
            
            if(ans(arr,ind+i,n)==true)
            return true;
        }
        return false;
    }
}

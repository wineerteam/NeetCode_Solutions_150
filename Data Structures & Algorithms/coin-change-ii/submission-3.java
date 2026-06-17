class Solution {
    int dp[][]=new int [101][5001];
    public int change(int amt, int[]arr) {
        
          for( int i=0; i<dp.length; i++){
            Arrays.fill(dp[i],-1);
          }
        return solve( amt,0,arr);
        
    }
    int solve( int target,int i, int [] arr){

        if(  i > arr.length-1 ) return 0;
        if( target ==0 && i <= arr.length-1) return 1;
        if( target < 0) return 0;

        if( dp[i][target] != -1) return dp[i][target];
        // take 
        int take_same=solve(target-arr[i],i,arr);
        int take_diff=solve( target,i+1,arr);
        return dp[i][target]= take_same+take_diff;
    }
}

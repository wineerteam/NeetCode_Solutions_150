class Solution {
    
    Map <String , Integer> map=new HashMap<>();

    public int findTargetSumWays(int[] arr, int target) {
        
        return solve( arr, 0,0,target);
        
    }
    int solve( int arr[], int i ,int sum, int target){
        if( i== arr.length){
            if( sum == target )
            return 1;
            else 
            return 0;
        }
          
          // we have two chooice add or minus 
          int add  = solve( arr, i+1, sum+arr[i], target);
          int minus= solve( arr, i+1, sum-arr[i], target);
          return add+minus;
    }
}

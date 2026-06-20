class Solution {
    public int hammingWeight(int n) {
        
        int count  = 0 ;
        
        // all 32 bits ko  check kr rhe h. 
        for( int i=31; i >= 0; i--){

            // 
            if( ((n>>i)&1) == 1)
             count++;
        }

        return count;
    }
}

class Solution {
    public int reverseBits(int n) {

        int result =0;
        if( n == 0) return result ;
        
        //  1 to 32 bit traverse
        for( int i=1; i<=32; i++){
            // left shit by 1bit
            result=result<<1;

            // result add(oR) with 1st bit of n
            result=result|(n&1);

            // remove right from n throw right shit of n by 1 bit
            n=(n>>1);
            
        }


        return result;
    }
}

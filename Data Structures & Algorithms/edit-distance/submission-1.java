class Solution {
    public int minDistance(String s1, String s2) {
        int dp [][]=new int [101][101];

        for( int i=0; i<dp.length; i++){
            Arrays.fill( dp[i],-1);
        }
        return solve(s1,s2,0,0,dp);
        
    }
    int solve( String s1, String s2, int i, int j,int dp[][]){

        //  string 2 khatam or string1 bacha h. to return s1 me kitna bacha h. utna delte krna hoga

        if( j == s2.length() )
        return s1.length()-i;
        // string 1 khtam ho gya pahle to hme insert krna hoga jitna s2 me bacha h. tabih match hoga
        if( i == s1.length())
        return s2.length()-j;
         

         // if already calculated then return 
         if( dp[i][j] != -1) 
         return dp[i][j];

        if( s1.charAt(i) == s2.charAt(j))
        return dp[i][j] = solve(s1,s2,i+1,j+1,dp);
        else{
            int ins = solve(s1,s2,i,j+1,dp);
            int del = solve(s1,s2,i+1,j,dp);
            int rep = solve(s1,s2,i+1,j+1,dp);
            
            return dp[i][j] = 1+ Math.min(ins,Math.min(del,rep));
        }
         
    }
}

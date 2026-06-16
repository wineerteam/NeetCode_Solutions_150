class Solution {
    int l,m,n;
    public boolean isInterleave(String s1, String s2, String s3) {

         l=s1.length();
         m=s2.length();
         n=s3.length();
        
        // if  s1 ka len + s2 ka len == s3 ke len then possible h. agar equal nhi hua to not possible
        if( l + m != n) return false;
        return solve(s1,s2,s3,0,0);
        
    }
    boolean solve( String s1,String s2, String s3, int i, int j){
        
        // all end at a time then conform ki we found or get result 

        if ( i == l && j == m && i + j == n) return true;

        boolean ans = false;

        // check s1 ans s3 euqual in char then store in ans 
        if( i<l && s1.charAt(i)  == s3.charAt(i+j))
          ans = solve(s1,s2,s3,i+1,j);
        
        if( ans ) return true;
        // if s2 and s3 ke char match then store ans 
        if( j<m && s2.charAt(j) == s3.charAt(i+j))
        ans = solve( s1,s2,s3,i,j+1);
        
        return ans;
    }
}

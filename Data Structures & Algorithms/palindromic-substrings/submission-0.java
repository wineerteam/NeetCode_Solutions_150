class Solution {
    public boolean isPalindrom(String s, int i,int j){
         if( i>j)
         return true;
         
         if( s.charAt(i) == s.charAt(j))
         return isPalindrom(s,i+1,j-1);

         return false;
    }
    public int countSubstrings(String s) {
      int count =0;
        for( int i=0;i<s.length(); i++){
            for( int j=i; j<s.length(); j++){
                if( isPalindrom(s,i,j)){
                    count++;
                }
            }
        }
return count;
    }
}

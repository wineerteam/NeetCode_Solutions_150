class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        boolean [] ans=new boolean[256];
        int left=0, right =0, len=0;
        while( right < n){

            // repetaing element ke liye 
            while( ans[s.charAt(right)]){
                ans[s.charAt(left)]=false;
                left++;
            }

            // no repeating or move forward or expand window 
            ans[s.charAt(right)]=true;
            len =Math.max(len, right-left+1);
            right++;
        }
        return len;
    }
}

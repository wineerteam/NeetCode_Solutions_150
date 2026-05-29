class Solution {
    public int lengthOfLongestSubstring(String s) {

        int []  arr =new int[256];
        int left=0,right=0, len=0;
         
         // length tak to chalega outer loop 
        while( right < s.length()){

            // repeteaing characters remove
            while(arr[s.charAt(right)]==1 ){
                arr[s.charAt(left)] = 0;
                left++;
            }
            // forward to jana hi hoga hme to usko true kar de rhe h
            arr[s.charAt(right)]=1;
            len=Math.max(len,right-left+1);
            right++;

        }

        return len; 

        
    }
}

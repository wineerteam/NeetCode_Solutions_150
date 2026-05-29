class Solution {
    public int lengthOfLongestSubstring(String s) {

        boolean []  arr =new boolean[256];
        int left=0,right=0, len=0;
         
         // length tak to chalega outer loop 
        while( right < s.length()){

            // repeteaing characters remove
            while(arr[s.charAt(right)] ){
                arr[s.charAt(left)] = false;
                left++;
            }
            // forward to jana hi hoga hme to usko true kar de rhe h
            arr[s.charAt(right)]=true;
            len=Math.max(len,right-left+1);
            right++;

        }

        return len; 

        
    }
}

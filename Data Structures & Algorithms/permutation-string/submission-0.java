class Solution {

    public  boolean isSame(int [] freq, int [] sfreq){
            for( int i=0; i<26; i++){
                if( freq[i] != sfreq[i]){
                    return false;
                }
            }
            return true;
           }
    public boolean checkInclusion(String s1, String s2) {
        
        // store s1 ki freq in 
        int n = s1.length();
        int [] freq = new int[26];

        for( int i=0; i<n; i++){
            freq[s1.charAt(i)-'a']++;
        }


        int windoSize = s1.length();

       for ( int i=0; i<s2.length(); i++){
        int windoIndex=0, idx = i;
        int [] sfreq = new int[26];

        while( windoIndex < windoSize && idx < s2.length()){
              sfreq[s2.charAt(idx)-'a']++;
              windoIndex++;
              idx++;
              
        }
            //  window is same or not 
            if( isSame(freq, sfreq)){
                return true;
            }
       }

      
        return false;
    }
}

class Solution {
    public boolean isSameFreq(int [] freq, int [] windowfreq){

        // only 26 letters so order N(1) tc 
        for( int i=0; i<26; i++){
            if( freq[i] != windowfreq[i])
             return false;
        }

        return true;
    }
    public boolean checkInclusion(String s1, String s2) {

            // store freq in array all latterse bhi sare characters bole to 256char h
            // store in s1 ke freq 
           int [] freq = new int[26];

            // store s1 me present letter ka freq in freq array 

           for( int i=0; i<s1.length(); i++){
            // character - alphate also char so difference store in freq array 
                freq[s1.charAt(i)-'a']++;
           }
            int sizeOfWindow=s1.length();
           for( int i=0; i<s2.length(); i++){
             int indexWindow=0, index=i;
             int [] windowfreq = new int[26];
             
             // store in window 
             while( indexWindow < sizeOfWindow && index < s2.length()){

                // store window size tak ka freq is known as windowfreq

                    windowfreq[s2.charAt(index)-'a']++;
                    // upadate both index 
                    indexWindow++;
                    index++;

             }

             // check window match or not
             if( isSameFreq(freq,windowfreq)){
                return true;
             }

           }
        return false;
    }
}

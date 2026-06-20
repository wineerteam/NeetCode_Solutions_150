class Solution {
public:
    int singleNumber(vector<int>& nums) {
        
        int unique =0;

        for( int i=0; i<=31; i++){
            int OneCont=0;
            int temp = (1 << i);
            for( int &num:nums){
                if( (num & temp) == 0){

                }
                else{
                    OneCont++;
                }

            }
            if( OneCont % 2 == 1){
                unique =(unique | temp);
            }
        }
        return unique;
    }
};

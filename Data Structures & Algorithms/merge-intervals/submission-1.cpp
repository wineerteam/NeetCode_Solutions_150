class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {

        int n = intervals.size();

        vector<vector<int>> ans;
        // any interval type sort first 
        sort(begin(intervals),end(intervals));

        ans.push_back(intervals[0]);
        
        for(int i=0; i<n; i++){
            if( intervals[i][0] <= ans.back()[1]){
                //overalapping conditions
                ans.back()[1]=max(intervals[i][1],ans.back()[1]);
            }
            else{
                // push as same ensuer that no overlaping 
                ans.push_back(intervals[i]);
            }
        }
        return ans;
    }
};

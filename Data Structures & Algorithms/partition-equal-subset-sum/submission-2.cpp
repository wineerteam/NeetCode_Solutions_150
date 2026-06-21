class Solution {
public:
    int t[101][5001];

    bool solve(vector<int>& arr, int i, int x) {

        if(x == 0)
            return true;

        if(i >= arr.size())
            return false;

        if(t[i][x] != -1)
            return t[i][x];

        bool take = false;

        if(arr[i] <= x)
            take = solve(arr, i + 1, x - arr[i]);

        bool ntake = solve(arr, i + 1, x);

        return t[i][x] = take || ntake;
    }

    bool canPartition(vector<int>& nums) {

        for( int i=0; i<101; i++){
            for( int j=0; j<5001; j++){
                t[i][j]=-1;
            }
        }

        int sum = 0;

        for(int num : nums)
            sum += num;

        if(sum % 2)
            return false;

        return solve(nums, 0, sum / 2);
    }
};
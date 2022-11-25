class Solution {
public:
    int solve(int index, vector<int> &nums, vector<int> &dp){
        if(index==0){
            return nums[index]; 
        }
        if(index<0){
            return 0; 
        }
        if(dp[index]!=-1){
            return dp[index]; 
            
        }
        int pick=nums[index] + solve(index-2, nums,dp); 
        int notPick=solve(index-1, nums,dp); 
        return dp[index]=max(pick,notPick); 
    }
    int rob(vector<int>& nums) {
         int n=nums.size(); 
        vector<int>  dp(n,-1);
       
        
        
        return solve(n-1 , nums , dp); 
    }
};

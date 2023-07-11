class Solution {
    public int[] buildArray(int[] nums) {
        int[] perms = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            perms[i] = nums[nums[i]];

        }
        return perms;
        
        
    }
}
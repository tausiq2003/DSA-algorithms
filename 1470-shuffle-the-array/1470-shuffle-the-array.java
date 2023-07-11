class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffledArray = new int[2*n];
        for(int i = 1; i < 2*n; i = i+2){
            shuffledArray[i-1] = nums[i/2]; 
            shuffledArray[i] = nums[(2*n+i)/2]; 
        }
        
        return shuffledArray;
        
    }
}
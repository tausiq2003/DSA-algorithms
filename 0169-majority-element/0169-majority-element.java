class Solution {
    public int majorityElement(int[] nums) {
        return insertionSort(nums);
    }
    public int insertionSort(int[] nums){
        for (int i = 0; i < nums.length-1; i++){
            for (int j = i+1; j > 0; j--){
                if (nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
            
                }
                else{
                    break;
                }
            }
        }
        return nums[(nums.length-1)/2];

    }
}
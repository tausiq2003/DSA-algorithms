class Solution {
    public static int missingNumber(int[] nums) {
        //search for the element and go for it.
        int index = 0;
        sort(nums);
        
        for (int i = 0; i < nums.length;i++){
            if (nums[i] == 0){
                index = i + 1;

            }
        }
        return index;
    }
    static void sort(int[] nums){

        int i = 0;
        while (i < nums.length) {

            int correct = nums[i] - 1;
            if(correct == -1){
                i++;
                continue;

            }
            if (nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;

            }
            else {
                i++;
            }


        }
    }
}
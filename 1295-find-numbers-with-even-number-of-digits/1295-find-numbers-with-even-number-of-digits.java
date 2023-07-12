import java.lang.Math;
class Solution {
    public int findNumbers(int[] nums) {
        int dig = 0;
        int count = 0;
        
        for (int i = 0; i< nums.length; i++){
            int counter =(int)Math.log10(nums[i])+1;
            if(counter % 2 == 0){
                count ++;
            }
        }
        
        
        return count;
        
    }
}
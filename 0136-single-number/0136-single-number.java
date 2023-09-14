class Solution {
    public int singleNumber(int[] nums) {
        int num = 0;
        for (int elem: nums){
            num = num ^ elem;
        }
        return num;
        
    }
}
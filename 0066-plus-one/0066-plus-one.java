class Solution {
    public int[] plusOne(int[] digits) {
     for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            if(digits[i] < 10){
                return digits;
            }
            digits[i] = 0;
            
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;

        
    }
}
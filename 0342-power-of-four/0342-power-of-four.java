class Solution {
    public boolean isPowerOfFour(int n) {
            // there exists an integer x such that x == 2^x
        //use recursion
        if (n <= 0){
            return false;
        }
        if (n == 1){
            return true;

        }
        if(n % 4 != 0){
            return false;
        }
        return isPowerOfFour(n/4);
        
    }
}
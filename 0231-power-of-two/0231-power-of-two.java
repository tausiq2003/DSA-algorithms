class Solution {
    public boolean isPowerOfTwo(int n) {
     // there exists an integer x such that x == 2^x
        //use recursion
        if (n <= 0){
            return false;
        }
        if (n < 2){
            return true;

        }
        if(n % 2 == 1){
            return false;
        }
        return isPowerOfTwo(n/2);
    }
}
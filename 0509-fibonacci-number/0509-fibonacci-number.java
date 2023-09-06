class Solution {
    public int fib(int n) {
        // this can be solved using dynamic programming but solving now
        if (n < 2){
            return n;
        }
        return fib(n-1) + fib(n-2);        
    }
}
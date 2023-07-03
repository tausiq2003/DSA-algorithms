class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int dig = 0;
        int prod = 1;
        while(n>0){
            dig = n%10;
            prod = prod * dig;
            sum = sum + dig;
            n = n/10;
        }
        int res = prod - sum;
        return res;
        
    }
}
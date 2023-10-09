class Solution {
    public int kthFactor(int n, int k) {
    if (k < 1 || k > n) {
        return -1;
    }
    
    int count = 0;
    
    for (int i = 1; i <= n; i++) {
        if (n % i == 0) {
            count++;
            if (count == k) {
                return i;
            }
        }
    }
    
    return -1;
    }}

class Solution {
    public boolean isPowerOfTwo(int n) {
     // there exists an integer x such that x == 2^x
        //use recursion
//         if (n <= 0){
//             return false;
//         }
//         if (n < 2){
//             return true;

//         }
//         if(n % 2 == 1){
//             return false;
//         }
//         return isPowerOfTwo(n/2);
        // this is an brilliant solution but look at return types yeah that pure luck
        // System.out.println(recursive(n));
        return recursive(n) % 2 == 0;
        
    }
    public int recursive(int n){
        if (n <= 0){
            return 1;
        }
        if (n < 2){
            return 0;

        }
        if(n % 2 == 1){
            return 1;
        }
        return recursive(n/2);
    
}
}
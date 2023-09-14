public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        if (n == 0){
            return 0;
        }
        int result = 0;
        for(int i = 0; i < 32; i++){
            //left shift
            result <<= 1;
            
            //drop 
            if ((n & 1) == 1){
                
                //add
                result++;

            } 
            
            //rightshift
            n >>= 1;
        
        }
        return result;
        
    }
}
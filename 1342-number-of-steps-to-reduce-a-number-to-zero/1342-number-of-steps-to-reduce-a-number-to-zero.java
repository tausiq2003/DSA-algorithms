class Solution {
    public int numberOfSteps(int num) {
//         //if num is even divide by 2
//         //else subtract by 1
//         int count = 0;
//         while(num > 0){
//             if(num % 2 == 0){
//                 num = num/2;
//             }
//             else{
//                 num--;
//             }
//             count++;
//         }
        
//         return count; 
        //previous soln
        // recursion soln
        // at last 0 + 1 + 1 + 1 +... count
        // base condition
        if(num == 0){
            return 0;
        }
        if (num % 2 == 0){
            return 1 + numberOfSteps(num/2);

        }
        return 1 + numberOfSteps(num - 1);
        
    }
}
class Solution {
    public int numberOfSteps(int num) {
        //if num is even divide by 2
        //else subtract by 1
        int count = 0;
        while(num > 0){
            if(num % 2 == 0){
                num = num/2;
            }
            else{
                num--;
            }
            count++;
        }
        
        return count;
        
    }
}
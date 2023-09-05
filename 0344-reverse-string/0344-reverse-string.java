class Solution {
    public void reverseString(char[] s) {
        // As the question mentioned O(1) space complexity, so it couldn't be achieved via recursion,
        // just doing for practice.
        //solving by two pointer method
        recursion(s, 0, s.length-1);
        
        
    }
    public void recursion(char[] str, int s, int e){
        if (s > e){
            return;
        }
        char temp = str[s];
        str[s] = str[e];
        str[e] = temp;
        recursion(str, s+1, e-1);
        
    }
}
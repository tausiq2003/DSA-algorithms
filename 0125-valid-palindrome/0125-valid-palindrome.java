class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder string = new StringBuilder();
        s = s.toLowerCase();

        String[] arrayString = s.strip().split(" ");
        for(int i = 0; i < arrayString.length; i++){
            String cleaned = arrayString[i].replaceAll("[^a-zA-Z0-9]", "");
            string.append(cleaned);
        }
    if(string.toString().equals(string.reverse().toString())){
        return true;
    }
    return false;
        
        
    }
}
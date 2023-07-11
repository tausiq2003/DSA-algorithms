class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int iter = 0;
        if (ruleKey.equals("color")){
            iter = 1;
        }
        else if(ruleKey.equals("name")){
            iter = 2;
        }
        int count = 0;
        for(int i = 0; i < items.size();i++){
            if (items.get(i).get(iter).equals(ruleValue)){
                count++;
            }

        }
        return count;
        
    }
}
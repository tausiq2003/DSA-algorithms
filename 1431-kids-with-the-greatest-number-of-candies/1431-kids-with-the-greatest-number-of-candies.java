class Solution {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maximum = max(candies);
        List<Boolean> list = new ArrayList<Boolean>(10);
        for(int i = 0; i < candies.length; i++){
            candies[i] = candies[i] + extraCandies;
            if(candies[i] >= maximum){
                list.add(true);

            }
            else{
                list.add(false);
            }
        }
        
        return list;
        
    }
    public static int max(int[] candies){
         int max = Integer.MIN_VALUE;
         for(int i = 0; i < candies.length; i++){
            if(candies[i] >= max){
                max = candies[i];
            }
        }
        return max;
    }
    
}

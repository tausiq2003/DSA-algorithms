class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] targetArray = new int[nums.length];
        List<Integer> list = new ArrayList<>(10);
        for(int i = 0; i < index.length; i++){
            list.add(index[i], nums[i]);
        } 
        for(int i = 0; i < nums.length; i++){
            targetArray[i] = list.get(i);
        }

        return targetArray;
        
    }
}
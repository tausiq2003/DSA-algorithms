class Solution {
    public int findMin(int[] nums) {
              // 4 cases
        // 1st: left of pivot
        // 2nd: right of target
        // 3rd: target
        // 4th: pivot
        int start = 0;
        int end = nums.length-1;
        // int tempstart = start;
        // int tempend = end;
        while(start < end){
            int mid = start + (end - start) /2;
            int b = mid-1;
            int a = mid +1;
            b = b < 0? mid:b;
            a = a > nums.length-1? mid: a;
            
        
            if (nums[a] < nums[mid]){
                return nums[a];
            }
            else if(nums[b] > nums[mid]){
                return nums[mid];
            }
            else if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                start++;
                end--;

            }
            else if(nums[mid] >= nums[start] && !(nums[start] < nums[end])){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return nums[start];
        
    }
}
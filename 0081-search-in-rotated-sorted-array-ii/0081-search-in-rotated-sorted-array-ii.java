class Solution {
//     public boolean search(int[] nums, int target) {
//         //Brute force solution --> O(n) using two pointers method
//         // if start == end then ignore
//         //if start > end then end--
//         //if start < end then search
//         int start = 0;
//         int end = nums.length -1;
//         int tempEnd = end;
//         int tempStart = start;
//         if(nums.length == 1){
//             if (nums[start] == target){
//                 return true;
//             }
//             else{
//                 return false;
//             }
//         }
//         while (nums[start] == nums[end]){
//             if(tempEnd - start<= 2){
//             return BinarySearch(start, tempEnd, target, nums);
//         }
//             end--;
//             tempEnd = end;
//             start++;
//             // problem
// // at last the array will be [1,1] or [1]
        
        
//         }
//         while (nums[start] > nums[end]){
//             end--;
//         }
    
//         return BinarySearch(start, end, target, nums) || BinarySearch(end+1, tempEnd, target, nums);
//     }
//         public boolean BinarySearch(int start, int end, int target, int[] arr){
//            if(arr.length == 1){
//                if(arr[start] == target){
//                    return true;
//                }
//                else{
//                    return false;
//                }
//         }
//         while(start <= end){
//             //find the middle element
//             // int mid = (start + end) /2;
//             // might be possible start + end overflows
//             int mid = start + (end - start) / 2;
            
//             if ( target < arr[mid]){
//                 end = mid - 1;
//             }
//             else if (target > arr[mid]){
//                 start = mid + 1;
//             }
//             else{
//                 return true;
//             }
//         }
//         return false;

//         }
   public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] == target) {
                return true;
            }
            
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            } else if (nums[start] <= nums[mid]) { // Left side is sorted
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // Right side is sorted
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        
        return false;
    }            }
 
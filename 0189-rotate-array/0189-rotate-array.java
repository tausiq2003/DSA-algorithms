class Solution {
    public void rotate(int[] nums, int k) {
        // I have thought of doing it in strings but it'll take O(n)
        // Can't divide and conquer as O(1) is required and not a sorted array.
        // So, took swapping method.
        // Brute force change to arr[0] increment position by 1
        if (k>nums.length){
            k = k%nums.length;
        }
        swap(nums, 0, nums.length-1);
        swap(nums,0, k-1);
        swap(nums,k, nums.length-1);
    
    }
    public void swap(int[] arr, int start, int end){
        
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
        

    }
        
}
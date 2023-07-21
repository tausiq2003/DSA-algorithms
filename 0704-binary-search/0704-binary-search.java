class Solution {
    public int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            //find the middle element
//            int mid = (start + end)/2 ; might be possible that (start+ end) may exceed
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;

            } else if (target > arr[mid]){
                start = mid +1;
            }else{
                //ans found
                return mid;

            }

        }
        return -1;
    }
        
    
}
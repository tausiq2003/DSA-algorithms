class Solution {
    public int search(int[] arr, int target) {
        return recursive(arr, target, 0, arr.length-1);
    }
    public int recursive(int[] arr, int target, int s, int e){
        //Using recursion
        if(s > e){
            return -1;
        }

        int m = s + (e-s)/2;

        if (arr[m] == target){
            return m;
        }
        if(target < arr[m]){
           return recursive(arr, target, s, m-1);
        }
        return recursive(arr, target, m+1, e);

    }
        
    
}
// package com.company;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 5,23, 34, 53, 54, 65, 76, 88, 90};
        int target = 5;
        int ans = binarySearch(arr, target);
        System.out.println(ans);


    }
     //return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr , int target){
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

// Credit to Kunal Kushwaha

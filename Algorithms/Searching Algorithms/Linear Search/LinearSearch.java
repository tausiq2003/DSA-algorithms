// package com.company;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1,2,3,5, 8, 7,34,63};
        int target = 8;
        int ans = linearsearch(nums, target);
        System.out.println(ans);


    }

     // search in the array: the return the index if item found
    //otherwise if item not found return -1
    static int linearsearch(int[] arr, int target) {
        if (arr.length == 0){
            return -1;

        }
        for(int index = 0; index< arr.length; index++){
            //check for element at every index if it is target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        //this line will execute if none of the return statements above have executed, target not found
        return -1;
    }

}

// Credit to Kunal Kushwaha

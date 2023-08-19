import java.util.Arrays;
class Solution {
    public int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
        // System.out.println(Arrays.toString(arr));
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return  index+1;
            }
            
        }
        
        
      return arr.length+1;  
    }
     static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
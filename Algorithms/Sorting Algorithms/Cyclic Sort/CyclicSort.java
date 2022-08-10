import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1, 4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyclicSort(int[] arr){
        // **** works in range of 1 to N continous unsorted/sorted arrays ****
        int temp = 0;
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] - i != 1){
                temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;

            } else{
                i++;
            }

        }
    }


}

package Questions;
import java.util.Scanner;

public class CountingOccurences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a big number: ");
        long num = in.nextInt();
        System.out.println();
        System.out.println("Enter target: ");
        int target = in.nextInt();
        int count = 0;
        while (num > 0){
            int digit = (int)num % 10;
            if (digit == target){
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
        //convert long to string
        // String str = Long.toString(num);
        // int count = 0;
        // for (int i = 0; i < str.length(); i++) {
        //     if(Character.getNumericValue(str.charAt(i)) == target){
        //         count++;
        //     }  
        // }
        // System.out.println(count);
    }
}

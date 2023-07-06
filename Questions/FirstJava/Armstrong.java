package Questions.FirstJava;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int noOfdigits = (int)(Math.log10((double)(num)))+1;
        boolean isArmstrong = false;
        int sum = 0;
        int temp = num;
        while (num > 0){
            int dig = num % 10;
            sum += Math.pow(dig, noOfdigits);
            num = num / 10;
        }
        if (sum == temp){
            isArmstrong = true;
        }
        System.out.println(isArmstrong);
    }
}

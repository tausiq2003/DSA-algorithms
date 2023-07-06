package Questions;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = in.nextInt();
        long rev = 0;
        while(num > 0){
            int dig = (int)num % 10;
            rev = rev * 10 + dig;

            num = num / 10;
        }
        System.out.println(rev);

    }
    
}

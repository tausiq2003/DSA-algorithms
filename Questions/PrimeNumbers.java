package Questions;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(IsPrime(num));
        
    }
    static boolean IsPrime(int number){
        if (number <= 1){
            return false;
        }
        int i = 2;
        while (i * i <= number){
            if (number % i == 0){
                return false;
            }
            i++;
        }
        return i * i > number;
    }

}

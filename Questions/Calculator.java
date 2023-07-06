package Questions;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char choice = 'x';
        do{
            System.out.println("Enter first number: ");
            int a = in.nextInt();
            System.out.println("Enter second number: ");
            int b = in.nextInt();
            System.out.println("Additon: " + (a+b));
            System.out.println("Subtraction: "+ (a-b));
            System.out.println("Multiplication: "+ (a*b));
            if (b != 0){
                System.out.println("Division: "+ (a/b));
                System.out.println("Remainder"+ (a%b));
            }
            else{
                System.out.println("Cannot divide by zero");
            }
            System.out.println("Enter choice: ");
            choice = in.next().trim().charAt(0);
            
        }while(choice != 'x');
    }
}

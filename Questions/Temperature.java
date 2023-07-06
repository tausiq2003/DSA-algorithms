package Questions;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number in celsius");
        double celsius = in.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("The equivalent value in fahrenheit is "+ (float)fahrenheit);

    }
}

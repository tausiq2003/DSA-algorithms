package Questions.FirstJava;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        // Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter principal: ");
        float principal = in.nextFloat();
        System.out.println("Enter time in years: ");
        float time = in.nextFloat();
        System.out.println("Enter rate: ");
        float rate = in.nextFloat();
        System.out.println("Interest: " + (principal * rate * time) / 100);
    }
}

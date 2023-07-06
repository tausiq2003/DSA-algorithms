package Questions.FirstJava;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        // Write a program to print whether a number is even or odd, also take input from the user.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        if (num % 2 != 0){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
    
}

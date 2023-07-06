package Questions.FirstJava;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        System.out.println("Enter in rupees");
        Scanner in = new Scanner(System.in);
        float rs = in.nextFloat();
        System.out.printf("USD: %.2f\n", (float)(rs/81.97));
    }
}

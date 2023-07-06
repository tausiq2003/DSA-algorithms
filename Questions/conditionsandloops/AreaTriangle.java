package Questions.conditionsandloops;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first side: ");
        int a = in.nextInt();
        System.out.println("Enter second side: ");
        int b = in.nextInt();
        System.out.println("Enter third side: ");
        int c = in.nextInt();
        
        float s = (a + b + c)/2;
        float area = (float)Math.sqrt((double)(s*(s-a)*(s-b)*(s-c)));
        System.out.println(area);


    }
}

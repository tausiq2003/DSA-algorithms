package Questions.conditionsandloops;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float radius = in.nextFloat();
        float area = (float)(Math.PI * radius * radius);
        System.out.printf("%.2f\n", area);
        
    }
}

package Questions.FirstJava;

import java.util.Scanner;

public class Palindrome {   
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner in = new Scanner(System.in);
        String str = in.next();
        //solve palindrome by two pointer method in java
        boolean isPalindrome = true;
        int i = 0;
        int j = str.length() - 1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(isPalindrome);


    }
    
}

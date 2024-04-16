package Java.Beginner;

import java.util.Scanner;

//#1003 - Simple Sum
public class SimpleSum {

    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        
        int soma = a + b;
        
        System.out.println("SOMA = " + soma);
        input.close();
    }
}

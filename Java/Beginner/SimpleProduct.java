package Java.Beginner;

import java.util.Scanner;

//#1004 - Simple Product
public class SimpleProduct {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        
        int prod = a * b;
        
        System.out.println("PROD = " + prod);
        input.close();
    }
}

package Java.Beginner;

import java.util.Scanner;

//#1001 - Extremely Basic
public class ExtremelyBasic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("X = " + (a + b));
        input.close();
    }

    
}

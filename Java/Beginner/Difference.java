package Java.Beginner;

import java.util.Scanner;

//#1007 - Difference
public class Difference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        int difference = (a * b - c * d);

        System.out.println("DIFERENCA = " + difference);
        input.close();
    }
}

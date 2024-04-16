package Java.Beginner;

import java.util.Scanner;

//#1006 - Average 2
public class Average2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double media = ((a * 2) + (b * 3) + (c * 5)) / 10;

        System.out.println(String.format("MEDIA = %.1f", media));
        input.close();
    }
}

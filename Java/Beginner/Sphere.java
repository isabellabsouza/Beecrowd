package Java.Beginner;

import java.util.Scanner;

//1011 - Sphere
public class Sphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r = input.nextDouble();
        double volume = (4/3.0) * 3.14159 * Math.pow(r, 3);

        System.out.println(String.format("VOLUME = %.3f", volume));
        input.close();
    }
}

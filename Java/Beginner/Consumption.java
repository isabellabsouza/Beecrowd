package Java.Beginner;

import java.util.Scanner;

//1014 - Consumption
public class Consumption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int distance = input.nextInt();
        double fuel = input.nextDouble();

        double consumption = distance / fuel;

        System.out.printf("%.3f km/l\n", consumption);
        input.close();
    }
}

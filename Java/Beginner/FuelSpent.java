package Java.Beginner;

import java.util.Scanner;

//1017 - Fuel Spent
public class FuelSpent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int time = input.nextInt();
        int speed = input.nextInt();

        double fuelSpent = (time * speed) / 12.0;

        System.out.printf("%.3f\n", fuelSpent);
        input.close();
    }
}

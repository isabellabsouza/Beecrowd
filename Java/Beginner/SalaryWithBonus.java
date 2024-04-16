package Java.Beginner;

import java.util.Scanner;

//1009 - Salary with Bonus
public class SalaryWithBonus {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        double salary = input.nextDouble();
        double sales = input.nextDouble();

        System.out.println(String.format("TOTAL = R$ %.2f", salary + sales * 0.15));
        input.close();
    }
}

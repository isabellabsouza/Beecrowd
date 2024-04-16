package Java.Beginner;

import java.util.Scanner;

//1008 - Salary
public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int employeeNumber = input.nextInt();
        int workedHours = input.nextInt();
        double hourlyRate = input.nextDouble();

        System.out.println("NUMBER = " + employeeNumber);
        System.out.println(String.format("SALARY = U$ %.2f", workedHours * hourlyRate));
        input.close();
    }
}

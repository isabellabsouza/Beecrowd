package Java.Beginner;

import java.util.Scanner;

//1020 - Age in Days
public class AgeInDays {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        int years = 0;
        int months = 0;
        int days = 0;

        if (age >= 365) {
            years = age / 365;
            age = age % 365;
        }
        if (age >= 30) {
            months = age / 30;
            age = age % 30;
        }
        days = age;

        System.out.println(years + " ano(s)");
        System.out.println(months + " mes(es)");
        System.out.println(days + " dia(s)");
        input.close();
    }
}

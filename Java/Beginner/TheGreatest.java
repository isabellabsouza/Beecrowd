package Java.Beginner;

import java.util.Scanner;

//1013 - The Greatest
public class TheGreatest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int maiorAB = (a+b+Math.abs(a-b))/2;
        int maior = (maiorAB+c+Math.abs(maiorAB-c))/2;

        System.out.println(maior + " eh o maior");
        input.close();
    }
}
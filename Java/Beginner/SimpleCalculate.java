package Java.Beginner;

import java.util.Scanner;

//1010 - Simple Calculate
public class SimpleCalculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        for(int i=0; i<2; i++){
            int code = input.nextInt();
            int quantity = input.nextInt();
            double price = input.nextDouble();
            total += quantity * price;
        }
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
        input.close();
    }
}

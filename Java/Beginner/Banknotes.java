package Java.Beginner;

import java.util.Scanner;

//1018 - Banknotes
public class Banknotes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        int[] notes = {100, 50, 20, 10, 5, 2, 1};
        
        System.out.println(value);

        for (int note : notes) {
            int count = value / note;
            System.out.println(count + " nota(s) de R$ " + note + ",00");
            value = value % note;
        }
        
        input.close();

    }
}

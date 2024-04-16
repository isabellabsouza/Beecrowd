package Java.Beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

//#1002 - Area of a Circle
public class AreaOfCircle {
    
    public static void main(String[] args) {
        DecimalFormat decimalF = new DecimalFormat("0.0000");
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double a = 3.14159 * r * r;
        System.out.println("A=" + decimalF.format(a));
        input.close();
    }
}

package Java.Beginner;

import java.util.Scanner;

// 1019 - Time Conversion
public class TimeConversion {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int time = input.nextInt();
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        if(time >= 3600){
            hours = time / 3600;
            time = time % 3600;
        }
        if(time >= 60){
            minutes = time / 60;
            time = time % 60;
        }
        seconds = time;

        System.out.println(hours + ":" + minutes + ":" + seconds);

        input.close();
    }
    
    
}

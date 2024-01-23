package solutions;

import java.util.Scanner;

public class leapYear {
    public int leapYear(){
        Scanner sc = new Scanner(System.in);

        int year;
        int result; // 1 or 0
        year = sc.nextInt();

        if((year % 4==0 && year % 100 != 0) || year % 400 ==0){
            result = 1;
        }else {
            result = 0;
        }

        return result;
    }

}

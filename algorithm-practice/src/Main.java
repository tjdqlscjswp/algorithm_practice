//import solutions.compareTwoNums;

import java.util.Scanner;

//Main 클래스에서 Solution클래스 선언해주기
public class Main {
    public static void main(String[] ars) {
        //Jan, 22, 2024
        //compareTwoNums compareTwoNums = new compareTwoNums();
        //System.out.println(compareTwoNums.compareTwoNumber());

        //Jan, 23, 2024
        Scanner sc = new Scanner(System.in);

        int year;
        int result; // 1 or 0
        year = sc.nextInt();

        if((year % 4==0 && year % 100 != 0) || year % 400 ==0){
            result = 1;
        }else {
            result = 0;
        }

        System.out.println(result);
    }
}

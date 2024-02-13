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

        int n;
        //1 <= n <= 9
        n = sc.nextInt();
        for(int i=1; i<10; i++){
            System.out.println(n + " * " + i +" = " + n*i);
        }
    }
}

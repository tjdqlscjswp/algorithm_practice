package solutions;

import java.util.Scanner;

public class multiplicationTable {
    //input a number n, then print n times table
    public void printTimesTable(){
        Scanner sc = new Scanner(System.in);
        int n;
        //1 <= n <= 9
        n = sc.nextInt();

        for(int i=1; i<10; i++){
            System.out.println(n + " * " + i +" = " + n*i);
        }

    }
}

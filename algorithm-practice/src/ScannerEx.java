import java.util.Scanner;

public class ScannerEx {
    public int addNumbers(){
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println(num1 + num2);
        return num1+num2;
    }
}

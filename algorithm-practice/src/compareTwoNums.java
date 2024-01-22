import java.util.Scanner;

public class compareTwoNums {
    // Compare given two integer value A, B.
    // If A is bigger than B, then return '>'.
    // If A is smaller that B, then return '<'.
    // If they are equal, then return '==',

    //-10,000 ≤ A, B ≤ 10,000

    public String compareTwoNumber() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        sc.close();

        String result;

        if (num1 == num2) {
            result = "==";
        } else if (num1 < num2) {
            result = "<";
        } else {
            result = ">";
        }

        //Ternary operator
        String result1 = (num1>num2) ? ">" : ((num1<num2)?"<":"==");

        return result;
    }
}

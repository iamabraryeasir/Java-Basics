package condition_control_03;

import java.util.Scanner;

public class FindLargerFrom3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a, b and c: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the largest.");
        } else if (num2 > num3) {
            System.out.println(num2 + " is the largest.");
        } else {
            System.out.println(num3 + " is the largest.");
        }

    }
}

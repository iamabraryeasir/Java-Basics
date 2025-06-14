package user_input_and_error_02;

import java.util.Scanner;

public class UserInput_00 {
    public static void main(String[] args) {
        /*
         * nextInt() -> for integer input
         * nextLong() -> for long input
         * nextFloat() -> for float input
         * nextDouble() -> for double input
         * nextBoolean() -> for boolean input
         * nextLine() -> for string input
         * next() -> reading string until a space
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = scan.nextInt();

        System.out.println(num1);
    }
}

package loop_control_04;

import java.util.Scanner;

public class FindMaxFrom5Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double max = Double.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print("n = ");
            double n = sc.nextDouble();

            if (n > max) {
                max = n;
            }
        }

        System.out.println("The max number is " + max);
    }
}

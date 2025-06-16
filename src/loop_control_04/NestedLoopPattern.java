package loop_control_04;

import java.util.Scanner;

public class NestedLoopPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n = ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(j + 1 + " ");
            }
            System.err.println();
        }

    }
}

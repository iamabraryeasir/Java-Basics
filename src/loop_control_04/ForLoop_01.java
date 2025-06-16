package loop_control_04;

import java.util.Scanner;

public class ForLoop_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n = ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". CSE is Fun!!");
        }
    }
}

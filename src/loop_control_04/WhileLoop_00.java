package loop_control_04;

import java.util.Scanner;

public class WhileLoop_00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n = ");
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            System.out.println(i + ". CSE is Fun!!");
            i++;
        }
    }
}

package array_06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int arrSize = sc.nextInt();

        int[] myArray = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            System.out.print("Enter value at index " + i + ": ");
            myArray[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(myArray));
    }
}

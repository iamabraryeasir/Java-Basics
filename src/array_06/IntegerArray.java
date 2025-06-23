package array_06;

import java.util.Arrays;;

public class IntegerArray {
    public static void main(String[] args) {
        int[] arr1 = new int[4];
        int[] arr2 = new int[] { 1, 2, 3, 4, 5 };
        int[] arr3 = { 1, 2, 3, 4, 5 };

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        System.out.println(arr2.length); // array length
        System.out.println(arr3[2]); // get a single value

        arr1[2] = 30;
        System.out.println(Arrays.toString(arr1));
    }
}

package string_05;

import java.util.Scanner;

public class JavaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fullName = "Abrar Yeasir";
        System.out.println(fullName);

        System.out.print("Enter a line: ");
        String stringLine = sc.nextLine(); // reads untail the new line

        System.out.println(stringLine);

        System.out.print("Enter a word: ");
        String stringWord = sc.next(); // reads untail the space

        System.out.println("The word is: " + stringWord);
    }
}
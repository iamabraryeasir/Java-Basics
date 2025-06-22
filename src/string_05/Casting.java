package string_05;

public class Casting {
    public static void main(String[] args) {
        char ch = 'c';
        int asciiValue = (int) ch;
        System.out.println(asciiValue);

        int val = 97;
        char ch2 = (char) val;
        System.out.println(ch2);
    }
}

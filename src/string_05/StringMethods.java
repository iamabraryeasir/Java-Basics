package string_05;

public class StringMethods {
    public static void main(String[] args) {
        String str = "CSE110";

        System.out.println(str.length()); // get the string length
        System.out.println(str.charAt(2)); // get character at a position
                                           // starts from 0 to len - 1

        for (int i = 0; i < str.length(); i++) {
            System.out.println(i + " " + str.charAt(i));
        }

        System.out.println(str.codePointAt(2)); // get the ASCII value

        String s1 = "CSE";
        String s2 = "CSE";
        System.out.println(s1 == s2); // true

        String s3 = new String("CSE");
        String s4 = new String("CSE");
        System.out.println(s3 == s4); // false

        System.out.println(s3.equals(s4)); // true
        System.out.println(s3.equals("CSe")); // false
        System.out.println(s3.equalsIgnoreCase("CSe")); // true

        String name = "Abrar";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
    }
}

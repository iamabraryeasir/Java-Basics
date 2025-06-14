package operators_01;

public class AssignmentOperators_02 {
    public static void main(String[] args) {
        /*
         * = -> assign
         * += -> plus/addition equals
         * -= -> minus/substraction equals
         * *= -> multiply equals
         * /= -> devide equals
         * %= -> modulo equals
         */

        int a = 20;
        System.out.println(a); // -> 20

        a += 10;
        System.out.println(a); // -> 30

        a -= 20;
        System.out.println(a); // -> 10

        a *= 2;
        System.out.println(a); // -> 20

        a /= 4;
        System.out.println(a); // -> 5

        a %= 2;
        System.out.println(a); // -> 1
    }
}

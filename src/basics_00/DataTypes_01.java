package basics_00;

public class DataTypes_01 {
    public static void main(String[] args) {
        /*
         * 1. Primitive DataType - (Value)
         * .... 1. Numeric
         * ........ 1. Whole Number
         * ............ - byte
         * ............ - short
         * ............ - int
         * ............ - long
         * ........ 2. Fraction
         * ............ - float
         * ............ - double
         * .... 2. Non-Numaric
         * ........ - char
         * ........ - boolean
         * 
         * 2. Non-Primitive DataType - (Referance)
         * .... - String
         * .... - Array
         * .... - Object
         * .... - Class
         * .... - Interface
         */

        byte num = 23;
        short num2 = 3456;
        long num3 = 45678;
        int myNum = 456;
        double d1 = 345.45;
        float f1 = 345.34f;
        char ch = 'c';
        boolean isActive = true;

        String name = "Abrar Yeasir";
        int[] ages = { 23, 45, 56 };

        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(myNum);
        System.out.println(d1);
        System.out.println(f1);
        System.out.println(ch);
        System.out.println(isActive);
        System.out.println(name);
        System.out.println(ages[1]);
    }
}

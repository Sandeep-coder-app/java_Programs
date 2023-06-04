package Basic_Programs;

import java.util.Scanner;

public class Arithmetic_Operator {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30, d;

        d = a+b+c;
        d = a-b;
        c = d*a;
        a = c/b;

        System.out.println(d);
        System.out.println(d);
        System.out.println(c);
        System.out.println(a);


        int first = 10, second = 20, third;

        third = first + second;
        System.out.println("add two no: ");
        System.out.println(third);

        third = first - second;
        System.out.println("Sub two no: ");
        System.out.println(third);

        third = first * second;
        System.out.println("Mul two no: ");
        System.out.println(third);

        third = first / second;
        System.out.println("Divide two no ");
        System.out.println(third);
    }
}

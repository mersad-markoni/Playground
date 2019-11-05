package com.company;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        int z = 1;
        while (z == 1) {

            int a;
            int b;
            int c;
            int r;
            float rd;
            Scanner in = new Scanner(System.in);
            System.out.println("Input number 1");
            a = in.nextInt();
            System.out.println("You entered number " + a);

            System.out.println("Input number 2");
            b = in.nextInt();
            System.out.println("You entered number " + b);

            System.out.println("Select math function:");
            System.out.println("1 - Add");
            System.out.println("2 - Substract");
            System.out.println("3 - Divide");
            System.out.println("4 - Multiply");
            c = in.nextInt();

            if (c == 1) {
                r = a + b;
                System.out.println("The result: " + a + "+" + b + "=" + r);
            }
            if (c == 2) {
                r = a - b;
                System.out.println("The result: " + a + "-" + b + "=" + r);
            }
            if (c == 3) {
                try {
                    rd = (float)a/b;
                    System.out.println("The result: " + a + "/" + b + "=" + rd);
                } catch (Exception e) {
                    System.out.println("Division not possible!!");
                }
            }
            if (c == 4) {
                r = a*b;
                System.out.println("The result: " + a + "*" + b + "=" + r);
            }
            if (c < 1 || c > 4) {
                System.out.println("No proper function selected!");
            }
            System.out.println("Do you want to try again?");
            System.out.println("1 - Yes");
            System.out.println("2 - No");

            z = in.nextInt();
            if (z == 2) break;

        }
    }
}

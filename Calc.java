//Watch out for big numbers - disable it
//Watch out for non-numerical input - 1108: Added try/catch - Better way is to do it with while loops.

package com.company;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        int z = 1;
        while (z == 1) {
            int a=0;
            int b=0;
            int c=0;
            int r=0;
            double rd=0;
            Scanner in = new Scanner(System.in);
            System.out.println("Input number 1");
            try {
                a = in.nextInt();
            }
            catch (Exception e){
                System.out.println("Input value is not a number!");
                continue;
            }
            System.out.println("You entered number " + a);

            System.out.println("Input number 2");
            try {
                b = in.nextInt();
            }
            catch (Exception e){
                System.out.println("Input value is not a number!");
                continue;
            }
            System.out.println("You entered number " + b);
            System.out.println("Select math function:");
            System.out.println("1 - Add");
            System.out.println("2 - Substract");
            System.out.println("3 - Divide");
            System.out.println("4 - Multiply");
            try {
                c = in.nextInt();
            }
            catch (Exception e){
                System.out.println("Input value is not a number!");
                continue;
            }
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
                    rd = (double)a/b;
                    System.out.printf("The result: %.2f\n",rd);
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
            try {
                z = in.nextInt();
            }
            catch (Exception e){
                System.out.println("Input value is not a number!");
                continue;
            }
            if (z == 2) break;

        }
    }
}

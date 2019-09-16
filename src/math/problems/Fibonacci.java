package math.problems;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        System.out.println("Enter the term to be printed");
        Scanner ob = new Scanner(System.in);
        int a = 1;
        int b = 0;
        int ch = ob.nextInt();

        for (int i = 0; i < ch; i++) {
            System.out.print(b);
            b = a + b;
            a = b - a;
            if (i <= ch - 2) {
                System.out.print(", ");
            }
            if (i == ch - 1) {
                System.out.println(".\nThese are the first " + ch + " Fibonacci Numbers!");


            }

        }
    }
}
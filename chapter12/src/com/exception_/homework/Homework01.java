package com.exception_.homework;

import java.util.Scanner;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Homework01 {
    public static double cal(int n1, int n2) {
        try {
            double res = n1 / n2;
            return res;

        } catch (ArithmeticException e) {
            throw new ArithmeticException("Can not divide 0");
        }
    }
    public static void main(String[] args) {




            try {
                if (args.length != 2) {
                    throw new ArrayIndexOutOfBoundsException("Missing or Redundant Parameter!");
                }
                int number1 = Integer.parseInt(args[0]);
                int number2 = Integer.parseInt(args[1]);
                double res = cal(number1, number2);
                System.out.println("Result: " + res);

            } catch (NumberFormatException e) {
                System.out.println("Input is Not an Integer");
            } catch (ArithmeticException e) {
                System.out.println("ar");
                System.out.println(e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }

    }
}



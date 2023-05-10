package com.exception_.tryCatch;

import java.util.Scanner;

/**
 * @author 欧欧
 * @version 1.0
 */
public class TryCatch02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Input:");
            String input = scanner.next();
            try {
                int i= Integer.parseInt(input);
                System.out.println("Success");
                break;
            } catch (NumberFormatException e) {
                System.out.println("input is not a integer try again;");
            }} while (true);

    }
}

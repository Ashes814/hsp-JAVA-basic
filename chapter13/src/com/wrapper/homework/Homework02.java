package com.wrapper.homework;

import java.util.Scanner;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        boolean illegalUsername = true;
        do {
            try {
                System.out.println("username:" );
                String userName = scanner.next();
                if (!(userName.length() == 3 || userName.length() == 4 || userName.length() == 5)) {
                    throw new RuntimeException("username length must equal to 3 or 4 or 5");
                }
                illegalUsername = false;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        } while (illegalUsername);


        boolean illegalPassword = true;
        do {
            try {
                System.out.println("password:");
                String password = scanner.next();
                Integer.parseInt(password);
                if (password.length() != 6) {
                    throw new RuntimeException("password length must equal to 6");
                }
                illegalPassword = false;
            } catch (NumberFormatException e) {
                System.out.println("password can only contain digit.");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        } while (illegalPassword);



        boolean illegalEmail = true;
        do {
            try {
                System.out.println("email:");
                String email = scanner.next();
                int atIndex = email.lastIndexOf('@');
                int dotIndex = email.lastIndexOf('.');
                if (atIndex == -1 || dotIndex == -1 || atIndex > dotIndex) {
                    throw new RuntimeException("Email Structure Error");
                }
                illegalEmail = false;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        } while (illegalEmail);

        System.out.println("Sign Up Success");
    }
}

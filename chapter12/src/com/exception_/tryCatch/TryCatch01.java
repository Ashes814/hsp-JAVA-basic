package com.exception_.tryCatch;

/**
 * @author 欧欧
 * @version 1.0
 */
public class TryCatch01 {
    public static int method() {
        int i = 1;
        try {
            i++; // i = 2
            String[] names = new String[3];
            if (names[1].equals("tom")) {
                System.out.println(names[1]);
            } else {
                names[3] = "jsss";
            }

            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {

            return 2;
        } catch (NullPointerException e) {
            return ++i; // i = 3
        } finally {
            ++i;
            System.out.println("i=" + i); // 4
        }
    }
    public static void main(String[] args) {
        System.out.println(method()); // 3

    }
}


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    Recursion r1 = new Recursion();
    System.out.println(r1.fibonacci(1));
    System.out.println(r1.fibonacci(2));
    System.out.println(r1.fibonacci(3));
    System.out.println(r1.fibonacci(4));
    System.out.println(r1.fibonacci(5));
    System.out.println(r1.fibonacci(6));
    System.out.println(r1.fibonacci(7));
    System.out.println(r1.fibonacci(8));


    System.out.println(r1.eatPeach(1, 10));

    


    }
       


}

class Recursion {
    public void recur(int n) {


        if(n > 2) {
            recur(n - 1);
        } else {
            System.out.println("n+" + n);
        }

        
        
    }

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Must Be a Positive Integer!!!!");
        }
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }

    public int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }  else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }


    }

    public int eatPeach(int day, int endDay) {
        if (day == endDay) {
            return 1;
        } else {
            return (eatPeach(day + 1, endDay) + 1) * 2;
        }

    }


}


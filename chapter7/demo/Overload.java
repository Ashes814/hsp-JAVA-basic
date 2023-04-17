import java.util.Calendar;

public class Overload {
    
    public static void main(String[] args) {
        Methods test = new Methods();
        // System.out.println(test.m(1));
        // System.out.println(test.m(1,2));
        // test.m("你爹");


        // System.out.println(test.max(1, 2));
        // System.out.println(test.max(1.1, 2.1));
        // System.out.println(test.max(1.1, 2.1, 3.1));
        System.out.println(test.sum(3,3,3,3));

        int[] a = {3,3,3,3};
        System.out.println(test.sum(a));

        
        
    }
}


class Methods {

    public int m(int n) {
        return n*n;
    }

    public int m(int n, int m) {
        return n*m;
    }
    public void m(String n) {
        System.out.println(n);
    }

    public int max(int a1, int a2) {
        return (a1 > a2 ) ? a1 : a2;
    }
    public double max(double a1, double a2) {
        return (a1 > a2 ) ? a1 : a2;
    }
    public double max(double a1, double a2, double a3) {

        if (a1 > a2) {
            if (a1 > a3) {
                return a1;
            } else {
                return a3;
            }
        } else {
            if (a2 > a3) {
                return a2;
            } else {
                return a3;
            }
        }

        
        
    }

    public int sum(int... nums) {
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            s += nums[i];
        }

        return s;

    }
   
}
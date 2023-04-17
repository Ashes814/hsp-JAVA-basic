package homework;

public class Homework06 {
    public static void main(String[] args) {
        Calc calc= new Calc();
        System.out.println(calc.add(1,0));
        System.out.println(calc.subtract(1,0));
        System.out.println(calc.multiply(1,0));
        System.out.println(calc.divide(1,0));

        

    }
}

class Calc {
  

    public double add(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public Double divide(double a, double b) {
        if (b == 0) {
            return null;
        }
        return a / b;
    }

    
}
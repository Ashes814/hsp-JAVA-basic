package demo;

public class Homework13 {
    public static void main(String[] args) {
        Circle circle = new Circle(0);
        PassObject passObject = new PassObject();
        passObject.printAreas(circle, 5);
    
        

    }
}

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public double findArea() {
        return radius * radius * Math.PI;
    }

    
    
}

class PassObject {
    public void printAreas(Circle c, int times) {
        for (int i = 1; i <= times; i++) {
            c.radius = (double) i;
            System.out.println(c.findArea());
        }
    }
}
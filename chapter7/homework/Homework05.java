package homework;

import demo.Circle;

public class Homework05 {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        circle.showArea();
        circle.showPerimeter();
        

    }
}

class Circle {
    double radius = 0.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void showPerimeter() {
        double perimeter = this.radius * 2 * Math.PI;
        System.out.println("Perimeter is: " + perimeter);
        
    }
    public void showArea() {
        double area = Math.PI * this.radius * this.radius ;
        System.out.println("Area is: " + area);
        
    }
}
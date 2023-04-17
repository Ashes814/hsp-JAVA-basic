package homework;

public class Homework07 {
    public static void main(String[] args) {
        // Dog miao = new Dog("miao", 8848);
        

        

    }
}

class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;

        this.show();
    }

    public void show() {
        System.out.println(this.name + " is " + this.age + " years old");
    }
    
}
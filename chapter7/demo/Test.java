import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[][] testArray = {{1},{1,2},{1,2,3}};
        MyTool t1 = new MyTool();
        t1.print2D(testArray);

        Person p1 = new Person();
        p1.name = "oo";
        p1.age = 8848;

        Person p2 = p1;
        Person newP1 = t1.copyPerson(p1);


        p2.age = 9949;

        newP1.age = 55;
        p1.age = 15;

        p1.name = "jj";
        System.out.println("p1:" + p1.name + p1.age);
        System.out.println("p2:" + p2.name + p2.age);
        System.out.println("newP1:" + newP1.name + newP1.age);

        System.out.println(p1.equals(newP1));
        System.out.println(p1.equals(p2));

    }
       


}

class Person {
    String name;
    int age;


}


class MyTool {
    

    public void print2D(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
  
    public Person copyPerson(Person personObject) {

        Person newObject = new Person();
        newObject.name = personObject.name;
        newObject.age = personObject.age;

        return newObject;

    }

}



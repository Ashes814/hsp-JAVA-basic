public class Constructor01 {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("oo", 8848);
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person1.name);
        System.out.println(person2.name);
        System.out.println(person1.age);
        System.out.println(person2.age);
    }
}


class Person {
    String name;
    int age;

    Person() {
        age = 18;
    }

    public Person(String name, int age) {
        System.out.println(this.hashCode());
        this.name = name;
        this.age = age;
    }

}
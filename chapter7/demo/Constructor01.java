public class Constructor01 {
    public static void main(String[] args) {
        TestPerson testPerson1 = new TestPerson("oo", 24);
        Person person2 = new Person("oo", 264);
        System.out.println(person2.compareTo(testPerson1));
     
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

    public boolean compareTo(TestPerson person) {
        if (this.name.equals(person.name) && this.age == person.age) {
            return true;
        } else {
            return false;
        }

    }

}

class TestPerson {
    String name;
    int age;

    public TestPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
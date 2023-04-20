package com.pack.equals_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person p1 = new Person("a", 10, 'm');
        Person p2 = new Person("a", 10, 'm');
        Person p3 = new Person("b", 11, 'm');
        Person p4 = p2;


//        System.out.println(p1 == p2); // false
//        System.out.println(p1.equals(p2)); // true true true true
//        System.out.println(p1.equals(p3)); // false false true false
//        System.out.println(p4 == p2); // true
//        System.out.println(p4.equals(p2)); // true

        System.out.println(p1);


    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toString() {
        return this.getName();
    }

    public boolean equals(Object personObj) {
        if (this == personObj) {
            return true;
        } else {
            if (personObj instanceof Person) {
                Person newPersonObj = (Person) personObj;
                boolean nameEqual = this.getName().equals(newPersonObj.getName());
                System.out.println("Check Name Equal: " + nameEqual);
                boolean ageEqual = this.getAge() == newPersonObj.getAge();
                System.out.println("Check Name Equal: " + ageEqual);
                boolean genderEqual = this.getGender() == newPersonObj.getGender();
                System.out.println("Check Name Equal: " + genderEqual);

                if (nameEqual && ageEqual && genderEqual) {
                    return true;
                } else {
                    return false;
                }


            } else {
                return false;
            }

        }
    }
}
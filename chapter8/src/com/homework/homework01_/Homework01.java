package com.homework.homework01_;

public class Homework01 {
    public static void main(String[] args) {
        Person[] personArray = {new Person("a", 2, "fireman"),
                new Person("b", 3, "policeman"),
                new Person("c", 1, "doctor"),
                new Person("c", 5, "doctor"),
                new Person("c", 6, "doctor"),
                new Person("c", 21, "doctor"),
                new Person("c", 18, "doctor"),
                new Person("c", 3, "doctor")};

        Homework01 test = new Homework01();
        test.sortPerson(personArray);

        for (int i = 0; i < personArray.length; i++) {
            System.out.println(personArray[i].getAge());

        }


    }

    public void sortPerson(Person[] pArr) {
        Person temp;
        for (int i = 0; i < pArr.length; i++) {
            for (int j = 0; j < pArr.length - i - 1; j++) {
                if (pArr[j].getAge() > pArr[j + 1].getAge()) {
                    temp = pArr[j + 1];
                    pArr[j + 1] = pArr[j];
                    pArr[j] = temp;
                }
            }
        }

    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }


}

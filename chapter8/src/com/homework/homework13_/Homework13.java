package com.homework.homework13_;


public class Homework13 {
    public static void main(String[] args) {
        Person[] staff = {new Student("s1", 10, 'm', "8848"),
                new Student("s2", 12, 'f', "9949"),
                new Teacher("t1", 32, 'm', 8),
                new Teacher("t2", 52, 'f', 28)};

        Homework13 exe = new Homework13();
        for (int i = 0; i < staff.length; i++) {
            staff[i].introduction();
            System.out.println("----------------");
            exe.execute(staff[i]);

        }

    }

    public void execute(Person person) {
        if (person instanceof Teacher) {
            ((Teacher) person).teach();


        } else if (person instanceof Student) {
            ((Student) person).study();
        }
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

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void play() {
        System.out.print(this.name + "爱玩");
    }

    public void introduction() {
        System.out.println("======================");
        System.out.println("Name：" + this.getName());
        System.out.println("Age：" + this.getAge());
        System.out.println("Gender：" + this.getGender());
    }
}

class Student extends Person {

    private String id;

    public Student(String name, int age, char gender, String id) {
        super(name, age, gender);
        this.id = id;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void study() {
        System.out.println("I Will Study Hard!");
    }

    @Override
    public void play() {
        super.play();
        System.out.println("足球");
    }

    @Override
    public void introduction() {
        System.out.println("学生的信息：");
        super.introduction();
        System.out.println("Work Age：" + this.getId());
        this.play();
        this.study();

    }
}

class Teacher extends Person {

    private int workAge;

    public Teacher(String name, int age, char gender, int workAge) {
        super(name, age, gender);
        this.workAge = workAge;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    public void teach() {
        System.out.println("I Will Teach Hard!");
    }

    @Override
    public void play() {
        super.play();
        System.out.println("象棋");
    }

    @Override
    public void introduction() {
        System.out.println("老师的信息：");
        super.introduction();
        System.out.println("Work Age：" + this.getWorkAge());
        this.play();
        this.teach();

    }
}
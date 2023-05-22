package com.oocool.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author 欧欧
 * @version 1.0
 */
public class HashMapExercise01 {
    public static void main(String[] args) {
        Employee e1 = new Employee("a", 10000, 1);
        Employee e2 = new Employee("b", 20000, 2);
        Employee e3 = new Employee("c", 30000, 3);

        HashMap hashMap = new HashMap();
        hashMap.put(e1.getId(), e1);
        hashMap.put(e2.getId(), e2);
        hashMap.put(e3.getId(), e3);


        for (Object key: hashMap.keySet()) {
           Employee emp = (Employee) hashMap.get(key);
           if (emp.getSalary() > 18000) {
               System.out.println(emp.getId() + ":" + emp.getSalary());
           }
        }
        Iterator empIterator = hashMap.entrySet().iterator();
        while ( empIterator.hasNext()) {
            Map.Entry e = (Map.Entry) empIterator.next();
            Employee emp2 = (Employee) e.getValue();
            if (emp2.getSalary() > 18000) {
                System.out.println(emp2.getId() + ":" + emp2.getSalary());
            }
        }

    }
}

class Employee {
    private String name;
    private double salary;
    private int id;

    Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}

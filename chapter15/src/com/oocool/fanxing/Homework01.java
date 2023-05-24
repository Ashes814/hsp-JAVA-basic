package com.oocool.fanxing;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 欧欧
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {

    }

    @Test
    public void test01() {
        DAO<User> userDAO = new DAO<>();
        userDAO.save("1", new User(1,19, "A"));
        userDAO.save("2", new User(2,12, "B"));
        userDAO.update("1", new User(3, 13, "C"));
        System.out.println(userDAO.list());
        userDAO.delete("2");
        System.out.println(userDAO.list());


    }
}

class DAO<T> {

    public static void main(String[] args) {

    }
    Map<String, T> map = new HashMap<>();


    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    };

    public void update(String id, T entity) {
        map.put(id, entity);
    }


    public List<T> list() {
        List<T> ts = new ArrayList<>();

        for (String key: map.keySet()) {
            ts.add(map.get(key));
        }


        return ts;
    }


    public void delete(String id) {
        map.remove(id);
    }
}

class User {
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
}




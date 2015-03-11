package com.lesson;

public class Humans {

    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge > 0 && newAge < 120) {
            age = newAge;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (newName != null && newName.length() >= 2) {
            name = newName;
        }
    }
}

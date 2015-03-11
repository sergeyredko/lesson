package com.lesson;

public class Lesson {
    public static void main (String[] args) {
        Humans human = new Humans();
        human.setName("Oleg");
        System.out.println(human.getName());
        human.setAge(100);
        System.out.println(human.getAge());
    }
}

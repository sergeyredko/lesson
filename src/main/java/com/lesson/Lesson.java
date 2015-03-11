package com.lesson;

public class Lesson {
    public static void main (String[] args) {
        Humans human = new Humans();
        human.name = "Sergey";
        System.out.println(human.getName());
        human.setName("Oleg");
        System.out.println(human.getName());

    }
}

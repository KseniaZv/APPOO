package com.company;

public class Main {

    public static void main(String[] args) {

        Man man = new Man();
        Woman woman = new Woman();

        man.setWeight(80);
        man.setHeight(190);
        man.setAge(36);

        woman.setWeight(80);
        woman.setHeight(190);
        woman.setAge(36);

        man.BMR();
        woman.BMR();

    }
}

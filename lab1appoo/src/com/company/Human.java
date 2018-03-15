package com.company;

public abstract class Human {
    private int weight;
    private int height;
    private int age;

    public abstract int BMR();

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(int newWeight) {
        weight = newWeight;
    }

    public void setHeight(int newHeight) {
        height = newHeight;
    }

    public void setAge(int newAge) {
        age = newAge;
    }
}

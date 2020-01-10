package com.company;

import java.awt.*;
import java.util.Random;

public class Pet {
    int age = generateDefaultAge();
    Color color;
    Shelter shelter;

    private int generateDefaultAge() {
        Random r = new Random();
        int i = r.nextInt(20);
        return i; //return ((int) (Math.random() * 10 + 5 ));
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public String getInfo() {
        return "Питомец:" + " { возраст =" + age + " , цвет = " + color +
                ", приют = " + shelter.getName() + shelter.getAddress();
    }

}
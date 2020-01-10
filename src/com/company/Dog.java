package com.company;

import java.awt.*;

public class Dog extends Pet {
    String name;
    String breed;
    String commands;

    public Dog (String name, String breed, Color color, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        super.setColor(color);
        super.setShelter(shelter);
    }
    public Dog (String name, String breed, Color color, Shelter shelter, String commands){
        this.name = name;
        this.breed = breed;
        super.setColor(color);
        super.setShelter(shelter);
        this.commands = commands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }
@Override
    public String getInfo(){
        return " Имя {" + name + " Парода " + breed +
                " Команда " + getCommands() + super.getInfo();
}



}

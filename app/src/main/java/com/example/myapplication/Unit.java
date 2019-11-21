package com.example.myapplication;

import android.widget.TextView;

public class Unit {

    public String getName() {
        return name;
    }

    private String name="Nigg";
    private int health=100;

    public Unit(String name, int health){
        this.name= name;
        this.health=health;
    }

    public void printInfo (TextView textPlace){
        textPlace.append("My name is " + name +" and I have " + health + " hp. \n");
    }

    public void letsGO(TextView textPlace){
        textPlace.append(name+ " started ran \n");
    }
}
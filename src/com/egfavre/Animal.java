package com.egfavre;

/**
 * Created by user on 5/24/16.
 */
public class Animal {
    String name;

    public void makeSound() {
        //default value
        System.out.println("Animal Sound!");
    }

    //override JAVA built in method
    @Override
    public String toString(){
        return name;
    }
}

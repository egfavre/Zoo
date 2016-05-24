package com.egfavre;

/**
 * Created by user on 5/24/16.
 */
public class Dog extends Mammal {
    public Dog(){
        this.name = "Dog";
    }
//to override Animal setting
    @Override
    public void makeSound(){
        System.out.println("Bark");
    }
}

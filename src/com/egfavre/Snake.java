package com.egfavre;

/**
 * Created by user on 5/24/16.
 */
public class Snake extends Reptile {
    public Snake(){
        this.name = "Snake";
    }
@Override
    public void makeSound(){
        System.out.println("ssss");
    }
}

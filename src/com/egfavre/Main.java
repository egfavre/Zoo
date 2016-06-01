package com.egfavre;

public class Main {

    public static void main(String[] args) {
        Animal d = createAnimal("Dog");
        Animal s = createAnimal("Snake");
        Animal h = createAnimal("Hawk");

        //anonymous class
        Animal a= new Reptile() {
          //define class
            @Override
            public void makeSound() {
                System.out.println("Croak!");
            }
        };
        a.name = "alligator";

        d.makeSound();
        s.makeSound();
        h.makeSound();
        a.makeSound();


        System.out.println(d);
        System.out.println(s);
        System.out.println(h);
        System.out.println(a);

        //returns name instead of memory address


    }
    //factory method- creates objects
    public static Animal createAnimal(String name){
        switch (name) {
            case "Dog":
                return new Dog();
            case "Snake":
                return new Snake();
            case "Hawk":
                return new Hawk();
        }
        return null;
    }


}

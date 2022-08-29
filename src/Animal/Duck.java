package src.Animal;

import src.AnimalRescuer.Animal;

public class Duck extends Animal {


    @Override
    public void speak() {
        System.out.println("Quack! Quack!");
    }

    @Override
    public void run() {
        System.out.println("The duck runs when it is scared.");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat() {
        System.out.println("Duck eats corn.");
    }

    @Override
    public void play() {
        System.out.println("The duck plays in the water.");
    }
}

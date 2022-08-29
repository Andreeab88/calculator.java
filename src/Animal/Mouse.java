package src.Animal;

import src.AnimalRescuer.Animal;

public class Mouse extends Animal {


    @Override
    public void speak() {
        System.out.println("Squeak! Squeak!");
    }

    @Override
    public void run() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat() {
        System.out.println("The mouse like to eat cheese.");
    }

    @Override
    public void play() {

    }
}

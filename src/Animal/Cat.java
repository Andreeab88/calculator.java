package src.Animal;

import src.AnimalRescuer.Animal;

public class Cat extends Animal {
    public void meouws() {
        System.out.println("Miauu!");
    }

    @Override
    public void speak() {
        System.out.println("Miau!");
    }

    @Override
    public void run() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat() {
        System.out.println("eating Purrina");
    }

    @Override
    public void play() {

    }
}

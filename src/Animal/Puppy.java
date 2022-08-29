package src.Animal;

import src.AnimalRescuer.Animal;

public class Puppy extends Animal {
    //-animal: nume, vârstă, nivelul stării de sănătate (de la 1 la 10), nivelul senzației de foame (de la 1 la 10),
    // nivelul stării de spirit (de la 1 la 10), numele mâncării preferate,
    //    numele activității de recreere preferate




    @Override
    public void speak() {
        System.out.println("Ham! Ham!");
    }

    @Override
    public void run() {
        System.out.println("Run in the morning.");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat() {
        System.out.println("The dog eat dog food.");
    }

    @Override
    public void play() {

    }
}


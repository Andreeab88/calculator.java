package src.AnimalRescuer;

import src.Animal.Cat;
import src.Animal.AboutDog.*;
import src.Animal.Duck;
import src.Animal.Mouse;
import src.Animal.Puppy;

public class Appmain {
    public static void main(String[] args) {
//Pentru fiecare clasă definiți proprietățile necesare si completati cu valori valide așa încât
        // în joc să se poată opera cu conceptele:
        // -animal: nume, vârstă, nivelul stării de sănătate (de la 1 la 10), nivelul senzației de foame (de la 1 la 10),
        // nivelul stării de spirit (de la 1 la 10), numele mâncării preferate, numele activității de recreere preferate
        // -adoptator: nume,
        // -sumă de bani disponibilă mâncare de animale: nume, preț, cantitate, disponibilitate în stoc
        //-activitate de recreere: nume
        //-medic veterinar: nume, specializare
        //Asigurați-vă că fiecare concept este reprezentat prin câte o proprietate de tipul corespunzător.
Puppy Labus = new Puppy();
        Labus.setName("Labus");
System.out.println(Labus.getName());
Labus.jogging();
        Labus.walk();

        Puppy Grivey = new Puppy();
        Grivey.setName ("\nGrivey");
        System.out.println(Grivey.getName());
        Grivey.walk();
        Grivey.jogging();

        Cat Felix = new Cat();
        Felix.setName("\nFelix");
        System.out.println(Felix.getName());
        Felix.meouws();

        Mouse Mouse= new Mouse();
        Mouse.setName("\nMouse");
        System.out.println(Mouse.getName());
        Mouse.squeak();

        Duck Ducky= new Duck();
        Ducky.setName("\nDucky");
        System.out.println(Ducky.getName());
        Ducky.quack();

FoodForDog Bella = new FoodForDog();
        Bella.moneyForDogFood();

 Adoption adoption = new Adoption();
 adoption.adoption();

 RecreationalAactivity relaxActivity = new RecreationalAactivity();
  relaxActivity.relaxActivity();

  Veterinarian goToDoctor = new Veterinarian();
  goToDoctor.goToDoctor();




    }
}

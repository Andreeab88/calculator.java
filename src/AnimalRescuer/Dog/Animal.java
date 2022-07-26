package src.AnimalRescuer.Dog;

public class Animal {
    //-animal: nume, vârstă, nivelul stării de sănătate (de la 1 la 10), nivelul senzației de foame (de la 1 la 10),
    //    // nivelul stării de spirit (de la 1 la 10), numele mâncării preferate, numele activității de recreere preferate

String name = "Bella";
int age = 5;
int theLevelOfHealth = 9;
int theLevelOfTheFeelingOfHunger = 10;
int moodLevel = 9;
String favoriteFood = "Purina";
String favoriteRecreationalActivity = "Power walk";

public void jogging(){
    System.out.println("Bella runs in the morning.");
}
public void walk(){
    System.out.println("Bella likes to go for a walk.");
}

}

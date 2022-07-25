package src.AnimalRescuer.Dog;

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
Animal animal = new Animal();
animal.jogging();
animal.walk();
        AmountOfMoneyAvailableForPetFood Bella = new AmountOfMoneyAvailableForPetFood();
        Bella.moneyForDogFood();
 Adoption adoption = new Adoption();
 adoption.adoption();
    }
}

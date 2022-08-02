package src.AnimalRescuer.Dog;

//medic veterinar: nume, specializare
public class Veterinarian {
  private String name ;
  private String specialization;

 public String getName(){
     return name;
 }

    public void setName(String name) {
        this.name = name;
    }


    public String getSpecialization(){
     return specialization;
    }
    public void setSpecialization(){
     this.specialization=specialization;
    }



    public void goToDoctor(){
      System.out.println("When Bella feels sick, she must be taken to the veterinary doctor. ");
  }
}

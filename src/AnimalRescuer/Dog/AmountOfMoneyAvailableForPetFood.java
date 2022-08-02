package src.AnimalRescuer.Dog;

//-sumă de bani disponibilă pentru mâncare de animale: nume, preț, cantitate, disponibilitate în stoc

public class AmountOfMoneyAvailableForPetFood {
   private String nameOfFood ;
   private double price ;
   private int quantity;
   private String availabilityInStock ;


  public String getNameOfFood(){
    return nameOfFood;
  }
  public void setNameOfFood(){
     this.nameOfFood=nameOfFood;
  }


  public double getPrice(){
      return price;
  }
  public void setPrice(){
      this.price=price;
  }



  public int getQuantity(){
      return quantity;
  }
  public void setQuantity(){
      this.quantity=quantity;
  }


  public String getAvailabilityInStock(){
      return availabilityInStock;
  }
  public void setAvailabilityInStock(){
      this.availabilityInStock=availabilityInStock;
  }



  public void moneyForDogFood(){
       System.out.println("I'm buying food for Bella.");
   }

}

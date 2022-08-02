package src.AnimalRescuer.Dog;

//-activitate de recreere: nume
public class RecreationalAactivity {
private String relaxActivity;

  public String getRelaxActivity(){
      return relaxActivity;
  }

    public void setRelaxActivity(String relaxActivity) {
        this.relaxActivity = relaxActivity;
    }

    public void relaxActivity(){
        System.out.println("Bella likes to sleep.");
        System.out.println("Bella likes to run.");
    }
}
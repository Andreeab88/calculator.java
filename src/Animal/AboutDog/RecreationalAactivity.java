package src.Animal.AboutDog;

//-activitate de recreere: nume
public class RecreationalAactivity {

    private String relaxActivity;

    public String getRelaxActivity() {
        return relaxActivity;
    }

    public void setRelaxActivity(String relaxActivity) {
        this.relaxActivity = relaxActivity;
    }



    public void relaxActivity(){
        System.out.println("Sleep.");
        System.out.println("Run.");
    }
}
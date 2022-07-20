package src;

public class LogicalOperations {
   public String verifyTextInput(String textInput) {
       if (textInput.equals("FastTrack")) {
           System.out.println("1. Learning text comparison.");
       } else {
           System.out.println("1. Got to try some more.");

       }
       return ("0");
   }
   public int getNumber(int x) {
       if ((x >= 2) && (x <= 8)) {
           System.out.println("2. The number " + x + " is in the given range.");
       } else if (!(x >= 2) && !(x <= 8)) {
           System.out.println("2. The number " + x + " is not in the given range.");
       }
       return (0);

   }

   public int getCmOfSnow(int i){
       if ((i>8) || (i==6)) {
           System.out.println("3. The amount of snow this winter was : " + i + " (cm).");
       }
        else  {
           System.out.println("3. The forecast snow is : " + i + " (cm).");
       }
        return (0);
         }


   public int getTheGreatherNumber(int y){
   if ((y>3) && (y!=4)) {
        System.out.println("4. The number is greater than 3 and not equal to 4.");
    }
else if (y==4) {
        System.out.println("4. The number is equal to 4.");
    }
     else if (y<3) {
       System.out.println("4. The number is lower than 3.");

   }
       return (0);



}}
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


   public int getTheGreatherNumber(int y) {
       if ((y > 3) && (y != 4)) {
           System.out.println("4. The number is greater than 3 and not equal to 4.");
       } else if (y == 4) {
           System.out.println("4. The number is equal to 4.");
       } else if (y < 3) {
           System.out.println("4. The number is lower than 3.");

       }
       return (0);

   }

       public void printToHundred (int x){

           for (int i = x; i <= 100; i++) {

               System.out.print(i +   " ");
           }
       }

       public void printMinusHundred(int y){
       for(int i = y; i>=-100; i--){
       System.out.print( i +   " ");

       }}

         public void intervalNumbers(int a, int b){
           for(int i = a;i<=b; i++){
               System.out.print(i +  " ");
           } }

    public void crescNumbers(int q,int w) {


        for (int i = q; i <= w; i++) {
            System.out.print(i +  " ");
        }
        for (int i = w; i <= q; i++) {
            System.out.print(i +  " ");
        }
    }





    public void evenNumbers(){
        for (int i = 1; i <= 100; i++) {
            if   (i%2==0){
                System.out.print(i +   " ");
            }
        }


    }


    public void oddNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

public double sumOfNumbers(int z, int sum){


      for(int i=z;i<=100;i++){

          sum =sum + i;
          System.out.print(sum + " ");
      }
return sum;
   }


    public double sumAndAverage() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            System.out.print(sum + " ");
        }
        return sum / 100d;
    }

        }
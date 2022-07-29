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
  public void numberCountTo100(int c){
       while (c<=100){
                System.out.print(c + " ");
                c++;
            }
        }

    public void numberCountToMinusToHundred(int c){
        while (c>=-100){
            System.out.print(c + " ");
            c--;
        }
    }


public void setNumeratorBetweenTwoNumbers(int first,int second){

    while (first<=second) {
        System.out.print(first + " ");
    first++;
    }
}

public void setIncreasingNumbersBetweenAnInterval(int first, int second){
       while (first<=second){
           System.out.println(first + " ");
           first++;
       }
    while (first>=second){
        System.out.print(second + " ");
        second++;
    }
   }

public void EvenNumbers(){
       int i =0;
       while( i<=100){
           i++;
          if(i%2==0) {
           System.out.print(i + " ");

       }}

   }


    public void OddNumbers(){
        int i = 0;
        while( i<=100){
            i++;
            if(i%2!=0) {
                System.out.print(i + " ");

            }}

    }


public void getSumAndAverage(){
int first = 111;
int last = 8899;
    int sum1 = 0;
    double count = 0;
   while(first <= last){
        sum1 = sum1 + first;
        first++;
        count++;

    }
    System.out.println(sum1/count);
   }


   public double getDivideWith7AndAverage(int start, int finish){
       int div = 0;
       double count = 0;
   while(start<=finish){
       start++;
       count++;
       if (start%7==0){
          System.out.print(start + " ");

      }

   }
       return(start/count);
   }

  public void getFibonacciSeries(){

  int n1 = 0;
    int n2 = 1;
    int count = 20;
        System.out.println("\n\n 18. Fibonacci Series of "+count+" numbers:");

        int i=1;
        while(i<=count){
            System.out.print(n1+" ");
            int sumOfPrevTwo = n1 + n2;
            n1 = n2;
            n2 = sumOfPrevTwo;
            i++;

        }
      }

//  Creati o metoda numita CozaLozaWoza.
    //Metoda va afisa:
    //- numerele de la 1 la 110
    //- 11 numere pe linie
    //- se va afisa Coza pentru numerele care sunt multiplu de 3 (1 2 Coza 4)
    //- se va afisa Loza pentru numerele care sunt multiplu de 5 (2 3 4 Loza 6)
    //- se va afisa Woza pentru numerele care sunt multiplu de 7 (4 5 6 Woza 8)
    //- se va afisa CozaLoza pentru numerele care sunt multiplu de 3 SI 5
    //- se va afisa CozaWoza pentru multiplu de 3 SI 7
    //- se va afisa WozaLoza pentru multiplu de 5 SI 7
    //- se va afisa CozaLozaWoza pentru multiplu de 3 SI 5 SI 7

public void printCozaLozaWoza(){
     for(int i = 1; i<=110; i++){
         if(i%3==0){
             System.out.print("Coza ");
         } else if(i%5==0){
             System.out.print("Loza ");
         }else if(i%7==0){
             System.out.print("Woza ");
         } else if(i%3==0 && i%5==0){
             System.out.print("CozaLoza ");
         }else if(i%3==0&&i%7==0){
             System.out.print("CozaWoza ");
         }else if(i%5==0&&i%7==0){
             System.out.print("WozaLoza ");
         }else if(i%3==0&&i%5==0&&i%7==0){
             System.out.println("CozaLozaWoza ");
         } else System.out.print(i + " ");
         if(i%11==0){
             System.out.println();
         }
     }



   }}










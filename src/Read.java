package src;

import java.util.InputMismatchException;
import java.util.Scanner;

//1. In clasa Read, din programul vostru, creati o metoda tratat, care sa returneze un numar de la tastatura.

public class Read {

    public int getInt(){
        int number = 0;
        boolean repeat;
        Scanner scan = new Scanner(System.in);
       do {
           try {

               System.out.println("Please enter a number: ");
              number = scan.nextInt();
               repeat=false;
           } catch (InputMismatchException exception) {
               System.err.println("Wrong! This is not a number! " + scan.next());
           repeat=true;
           }
       }while (repeat);
   return number;
    }
}

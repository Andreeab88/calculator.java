package src;

import java.util.Arrays;
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

               System.out.println("1. Please enter a integer number: ");
              number = scan.nextInt();
               repeat=false;
           } catch (InputMismatchException exception) {
               System.err.println("Wrong! This is not a integer number! " + scan.next());
           repeat=true;
           }
       }while (repeat);
   return number;
    }

//2. In clasa Read, duplicati metoda de la punctul 1, astfel incat sa aveti mai multe metode,
// care sa citeasca si sa returneze si alte tipuri de numere (float, int, double, long, etc)

    public float getFloat(){
       float number = 0;
        boolean repeat;
        Scanner scan = new Scanner(System.in);
        do {
            try {

                System.out.println("2. Please enter a float number: ");
                number = scan.nextFloat();
                repeat=false;
            } catch (InputMismatchException exception) {
                System.err.println("Wrong! This is not a float number! " + scan.next());
                repeat=true;
            }
        }while (repeat);
        return number;
    }


    public double getDouble(){
        double number = 0;
        boolean repeat;
        Scanner scan = new Scanner(System.in);
        do {
            try {

                System.out.println("3. Please enter a double number: ");
                number = scan.nextDouble();
                repeat=false;
            } catch (InputMismatchException exception) {
                System.err.println("Wrong! This is not a double number! " + scan.next());
                repeat=true;
            }
        }while (repeat);
        return number;
    }


    public long getLong(){
        long number = 0;
        boolean repeat;
      Scanner scan = new Scanner(System.in);
        do {
            try {
                System.out.println("4. Please enter a long number: ");
                number = scan.nextLong();
                repeat=false;
            } catch (InputMismatchException exception) {
                System.err.println("Wrong! This is not a long number! " + scan.next());
                repeat=true;
            }
        }while (repeat);
        return number;
    }



 //3. In clasa Read, creati o metoda care sa returneze un array de numere populat de la tastatura.
    // Metoda sa primeasca ca si parametru un numar, care reprezinta cate pozitii are.

public int[] getMyArrayOfInt(int length){
    int [] myArray= new int[length];
    boolean repeat;
    Scanner scan = new Scanner(System.in);

        do {
            try {


                System.out.println("5. Enter the length of the array:");
                 length = scan.nextInt();

                System.out.println(" Please enter  elements of the array: ");
                myArray = new int[length];

                for(int i=0; i<myArray.length; i++){
                    myArray[i] = scan.nextInt();
                }
                System.out.println(Arrays.toString(myArray));
                repeat=false;
            } catch (InputMismatchException exception) {
                System.err.println("Wrong! This is not a array! " + scan.next());
               repeat=true;
            }
        }while (repeat);
    return myArray;

    }

}



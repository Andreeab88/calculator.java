package src;

import java.util.*;

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

                System.out.println("2.a. Please enter a float number: ");
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

                System.out.println("2.b.  Please enter a double number: ");
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
                System.out.println("2.c. Please enter a long number: ");
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

    Scanner scan = new Scanner(System.in);

    System.out.println("3. Enter the length of the array:");
                 length = scan.nextInt();

                System.out.println(" Please enter  elements of the array: ");
                myArray = new int[length];

                for(int i=0; i<myArray.length; i++){
                    myArray[i] = scan.nextInt();
                }
                System.out.println(Arrays.toString(myArray));

                return myArray;

    }


//4. In clasa Read, creati o metoda care sa returneze o lista de numere populate de la tastatura.
// Metoda nu va primi parametru lungimea. In rezolvarea ei trebuie folosit try-catch.
// (Hint: a se citi de la tastatura atata timp cat valoarea primita e numar,
// cand nu mai e numar, sa se intrerupa citirea)

    public List<Integer> getTheListOfInt() {
       List<Integer> myList = new ArrayList<>();

        boolean repeat;
        do {
            try {

                Scanner scan = new Scanner(System.in);
                System.out.println("4. Please enter a number from list: ");
int number = scan.nextInt();
                System.out.println(" Please enter  a number: ");
               myList.add(number);
              for (int i = 0; i < myList.size(); i++) {

                   myList.set(i, scan.nextInt());

              }
              System.out.println(myList);
              repeat = false;
            } catch (InputMismatchException exception) {
                System.err.println("Wrong! This is not a number! ");
                repeat = true;
            }

        } while (repeat);
        return myList;

    }


//5. In clasa LogicalOp, creati o metoda care sa primeasca un array de numere ca si parametru, si un numar.
// Fara a folosi conditii, si folosind un try-catch, afisati valoarea de pe pozitia numarului primit,
// iar daca valoarea numarului este mai mare decat numarul de pozitii din array,
// afisati textul: "Inside catch, number too large".


public void getMyArray(int x){
    int[] myArray=new int[5];

        try{
            Scanner scan = new Scanner(System.in);

            System.out.println("5. Enter the array: " );
            for(int i=0;i< myArray.length;i++) {
            myArray[i] = scan.nextInt();}
            System.out.println("Enter a number index: " );
            x = scan.nextInt();

            System.out.println("The index value of the received number is: " );

            System.out.println(myArray[x]);

            }

            catch (ArrayIndexOutOfBoundsException exception){

                if (x > myArray.length) {
                    System.err.println("Number too large!!!");


            }
        }
}






}



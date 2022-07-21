package src;

import java.util.Scanner;

public class Main3 {
    public  static void main(String[] args) {

        //1. Given a text input, if it is “FastTrack”, then print “Learning text comparison”. If not, print
        //“Got to try some more”
        String textInput = "FastTrack";
LogicalOperations op = new LogicalOperations();
op.verifyTextInput(textInput);


//2. Given a number, if it’s equal to or higher than 2 and equal to or lower than 8, print the
//number
        int x = 9;
op.getNumber(x);


//3. Given a number input, if it is higher than 8 OR equal to 6, print “The amount of snow
//this winter was(cm):” and the given number. Else print “The forecast snow is(cm):”
        int i = 2;
   op.getCmOfSnow(i);

//4. Given a number input, if the number is greater than 3 but not equal to 4, print “The
//number is greater than 3 and not equal to 4”. Else if the number is equal to 4 print
//”The number is equal to 4”. Else if the number is lower than 3 print “The number is
//lower than 3”
        int y = 2;
op.getTheGreatherNumber(y);

//5. If the user pressed number keys( from 0 to 9), the program will tell the number that is
//pressed, otherwise, program will show "Not allowed”. (use a switch case for this)
Scanner scanner=new Scanner(System.in);
        Scanner reader=new Scanner(System.in);
        System.out.println("5. Press a number: ");
        int z = reader.nextInt();
        switch (z) {
            case 0: System.out.println("The user pressed: 0.");break;
            case 1: System.out.println("The user pressed: 1.");break;
            case 2: System.out.println("The user pressed: 2.");break;
            case 3: System.out.println("The user pressed: 3.");break;
            case 4: System.out.println("The user pressed: 4.");break;
            case 5: System.out.println("The user pressed: 5.");break;
            case 6: System.out.println("The user pressed: 6.");break;
            case 7: System.out.println("The user pressed: 7.");break;
            case 8: System.out.println("The user pressed: 8.");break;
            case 9: System.out.println("The user pressed: 9.");break;
            default: System.out.println("Not allowed");
        }

    //6. Write a Java program to determine whether an input number is an even number.
        System.out.println("6. Enter the number: " );
        int a =  reader.nextInt();
        if (a % 2 == 0){
              System.out.println("The number " + a + " is even.");}
           else System.out.println("The number " + a + " is odd.");


   //7. Write Java program to allow the user to input his/her age. Then the program will show
        //if the person is eligible to vote. A person who is eligible to vote must be older than or
        //equal to 18 years old.

        System.out.println("7. Enter your age: ");
        int b = reader.nextInt();
        if (b>=18){
                   System.out.println("The person is eligible to vote.");
               } else System.out.println("The person is not eligible to vote.");

       //8. Find the greatest number from 3 given numbers.
        System.out.println("8. Enter 3 numbers: " );
               int q = reader.nextInt();
               int w = reader.nextInt();
              int e = reader.nextInt();

        if (q > w) {
            System.out.println("The greatest number is: " + q + ("."));
        } else if (w > e) {
            System.out.println("The greatest number is: " + w + ("."));
        } else
            System.out.println("The greatest number is: " + e + ("."));


        //9. Se citeste un numar, sa se afiseze valoarea numarului citit.
        System.out.println("9. Enter a number: ");
        int s = reader.nextInt();
        System.out.println("The value of number is: " + s + ("."));

        //10. Se citeste un numar, sa se afiseze patratul acestuia (x^2).

        System.out.println("10. Enter a number: ");
       int r = reader.nextInt();
       float t = r^2;
        System.out.println("The square of number " + r + " is: " + t + ".");


    //11. Se citesc doua numere, sa se afiseze rezultatul impartirii celor doua numere.
        System.out.println("11. Enter first number: ");
        double first= reader.nextDouble();
        System.out.println("Enter second number: ");
        int second= reader.nextInt();

        System.out.println("The result of dividing the two numbers is: " + (first / second) + ("."));


        //Se citesc patru numere, sa se afiseze maximul.
        System.out.println("12. Enter first number:");
        int m = reader.nextInt();
        System.out.println("Enter the second number:");
        int n = reader.nextInt();
        System.out.println("Enter the third number:");
        int k = reader.nextInt();
        System.out.println("Enter the other number:");
        int l = reader.nextInt();
        if ((m>=n) && (m>=k) && (m>=l)) {
          System.out.println("The maximum of the four numbers is:" + m);
       } else if ((n>=m) && (n>=k) && (n>=l)) {
           System.out.println("The maximum of the four numbers is:" + n);
        } else if ((k>=m) && (k>=n) && (k>=l)) {
           System.out.println("The maximum of the four numbers is:" + k);
       } else System.out.println("The maximum of the four numbers is: " + l);



   //13. Se citesc trei numere, sa se afiseze minimul si maximul.
        System.out.println("13. Enter first number:");
        int d = reader.nextInt();
        System.out.println("Enter the second number:");
        int f = reader.nextInt();
        System.out.println("Enter the third number:");
        int g = reader.nextInt();

        if ((d<=f) && (d<=g)) {
            System.out.println("The minimum of the three numbers is:" +  d + ".");
        } else if ((f<=d) && (f<=g)){
            System.out.println("The minimum of the three numbers is:" + f + ".");
        }else
        System.out.println("The minimum of the three numbers is:" + g + ".");

        if ((d>=f) && (d>=g)) {
            System.out.println("The maximum of the three numbers is:" + d + ".");

        } else if ((f>=d) && (f>=g)){
            System.out.println("The maximum of the three numbers is:" + f + ".");

        }else System.out.println("The maximum of the three numbers is:" + g + ".");


        //14. Se citesc doua numere, sa se ordoneze crescator.
        System.out.println("14. Enter first number:");
        int o = reader.nextInt();
        System.out.println("Enter the second number:");
        int p = reader.nextInt();
        if (o<p){
            System.out.println("The two numbers written in ascending order are:" + o + "," + p + ".");
        } else System.out.println("The two numbers written in ascending order are:" + p + "," + o + ".");

    }
}

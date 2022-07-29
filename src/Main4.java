package src;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main4 {
    //1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100,
    //pornind de la numarul primit ca si parametru.
    // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public static void main(String[] args) {

        int x = 5;
        LogicalOperations op = new LogicalOperations();
        System.out.println("1. Counting up to 100 is: ");
        op.printToHundred(x);

        //2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
        // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
        // pornind de la numarul primit ca si parametru.
        // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

        int y = 7;
        System.out.println("\n\n 2. Counting up to -100 is: ");
        op.printMinusHundred(y);

        //  3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
        //  Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit,
        //  pana la cel de-al doilea (ex: daca int x e primul parametru iar int y  este cel de-al doilea,
        //  numaratoarea sa se faca de la x, la y.

        int a = 2;
        int b = 10;
        System.out.println("\n\n 3. The numerator between the two numbers is: ");
        op.intervalNumbers(a, b);

        //4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
        // Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
        // si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
        // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,
        // atunci numaratoarea sa fie de la y la x).

        Scanner reader=new Scanner(System.in);


        System.out.println("\n\n 4. Enter 2 numbers: ");
        int q = reader.nextInt();
        int w = reader.nextInt();
        op.crescNumbers(q,w);
//5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

        System.out.println("\n\n 5. The even numbers from 1 to 100: ");
        op.evenNumbers();

//6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

        System.out.println("\n\n 6. The odd numbers from 1 to 100: ");
        op.oddNumbers();
//7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
// Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
// iar la final sa returneze rezultatul. Apelati metoda in clasa Main,
// metoda main() pentru a verifica daca functioneaza.
        int z = 5;
        int sum = 0;
        System.out.println("\n\n 7. The sum of numbers count up to 100: ");
        op.sumOfNumbers(z,sum);

//8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
// Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
// si sa calculeze media numerelor. La final, metoda sa returneze media. Apelati metoda in clasa Main,
// metoda main() pentru a verifica daca functioneaza.
        System.out.println("\n\n 8. The sum and average of numbers count up to 100: ");
        op.sumAndAverage();


 //9. Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:

        //*******
        //******
        //*****
        //****
        //***
        //**
        //*

Print print=new Print();
        System.out.println("\n 9. ");
print.printStars();
    } }


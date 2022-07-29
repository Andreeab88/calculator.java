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
        System.out.println("\n\n 3. The numerator between two numbers is: ");
        op.intervalNumbers(a, b);

        //4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
        // Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
        // si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
        // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,
        // atunci numaratoarea sa fie de la y la x).


        System.out.println("\n\n 4. The  increasing numbers within the range are: ");
        int q = 8;
        int w = 3;
        op.crescNumbers(q, w);
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
        op.sumOfNumbers(z, sum);

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

        Print print = new Print();
        System.out.println("\n 9. ");
        print.printStars();

        //10. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
        // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la 100,
        // pornind de la numarul primit ca si parametru.
        // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

        System.out.println("\n\n 10. Counting up to 100 (with WHILE loops) is :  ");
        op.numberCountTo100(5);
        //11. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
        // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
        // pornind de la numarul primit ca si parametru.
        // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

        System.out.println("\n\n 11. Counting up to -100 (with WHILE loops) is :  ");
        op.numberCountToMinusToHundred(5);

        //12. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
        // Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit,
        // pana la cel de-al doilea (ex: daca int x e primul parametru iar int y  este cel de-al doilea,
        // numaratoarea sa se faca de la x, la y.

        System.out.println("\n\n 12. The numerator between two numbers (with WHILE loops) is:");
        op.setNumeratorBetweenTwoNumbers(5, 8);


        // 13.    Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
        //     Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
        //     si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
        //     (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,
        //     atunci numaratoarea sa fie de la y la x).

        System.out.println("\n\n 13. The  increasing numbers within the range (with WHILE loops) are: ");
        op.setIncreasingNumbersBetweenAnInterval(8, 4);


        //14.  Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

        System.out.println("\n\n 14. The even numbers from 1 to 100 (with WHILE loops) :");


        op.EvenNumbers();

        //15. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

        System.out.println("\n\n 15. The odd numbers from 1 to 100 (with WHILE loops) :");
        op.OddNumbers();


        //16. Creati o metoda care sa adune toate numerele din intervalul 111 si 8899. Sa se afiseze suma totala,
        // iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval.
        // Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval.
        // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

        System.out.println("\n\n 16. The sum and average of numbers (with WHILE loops) :");
        op.getSumAndAverage();

        //17.  Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze media numerelor
        // divizibile cu 7, din acel interval. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

        System.out.println("\n\n 17. The  average of numbers divisible by 7 (with WHILE loops) is:");
        op.getDivideWith7AndAverage(1,20);

//18.  Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.

op.getFibonacciSeries();

        System.out.println("\n\n 19. CozaLozaWoza: ");

 op.printCozaLozaWoza();

    }}
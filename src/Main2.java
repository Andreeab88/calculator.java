package src;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Calculator calc = new Calculator();

        //Tema lab.10:
        //1. Pentru exercitiile din clasa main() de data trecuta,
        // creati metode separate pentru fiecare, tot in clasa Main.java,
        // si apoi apelati-le in metoda main().

        //1.1. Printati "Hello" in consola, iar pe rand nou, printati numele vostru.
        System.out.println("     TEMA LABORATOR 10:       ");

        System.out.println("1.1. Hello \n     Andreea");

        //1.2.Printati rezultatul sumei a doua numere(orice numere)
        //        short a = 10;    int b = 20;    int c = a+b;

        System.out.println("1.2. x = 10+20 = "+ calc.sum(10,20)+(";"));

        //1.3. Printati rezultatul impartirii a doua numere.
        // Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.
        // double x = 15;     int y = 4;      double z = x/y;

        System.out.println("1.3. z = 15/4 = "+ calc.divide(15,4)+(";"));

        //1.4. Printati rezultatul urmatoarelor operatiuni:
        //1.4.a.   -5 + 8 * 6
        //int q = -5;      int w = 8;      int e = 6;      double r = q+w*e;

        System.out.println("1.4.a. r = -5+8*6 = "+ calc.r(-5,8,6)+(";"));

        //1.4.b.   (55+9) % 9
        //double t = 55;     int u = 9;       double i = (t+u)%u;

        System.out.println("1.4.b. i = (55+9)%9 = "+ calc.i(55,9)+(";"));

        //1.4.c.  20 + -3*5 / 8
        //float o = 20;   float p = -3;    int s = 5;   int d = 8;    float res = o+p*s/d;

        System.out.println("1.4.c. f = 20+-3*5/8 = "+ calc.res(20,-3,5,8)+(";"));

        //1.4.d. 5 + 15 / 3 * 2 - 8 % 3
        ///int f = 5;  double g = 15;  int h = 3;  int j = 2;  int k = 8;  double v = f+g/h*j-k%h;

        System.out.println("1.4.d. v = 5+15/3*2-8%3 = "+ calc.v(5,15,3,2,8) +(";"));

        //1.5. Write a Java program to print ‘The addition of 7 and 8 is: ‘, and then the
        // sum of the two numbers
        //int n = 7;   int m = 8;   double sum = n+m;

        System.out.println("1.5. The addition of 7 and 8 is: "+ calc.adun(7,8)+(";"));

        //1.6. Write a Java program to divide two numbers and print on the screen.
        //double number1 = 20;   int number2 = 6;   exerc2 = number1/number2;

        System.out.println("1.6. divideTheNumbers = 20/6 = "+ calc.c(20,6)+(";"));

        //2. Scrieti cate o metoda java pentru fiecare din urmatoarele operatii matematice:
        // adunare, scadere, inmultire, impartire. Fiecare metoda ar trebui sa primeasca
        // doi parametrii de tip numar,sa execute operatia, si sa returneze rezultatul.
        //Apoi apelati metoda in main cu valorile cu care doriti sa executati operatia.


        System.out.println("2.a. Rezultatul adunarii este: "+
                calc.adunare(7,9)+(";"));
        System.out.println("2.b. Rezultatul scaderii este: "+
                calc.scadere(15,7)+(";"));
        System.out.println("2.c. Rezultatul inmultirii este: "+
                calc.inmultire(6,6)+(";"));
        System.out.println("2.d. Rezultatul impartirii este: "+
                calc.impartire(21,6)+(";"));

        //3. Scrieti o metoda java, care sa afiseze urmatorul model:
        Print print=new Print();
        System.out.println("3. Modelul Java:");
        print.modelJava();

        // 4.Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar,
        //si sa returneze media numerelor.
        System.out.println("\n4. Media numerelor 7,8,9 este: "+
                calc.mediaNumerelor(7,8,9)+(";"));

        //5.Scrieti o metoda java, care sa afiseze urmatorul model:
        System.out.println("5.");
        print.model();

        //6.Scrieti o metoda java, care sa returneze restul impartirii a doua numere.
        System.out.println("6. Restul impartirii numerelor 15 si 7 este: "+
                calc.restulImpartirii(15,7)+(";"));

        //7.Scrieti o metoda java, care sa primeasca ca si parametru un numar,
        //care sa reprezinte temperatura in Fahrenheit, si sa returneze temperatura in Celsius.
        //Formula de calcul este: C = (F -32) * 5/9.

        Scanner scanner = new Scanner(System.in);
        System.out.print("7. Introdu valoarea in Fahrenheit: ");

        int F = scanner.nextInt();

        System.out.println("Conversia numarului "+F +" din Fahrenheit in Celsius este: "+
                (F -32)*5/9+(";"));

        //8.Scrieti o metoda java, care sa primeasca ca si parametru un numar real,
        //care sa reprezinte distanta in inch, si sa returneze distanta in metri.

        System.out.print("8. Introdu valoarea in inch: ");
        int Inches = scanner.nextInt();
        System.out.print("Conversia numarului "+Inches +" din inch in metri este: "+
                Inches  *0.0254+(";"));

        //9.Scrieti o metoda java, care primeste distanta (in metrii) si timpul
        //(ca si 3 numere: ore, minute, secunde), si afiseaza viteza, in metrii pe secunda,
        // kilometrii pe ora si mile pe ora.
        //(Indiciu: 1 mila = 1609 metrii)

        System.out.print("\n 9. Introdu distanta (metri): ");
        int distanta = scanner.nextInt();
        System.out.print("\n Introdu ore, minute, secunde: ");
        int kilometri=scanner.nextInt();
        int ora=scanner.nextInt();
        int secunda=scanner.nextInt();


        System.out.print("Viteza de deplasare (metri/secunda)  este: " + distanta/secunda+(";"));


        System.out.print("\n Viteza de deplasare (kilometri/ora) este: " + kilometri/ora + (";"));

        System.out.print("\n Viteza de deplasare (mile/ora) este: " + 1609/ora + (";"));


    }
}

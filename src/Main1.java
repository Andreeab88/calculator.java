package src;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("      TEMA LABORATOR 9:     ");

        //1. Printati "Hello" in consola, iar pe rand nou, printati numele vostru.
        System.out.println("1.    Hello!");
        System.out.println("      Andreea");
        //2. Printati rezultatul sumei a doua numere(orice numere)
        short a = 10;
        int b = 20;
        int c = a+b;
        System.out.println("2.    c = 10+20 = " + c + (";"));

        //3. Printati rezultatul impartirii a doua numere.
        // Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.
        double x = 15;
        int y = 4;
        double z = x/y;
        System.out.println("3.    z = 15/4 = " + z + (";"));

        //4. Printati rezultatul urmatoarelor operatiuni:
        //a. -5 + 8 * 6
        int q = -5;
        int w = 8;
        int e = 6;
        double r = q+w*e;
        System.out.println("4.a.  r = -5+8*6 = " + r + (";"));


        //b. (55+9) % 9
        double t = 55;
        int u = 9;
        double i = (t+u)%u;
        System.out.println("  b.  i = (55+9)%9 = " + i + (";"));

        //c. 20 + -3*5 / 8
        float o = 20;
        float p = -3;
        int s = 5;
        int d = 8;
        float res = o+p*s/d;
        System.out.println("  c.  f = 20+-3*5/8 = " + res + (";"));

        //d. 5 + 15 / 3 * 2 - 8 % 3
        int f = 5;
        double g = 15;
        int h = 3;
        int j = 2;
        int k = 8;
        double v = f+g/h*j-k%h;
        System.out.println("  v.  t = 5 + 15 / 3 * 2 - 8 % 3 =" + v + (";"));

        //5. Write a Java program to print ‘The addition of 7 and 8 is: ‘, and then the
        // sum of the two numbers
        int n = 7;
        int m = 8;
        double sum = n+m;
        System.out.println("5. The addition of 7 and 8 is: " + sum + (";"));

        //6. Write a Java program to divide two numbers and print on the screen.
        double number1 = 20;
        int number2 = 6;
        double dividenumber = number1/number2;
        System.out.println("6. c = " + dividenumber + (";"));


        System.out.println(5);
        System.out.println("5");
        System.out.print("Buna!\n");
        System.out.println("Ce faci? \nEu sunt Andreea si vreau sa devin Software Tester," +
                " dar mai am de invatat. O zi buna!");

    }}


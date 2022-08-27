package src;

import java.lang.reflect.Method;

public class Main7 {
    public static void main(String[] args) {

        //1. In clasa Read, din programul vostru, creati o metoda tratat, care sa returneze un numar de la tastatura.


Read read = new Read();
int x = read.getInt();
        System.out.println(x);


//2. In clasa Read, duplicati metoda de la punctul 1, astfel incat sa aveti mai multe metode,
// care sa citeasca si sa returneze si alte tipuri de numere (float, int, double, long, etc)


        Read read1 = new Read();
       float y = read1.getFloat();
        System.out.println(y);


        Read read2 = new Read();
        double z= read2.getDouble();
        System.out.println(z);

        Read read3 = new Read();
        double q= read3.getLong();
        System.out.println(q);


  //3. In clasa Read, creati o metoda care sa returneze un array de numere populat de la tastatura.
        // Metoda sa primeasca ca si parametru un numar, care reprezinta cate pozitii are.

    Read read4 = new Read();
    read4.getMyArrayOfInt(args.length);


    //In clasa Read, creati o metoda care sa returneze o lista de numere populate de la tastatura.
        // Metoda nu v-a primii parametru lungimea. In rezolvarea ei trebuie folosit try-catch.
        // (Hint: a se citi de la tastatura atata timp cat valoarea primita e numar,
        // cand nu mai e numar, sa se intrerupa citirea)

        Read read5 = new Read();

           read5.getTheListOfInt();


   //5. In clasa LogicalOp, creati o metoda care sa primeasca un array de numere ca si parametru, si un numar.
        // Fara a folosi conditii, si folosind un try-catch, afisati valoarea de pe pozitia numarului primit,
        // iar daca valoarea numarului este mai mare decat numarul de pozitii din array,
        // afisati textul: "Inside catch, number too large".


        Read read6 = new Read();

        read6.getMyArray(x);


   //6. In clasa LogicalOp, creati o metoda  'wait()'. Metoda sa nu returneze nimic,
        // dar sa primeasca un parametru de tip int. In interiorul ei, tratati metoda Thread.sleep(),
        // astfel incat metoda noastra sa primeasca valoarea in secunde,
        // cat sa astepte. Ex: wait(5) -> asteapta 5 secunde.
LogicalOperations op=new LogicalOperations();
        op.waitMethod(x);

    }
}

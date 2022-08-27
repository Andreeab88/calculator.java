package src;

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


    }
}

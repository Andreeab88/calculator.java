package src;

public class Print {

    public void model(){
        System.out.println(
                        "  +|||||+  \n" +
                        " [| o o |] \n" +
                        "  |  ^  |  \n" +
                        "  | '-' |  \n" +
                        "  +-----+    "
        );

    }


    public void modelJava()
    {
        System.out.print(
                        "     J      a       V     V      a    \n"+
                        "     J     a a       V   V      a a   \n"+
                        "  J  J    aaaaa       V V      aaaaa  \n"+
                        "  J J    a     a       V      a     a "
        );



    }
    public void printStars(){

        for(int i = 1;i<=7;i++){
            for(int j = 7;j>=i;j--){
               System.out.print("* ");
                                    }
            System.out.println();
        }

    }



// Creati o metoda care sa afiseze urmatoarea grila, folosind un array:

    public void printArrayModel() {

        char[] model= {'-', '-', '-', '-', '-','-','-','-','-','-'};
        for (int i = 0; i < 10;i++) {

                System.out.println(model);
            }

        }

    }


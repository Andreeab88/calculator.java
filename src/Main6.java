package src;

import java.util.*;

public class Main6 {
    public static void main(String[] args) {
        //1. Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze,
        // pe rand, toate valorile din lista, fiecare pe rand nou.

        LogicalOperations op=new LogicalOperations();
        System.out.println("1. The list is: ");
        List <Integer> myList=new ArrayList<>(100);
        for (int i = 0; i <=100; i++) {
            myList.add(i);}

       op.printMyArrayList(myList);

 //2.  Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere,
        // si celalalt un numar (real sau intreg).
        // Metoda sa adauge numarul primit ca si parametru la final de lista.

        System.out.println("2. The list with the last changed parameter is: ");
        List <Integer> myList1=new ArrayList<>();
       for (int i = 0; i <=100; i++) {
           myList1.add(i);
        } // System.out.print(myList1);

       op.addParameterToList(myList1,50);


  //3. Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista,
        // iar celalalt un numar intreg. Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista,
        // fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.

        System.out.println("\n 3. The list that starts from the integer received as a parameter is:  ");

       List<Integer>myList2=new ArrayList<>(100);


       op.printMyList(myList2,25);

//4. Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand,
// toate valorile din lista, dar invers(de la capat la inceput).

        System.out.println("\n 4. The reverse list is: ");
List<Integer> myList3=new ArrayList<>();
        for (int i = 1; i <=100; i++) {
            myList3.add(i);
        }
        op.printReverseList(myList3);


//5. Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri,
// unul de tip intreg, si unul de tip String. Metoda sa adauge parametrul de tip String in lista primita,
// iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.

        System.out.println("\n 5. The list with a string parameter is: ");
        List<String> myList4=new ArrayList<>();
        for (int i = 1; i <=100; i++) {
            myList4.add(i + "");
        }

    op.addStringToList(myList4,50,"Andreea");


 //6. Scrieti o metoda Java, care sa primeasca doi parametrii. Primul dintre ei va fi o Lista,
        // iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.

        System.out.println("\n 6. The list with a  parameter on the first position is: ");
        List<String> myList5=new ArrayList<>();
        for (int i = 1; i <=100; i++) {
            myList5.add(i + "");
        }
op.addParameterToList(myList5,"Andreea");


 //7. Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista,
        // si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).

        System.out.println("\n 7. The positions with values from list are: ");
        List<Integer> myList6=new ArrayList<>();
        for (int i = 1; i <=100; i++) {
            myList6.add(i);
        }

        op.addListWithPositionsAndValues(myList6);

 //8. Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.

        System.out.println("\n 8. The biggest number from the list is: ");
        List<Integer> myList7=new ArrayList<>();
        for (int i = 1; i <=100; i++) {
            myList7.add(i);
        }


        System.out.print(op.getTheBiggestNumber(myList7));


  //9. Scrieti o metoda Java care sa schimbe pozitia a doua elemente intr-o Lista,

        System.out.println("\n 9. The changed position for two numbers from to the list is: ");
        List<Integer> myList8=new ArrayList<>();
        for (int i = 1; i <=100; i++) {
            myList8.add(i);
        }
  op.changePositionFromTheList(myList8);


  //10. Scrieti o metoda Java care sa primeasca o Lista si sa returneze o alta lista,
        // care sa contina doar numerele pare din lista primita.
        List<Integer> myList9 = new ArrayList<>();
        System.out.print("10. The list with even numbers from complete list is : ");
        List<Integer> myListWithEvenNumbers = new ArrayList<>();
        for (int i =1; i <=100; i++) {
            myList9.add(i);
        }
        System.out.println(op.getTheListWithTheEvenNumbers(myList9,myListWithEvenNumbers));

  //11. Scrieti o metoda Java care sa primeasca parametru o Lista nesortata, si sa returneze Lista sortata crescator. Atentie, sortarea sa se faca programatic(adica logica sa fie scrisa de voi),
        // si nu folosit librarie externa, precum Collection.sort().

        List<Integer> myUnorderedList= new ArrayList<>();

        List<Integer> mySortedByBreederList = new ArrayList<>();
        System.out.print("11. The sorted by breeder list is : ");

        //for (int i =0; i < myUnorderedList.size(); i++) {
          // myUnorderedList.add(i);
       // }
        System.out.println(op.getListSortedByBreeder(myUnorderedList,mySortedByBreederList));

    }
}

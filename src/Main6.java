package src;

import java.util.*;

public class Main6 {
    public static void main(String[] args) {
        //1. Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze,
        // pe rand, toate valorile din lista, fiecare pe rand nou.

        List <Integer> myListOfInteger=new ArrayList<>(100);
LogicalOperations logicalOperations=new LogicalOperations();
       logicalOperations.printMyArrayList(myListOfInteger);

 // Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere,
        // si celalalt un numar (real sau intreg).
        // Metoda sa adauge numarul primit ca si parametru la final de lista.

        List <Integer> myList=new ArrayList<>(100);
        for(int i=1;i<=100;i++){
            myList.add(i);}
        System.out.println(myList);
        logicalOperations.addParameterToList(myList,67);

    }
}

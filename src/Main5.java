package src;

public class Main5 {
    public static void main(String[] args) {
        //1. In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii, valorile de la 1 la 100.
        // Sa se afiseze progresul in consola pe tot parcursul.
    LogicalOperations op=new LogicalOperations();
        System.out.println("\n 1. Array of 100 positions: ");
    op.getArrayTo100();


 //2.  Creati o metoda care primeasca un parametru de tip array de numere intregi gol,
        // si sa il returneze populat cu toate valorile pare de la 1 la 100.
        // Apelati metoda in main() pentru a verifica daca functioneaza.
        // Atentie, metoda returneaza un array, deci acesta va trebui surprins si afisat folosind o bucla.

op.populateAnArray(100);
        System.out.println("\n\n 2. Array of 100 populated positions:: ");
int[] myArray=op.populateAnArray(100);
        op.printArray(myArray);


  //3.  Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori.
        // Metoda sa calculeze si sa returneze media numerelor din array.
        // Apelati metoda in main() pentru a verifica daca functioneaza.
        System.out.println("\n\n 3. Average of numbers from array: ");
        System.out.println(op.getAverageOfArray(myArray));


   //4. . Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori,
        // si un parametru de tip String. Metoda sa verifice daca valoarea string-ului primit se regaseste
        // in array-ul primit, iar daca da sa returneze true iar daca nu, sa returneze false.
        // Apelati metoda in main() pentru a verifica daca functioneaza.

op.verifyArrayOfStrings();
        op.printArrayOfStrings();


    }
}

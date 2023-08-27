package org.example.labs.lab_108.e;

public class IntVector implements IntList{

    int[] vector = new int[20];
    int contador=0;
    @Override
    public void add(int number) {
        if (arrayIsFull()) increaseSizeArray();
        vector[contador]=number;
        contador++;
    }
    private boolean arrayIsFull() {
        return (vector.length==contador);
    }

    private void increaseSizeArray(){
        int [] arrayNew = new int [(int) (contador * 2)];

        //Copy the values the new array
        for (int i = 0; i < vector.length; i++) {
            arrayNew[i]=vector[i];
        }
        //Change the name to the Array to the oldest
        vector=arrayNew;
       // System.out.println("New Size Array is " + vector.length);
    }

    @Override
    public int get() {
        return 0;
    }

    @Override
    public void printList() {
        for (int i = 0; i < vector.length; i++) {
            if (i%20==0) System.out.println();
            System.out.printf("[%3s]  %2s ", i , vector[i]);

        }
        System.out.println();
    }
}

package org.example.labs.lab_108.e;

import java.util.Arrays;

public class IntArrayList implements IntList{

    int [] array = new int[10];
    int contador=0;
    @Override
    public void add(int number) {
        if (arrayIsFull()) increaseSizeArray();
        array[contador]=number;
        contador++;
    }

    private boolean arrayIsFull() {
        return (array.length==contador);
    }

    private void increaseSizeArray(){
        int [] arrayNew = new int [(int) (contador * 1.50)];

        //Copy the values the new array
        for (int i = 0; i < array.length; i++) {
            arrayNew[i]=array[i];
        }
        //Change the name to the Array to the oldest
        array=arrayNew;
        //System.out.println("New Size Array is " + array.length);
    }



    @Override
    public int get() {
        return 0;
    }

    @Override
    public void printList() {
        for (int i = 0; i < array.length; i++) {
            if (i%20==0) System.out.println();
            System.out.printf("[%3s]  %2s ", i , array[i]);
        }
        System.out.println();
    }


}

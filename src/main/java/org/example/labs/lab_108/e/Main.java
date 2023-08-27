package org.example.labs.lab_108.e;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Create an IntList Interface. An IntList is simply a way to store a list of integers.
//
//        All IntLists should have an add method by which a user can a new number to the list.
//        All IntLists should have a get method by which users can retrieve an element by index.
//        You will need two implementations of IntList.

//        The first implementation is IntArrayList. IntArrayList should store numbers in an array with
//        a length of 10 by default. When the add method is called, you must first determine if the array is full.
//        If it is, create a new array that is 50% larger, move all elements over to the new array
//        and add the new element. (for example, an array of length 10 would be increased to 15)


//        The second implementation is IntVector. IntVector should store numbers in an array with
//        a length of 20 by default. When the add method is called, you must first determine if the array is full.
//        If it is, create a new array that is double the size of the current array, move all elements
//        over to the new array and add the new element. (for example, an array of length 10 would be increased to 20)
//        In your README.md include an example of when IntArrayList would be more efficient and w
//        hen IntVector would be more efficient.

        List<Double> resultados= new ArrayList<>();
        IntList intArrayList = new IntArrayList();
        IntList intArrayVector = new IntVector();



        long start1,end1, start2, end2;

        for (int k = 0; k < 10 ; k++) {


            start1 = Instant.now().toEpochMilli();
            for (int i = 0; i < 600_000; i++) {

                intArrayList.add((int) (Math.random() * 20));
            }
            end1 = Instant.now().toEpochMilli();

//            System.out.println("Time millisecond: " + (end1 - start1));


            start2 = Instant.now().toEpochMilli();
            for (int i = 0; i < 600_000; i++) {
                intArrayVector.add((int) (Math.random() * 20));
            }
            end2 = Instant.now().toEpochMilli();

//            System.out.println("Time millisecond: " + (end2 - start2));


            resultados.add((double) (end1 - start1) / (end2 - start2) );



        }

        for (Double resultado:resultados) {
            System.out.println(resultado);
        }
    }
}

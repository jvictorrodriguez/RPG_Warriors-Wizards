package org.example.labs.lab_108.e_2;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        IntList array1 = new IntArrayList();
        IntList vector1= new IntVector();
        List<Long> resultVector= new ArrayList<>();
        List<Long> resultArray= new ArrayList<>();

        int size=1_000;
        long startArray,endArray,startVector,endVector;

        for (int k = 0; k < 10 ; k++) {
        resultVector.clear();
        resultArray.clear();


            startArray = Instant.now().toEpochMilli();
            for (int i = 0; i < size; i++) {
                array1.add((int) (Math.random() * 20));
            }
            endArray = Instant.now().toEpochMilli();


            startVector = Instant.now().toEpochMilli();
            for (int i = 0; i < size; i++) {

                vector1.add((int) (Math.random() * 20));
            }
            endVector = Instant.now().toEpochMilli();

            resultVector.add(((endVector - startVector)));
            resultArray.add(((endArray - startArray)));

            System.out.println("******Resultados**********");
            resultVector.forEach(System.out::println);
            resultArray.forEach(System.out::println);


        }



    }
    }

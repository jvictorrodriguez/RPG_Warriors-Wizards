package org.example.labs.lab_104_b;

import static java.util.Arrays.asList;
import static java.util.Arrays.stream;

public class Main {

    public static void main(String[] args) {
        int [] listOfNumbers= {5,3,5,4,2,8,1,9,10,-8};


        findThe2Smallest(listOfNumbers);

        System.out.println("************");
        stream(listOfNumbers).distinct().sorted().limit(2).forEach(System.out::println);
        int [] minimValues= stream(listOfNumbers).distinct().sorted().limit(2).toArray();
        System.out.println("//////////////////");
        for (int value:minimValues) {
            System.out.print(value+" => ");
        }
    }

    private static void findThe2Smallest(int[] listOfNumbers) {

        int smallest=listOfNumbers[0];
        int secondSmallest= smallest;
        int currentNumber;
        for (int i = 0; i < listOfNumbers.length; i++) {
            currentNumber=listOfNumbers[i];
            if (currentNumber<secondSmallest){
                if (currentNumber<smallest){
                    secondSmallest=smallest;
                    smallest=currentNumber;
                }else{
                    secondSmallest=currentNumber;
                }
            }
        }
        System.out.println("Small1 is:  "+smallest);
        System.out.println("Small2 is:  "+secondSmallest);
    }
}

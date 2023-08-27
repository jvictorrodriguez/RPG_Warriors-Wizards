package org.example.labs.lab_104_a;

public class Main {
    public static void main(String[] args) {
        int [] listOfNumbers= {5,3,5,4,2,8,1,9,10};

        int small=  findSmallest(listOfNumbers);
        int big= findBiggest(listOfNumbers);

        System.out.println("The smallest number is " + small);
        System.out.println("The biggest number is " + big);

        System.out.printf("The result of substract to the maximun number %d the minimum number %d is %d", big, small,(big-small));


    }

    private static int findSmallest(int[] listOfNumbers) {
        int min=Integer.MAX_VALUE;
        checkLengthArray(listOfNumbers);
        for (int i = 0; i < listOfNumbers.length; i++) {
            int currentNumber= listOfNumbers[i];
            if (currentNumber<min)
                min=currentNumber;
        }
        return min;
    }

    private static int findBiggest(int[] listOfNumbers){
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < listOfNumbers.length; i++) {
            int currentNumber= listOfNumbers[i];
            if(currentNumber>max)
                max=currentNumber;
        }
        return max;
    }

    private static void checkLengthArray(int[] listOfNumbers) {
        if (listOfNumbers.length<2)
            System.out.println("The listOfNumbers length is " + listOfNumbers.length);
    }


}

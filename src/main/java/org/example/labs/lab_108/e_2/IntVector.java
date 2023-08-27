package org.example.labs.lab_108.e_2;

public class IntVector implements IntList {


    private Integer [] array = new Integer[20];



    public int checkArrayDimension(){
        return array.length;
    }

    public int checkArrayLenght(){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==null)
                return i;
        }
        return array.length;
    }

    private boolean arrayIsFull() {
        return (checkArrayLenght()==checkArrayDimension());
    }

    private void increaseSizeArray(){
        Integer [] arrayNew = new Integer [(int) (checkArrayDimension() * 1.50)];

        //Copy the values the new array
        for (int i = 0; i < array.length; i++) {
            arrayNew[i]=array[i];
        }
        //Change the name to the Array to the oldest
        array=arrayNew;
        //System.out.println("New Size Array is " + array.length);
    }


    public void add(int num) {
        if (arrayIsFull())
            increaseSizeArray();
        array[checkArrayLenght()]=num;

    }


    public int get(int pos) {
        if (pos<checkArrayLenght())
            return array[pos];
        return -1; //todo launch an exception
    }


}


package org.example.labs.lab_108.c;

public class Sedan extends Car{


    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    @Override
    public String toString() {
        return "Sedan{} " + super.toString();
    }
}

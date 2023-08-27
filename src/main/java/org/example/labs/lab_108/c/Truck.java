package org.example.labs.lab_108.c;

public class Truck extends Car{
    private int towingCapacity;


    public Truck(String vinNumber, String make, String model, int mileage, int towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString()+
                " towingCapacity=" + towingCapacity +
                "} " ;
    }
}

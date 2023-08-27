package org.example.labs.lab_108.c;

public class Utility extends Car{
    private boolean fourWheelDrive;

    public Utility(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String toString() {
        return "Utility{" + super.toString() + " " +
                "fourWheelDrive=" + fourWheelDrive +
                "} " ;
    }
}

package org.example.labs.lab_108.c;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> carList = Arrays.asList(
                new Sedan("z0001","VOLKSWAGEN","PASSAT",15_000),
                new Truck("T0001", "EBRO", "Transporter", 100_000, 25_000),
                new Utility("U0001", "NISSAN", "Qasqhai+2",18_000,true)
        ) ;

        for (Car car:carList) {
            System.out.println(car);
        }

Utility utility1 = new Utility("U0001", "NISSAN", "Qasqhai",120_000,true);
        utility1.isFourWheelDrive();
        //carList.get(2).isFourWheelDrive();    //visibiliad de tipo .......  pero ............. comportamiento del objeto

        Truck truck1 = new Truck("T0001", "EBRO", "Transporter", 100_000, 25_000);
        System.out.println("TRuck mileage " + truck1.getMileage());
        System.out.println("TowingCapacity: "+ truck1.getTowingCapacity());
    }



}

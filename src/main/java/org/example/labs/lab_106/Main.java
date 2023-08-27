package org.example.labs.lab_106;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        List<Employee> employees = Arrays.asList(
                new Employee("Nico", "Rodriguez", 30_000),
                new Intern("Hugo", "Rodríguez", 60_000)
        );

        for (Employee emp : employees) {
            System.out.println(emp);
        }


        saveEmployeesToFile(employees);


    }
    private static void saveEmployeesToFile(List<Employee> employees){


        try {
            FileWriter fileWriter= new FileWriter("employees.txt");

            for (Employee employee: employees) {
                fileWriter.write(employee.toFile());
            }
            fileWriter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    }


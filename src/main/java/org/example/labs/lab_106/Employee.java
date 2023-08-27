package org.example.labs.lab_106;

import java.lang.reflect.Field;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setSalary(salary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + NumberFormat.getInstance().format(salary) +
                '}';
    }

    public String toFile(){
        final String separator=";";
        return getFirstName()+separator
                +getLastName()+separator
                +getSalary()+"\n";



//        StringBuilder result = new StringBuilder();
//        String newLine = System.getProperty("line.separator");
//
////        result.append( this.getClass().getName() );
////        result.append( " Object {" );
////        result.append(newLine);
//
//        //determine fields declared in this class only (no fields of superclass)
//        Field[] fields = this.getClass().getDeclaredFields();
//
//        //print field names paired with their values
//        for ( Field field : fields  ) {
//            result.append("  ");
//            try {
//                result.append( field.getName() );
//                result.append(": ");
//                //requires access to private field:
//                result.append( field.get(this) );
//            } catch ( IllegalAccessException ex ) {
//                System.out.println(ex);
//            }
//            result.append(newLine);
//        }
//        result.append("}");
//
//        return result.toString();

    }



}

package org.example.labs.lab_104_c;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        double x = 2;
        double y = 3;


        System.out.println(resolveExpresion(x,y));
    }


        public static double resolveExpresion(double x,double y){
            return  Math.pow(x,2) + Math.pow( (4*y/5 - x) , 2);
        }

}

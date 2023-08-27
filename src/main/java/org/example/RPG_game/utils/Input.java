package org.example.RPG_game.utils;


import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in);


    public static String askFor(String question) {
        System.out.println(question);
        return sc.nextLine();
    }

    public static <T> String askForAndCheck(String question, T [] values, String mensajeError) {
        boolean correct = false;
        String answer="";
        do {
            System.out.println(question);
            answer = sc.nextLine();
            for (var value : values) {
                if (answer.equalsIgnoreCase((String) value)){
                    correct = true;
                    return answer;
                }
            }
            System.out.println(mensajeError);
        }while (!correct) ;
        return answer;
    }
    public static int askForAndCheck(String question, int maxIntValue, String mensajeError) {
        boolean correct = false;

        String answer="";
        int answerToInt=0;
        do {
            System.out.println(question);
            answer = sc.nextLine();
            answerToInt=Integer.valueOf(answer);
            if (answerToInt<=maxIntValue)
                return answerToInt;
            System.out.println(mensajeError);
        }while (!correct) ;
        return 0;
    }




    public static String getInput() {
        return sc.nextLine();
    }
}

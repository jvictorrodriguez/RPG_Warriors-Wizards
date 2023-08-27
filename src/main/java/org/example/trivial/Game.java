package org.example.trivial;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private int correctAnswers;
    private List<Question> preguntas;

    private void initGame(){
        preguntas = new ArrayList<>();
        preguntas.add(new Question("Es París la capital de Francia",true, 1 ));
        preguntas.add(new Question("Es Madrid la capital de Francia",false, 1 ));
        preguntas.add(new Question("Es Caracas la capital de Venezuela",true, 1 ));
        preguntas.add(new Question("Es Berlín la capital de Alemania",true, 1 ));
    }

    public static void main(String[] args) {
        System.out.println("Starting game...........");
    }

}

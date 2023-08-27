package org.example.RPG_game.service;


import org.example.RPG_game.model.Character;
import org.example.RPG_game.model.Warrior;
import org.example.RPG_game.model.Wizard;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static org.example.RPG_game.model.Warrior.WARRIOR_MAX_HP;
import static org.example.RPG_game.model.Warrior.WARRIOR_MIN_HP;
import static org.example.RPG_game.model.Warrior.WARRIOR_MAX_STAMINA;
import static org.example.RPG_game.model.Warrior.WARRIOR_MIN_STAMINA;
import static org.example.RPG_game.model.Warrior.WARRIOR_MAX_STRENGTH;
import static org.example.RPG_game.model.Warrior.WARRIOR_MIN_STRENGTH;
import static org.example.RPG_game.model.Wizard.WIZARD_MAX_HP;
import static org.example.RPG_game.model.Wizard.WIZARD_MIN_HP;
import static org.example.RPG_game.model.Wizard.WIZARD_MIN_MANA;
import static org.example.RPG_game.model.Wizard.WIZARD_MAX_MANA;
import static org.example.RPG_game.model.Wizard.WIZARD_MIN_INTELLIGENCE;
import static org.example.RPG_game.model.Wizard.WIZARD_MAX_INTELLIGENCE;
import org.example.RPG_game.enums.CharacterType;



public class MiniFactoryRandom {

    static Random random= new Random();
    private static int numberOfCharacterTypes= CharacterType.values().length;
    static List<String> names = new ArrayList<>();

    static {
        loadFileNames();
    }

    private static void loadFileNames() {
        Scanner readFile;
        String line;
        String[] name;

        try {
            System.out.println("Loading file..................");
            File file = new File("5000nombres.csv");
            readFile = new Scanner(file);

            while (readFile.hasNext()) {
                line = readFile.nextLine();
                name = line.split(";");
                names.add(name[1]);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public static Character crearCharacterRandom(){
        int opcion=0;

        opcion= random.nextInt(numberOfCharacterTypes);
        switch (opcion){
            case 0: return crearWarriorRandom();
            case 1: return crearWizardRandom();
        }
        return null;
    }

    private static Character crearWarriorRandom(){
        int positionRandomName= random.nextInt(names.size());
        Warrior warrior= new Warrior(names.get(positionRandomName),
                random.nextInt(WARRIOR_MIN_HP,WARRIOR_MAX_HP+1),
                random.nextInt(WARRIOR_MIN_STAMINA,WARRIOR_MAX_STAMINA+1),
                random.nextInt(WARRIOR_MIN_STRENGTH,WARRIOR_MAX_STRENGTH+1)
        );
        names.remove(positionRandomName);
        return warrior;
    }

    private static Character crearWizardRandom(){
        int positionRandomName= random.nextInt(names.size());
        Wizard wizard= new Wizard(names.get(positionRandomName),
                random.nextInt(WIZARD_MIN_HP,WIZARD_MAX_HP+1),
                random.nextInt(WIZARD_MIN_MANA, WIZARD_MAX_MANA+1),
                random.nextInt(WIZARD_MIN_INTELLIGENCE, WIZARD_MAX_INTELLIGENCE)+1
        );
        names.remove(positionRandomName);
        return wizard;
    }

}

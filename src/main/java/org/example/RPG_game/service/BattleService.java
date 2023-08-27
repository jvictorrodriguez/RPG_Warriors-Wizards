package org.example.RPG_game.service;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import org.example.RPG_game.model.*;
import org.example.RPG_game.model.Character;
import org.example.RPG_game.utils.Input;

public class BattleService {
    private static Locale idiomaActual = Locale.getDefault();
    private static ResourceBundle mensajes = ResourceBundle.getBundle("mensajes", idiomaActual);
    List<Team> teams = new ArrayList<>();
    List<Character> fightList = new ArrayList<>();

    List<Statistics> statistics = new ArrayList<>();

    public BattleService(List<Team> teams) {
        this.teams = teams;
    }

    public void start() {


        System.out.println(".............Starting BattleService...........");

        do {

            printTeamsCharacters();


            //Select characters to Fight
            fightList.clear();
            for (Team team : teams) {
                fightList.add(selectCharacterToFight(team));
            }

            printFightList();

            System.out.println("**********************Fight**********************");
            do {
                statistics.add(fightList.get(0).attack(fightList.get(1)));
                statistics.add(fightList.get(1).attack(fightList.get(0)));
            } while (fightList.get(0).isAlive() && fightList.get(1).isAlive());

//            System.out.println(fightList.get(0).getName() + " is Alive ?" + fightList.get(0).isAlive());
//            System.out.println(fightList.get(1).getName() + " is Alive ?" + fightList.get(1).isAlive());

            if (!fightList.get(0).isAlive()) teams.get(0).getCharacterList().remove(fightList.get(0));
            if (!fightList.get(1).isAlive()) teams.get(1).getCharacterList().remove(fightList.get(1));



        } while (teams.get(0).getCharacterList().size()!=0 && teams.get(1).getCharacterList().size()!=0);
        if (teams.get(0).getCharacterList().size()!=0) System.out.println("Wins TEAM 0");
        else System.out.println("WINS TEAM 1");
        System.out.println("Statistics******************************");
        statistics.forEach(System.out::println);
    }

    private Character selectCharacterToFight(Team team) {

        int charactersByTeamAvaliable = team.getCharacterList().size() - 1;
        String mensajeError = mensajes.getString("ErrorInputAValidValue");


        int characterPosition = Input.askForAndCheck(mensajes.getString("SelectYourCharacter"),
                charactersByTeamAvaliable, mensajeError);

        return team.getCharacterList().get(characterPosition);
    }

    private void printTeamsCharacters() {
        System.out.println("****************************************************Teams");
        for (Team team : teams) {
            System.out.println("////////////////////////Team***************");
            for (Character character : team.getCharacterList()) {
                character.print();

            }
            System.out.println("***************************************End Team");
        }
        System.out.println("***************************************End Teams");
    }

    private void printFightList() {
        System.out.println("**********Fight List Start");

        for (Character character : fightList) {
            character.print();
        }
        System.out.println("***********************");

    }
}

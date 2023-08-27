package org.example.RPG_game.service;

import org.example.RPG_game.model.Character;
import org.example.RPG_game.model.Team;
import org.example.RPG_game.model.Warrior;
import org.example.RPG_game.model.Wizard;
import org.example.RPG_game.utils.Input;
import org.example.RPG_game.enums.CharacterType;

import java.text.MessageFormat;
import java.util.*;
import static org.example.RPG_game.utils.Input.askFor;

public class GameService {

    private final int numberOfCharactersByTeam = 3;
    private static Locale idiomaActual = Locale.getDefault();
    private static ResourceBundle mensajes = ResourceBundle.getBundle("mensajes", idiomaActual);

    List<Team> teams= new ArrayList<>();
    List<Integer> players = new ArrayList<>();

    public void setGame() {
    BattleService battleService;
    String [] seleccion;


        whoPlay();

        seleccion=howToCreateTeams();

        for (int i = 0; i < seleccion.length; i++) {
            if (seleccion[i].equalsIgnoreCase("1"))
                teams.add(handMadeTeam());
            else
                teams.add(randomCreationTeam());
        }




        battleService=new BattleService(teams);
        battleService.start();

    }

    public void whoPlay(){
        String []validOptions = {"1","2"};
        String mensajeError= mensajes.getString("ErrorInputAValidValue");

        for (int i = 1; i <= 2; i++) {
            players.add(Integer.valueOf(Input.askForAndCheck(
                    MessageFormat.format(mensajes.getString("SelectPlayer"), i), validOptions, mensajeError)));
        }

    }
    public String[] howToCreateTeams(){
        String []validOptions = {"1","2"};
        String mensajeError= mensajes.getString("ErrorInputAValidValue");
        String[] seleccion = new String[2];

        System.out.println(mensajes.getString("howToCreateTeams"));
        seleccion[0] = Input.askForAndCheck(
                MessageFormat.format(mensajes.getString("selectModeForTeam"),"1"),validOptions, mensajeError);
        seleccion[1] = Input.askForAndCheck(
                MessageFormat.format(mensajes.getString("selectModeForTeam"),"2"),validOptions, mensajeError);
        return seleccion;
    }

    // C R E A T I N G    T E A M S
    private Team randomCreationTeam() {
        Team team= new Team();

        System.out.println(mensajes.getString("creacionAleatoria"));
        for (int i = 0; i < numberOfCharactersByTeam; i++) {
            team.addCharacterToTeam(MiniFactoryRandom.crearCharacterRandom());
        }
        return team;
    }

    private Team handMadeTeam() {
        Team team = new Team();
        for (int i = 0; i < numberOfCharactersByTeam; i++) {
            team.addCharacterToTeam(createCharacterHandMade());
        }
        return team;
    }

    private static Character createCharacterHandMade() {
        //Creación manual
        String seleccion;
        System.out.println(mensajes.getString("menu"));

        do {
            for (CharacterType characterType : CharacterType.values()) {
                System.out.println(characterType.name());
            }

            seleccion = Input.getInput().toUpperCase();
            switch (seleccion) {
                case "WARRIOR":
                    return new Warrior(     askFor(mensajes.getString("Name")),
                            Integer.valueOf(askFor(mensajes.getString("Hp"))),
                            Integer.valueOf(askFor(mensajes.getString("Stamina"))),
                            Integer.valueOf(askFor(mensajes.getString("Strength"))));

                case "WIZARD":
                    return new Wizard(      askFor(mensajes.getString("Name")),
                            Integer.valueOf(askFor(mensajes.getString("Hp"))),
                            Integer.valueOf(askFor(mensajes.getString("Mana"))),
                            Integer.valueOf(askFor(mensajes.getString("Intelligence"))));
            }
        } while (true);
    }

    public static void printTeam(Team team) {
        System.out.println("Printing team....");
        for (int i = 0; i < team.getCharacterList().size(); i++) {
            System.out.print(i+" ");
            team.getCharacterList().get(i).print();
        }
    }
}

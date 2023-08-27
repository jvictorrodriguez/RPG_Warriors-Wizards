package org.example.RPG_game.model;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Character> characterList= new ArrayList<>();

    public Team() {
    }

    public Team(String name, List<Character> characterList) {
        this.name = name;
        this.characterList = characterList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCharacterToTeam(Character character){
        characterList.add(character);
    }
    public List<Character> getCharacterList() {
        return characterList;
    }

    public void setCharacterList(List<Character> characterList) {
        this.characterList = characterList;
    }
}

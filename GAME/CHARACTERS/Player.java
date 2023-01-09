
package GAME.CHARACTERS;

import java.util.ArrayList;


public class Player {
    private int health;
    private int attack;
    private int defense;
    private int roomNumber;
    private ArrayList<String> items;//c
    private boolean isPlayer;
    
    
    public Player(int health,
                  int attack,
                  int defense,
                  int roomNumber,
                  ArrayList<String> items,
                  boolean isPlayer){
        health = this.health;
        attack = this.attack;
        defense = this.defense;
        roomNumber = this.roomNumber;
        items = this.items;
        isPlayer = this.isPlayer;
    }
    
    public int getPlayerHealth(Player p)
    {
        return p.health;
    }
    
}

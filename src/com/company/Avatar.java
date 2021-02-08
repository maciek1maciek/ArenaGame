package com.company;

public class Avatar {
    private String characterName;
    private int health;
    Stuff hand=null;

    public Avatar(String characterName, int health) {
        this.characterName = characterName;
        this.health = health;
    }

    boolean isAlive(){
        if(health>0){
            return true;
        }else
            return false;
    }






    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Stuff getHand() {
        return hand;
    }

    public void setHand(Stuff hand) {
        this.hand = hand;
    }
}

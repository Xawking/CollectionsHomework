package ru.netology;

public class Player<Player> {
    private int id;
    private int strength;
    private String name;
    private boolean isRegistered = false;

    public Player() {
    }

    public Player(int id, int strength, String name) {
        this.id = id;
        this.strength = strength;
        this.name = name;
    }

    public boolean getIsRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


}

package ru.netology;

public class Player implements Comparable<Player> {
    private int id;
    private int strength;
    private String name;


    public Player() {
    }

    public Player(int id, int strength, String name) {
        this.id = id;
        this.strength = strength;
        this.name = name;
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


    @Override
    public int compareTo(Player o) {
        if (this.getStrength() > o.getStrength()) {
            return 1;
        }
        if (this.getStrength() < o.getStrength()) {
            return 2;
        } else {
            return 0;
        }
    }
}

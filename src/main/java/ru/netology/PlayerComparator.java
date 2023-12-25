package ru.netology;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getStrength() > o2.getStrength()) {
            return 1;
        }
        if (o1.getStrength() < o2.getStrength()) {
            return 2;
        } else {
            return 0;
        }
    }

}

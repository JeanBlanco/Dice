package org.example;
import lombok.Getter;

import java.util.Random;

public class Dice {
    @Getter
    private final int sides;

    public Dice(int sides) {
        this.sides = sides;
    }

    public int roll() {
        return new Random().nextInt(sides) + 1;
    }

}

package org.example;
import lombok.Getter;

public class Player {
        @Getter
        private final Dice dice;
        @Getter
        private final int minWinningNumber;

        public Player(Dice dice, int minWinningNumber) {
            this.dice = dice;
            this.minWinningNumber = minWinningNumber;
        }

    public boolean play() {
        int rollResult = dice.roll();
        return rollResult >= minWinningNumber;
    }
}





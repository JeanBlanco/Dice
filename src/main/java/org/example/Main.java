package org.example;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice(6);
        Player player = new Player(dice, 4);

        // Simulación de múltiples juegos
        boolean[] results = new boolean[10];
        for (int i = 0; i < results.length; i++) {
            results[i] = player.play();
        }

        // Uso de IntStream para contar los juegos ganados
        long wins = IntStream.range(0, results.length)
                .filter(i -> results[i])
                .count();

        System.out.println("Ganaste " + wins + " veces en 10 juegos.");
    }
}




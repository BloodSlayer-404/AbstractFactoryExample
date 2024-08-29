package org.example.tools.axes;

public class StoneAxe implements Axe {
    @Override
    public void cut() {
        System.out.println("El hacha de piedra tardo en cortar el bloque 1.9 segundos");
    }

    @Override
    public void attack() {
        System.out.println("El hacha de piedra hizo un daño de 4 puntos de salud");
    }
}

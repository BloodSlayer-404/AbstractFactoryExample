package org.example.tools.axes;

public class DiamondAxe implements Axe {
    @Override
    public void cut() {
        System.out.println("El hacha de diamante tardo en cortar el bloque 0.5 segundos");
    }

    @Override
    public void attack() {
        System.out.println("El hacha de diamante hizo un daño de 7 puntos de salud");
    }
}

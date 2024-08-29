package org.example.tools.axes;

public class IronAxe implements Axe {

    @Override
    public void cut() {
        System.out.println("El hacha de hierro tardo en cortar el bloque 0.65 segundos");
    }

    @Override
    public void attack() {
        System.out.println("El hacha de hierro hizo un daño de 6 puntos de salud");
    }
}

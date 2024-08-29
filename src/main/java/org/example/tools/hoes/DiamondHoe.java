package org.example.tools.hoes;

public class DiamondHoe implements Hoe {
    @Override
    public void plow() {
        System.out.println("La azada de diamante tardo 0.5 segundos en arar el suelo");
    }

    @Override
    public void harvest() {
        System.out.println("La azada de diamante obtuvo 5 items extra");
    }
}

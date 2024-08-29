package org.example.tools.hoes;

public class StoneHoe implements Hoe {
    @Override
    public void plow() {
        System.out.println("La azada de piedra tardo 2 segundos en arar el suelo");
    }

    @Override
    public void harvest() {
        System.out.println("La azada de piedra obtuvo 1 item extra\"");
    }
}

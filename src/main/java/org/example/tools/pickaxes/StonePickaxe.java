package org.example.tools.pickaxes;

public class StonePickaxe implements Pickaxe {
    @Override
    public void mine() {
        System.out.println("El pico de piedra tardo en romper el bloque 1.9 segundos");
    }

    @Override
    public void dropMineral() {
        System.out.println("El pico de piedra obtuvo 2 minerales extra");
    }
}

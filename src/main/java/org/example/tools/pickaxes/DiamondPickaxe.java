package org.example.tools.pickaxes;

public class DiamondPickaxe implements Pickaxe {
    @Override
    public void mine() {
        System.out.println("El pico de diamante tardo en romper el bloque 0.95 segundos");
    }

    @Override
    public void dropMineral() {
        System.out.println("El pico de diamante obtuvo 4 minerales extra");
    }
}

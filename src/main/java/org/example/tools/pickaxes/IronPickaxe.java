package org.example.tools.pickaxes;

public class IronPickaxe implements Pickaxe {
    @Override
    public void mine() {
        System.out.println("El pico de hierro tardo en romper el bloque 1.25 segundos");
    }

    @Override
    public void dropMineral() {
        System.out.println("El pico de hierro obtuvo 3 minerales extra");
    }
}

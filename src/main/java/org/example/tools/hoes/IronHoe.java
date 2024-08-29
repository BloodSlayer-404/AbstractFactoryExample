package org.example.tools.hoes;

public class IronHoe implements Hoe {
    @Override
    public void plow() {
        System.out.println("La azada de hierro tardo 1 segundos en arar el suelo");
    }

    @Override
    public void harvest() {
        System.out.println("La azada de hierro obtuvo 3 items extra");
    }
}

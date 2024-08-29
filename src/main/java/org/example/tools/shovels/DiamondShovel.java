package org.example.tools.shovels;

public class DiamondShovel implements Shovel {
    @Override
    public void dig() {
        System.out.println("La pala de diamante cavo la tierra en 0.1 segundos ");
    }

    @Override
    public void makePath() {
        System.out.println("Se realizo un camino exepcional con la pala de diamante");
    }
}

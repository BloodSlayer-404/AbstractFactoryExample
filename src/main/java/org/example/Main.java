package org.example;

import org.example.factories.DiamondToolsFactory;
import org.example.factories.IronToolsFactory;
import org.example.factories.StoneToolsFactory;
import org.example.tools.axes.Axe;
import org.example.tools.hoes.Hoe;
import org.example.tools.pickaxes.Pickaxe;
import org.example.tools.shovels.Shovel;

public class Main {
    public static void main(String[] args) {
        ToolFactory diamondToolsFactory = new DiamondToolsFactory();
        ToolFactory ironToolsFactory = new IronToolsFactory();
        ToolFactory stoneToolsFactory = new StoneToolsFactory();

        Axe axe = ironToolsFactory.createAxe();
        Pickaxe pickaxe = ironToolsFactory.createPickaxe();
        Hoe hoe = ironToolsFactory.createHoe();
        Shovel shovel = ironToolsFactory.createShovel();

        axe.cut();
        axe.attack();
        pickaxe.mine();
        pickaxe.dropMineral();
        hoe.harvest();
        hoe.plow();
        shovel.dig();
        shovel.makePath();

        System.out.println("\n");

        axe = stoneToolsFactory.createAxe();
        pickaxe = stoneToolsFactory.createPickaxe();
        hoe = stoneToolsFactory.createHoe();
        shovel = stoneToolsFactory.createShovel();

        axe.cut();
        axe.attack();
        pickaxe.mine();
        pickaxe.dropMineral();
        hoe.harvest();
        hoe.plow();
        shovel.dig();
        shovel.makePath();

        System.out.println("\n");

        axe = diamondToolsFactory.createAxe();
        pickaxe = diamondToolsFactory.createPickaxe();
        hoe = diamondToolsFactory.createHoe();
        shovel = diamondToolsFactory.createShovel();

        axe.cut();
        axe.attack();
        pickaxe.mine();
        pickaxe.dropMineral();
        hoe.harvest();
        hoe.plow();
        shovel.dig();
        shovel.makePath();
    }


}

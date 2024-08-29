package org.example.factories;

import org.example.ToolFactory;
import org.example.tools.axes.Axe;
import org.example.tools.axes.StoneAxe;
import org.example.tools.hoes.Hoe;
import org.example.tools.hoes.StoneHoe;
import org.example.tools.pickaxes.Pickaxe;
import org.example.tools.pickaxes.StonePickaxe;
import org.example.tools.shovels.Shovel;
import org.example.tools.shovels.StoneShovel;

public class StoneToolsFactory implements ToolFactory {
    @Override
    public Axe createAxe() {
        return new StoneAxe();
    }

    @Override
    public Pickaxe createPickaxe() {
        return new StonePickaxe();
    }

    @Override
    public Hoe createHoe() {
        return new StoneHoe();
    }

    @Override
    public Shovel createShovel() {
        return new StoneShovel();
    }
}

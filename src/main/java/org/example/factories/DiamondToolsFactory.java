package org.example.factories;

import org.example.ToolFactory;
import org.example.tools.axes.Axe;
import org.example.tools.axes.DiamondAxe;
import org.example.tools.hoes.Hoe;
import org.example.tools.hoes.DiamondHoe;
import org.example.tools.pickaxes.Pickaxe;
import org.example.tools.pickaxes.DiamondPickaxe;
import org.example.tools.shovels.Shovel;
import org.example.tools.shovels.DiamondShovel;

public class DiamondToolsFactory implements ToolFactory {
    @Override
    public Axe createAxe() {
        return new DiamondAxe();
    }

    @Override
    public Pickaxe createPickaxe() {
        return new DiamondPickaxe();
    }

    @Override
    public Hoe createHoe() {
        return new DiamondHoe();
    }

    @Override
    public Shovel createShovel() {
        return new DiamondShovel();
    }
}

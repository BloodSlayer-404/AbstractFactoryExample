package org.example.factories;

import org.example.ToolFactory;
import org.example.tools.axes.Axe;
import org.example.tools.axes.IronAxe;
import org.example.tools.hoes.Hoe;
import org.example.tools.hoes.IronHoe;
import org.example.tools.pickaxes.Pickaxe;
import org.example.tools.pickaxes.IronPickaxe;
import org.example.tools.shovels.Shovel;
import org.example.tools.shovels.IronShovel;

public class IronToolsFactory implements ToolFactory {
    @Override
    public Axe createAxe() {
        return new IronAxe();
    }

    @Override
    public Pickaxe createPickaxe() {
        return new IronPickaxe();
    }

    @Override
    public Hoe createHoe() {
        return new IronHoe();
    }

    @Override
    public Shovel createShovel() {
        return new IronShovel();
    }
}

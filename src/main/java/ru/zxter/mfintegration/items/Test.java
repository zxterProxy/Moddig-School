package ru.zxter.mfintegration.items;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemTool;
import ru.zxter.mfintegration.Main;

/**
 * Предмет для теста
 */

public class Test extends ItemPickaxe {
    public Test (ToolMaterial material, String name, String texture){
        super(material);
        GameRegistry.registerItem(this,name);
        this.setTextureName(Main.MODID + ":" + texture);
        this.setCreativeTab(CreativeTabs.tabBlock);
        setUnlocalizedName(name);
    }
}

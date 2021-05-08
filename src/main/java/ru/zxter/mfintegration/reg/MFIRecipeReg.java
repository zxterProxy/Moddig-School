package ru.zxter.mfintegration.reg;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by zxter on 09.05.2021.
 */
public class MFIRecipeReg {

    public static void MFIRecipe() {
        GameRegistry.addRecipe(new ItemStack(ItemToolReg.test, 1),

                new Object[]{

                        "MMM",
                        "###",
                        "MMM",

                        ('X'), Blocks.gravel,
                        ('#'), Items.iron_ingot,
                        ('M'), Blocks.obsidian

                }

        );
    }
}
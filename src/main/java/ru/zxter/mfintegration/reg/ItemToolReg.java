package ru.zxter.mfintegration.reg;

import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.util.EnumHelper;
import ru.zxter.mfintegration.items.Test;

/**
 * Created by zxter on 09.05.2021.
 */
public class ItemToolReg {
    public static ItemTool test;
    public static final Item.ToolMaterial mmm = EnumHelper.addToolMaterial("RUST", 2, 513, 7.0F, 3.0F, 100);
    public static void init (){
        test = new Test (mmm,"test", "");
    }
}

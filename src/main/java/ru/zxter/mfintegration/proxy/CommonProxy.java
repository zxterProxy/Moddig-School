package ru.zxter.mfintegration.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import ru.zxter.mfintegration.mfintegration.KnowledgeListMFI;
import ru.zxter.mfintegration.reg.ItemToolReg;
import ru.zxter.mfintegration.reg.MFIRecipeReg;

/**
 * CommonProxy
 *
 * Действия данного класса выполняються на стороне и клиента и сервера
 *
 */

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        ItemToolReg.init();
    }

    public void init(FMLInitializationEvent event) {
        MFIRecipeReg.MFIRecipe();
    }

    public void postInit(FMLPostInitializationEvent event) {
        KnowledgeListMFI.init();
    }
}

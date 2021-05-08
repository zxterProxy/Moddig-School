package ru.zxter.mfintegration.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import ru.zxter.mfintegration.mfintegration.KnowledgePageRegistryMFI;

/**
 * ClientProxy
 *
 * Действия выполняються на стороне только клиента
 *
 * Регистрация моделей блоков/мобов/предметов
 * Регистрация рендеров этих самых моделей
 * ИТД...
 *
 */

public class ClientProxy extends CommonProxy
{
    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event)
    {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event)
    {
        super.postInit(event);
        KnowledgePageRegistryMFI.MFIRegisterPages();
    }
}

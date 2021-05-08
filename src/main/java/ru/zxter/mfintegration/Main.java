package ru.zxter.mfintegration;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import ru.zxter.mfintegration.proxy.CommonProxy;

/**
 * Created by zxter on 08.05.2021.
 */
@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION,dependencies = "required-after:minefantasy2@")

public class Main {
    public static final String MODID = "MMI";
    public static final String NAME = "MF_Integration";
    public static final String VERSION = "0.0.1";

    @SidedProxy(clientSide = "ru.zxter.mfintegration.proxy.ClientProxy", serverSide = "ru.zxter.mfintegration.proxy.CommonProxy")
    public static CommonProxy proxy;


    /** ПРЕИНИЦАЛИЗАЦИЯ
     *
     * ( Обычно тут регистрируют )
     *
     * Регистрация блоков и предметов.
     * Регистрация Tile Entity
     * Регистрация сущностей
     * Присвоение имен в Ore Dictionary
     *
     *
     **/
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        System.out.println("\u001B[32m" + "[MFI PRE-INITIALIZATION]" + "\u001B[0m");
        proxy.preInit(event);
    }
    /** ИЦАЛИЗАЦИЯ
     *
     * ( Обычно тут регистрируют )
     *
     * Регистрация генераторов структур
     * Регистрация рецептов
     * Регистрация обработчиков действий
     *
     *
     **/
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("\u001B[32m" + "[MFI INITIALIZATION]" + "\u001B[0m");
        proxy.init(event);
    }
    /** ПОСТИЦАЛИЗАЦИЯ
     *
     * ( Обычно тут регистрируют )
     *
     * Всё, что связанно с другимим модами
     *
     **/
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        System.out.println("\u001B[32m" + "[MFI POST-INITIALIZATION]" + "\u001B[0m");
        proxy.postInit(event);
    }
}
//ПОЯСНЕНИЯ ПО ПРОКСИ *
/**
 *  Minecraft состоит из нескольких частей:
 *
 *  Физический клиент — это программа, которую вы запускаете с помощью лаунчера.
 *  Физический сервер, который часто называется выделенным сервером — программа, которая запускается с помощью файлов типа minecraft_server.jar.
 *  Логический клиент отвечает за отображение моделей и текстур, за прием данных от мышки и клавиатуры, за отображение GUI.
 *  Логический сервер отвечает за всю игровую логику: спавн мобов, погоду, обновление инвентарей, AI и все другие механики игры.
 *
 * */
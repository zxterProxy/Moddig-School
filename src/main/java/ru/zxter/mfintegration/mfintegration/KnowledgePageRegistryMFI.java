package ru.zxter.mfintegration.mfintegration;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import minefantasy.mf2.api.knowledge.client.EntryPageCraft;
import minefantasy.mf2.api.knowledge.client.EntryPageRecipeBase;
import minefantasy.mf2.api.knowledge.client.EntryPageRecipeCarpenter;
import minefantasy.mf2.api.knowledge.client.EntryPageText;
import minefantasy.mf2.knowledge.KnowledgeListMF;
import ru.zxter.mfintegration.reg.MFIRecipeReg;

/**
 * Created by zxter on 09.05.2021.
 */

@SideOnly(Side.CLIENT)
public class KnowledgePageRegistryMFI {

    public static void MFIRegisterPages(){
        KnowledgeListMFI.test.addPages(new EntryPageText("knowledge.gettingStarted.upgrade"));
        KnowledgeListMFI.test.addPages(new EntryPageRecipeBase(KnowledgeListMF.dryrocksR));

    }
}

package ru.zxter.mfintegration.mfintegration;

import minefantasy.mf2.api.knowledge.InformationBase;
import minefantasy.mf2.api.rpg.SkillList;
import minefantasy.mf2.block.list.BlockListMF;
import ru.zxter.mfintegration.reg.ItemToolReg;

import static minefantasy.mf2.knowledge.KnowledgeListMF.mastery;

/**
 * Регистрация изучений
 * Регистрация идет в пост инициализции
 */
public class KnowledgeListMFI {

    public static InformationBase test;

    public static void init() {
        test = (new InformationBase("scrapper", 0, -3, 0, ItemToolReg.test, (InformationBase) null))
                .registerStat().setPage(mastery).addSkill(SkillList.artisanry, 1);
    }
}
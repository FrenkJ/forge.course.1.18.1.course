package net.frenk.mccourse.util;

import net.frenk.mccourse.MCCourseMOD;
import net.frenk.mccourse.item.Moditems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;

public class ModItemProperties {

    public static void  addCustomItemProperties() {
        ItemProperties.register((Moditems.DATA_TABLET.get()), new ResourceLocation(MCCourseMOD.MOD_ID, "on"),
                ((pStack, pLevel, pEntity, pSeed) -> pStack.hasTag() ? 1f : 0f));

    }

}

package net.frenk.mccourse.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab COURSE_TAB = new CreativeModeTab("couresmodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Moditems.COBALT_INGOT.get());
        }
    };
}

package net.frenk.mccourse.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier COBALT = new ForgeTier(4, 1500, 4f,
            4f, 10, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Moditems.COBALT_INGOT.get()));

}

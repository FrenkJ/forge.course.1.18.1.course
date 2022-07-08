package net.frenk.mccourse.item.custom;

import net.frenk.mccourse.util.ModTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Vanishable;
import net.minecraft.world.level.block.Block;

public class PaxellItem extends DiggerItem implements Vanishable {


    public PaxellItem( Tier pTier,float pAttackDamageModifier, float pAttackSpeedModifier,  Properties pProperties) {
        super(pAttackDamageModifier, pAttackSpeedModifier, pTier, ModTags.Blocks.PAXEL_MINEABLE, pProperties);
    }
}



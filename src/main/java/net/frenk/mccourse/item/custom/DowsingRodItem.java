package net.frenk.mccourse.item.custom;

import net.frenk.mccourse.util.ModTags;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DowsingRodItem extends Item {

    public DowsingRodItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if (pContext.getLevel().isClientSide()) {
            BlockPos postitionClicked = pContext.getClickedPos();
            Player player = pContext.getPlayer();
            Boolean foundBlock = false;

            for (int i = -64; i <= postitionClicked.getY() + 64; i++){
                Block blockBelow= pContext.getLevel().getBlockState(postitionClicked.below(i)).getBlock();

                if(isValuableBlock(blockBelow)) {
                    outputValuableCoordinate(postitionClicked.below(i), player,blockBelow);
                    foundBlock = true;
                            break;


                }

            }
              if(!foundBlock) {
                  player.sendMessage( new TranslatableComponent("item.mccourse.dowsing_rod.no_valuables"),
                          player.getUUID());
              }

        }

        return super.useOn(pContext);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents,
                                TooltipFlag pIsAdvanced) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(new TranslatableComponent("tooltip.mccourse.dowsing_rod.tooltip.shift"));
        }else{
            pTooltipComponents.add(new TranslatableComponent("tooltip.mccourse.dowsing_rod.tooltip."));
        }

    }

    private void outputValuableCoordinate(BlockPos blockPos, Player player, Block blockBelow) {
      player.sendMessage(new TextComponent("found" + blockBelow.getName() + "at" + "("
              + blockPos.getX() + ", " +  blockPos.getY()+ "," + blockPos.getZ()+ ")"), player.getUUID())   ;
}

private boolean isValuableBlock (Block block) {
        return ModTags.Blocks.DOWSING_ROD_VALUABLE.contains(block);

}


}

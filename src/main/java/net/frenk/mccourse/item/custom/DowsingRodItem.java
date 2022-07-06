package net.frenk.mccourse.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

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
private void outputValuableCoordinate(BlockPos blockPos, Player player, Block blockBelow) {
      player.sendMessage(new TextComponent("found" + blockBelow.getName() + "at" + "("
              + blockPos.getX() + ", " +  blockPos.getY()+ "," + blockPos.getZ()+ ")"), player.getUUID())   ;
}

private boolean isValuableBlock (Block block) {
        return block == Blocks.COAL_ORE || block == Blocks.IRON_ORE || block == Blocks.DIAMOND_ORE || block == Blocks.COPPER_ORE ||
                block == Blocks.GOLD_ORE;

}


}

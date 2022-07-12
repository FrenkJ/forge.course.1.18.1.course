package net.frenk.mccourse.util;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class InventoryUtil {

public static boolean hasPlayerInInventory (Player player, Item item) {
    for (int i = 0; i< player.getInventory().getContainerSize(); i++) {
        ItemStack currentStack = player.getInventory().getItem(i);
        if (!currentStack.isEmpty() && currentStack.sameItem(new ItemStack(item))) {
            return true;
        }

    }
    return false;
}

    public static int getFirstInInventoryIndex (Player player, Item item) {
        for (int i = 0; i < player.getInventory().getContainerSize(); i++) {
            ItemStack currentStack = player.getInventory().getItem(i);
            if (!currentStack.isEmpty() && currentStack.sameItem(new ItemStack(item))) {
                return i;
            }

        }

 return -1;
    }

}

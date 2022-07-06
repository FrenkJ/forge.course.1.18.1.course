package net.frenk.mccourse.util;

import net.frenk.mccourse.MCCourseMOD;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class ModTags {

    public static void register() {
        Blocks.registerBlocktags();
        Blocks.Items.registerItemTags();
    }

    public static class Blocks {
        public static final Tags.IOptionalNamedTag<Block> DOWSING_ROD_VALUABLE = tag("dowsing_rod_valuable");

        private static Tags.IOptionalNamedTag<Block> tag(String name) {
            return BlockTags.createOptional(new ResourceLocation(MCCourseMOD.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Block> forgetag(String name) {
            return BlockTags.createOptional(new ResourceLocation("forge", name));
        }

        public static void registerBlocktags() {

        }

        public static class Items {
            public static final Tags.IOptionalNamedTag<Item> COBALT_INGOT = forgetag("ingots/cobalt");
            public static final Tags.IOptionalNamedTag<Item> COBALT_NUGGETS = forgetag("nuggets/cobalt");

            private static Tags.IOptionalNamedTag<Item> tag(String name) {
                return ItemTags.createOptional(new ResourceLocation(MCCourseMOD.MOD_ID, name));
            }

            private static Tags.IOptionalNamedTag<Item> forgetag(String name) {
                return ItemTags.createOptional(new ResourceLocation("forge", name));
            }

            public static void registerItemTags() {
            }

        }
    }
}
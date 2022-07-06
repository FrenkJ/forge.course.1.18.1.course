package net.frenk.mccourse.item;

import net.frenk.mccourse.MCCourseMOD;
import net.frenk.mccourse.item.custom.CoalSliverItem;
import net.frenk.mccourse.item.custom.DowsingRodItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
    DeferredRegister.create(ForgeRegistries.ITEMS, MCCourseMOD.MOD_ID);

   public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot",
           ()-> new Item(new Item.Properties().tab(ModCreativeModTab.COURSE_TAB)));

   public static final RegistryObject<Item> COBALT_NUGGET = ITEMS.register("cobalt_nugget",
            ()-> new Item(new Item.Properties().tab(ModCreativeModTab.COURSE_TAB)));

    public static final RegistryObject<Item> RAW_COBALT = ITEMS.register("raw_cobalt",
            ()-> new Item(new Item.Properties().tab(ModCreativeModTab.COURSE_TAB)));

    public static final RegistryObject<Item> DOWSING_ROD = ITEMS.register("dowsing_rod",
            ()-> new DowsingRodItem(new Item.Properties().tab(ModCreativeModTab.COURSE_TAB)));

    public static final RegistryObject<Item> COAL_SLIVER = ITEMS.register("coal_sliver",
            ()-> new CoalSliverItem(new Item.Properties().tab(ModCreativeModTab.COURSE_TAB)));


    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}

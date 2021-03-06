package net.frenk.mccourse.item;

import net.frenk.mccourse.MCCourseMOD;
import net.frenk.mccourse.block.custom.DataTabletItem;
import net.frenk.mccourse.item.custom.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
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

    public static final RegistryObject<Item> COBALT_SWORD = ITEMS.register("cobalt_sword",
            ()-> new LevitationSwordItem(ModTiers.COBALT ,2, 3f, new Item.Properties()
                    .tab(ModCreativeModTab.COURSE_TAB)));

    public static final RegistryObject<Item> COBALT_PICKAXE = ITEMS.register("cobalt_pickaxe",
            ()-> new PickaxeItem(ModTiers.COBALT ,2, 3f, new Item.Properties()
                    .tab(ModCreativeModTab.COURSE_TAB)));

    public static final RegistryObject<Item> COBALT_AXE = ITEMS.register("cobalt_axe",
            ()-> new AxeItem(ModTiers.COBALT ,6, 0f, new Item.Properties()
                    .tab(ModCreativeModTab.COURSE_TAB)));

    public static final RegistryObject<Item> COBALT_SHOVEL = ITEMS.register("cobalt_shovel",
            ()-> new ShovelItem(ModTiers.COBALT ,2, 3f, new Item.Properties()
                    .tab(ModCreativeModTab.COURSE_TAB)));

    public static final RegistryObject<Item> COBALT_HOE= ITEMS.register("cobalt_hoe",
            ()-> new HoeItem(ModTiers.COBALT ,0, 0f, new Item.Properties()
                    .tab(ModCreativeModTab.COURSE_TAB)));

    public static final RegistryObject<Item> COBALT_PAXEL= ITEMS.register("cobalt_paxel",
            ()-> new PaxellItem(ModTiers.COBALT ,0, 0f, new Item.Properties()
                    .tab(ModCreativeModTab.COURSE_TAB)));

    public static final RegistryObject<Item> COBALT_HELMET = ITEMS.register("cobalt_helmet",
            () -> new ModArmorItem(ModArmorMaterials.COBALT, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.COURSE_TAB)));

    public static final RegistryObject<Item> COBALT_CHESTPLATE= ITEMS.register("cobalt_chestplate",
            ()-> new ArmorItem(ModArmorMaterials.COBALT , EquipmentSlot.CHEST, new Item.Properties()
                    .tab(ModCreativeModTab.COURSE_TAB)));

    public static final RegistryObject<Item> COBALT_LEGGINGS= ITEMS.register("cobalt_leggings",
            ()-> new ArmorItem(ModArmorMaterials.COBALT , EquipmentSlot.LEGS, new Item.Properties()
                    .tab(ModCreativeModTab.COURSE_TAB)));

    public static final RegistryObject<Item> COBALT_BOOTS= ITEMS.register("cobalt_boots",
            ()-> new ArmorItem(ModArmorMaterials.COBALT , EquipmentSlot.FEET, new Item.Properties()
                    .tab(ModCreativeModTab.COURSE_TAB)));

    public static final RegistryObject<Item> COBALT_HORSE_ARMOR = ITEMS.register("cobalt_horse_armor",
            () -> new HorseArmorItem(12, "cobalt",
                    new Item.Properties().tab(ModCreativeModTab.COURSE_TAB)));

    public static final RegistryObject<Item> DATA_TABLET = ITEMS.register("data_tablet",
            () -> new DataTabletItem(new Item.Properties().tab(ModCreativeModTab.COURSE_TAB).stacksTo(1)));

    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}

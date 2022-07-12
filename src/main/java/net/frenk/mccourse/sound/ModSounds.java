package net.frenk.mccourse.sound;

import net.frenk.mccourse.MCCourseMOD;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MCCourseMOD.MOD_ID);

public static RegistryObject<SoundEvent> DOWSING_ROD_FOUND_ORE = registerSoundEvents("dowsing_rod_found_ore");




    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        ResourceLocation id = new ResourceLocation(MCCourseMOD.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> new SoundEvent(id));
    }
    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }

}

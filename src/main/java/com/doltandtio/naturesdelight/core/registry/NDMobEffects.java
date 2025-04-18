package com.doltandtio.naturesdelight.core.registry;

import com.doltandtio.naturesdelight.common.effect.ChilledEffect;
import com.doltandtio.naturesdelight.common.effect.MedicinalEffect;
import com.doltandtio.naturesdelight.common.effect.VigorEffect;
import com.doltandtio.naturesdelight.core.NaturesDelight;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NDMobEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, NaturesDelight.MOD_ID);

    public static final RegistryObject<MobEffect> CHILLED = MOB_EFFECTS.register("chilled", ChilledEffect::new);
    public static final RegistryObject<MobEffect> MEDICINAL = MOB_EFFECTS.register("medicinal", MedicinalEffect::new);
    public static final RegistryObject<MobEffect> VIGOR = MOB_EFFECTS.register("vigor", VigorEffect::new);
}

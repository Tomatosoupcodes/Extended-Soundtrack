package com.github.Tomatosoupcodes.mc_ost_plus.core.init;

import com.github.Tomatosoupcodes.mc_ost_plus.MinecraftOSTPlus;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundEventInit {

	public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister
			.create(ForgeRegistries.SOUND_EVENTS, MinecraftOSTPlus.MOD_ID);

	public final Lazy<SoundEvent> DEATH_LAZY = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(MinecraftOSTPlus.MOD_ID, "record.death")));

	public final Lazy<SoundEvent> DOG_LAZY = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(MinecraftOSTPlus.MOD_ID, "record.dog")));

	public final Lazy<SoundEvent> DROOPYLR_LAZY = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(MinecraftOSTPlus.MOD_ID, "record.droopy_likes_ricochet")));

	public final Lazy<SoundEvent> DROOPYLYF_LAZY = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(MinecraftOSTPlus.MOD_ID, "record.droopy_likes_your_face")));

	public final Lazy<SoundEvent> FLAKE_LAZY = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(MinecraftOSTPlus.MOD_ID, "record.flake")));

	public final Lazy<SoundEvent> KYOTO_LAZY = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(MinecraftOSTPlus.MOD_ID, "record.kyoto")));

	public final Lazy<SoundEvent> ELEVEN_LAZY = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(MinecraftOSTPlus.MOD_ID, "record.eleven")));

	public final Lazy<SoundEvent> OXTENC_LAZY = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(MinecraftOSTPlus.MOD_ID, "record.0x10c")));

	public final Lazy<SoundEvent> O_LAZY = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(MinecraftOSTPlus.MOD_ID, "record.0")));
}

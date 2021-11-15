package com.github.Tomatosoupcodes.mc_ost_plus.core.init;

import com.github.Tomatosoupcodes.mc_ost_plus.MinecraftOSTPlus;
import com.github.Tomatosoupcodes.mc_ost_plus.common.itemgroup.MCOSTPlusItemGroup;

import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			MinecraftOSTPlus.MOD_ID);

	public static final RegistryObject<MusicDiscItem> MUSIC_DISC_DEATH = ITEMS.register("music_disc_death",
			() -> new MusicDiscItem(0, () -> new SoundEventInit().DEATH_LAZY.get(),
					new Item.Properties().maxStackSize(1).group(MCOSTPlusItemGroup.MC_OST_PLUS)));

	public static final RegistryObject<MusicDiscItem> MUSIC_DISC_DOG = ITEMS.register("music_disc_dog",
			() -> new MusicDiscItem(3, () -> new SoundEventInit().DOG_LAZY.get(),
					new Item.Properties().maxStackSize(1).group(MCOSTPlusItemGroup.MC_OST_PLUS)));

	public static final RegistryObject<MusicDiscItem> MUSIC_DISC_DROOPYLR = ITEMS.register("music_disc_droopylr",
			() -> new MusicDiscItem(8, () -> new SoundEventInit().DROOPYLR_LAZY.get(),
					new Item.Properties().maxStackSize(1).group(MCOSTPlusItemGroup.MC_OST_PLUS)));

	public static final RegistryObject<MusicDiscItem> MUSIC_DISC_DROOPYLYF = ITEMS.register("music_disc_droopylyf",
			() -> new MusicDiscItem(9, () -> new SoundEventInit().DROOPYLYF_LAZY.get(),
					new Item.Properties().maxStackSize(1).group(MCOSTPlusItemGroup.MC_OST_PLUS)));

	public static final RegistryObject<MusicDiscItem> MUSIC_DISC_FLAKE = ITEMS.register("music_disc_flake",
			() -> new MusicDiscItem(14, () -> new SoundEventInit().FLAKE_LAZY.get(),
					new Item.Properties().maxStackSize(1).group(MCOSTPlusItemGroup.MC_OST_PLUS)));

	public static final RegistryObject<MusicDiscItem> MUSIC_DISC_KYOTO = ITEMS.register("music_disc_kyoto",
			() -> new MusicDiscItem(15, () -> new SoundEventInit().KYOTO_LAZY.get(),
					new Item.Properties().maxStackSize(1).group(MCOSTPlusItemGroup.MC_OST_PLUS)));

	public static final RegistryObject<MusicDiscItem> MUSIC_DISC_ELEVEN = ITEMS.register("music_disc_eleven",
			() -> new MusicDiscItem(11, () -> new SoundEventInit().ELEVEN_LAZY.get(),
					new Item.Properties().maxStackSize(1).group(MCOSTPlusItemGroup.MC_OST_PLUS)));

	public static final RegistryObject<MusicDiscItem> MUSIC_DISC_OXTENC = ITEMS.register("music_disc_0x10c",
			() -> new MusicDiscItem(10, () -> new SoundEventInit().OXTENC_LAZY.get(),
					new Item.Properties().maxStackSize(1).group(MCOSTPlusItemGroup.MC_OST_PLUS)));

	public static final RegistryObject<MusicDiscItem> MUSIC_DISC_0 = ITEMS.register("music_disc_0",
			() -> new MusicDiscItem(0, () -> new SoundEventInit().O_LAZY.get(),
					new Item.Properties().maxStackSize(1).group(MCOSTPlusItemGroup.MC_OST_PLUS)));
}

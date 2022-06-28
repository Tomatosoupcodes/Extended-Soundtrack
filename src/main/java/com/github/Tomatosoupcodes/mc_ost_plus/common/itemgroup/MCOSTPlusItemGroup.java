package com.github.Tomatosoupcodes.mc_ost_plus.common.itemgroup;

import com.github.Tomatosoupcodes.mc_ost_plus.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MCOSTPlusItemGroup extends ItemGroup {

	public static final MCOSTPlusItemGroup MC_OST_PLUS = new MCOSTPlusItemGroup(ItemGroup.GROUPS.length, "mc_ost_plus");

	public MCOSTPlusItemGroup(int index, String label) {
		super(index, label);
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(ItemInit.MUSIC_DISC_DROOPYLYF.get());
	}

}

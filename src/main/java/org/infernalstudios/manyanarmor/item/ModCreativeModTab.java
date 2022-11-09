package org.infernalstudios.manyanarmor.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModCreativeModTab {
    public static final CreativeModeTab MANYANARMORS = new CreativeModeTab("manyanarmors") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.IRON_CHESTPLATE);
        }
    };
}

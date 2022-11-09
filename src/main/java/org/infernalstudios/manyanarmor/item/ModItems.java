package org.infernalstudios.manyanarmor.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.infernalstudios.manyanarmor.ManyAnArmorMod;
import org.infernalstudios.manyanarmor.item.Armor.GorillaArmor;

public class ModItems {


    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ManyAnArmorMod.MOD_ID);

    public static final RegistryObject<Item> GORILLA_HELMET = ITEMS.register("gorilla_helmet",
            () -> new GorillaArmor.Helmet());
    public static final RegistryObject<Item> GORILLA_CHESTPLATE = ITEMS.register("gorilla_chestplate",
            () -> new GorillaArmor.Chestplate());
    public static final RegistryObject<Item> GORILLA_LEGGINGS = ITEMS.register("gorilla_leggings",
            () -> new GorillaArmor.Leggings());
    public static final RegistryObject<Item> GORILLA_BOOTS = ITEMS.register("gorilla_boots",
            () -> new GorillaArmor.Boots());


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

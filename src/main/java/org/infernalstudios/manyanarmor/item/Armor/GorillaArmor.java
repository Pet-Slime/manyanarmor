package org.infernalstudios.manyanarmor.item.Armor;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.ForgeRegistries;
import org.infernalstudios.manyanarmor.item.ModCreativeModTab;

public class GorillaArmor extends ArmorItem {

    private static final CreativeModeTab LEATHERS = ModCreativeModTab.MANYANARMORS;

    public GorillaArmor(EquipmentSlot slot, Properties properties) {
        super(new ArmorMaterial() {
            @Override
            public int getDurabilityForSlot(EquipmentSlot slot) {
                return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
            }

            @Override
            public int getDefenseForSlot(EquipmentSlot slot) {
                return new int[]{2, 5, 6, 2}[slot.getIndex()];
            }

            @Override
            public int getEnchantmentValue() {
                return 9;
            }

            @Override
            public SoundEvent getEquipSound() {
                return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather"));
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.LEATHER));
            }

            @Override
            public String getName() {
                return "gorilla_armor";
            }

            @Override
            public float getToughness() {
                return 0f;
            }

            @Override
            public float getKnockbackResistance() {
                return 0f;
            }
        }, slot, properties);
    }

    public static class Helmet extends GorillaArmor {
        public Helmet() {
            super(EquipmentSlot.HEAD, new Properties().tab(LEATHERS));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "manyanarmor:textures/models/armor/gorilla_layer_1.png";
        }
    }

    public static class Chestplate extends GorillaArmor {
        public Chestplate() {
            super(EquipmentSlot.CHEST, new Properties().tab(LEATHERS));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "manyanarmor:textures/models/armor/gorilla_layer_1.png";
        }
    }

    public static class Leggings extends GorillaArmor {
        public Leggings() {
            super(EquipmentSlot.LEGS, new Properties().tab(LEATHERS));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "manyanarmor:textures/models/armor/gorilla_layer_2.png";
        }
    }

    public static class Boots extends GorillaArmor {
        public Boots() {
            super(EquipmentSlot.FEET, new Properties().tab(LEATHERS));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "manyanarmor:textures/models/armor/gorilla_layer_1.png";
        }
    }
}

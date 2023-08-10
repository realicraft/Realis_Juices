package com.realicraft.rcjuices.item;

import com.realicraft.rcjuices.rcJuices;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, rcJuices.MOD_ID);

    public static final RegistryObject<Item> APPLE_JUICE = ITEMS.register("apple_juice", () -> new JuiceItem(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(4).saturationMod(2.4f).build())));
    public static final RegistryObject<Item> CARROT_JUICE = ITEMS.register("carrot_juice", () -> new JuiceItem(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(3).saturationMod(3.6f).build())));
    public static final RegistryObject<Item> GOLDEN_APPLE_JUICE = ITEMS.register("golden_apple_juice", () -> new JuiceItem(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(4).saturationMod(9.6f).alwaysEat().effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1), 1.0F).effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0), 1.0F).build())));
    public static final RegistryObject<Item> GLOW_BERRY_JUICE = ITEMS.register("glow_berry_juice", () -> new JuiceItem(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.4f).build())));
    public static final RegistryObject<Item> MELON_JUICE = ITEMS.register("melon_juice", () -> new JuiceItem(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(2).saturationMod(1.2f).build())));
    public static final RegistryObject<Item> PUMPKIN_JUICE = ITEMS.register("pumpkin_juice", () -> new JuiceItem(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(5).saturationMod(3.6f).build())));
    public static final RegistryObject<Item> SWEET_BERRY_JUICE = ITEMS.register("sweet_berry_juice", () -> new JuiceItem(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.4f).build())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

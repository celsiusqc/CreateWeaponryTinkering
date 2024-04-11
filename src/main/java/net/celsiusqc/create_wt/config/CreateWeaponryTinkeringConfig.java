package net.celsiusqc.create_wt.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CreateWeaponryTinkeringConfig {
    public static ForgeConfigSpec.BooleanValue enableTinyTools;
    public static ForgeConfigSpec.BooleanValue enableGlaives;

    public static final ForgeConfigSpec CONFIG;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        enableTinyTools = builder
                .comment("Should Tiny Tools be enabled?")
                .define("items.enableTinyTools", true);

        enableGlaives = builder
                .comment("Should Glaives be enabled?")
                .define("items.enableGlaives", true);

        CONFIG = builder.build();
    }
}


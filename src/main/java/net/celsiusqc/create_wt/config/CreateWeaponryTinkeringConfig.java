package net.celsiusqc.create_wt.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CreateWeaponryTinkeringConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec CONFIG;

    public static ForgeConfigSpec.BooleanValue enableTinyTools;

    static {
        enableTinyTools = BUILDER
                .comment("Enable Tiny Tools: if disabled, they will not appear in game.")
                .define("feature.enableTinyTools", true);

        CONFIG = BUILDER.build();
    }
}

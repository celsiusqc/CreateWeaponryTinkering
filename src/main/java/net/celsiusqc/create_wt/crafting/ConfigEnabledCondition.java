package net.celsiusqc.create_wt.crafting;

import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;
import net.celsiusqc.create_wt.config.CreateWeaponryTinkeringConfig;

public class ConfigEnabledCondition implements ICondition {
    private final ResourceLocation location;
    private final String configName;
    private final boolean expectedValue;

    public ConfigEnabledCondition(ResourceLocation location, String configName) {
        this(location, configName, true);
    }

    public ConfigEnabledCondition(ResourceLocation location, String configName, boolean expectedValue) {
        this.location = location;
        this.configName = configName;
        this.expectedValue = expectedValue;
    }

    @Override
    public ResourceLocation getID() {
        return location;
    }

    @Override
    public boolean test(IContext context) {
        // Recipes historically reference these with section prefixes ("feature.enableVanillaRecipeOverwrite",
        // "items.enableGlaives"); compare on the bare name so both spellings resolve.
        String key = this.configName.substring(this.configName.lastIndexOf('.') + 1);
        Boolean configValue = null;
        if (key.equals("enableTinyTools")) {
            configValue = CreateWeaponryTinkeringConfig.enableTinyTools.get();
        } else if (key.equals("enableGlaives")) {
            configValue = CreateWeaponryTinkeringConfig.enableGlaives.get();
        } else if (key.equals("enableMaces")) {
            configValue = CreateWeaponryTinkeringConfig.enableMaces.get();
        } else if (key.equals("enableKatanas")) {
            configValue = CreateWeaponryTinkeringConfig.enableKatanas.get();
        } else if (key.equals("enableHammers")) {
            configValue = CreateWeaponryTinkeringConfig.enableHammers.get();
        } else if (key.equals("enableVanillaRecipeOverwrite")) {
            configValue = CreateWeaponryTinkeringConfig.enableVanillaRecipeOverwrite.get();
        }
        if (configValue == null) {
            return true; // unknown name: keep the recipe rather than silently dropping content
        }
        // expectedValue lets data files load a recipe when a setting is DISABLED (value: false),
        // which is how the vanilla tool recipes get restored when enableVanillaRecipeOverwrite is off.
        return configValue == this.expectedValue;
    }

    public static class Serializer implements IConditionSerializer<ConfigEnabledCondition> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void write(JsonObject json, ConfigEnabledCondition value) {
            json.addProperty("config", value.configName);
            json.addProperty("value", value.expectedValue);
        }

        @Override
        public ConfigEnabledCondition read(JsonObject json) {
            boolean expected = !json.has("value") || json.getAsJsonPrimitive("value").getAsBoolean();
            return new ConfigEnabledCondition(new ResourceLocation("create_wt", "config"),
                    json.getAsJsonPrimitive("config").getAsString(), expected);
        }

        @Override
        public ResourceLocation getID() {
            return new ResourceLocation("create_wt", "config");
        }
    }
}

package net.celsiusqc.create_wt.crafting;

import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;
import net.celsiusqc.create_wt.config.CreateWeaponryTinkeringConfig;

public class ConfigEnabledCondition implements ICondition {
    private final ResourceLocation location;
    private final String configName;

    public ConfigEnabledCondition(ResourceLocation location, String configName) {
        this.location = location;
        this.configName = configName;
    }

    @Override
    public ResourceLocation getID() {
        return location;
    }

    // This is the correct method to override from ICondition
    @Override
    public boolean test(IContext context) {
        // You should check which config name is being passed and return the appropriate config setting.
        if (this.configName.equals("enableTinyTools")) {
            return CreateWeaponryTinkeringConfig.enableTinyTools.get();
        }
        if (this.configName.equals("enableGlaives")) {
            return CreateWeaponryTinkeringConfig.enableGlaives.get();
        }
        if (this.configName.equals("enableMaces")) {
            return CreateWeaponryTinkeringConfig.enableMaces.get();
        }
        if (this.configName.equals("enableKatanas")) {
            return CreateWeaponryTinkeringConfig.enableKatanas.get();
        }
        if (this.configName.equals("enableHammers")) {
            return CreateWeaponryTinkeringConfig.enableHammers.get();
        }
        if (this.configName.equals("enableVanillaRecipeOverwrite")) {
            return CreateWeaponryTinkeringConfig.enableVanillaRecipeOverwrite.get();


        }
        // If configName does not match known configs, you can decide to either default to true or false
        // Or throw an exception if that is considered a configuration error.
        return true; // or throw new RuntimeException("Unknown config: " + this.configName);
    }

    public static class Serializer implements IConditionSerializer<ConfigEnabledCondition> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void write(JsonObject json, ConfigEnabledCondition value) {
            // Serialize the condition's config option name
            json.addProperty("config", value.configName);
        }

        @Override
        public ConfigEnabledCondition read(JsonObject json) {
            // Deserialize the condition's config option name
            return new ConfigEnabledCondition(new ResourceLocation("create_wt", "config"), json.getAsJsonPrimitive("config").getAsString());
        }

        @Override
        public ResourceLocation getID() {
            return new ResourceLocation("create_wt", "config");
        }
    }
}

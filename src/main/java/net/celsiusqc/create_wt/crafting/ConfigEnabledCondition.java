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
        // Check the appropriate config option, for example:
        return CreateWeaponryTinkeringConfig.enableTinyTools.get();
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

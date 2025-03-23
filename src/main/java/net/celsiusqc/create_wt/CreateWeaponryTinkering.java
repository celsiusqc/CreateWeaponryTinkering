package net.celsiusqc.create_wt;

import com.simibubi.create.Create;
import net.celsiusqc.create_wt.fluid.ModFluids;
import net.celsiusqc.create_wt.fluid.MoltenLavaFluidProperties;
import net.celsiusqc.create_wt.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.celsiusqc.create_wt.fluid.ModFluids.registerFluid;
import static net.celsiusqc.create_wt.item.ModItems.registerItem;

public class CreateWeaponryTinkering implements ModInitializer {
	public static final String MOD_ID = "create_wt";
    public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");
	public static final RegistryKey<ItemGroup> GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "group"));

	@Override
	public void onInitialize() {

		Registry.register(Registries.ITEM_GROUP, GROUP, FabricItemGroup.builder()
				.displayName(Text.translatable("itemgroup.create_wt"))
				.icon(() -> new ItemStack(ModItems.ICON))
				.entries(((displayContext, entries) -> entries.add(ModItems.ICON)))
				.build());

		ModItems.registerModItems();
		ModFluids.registerModFluids();
		registerItem();
		registerFluid();

		LOGGER.info("Create addon mod [{}] is loading alongside Create [{}]!", NAME, Create.VERSION);
		LOGGER.info(EnvExecutor.unsafeRunForDist(
				() -> () -> "{} is accessing Porting Lib from the client!",
				() -> () -> "{} is accessing Porting Lib from the server!"
		), NAME);

	}

	

}
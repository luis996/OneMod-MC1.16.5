
package net.mcreator.onemod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.block.Blocks;

import net.mcreator.onemod.itemgroup.OneModItemGroup;
import net.mcreator.onemod.OnemodModElements;

@OnemodModElements.ModElement.Tag
public class BedrockPickaxeItem extends OnemodModElements.ModElement {
	@ObjectHolder("onemod:bedrock_pickaxe")
	public static final Item block = null;
	public BedrockPickaxeItem(OnemodModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 128000;
			}

			public float getEfficiency() {
				return 128000f;
			}

			public float getAttackDamage() {
				return 127998f;
			}

			public int getHarvestLevel() {
				return 128000;
			}

			public int getEnchantability() {
				return 128000;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.DIAMOND_BLOCK), new ItemStack(Blocks.BEDROCK));
			}
		}, 1, 96f, new Item.Properties().group(OneModItemGroup.tab).isImmuneToFire()) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}
		}.setRegistryName("bedrock_pickaxe"));
	}
}

package ru.blayzer.customblocks;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.MinecraftForge;
import ru.blayzer.customblocks.armor.*;
import ru.blayzer.customblocks.blocks.*;
import ru.blayzer.customblocks.blocksmodels.*;
import ru.blayzer.customblocks.blocksmodels.util.*;
import ru.blayzer.customblocks.blocksmulti.*;
import ru.blayzer.customblocks.fences.*;
import ru.blayzer.customblocks.items.*;
import ru.blayzer.customblocks.ladders.*;
import ru.blayzer.customblocks.rails.*;
import ru.blayzer.customblocks.shields.*;
import ru.blayzer.customblocks.swords.*;
import ru.blayzer.customblocks.webs.*;

@Mod (modid = "customblocks", name = "CustomBlocks", version = "2.0")

public class CustomBlocksCore {

	@SidedProxy(clientSide="ru.blayzer.customblocks.ClientProxy", serverSide="ru.blayzer.customblocks.CommonProxy")
	public static CommonProxy proxy;
	
	public static Item Item_01;
	public static Item Item_02;
	public static Item Item_03;
	public static Item Item_04;
	public static Item Item_05;
	public static Item Item_06;
	public static Item Item_07;
	public static Item Item_08;
	public static Item Item_09;
	public static Item Item_10;
	public static Item Item_11;
	public static Item Item_12;
	public static Item Item_13;
	public static Item Item_14;
	public static Item Item_15;
	public static Item Item_16;
	public static Item Item_17;
	public static Item Item_18;
	public static Item Item_19;
	public static Item Item_20;
	public static Item Item_21;
	public static Item Item_22;
	public static Item Item_23;
	public static Item Item_24;
	public static Item Item_25;
	public static Item Item_26;
	public static Item Item_27;
	public static Item Item_28;
	public static Item Item_29;
	public static Item Item_30;
	public static Item Item_31;
	public static Item Item_32;
	public static Item Item_33;
	public static Item Item_34;
	public static Item Item_35;
	public static Item Item_36;
	public static Item Item_37;
	public static Item Item_38;
	public static Item Item_39;
	public static Item Item_40;
	public static Item Item_41;
	public static Item Item_42;
	public static Item Item_43;
	public static Item Item_44;
	public static Item Item_45;

	public static Item Weapon;
	public static Item Weapon1;
	public static Item Weapon2;
	public static Item Weapon3;
	public static Item Weapon4;
	public static Item Weapon5;
	public static Item Weapon6;	
	public static Item SteelSword;
	public static Item RubySword;
	public static Item ObsidianSword;
	public static Item TitaniumSword;
	public static Item TopazSword;
	public static Item CobaltSword;         
	
	public static Item WoodShield;
	public static Item StoneShield;
	public static Item BronzeShield;
	public static Item IronShield;
	public static Item GoldShield;
	public static Item DiamondShield;
	public static Item EmeraldShield;
	public static Item FullWoodShield;
	public static Item FullStoneShield;
	public static Item FullBronzeShield;
	public static Item FullIronShield;
	public static Item FullGoldShield;
	public static Item FullDiamondShield;
	public static Item FullEmeraldShield;
	public static Item CryscentShield;
	public static Item HeaterShield;
	public static Item ScutumShield;
	public static Item TowerShield;
	
	public static Block Block_01;
	public static Block Block_02;
	public static Block Block_03;
	public static Block Block_04;
	public static Block Block_05;
	public static Block Block_06;
	public static Block Block_07;
	public static Block Block_08;
	public static Block Block_09;
	public static Block Block_10;
	public static Block Block_11;
	public static Block Block_12;
	public static Block Block_13;
	public static Block Block_14;
	public static Block Block_15;
	public static Block Block_16;
	public static Block Block_17;
	public static Block Block_18;
	public static Block Block_19;
	public static Block Block_20;
	public static Block Block_21;
	public static Block Block_22;
	public static Block Block_23;
	public static Block Block_24;
	public static Block Block_25;
	public static Block Block_26;
	public static Block Block_27;
	public static Block Block_28;
	public static Block Block_29;
	public static Block Block_30;
	public static Block Block_31;
	public static Block Block_32;
	public static Block Block_33;
	public static Block Block_34;
	public static Block Block_35;
	public static Block Block_36;
	public static Block Block_37;
	public static Block Block_38;
	public static Block Block_39;
	public static Block Block_40;
	public static Block Block_41;
	public static Block Block_42;
	public static Block Block_43;
	public static Block Block_44;
	public static Block Block_45;
	public static Block Block_46;
	public static Block Block_47;
	public static Block Block_48;
	public static Block Block_49;
	public static Block Block_50;
	public static Block Block_51;
	public static Block Block_52;
	public static Block Block_53;
	public static Block Block_54;
	public static Block Block_55;
	public static Block Block_56;
	public static Block Block_57;
	public static Block Block_58;
	public static Block Block_59;
	public static Block Block_60;
	public static Block Block_61;
	public static Block Block_62;
	public static Block Block_63;
	public static Block Block_64;
	public static Block Block_65;
	public static Block Block_66;
	public static Block Block_67;
	public static Block Block_68;
	public static Block Block_69;
	public static Block Block_70;
	public static Block Block_71;
	public static Block Block_72;
	public static Block Block_73;
	public static Block Block_74;
	public static Block Block_75;
	public static Block Block_76;
	public static Block Block_77;
	public static Block Block_78;
	public static Block Block_79;
	public static Block Block_80;
	public static Block Block_81;
	
	public static Block BlockModel_01;
	public static Block BlockModel_02;
	public static Block BlockModel_03;
	public static Block BlockModel_04;
	public static Block BlockModel_05;
	
	public static Block BlockMulti_01;
	public static Block BlockMulti_02;
	public static Block BlockMulti_03;
	public static Block BlockMulti_04;
	public static Block BlockMulti_05;
	public static Block BlockMulti_06;
	public static Block BlockMulti_07;
	public static Block BlockMulti_08;
	public static Block BlockMulti_09;
	public static Block BlockMulti_10;
	public static Block BlockMulti_11;
	public static Block BlockMulti_12;
	public static Block BlockMulti_13;
	public static Block BlockMulti_14;
	public static Block BlockMulti_15;
	public static Block BlockMulti_16;
	public static Block BlockMulti_17;
	public static Block BlockMulti_18;
	public static Block BlockMulti_19;
	public static Block BlockMulti_20;
	public static Block BlockMulti_21;
	public static Block BlockMulti_22;
	public static Block BlockMulti_23;
	public static Block BlockMulti_24;
	public static Block BlockMulti_25;
	public static Block BlockMulti_26;
	public static Block BlockMulti_27;
	
	public static Block BlockFence_01;
	public static Block BlockFence_02;
	public static Block BlockFence_03;
	public static Block BlockFence_04;
	public static Block BlockFence_05;
	public static Block BlockFence_06;
	public static Block BlockFence_07;
	public static Block BlockFence_08;
	public static Block BlockFence_09;
	public static Block BlockFence_10;
	public static Block BlockFence_11;
	public static Block BlockFence_12;
	public static Block BlockFence_13;
	public static Block BlockFence_14;
	public static Block BlockFence_15;
	public static Block BlockFence_16;
	public static Block BlockFence_17;
	public static Block BlockFence_18;
	
	public static Block BlockWeb_01;
	public static Block BlockWeb_02;
	public static Block BlockWeb_03;
	public static Block BlockWeb_04;
	public static Block BlockWeb_05;
	public static Block BlockWeb_06;
	public static Block BlockWeb_07;
	public static Block BlockWeb_08;
	public static Block BlockWeb_09;
	public static Block BlockWeb_10;
	public static Block BlockWeb_11;
	public static Block BlockWeb_12;
	public static Block BlockWeb_13;
	public static Block BlockWeb_14;
	public static Block BlockWeb_15;
	public static Block BlockWeb_16;
	public static Block BlockWeb_17;
	public static Block BlockWeb_18;
	public static Block BlockWeb_19;
	public static Block BlockWeb_20;
	public static Block BlockWeb_21;
	public static Block BlockWeb_22;
	public static Block BlockWeb_23;
	public static Block BlockWeb_24;
	public static Block BlockWeb_25;
	public static Block BlockWeb_26;
	public static Block BlockWeb_27;
	
	public static Block BlockRail_01;
	public static Block BlockRail_02;
	public static Block BlockRail_03;
	public static Block BlockRail_04;
	public static Block BlockRail_05;
	public static Block BlockRail_06;
	public static Block BlockRail_07;
	public static Block BlockRail_08;
	public static Block BlockRail_09;
	public static Block BlockRail_10;
	public static Block BlockRail_11;
	public static Block BlockRail_12;
	public static Block BlockRail_13;
	public static Block BlockRail_14;
	public static Block BlockRail_15;
	public static Block BlockRail_16;
	public static Block BlockRail_17;
	public static Block BlockRail_18;
	
	public static Block BlockLadder_01;
	public static Block BlockLadder_02;
	public static Block BlockLadder_03;
	public static Block BlockLadder_04;
	public static Block BlockLadder_05;
	public static Block BlockLadder_06;
	public static Block BlockLadder_07;
	public static Block BlockLadder_08;
	public static Block BlockLadder_09;
	public static Block BlockLadder_10;
	public static Block BlockLadder_11;
	public static Block BlockLadder_12;
	public static Block BlockLadder_13;
	public static Block BlockLadder_14;
	public static Block BlockLadder_15;
	public static Block BlockLadder_16;
	public static Block BlockLadder_17;
	public static Block BlockLadder_18;

    public static ItemArmor DiamondHelmet;
    public static ItemArmor DiamondChest;
    public static ItemArmor DiamondLeggins;
    public static ItemArmor DiamondBoots;
    public static ItemArmor SteelHelmet;
    public static ItemArmor SteelChest;
    public static ItemArmor SteelLeggins;
    public static ItemArmor SteelBoots;
    public static ItemArmor EmeraldHelmet;
    public static ItemArmor EmeraldChest;
    public static ItemArmor EmeraldLeggins;
    public static ItemArmor EmeraldBoots;
    public static ItemArmor GoldHelmet;
    public static ItemArmor GoldChest;
    public static ItemArmor GoldLeggins;
    public static ItemArmor GoldBoots;
    public static ItemArmor CustomHelm;
    public static ItemArmor CustomChest;
    public static ItemArmor CustomLegg;
    public static ItemArmor CustomBoots;
    public static ItemArmor CustomHelm1;
    public static ItemArmor CustomChest1;
    public static ItemArmor CustomLegg1;
    public static ItemArmor CustomBoots1;
    public static ItemArmor CustomHelm2;
    public static ItemArmor CustomChest2;
    public static ItemArmor CustomLegg2;
    public static ItemArmor CustomBoots2;
    public static ItemArmor CustomHelm3;
    public static ItemArmor CustomChest3;
    public static ItemArmor CustomLegg3;
    public static ItemArmor CustomBoots3;
    
    
    //¬кладки креатива
	public static CreativeTabs CustomBlocks = new CreativeTabs("CustomBlocks") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Item_01;
	    }
	};
	public static CreativeTabs CustomBlocksMulti = new CreativeTabs("CustomBlocksMulti") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Item_01;
	    }
	};
	public static CreativeTabs CustomBlocksItems = new CreativeTabs("CustomBlocksItems") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Item_01;
	    }
	};
	public static CreativeTabs CustomBlocksWebs = new CreativeTabs("CustomBlocksWebs") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Item_01;
	    }
	};
	public static CreativeTabs CustomBlocksLadders = new CreativeTabs("CustomBlocksLadders") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Item_01;
	    }
	};
	public static CreativeTabs CustomBlocksRails = new CreativeTabs("CustomBlocksRails") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Item_01;
	    }
	};
	public static CreativeTabs CustomBlocksFences = new CreativeTabs("CustomBlocksFences") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Item_01;
	    }
	};
	public static CreativeTabs CustomBlocksModels = new CreativeTabs("CustomBlocksModels") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Item_01;
	    }
	};
	public static CreativeTabs CustomBlocksArmor = new CreativeTabs("CustomBlocksArmor") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Item_01;
	    }
	};
	public static CreativeTabs CustomBlocksSwords = new CreativeTabs("CustomBlocksSwords") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Item_01;
	    }
	};
	public static CreativeTabs CustomBlocksShields = new CreativeTabs("CustomBlocksShields") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Item_01;
	    }
	};
	
	
	@EventHandler
	public void preLoad(FMLPreInitializationEvent event)
	{		

		MinecraftForge.EVENT_BUS.register(new EventHandlerCommon());
		
		//Tiles for block-multitexturred
		proxy.registerRenderThings();
		GameRegistry.registerTileEntity(TileEntityBlockModel1.class, "tileEntityBlock1");
		GameRegistry.registerTileEntity(TileEntityBlockModel1.class, "tileEntityBlock2");
        GameRegistry.registerTileEntity(TileEntityBlockModel1.class, "tileEntityBlock3");
		
		
        //Items
		Item_01 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item1");
		GameRegistry.registerItem(Item_01, "Item_01");
		Item_02 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item2");
		GameRegistry.registerItem(Item_02, "Item_02");
		Item_03 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item3");
		GameRegistry.registerItem(Item_03, "Item_03");
		Item_04 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item4");
		GameRegistry.registerItem(Item_04, "Item_04");
		Item_05 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item5");
		GameRegistry.registerItem(Item_05, "Item_05");
		Item_06 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item6");
		GameRegistry.registerItem(Item_06, "Item_06");
		Item_07 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item7");
		GameRegistry.registerItem(Item_07, "Item_07");
		Item_08 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item8");
		GameRegistry.registerItem(Item_08, "Item_08");
		Item_09 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item9");
		GameRegistry.registerItem(Item_09, "Item_09");
		Item_10 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item10");
		GameRegistry.registerItem(Item_10, "Item_10");
		Item_11 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item11");
		GameRegistry.registerItem(Item_11, "Item_11");
		Item_12 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item12");
		GameRegistry.registerItem(Item_12, "Item_12");
		Item_13 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item13");
		GameRegistry.registerItem(Item_13, "Item_13");
		Item_14 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item14");
		GameRegistry.registerItem(Item_14, "Item_14");
		Item_15 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item15");
		GameRegistry.registerItem(Item_15, "Item_15");
		Item_16 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item16");
		GameRegistry.registerItem(Item_16, "Item_16");
		Item_17 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item17");
		GameRegistry.registerItem(Item_17, "Item_17");
		Item_18 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item18");
		GameRegistry.registerItem(Item_18, "Item_18");
		Item_19 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item19");
		GameRegistry.registerItem(Item_19, "Item_19");
		Item_20 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item20");
		GameRegistry.registerItem(Item_20, "Item_20");
		Item_21 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item21");
		GameRegistry.registerItem(Item_21, "Item_21");
		Item_22 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item22");
		GameRegistry.registerItem(Item_22, "Item_22");
		Item_23 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item23");
		GameRegistry.registerItem(Item_23, "Item_23");
		Item_24 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item24");
		GameRegistry.registerItem(Item_24, "Item_24");
		Item_25 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item25");
		GameRegistry.registerItem(Item_25, "Item_25");
		Item_26 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item26");
		GameRegistry.registerItem(Item_26, "Item_26");
		Item_27 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item27");
		GameRegistry.registerItem(Item_27, "Item_27");
		Item_28 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item28");
		GameRegistry.registerItem(Item_28, "Item_28");
		Item_29 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item29");
		GameRegistry.registerItem(Item_29, "Item_29");
		Item_30 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item30");
		GameRegistry.registerItem(Item_30, "Item_30");
		Item_31 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item31");
		GameRegistry.registerItem(Item_31, "Item_31");
		Item_32 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item32");
		GameRegistry.registerItem(Item_32, "Item_32");
		Item_33 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item33");
		GameRegistry.registerItem(Item_33, "Item_33");
		Item_34 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item34");
		GameRegistry.registerItem(Item_34, "Item_34");
		Item_35 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item35");
		GameRegistry.registerItem(Item_35, "Item_35");
		Item_36 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item36");
		GameRegistry.registerItem(Item_36, "Item_36");
		Item_37 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item37");
		GameRegistry.registerItem(Item_37, "Item_37");
		Item_38 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item38");
		GameRegistry.registerItem(Item_38, "Item_38");
		Item_39 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item39");
		GameRegistry.registerItem(Item_39, "Item_39");
		Item_40 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item40");
		GameRegistry.registerItem(Item_40, "Item_40");
		Item_41 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item41");
		GameRegistry.registerItem(Item_41, "Item_41");
		Item_42 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item42");
		GameRegistry.registerItem(Item_42, "Item_42");
		Item_43 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item43");
		GameRegistry.registerItem(Item_43, "Item_43");
		Item_44 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item44");
		GameRegistry.registerItem(Item_44, "Item_44");
		Item_45 = new CustomItem().setCreativeTab(CustomBlocksItems).setUnlocalizedName("CustomItem").setTextureName("customblocks:Item45");
		GameRegistry.registerItem(Item_45, "Item_45");
		
		
		//Swords
		SteelSword = new CustomSword(ToolMaterialUtils.TM3).setCreativeTab(CustomBlocksSwords).setUnlocalizedName("SteelSword").setTextureName("customblocks:swords/SteelSword");
		GameRegistry.registerItem(SteelSword, "SteelSword");
		RubySword = new CustomSword(ToolMaterialUtils.TM10).setCreativeTab(CustomBlocksSwords).setUnlocalizedName("RubySword").setTextureName("customblocks:swords/RubySword");
		GameRegistry.registerItem(RubySword, "RubySword");
		TopazSword = new CustomSword(ToolMaterialUtils.TM4).setCreativeTab(CustomBlocksSwords).setUnlocalizedName("TopazSword").setTextureName("customblocks:swords/TopazSword");
		GameRegistry.registerItem(TopazSword, "TopazSword");
		ObsidianSword = new CustomSword(ToolMaterialUtils.TM5).setCreativeTab(CustomBlocksSwords).setUnlocalizedName("ObsidianSword").setTextureName("customblocks:swords/ObsidianSword");
		GameRegistry.registerItem(ObsidianSword, "ObsidianSword");
		CobaltSword = new CustomSword(ToolMaterialUtils.TM6).setCreativeTab(CustomBlocksSwords).setUnlocalizedName("CobaltSword").setTextureName("customblocks:swords/CobaltSword");
		GameRegistry.registerItem(CobaltSword, "CobaltSword");
		TitaniumSword = new CustomSword(ToolMaterialUtils.TM7).setCreativeTab(CustomBlocksSwords).setUnlocalizedName("TitaniumSword").setTextureName("customblocks:swords/TitaniumSword");
		GameRegistry.registerItem(TitaniumSword, "TitaniumSword");
		Weapon = new CustomSword(ToolMaterialUtils.TM7).setCreativeTab(CustomBlocksSwords).setUnlocalizedName("Weapon").setTextureName("customblocks:swords/Weapon");
		GameRegistry.registerItem(Weapon, "Weapon");
		Weapon1 = new CustomSword(ToolMaterialUtils.TM7).setCreativeTab(CustomBlocksSwords).setUnlocalizedName("Weapon1").setTextureName("customblocks:swords/Weapon1");
		GameRegistry.registerItem(Weapon1, "Weapon1");
		Weapon2 = new CustomSword(ToolMaterialUtils.TM7).setCreativeTab(CustomBlocksSwords).setUnlocalizedName("Weapon2").setTextureName("customblocks:swords/Weapon2");
		GameRegistry.registerItem(Weapon2, "Weapon2");
		Weapon3 = new CustomSword(ToolMaterialUtils.TM7).setCreativeTab(CustomBlocksSwords).setUnlocalizedName("Weapon3").setTextureName("customblocks:swords/Weapon3");
		GameRegistry.registerItem(Weapon3, "Weapon3");
		Weapon4 = new CustomSword(ToolMaterialUtils.TM7).setCreativeTab(CustomBlocksSwords).setUnlocalizedName("Weapon4").setTextureName("customblocks:swords/Weapon4");
		GameRegistry.registerItem(Weapon4, "Weapon4");
		Weapon5 = new CustomSword(ToolMaterialUtils.TM7).setCreativeTab(CustomBlocksSwords).setUnlocalizedName("Weapon5").setTextureName("customblocks:swords/Weapon5");
		GameRegistry.registerItem(Weapon5, "Weapon5");
		Weapon6 = new CustomSword(ToolMaterialUtils.TM7).setCreativeTab(CustomBlocksSwords).setUnlocalizedName("Weapon6").setTextureName("customblocks:swords/Weapon6");
		GameRegistry.registerItem(Weapon6, "Weapon6");
		
		
		//Blocks
		Block_01 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block1");
		GameRegistry.registerBlock(Block_01, "Block_01");
		Block_02 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block2");
		GameRegistry.registerBlock(Block_02, "Block_02");
		Block_03 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block3");
		GameRegistry.registerBlock(Block_03, "Block_03");
		Block_04 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block4");
		GameRegistry.registerBlock(Block_04, "Block_04");
		Block_05 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block5");
		GameRegistry.registerBlock(Block_05, "Block_05");
		Block_06 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block6");
		GameRegistry.registerBlock(Block_06, "Block_06");
		Block_07 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block7");
		GameRegistry.registerBlock(Block_07, "Block_07");
		Block_08 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block8");
		GameRegistry.registerBlock(Block_08, "Block_08");
		Block_09 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block9");
		GameRegistry.registerBlock(Block_09, "Block_09");
		Block_10 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block10");
		GameRegistry.registerBlock(Block_10, "Block_10");
		Block_11 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block11");
		GameRegistry.registerBlock(Block_11, "Block_11");
		Block_12 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block12");
		GameRegistry.registerBlock(Block_12, "Block_12");
		Block_13 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block13");
		GameRegistry.registerBlock(Block_13, "Block_13");
		Block_14 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block14");
		GameRegistry.registerBlock(Block_14, "Block_14");
		Block_15 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block15");
		GameRegistry.registerBlock(Block_15, "Block_15");
		Block_16 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block16");
		GameRegistry.registerBlock(Block_16, "Block_16");
		Block_17 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block17");
		GameRegistry.registerBlock(Block_17, "Block_17");
		Block_18 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block18");
		GameRegistry.registerBlock(Block_18, "Block_18");
		Block_19 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block19");
		GameRegistry.registerBlock(Block_19, "Block_19");
		Block_20 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block20");
		GameRegistry.registerBlock(Block_20, "Block_20");
		Block_21 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block21");
		GameRegistry.registerBlock(Block_21, "Block_21");
		Block_22 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block22");
		GameRegistry.registerBlock(Block_22, "Block_22");
		Block_23 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block23");
		GameRegistry.registerBlock(Block_23, "Block_23");
		Block_24 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block24");
		GameRegistry.registerBlock(Block_24, "Block_24");
		Block_25 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block25");
		GameRegistry.registerBlock(Block_25, "Block_25");
		Block_26 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block26");
		GameRegistry.registerBlock(Block_26, "Block_26");
		Block_27 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block27");
		GameRegistry.registerBlock(Block_27, "Block_27");
		Block_28 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block28");
		GameRegistry.registerBlock(Block_28, "Block_28");
		Block_29 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block29");
		GameRegistry.registerBlock(Block_29, "Block_29");
		Block_30 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block30");
		GameRegistry.registerBlock(Block_30, "Block_30");
		Block_31 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block31");
		GameRegistry.registerBlock(Block_31, "Block_31");
		Block_32 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block32");
		GameRegistry.registerBlock(Block_32, "Block_32");
		Block_33 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block33");
		GameRegistry.registerBlock(Block_33, "Block_33");
		Block_34 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block34");
		GameRegistry.registerBlock(Block_34, "Block_34");
		Block_35 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block35");
		GameRegistry.registerBlock(Block_35, "Block_35");
		Block_36 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block36");
		GameRegistry.registerBlock(Block_36, "Block_36");
		Block_37 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block37");
		GameRegistry.registerBlock(Block_37, "Block_37");
		Block_38 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block38");
		GameRegistry.registerBlock(Block_38, "Block_38");
		Block_39 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block39");
		GameRegistry.registerBlock(Block_39, "Block_39");
		Block_40 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block40");
		GameRegistry.registerBlock(Block_40, "Block_40");
		Block_41 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block41");
		GameRegistry.registerBlock(Block_41, "Block_41");
		Block_42 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block42");
		GameRegistry.registerBlock(Block_42, "Block_42");
		Block_43 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block43");
		GameRegistry.registerBlock(Block_43, "Block_43");
		Block_44 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block44");
		GameRegistry.registerBlock(Block_44, "Block_44");
		Block_45 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block45");
		GameRegistry.registerBlock(Block_45, "Block_45");
		Block_46 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block46");
		GameRegistry.registerBlock(Block_46, "Block_46");
		Block_47 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block47");
		GameRegistry.registerBlock(Block_47, "Block_47");
		Block_48 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block48");
		GameRegistry.registerBlock(Block_48, "Block_48");
		Block_49 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block49");
		GameRegistry.registerBlock(Block_49, "Block_49");
		Block_50 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block501");
		GameRegistry.registerBlock(Block_50, "Block_50");
		Block_51 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block51");
		GameRegistry.registerBlock(Block_51, "Block_51");
		Block_52 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block52");
		GameRegistry.registerBlock(Block_52, "Block_52");
		Block_53 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block53");
		GameRegistry.registerBlock(Block_53, "Block_53");
		Block_54 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block54");
		GameRegistry.registerBlock(Block_54, "Block_54");
		Block_55 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block55");
		GameRegistry.registerBlock(Block_55, "Block_55");
		Block_56 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block56");
		GameRegistry.registerBlock(Block_56, "Block_56");
		Block_57 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block57");
		GameRegistry.registerBlock(Block_57, "Block_57");
		Block_58 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block58");
		GameRegistry.registerBlock(Block_58, "Block_58");
		Block_59 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block59");
		GameRegistry.registerBlock(Block_59, "Block_59");
		Block_60 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block60");
		GameRegistry.registerBlock(Block_60, "Block_60");
		Block_61 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block61");
		GameRegistry.registerBlock(Block_61, "Block_61");
		Block_62 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block62");
		GameRegistry.registerBlock(Block_62, "Block_62");
		Block_63 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block63");
		GameRegistry.registerBlock(Block_63, "Block_63");
		Block_64 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block64");
		GameRegistry.registerBlock(Block_64, "Block_64");
		Block_65 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block65");
		GameRegistry.registerBlock(Block_65, "Block_65");
		Block_66 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block66");
		GameRegistry.registerBlock(Block_66, "Block_66");
		Block_67 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block67");
		GameRegistry.registerBlock(Block_67, "Block_67");
		Block_68 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block68");
		GameRegistry.registerBlock(Block_68, "Block_68");
		Block_69 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block69");
		GameRegistry.registerBlock(Block_69, "Block_69");
		Block_70 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block70");
		GameRegistry.registerBlock(Block_70, "Block_70");
		Block_71 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block71");
		GameRegistry.registerBlock(Block_71, "Block_71");
		Block_72 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block72");
		GameRegistry.registerBlock(Block_72, "Block_72");
		Block_73 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block73");
		GameRegistry.registerBlock(Block_73, "Block_73");
		Block_74 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block74");
		GameRegistry.registerBlock(Block_74, "Block_74");
		Block_75 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block75");
		GameRegistry.registerBlock(Block_75, "Block_75");
		Block_76 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block76");
		GameRegistry.registerBlock(Block_76, "Block_76");
		Block_77 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block77");
		GameRegistry.registerBlock(Block_77, "Block_77");
		Block_78 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block78");
		GameRegistry.registerBlock(Block_78, "Block_78");
		Block_79 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block79");
		GameRegistry.registerBlock(Block_79, "Block_79");
		Block_80 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block80");
		GameRegistry.registerBlock(Block_80, "Block_80");
		Block_81 = new CustomBlock().setCreativeTab(CustomBlocks).setBlockName("CustomBlock").setBlockTextureName("customblocks:Block81");
		GameRegistry.registerBlock(Block_81, "Block_81");
		
		
		//Blocks-models
		BlockModel_01 = new BlockModel1().setCreativeTab(CustomBlocksModels).setBlockName("CustomBlockModel");
		GameRegistry.registerBlock(BlockModel_01, "BlockModel_01");
		BlockModel_02 = new BlockModel2().setCreativeTab(CustomBlocksModels).setBlockName("CustomBlockModel");
		GameRegistry.registerBlock(BlockModel_02, "BlockModel_02");
		BlockModel_03 = new BlockModel3().setCreativeTab(CustomBlocksModels).setBlockName("CustomBlockModel");
		GameRegistry.registerBlock(BlockModel_03, "BlockModel_03");
		

		//Blocks-multitexturred
		BlockMulti_01 = new BlockMulti_01().setCreativeTab(CustomBlocksMulti).setBlockName("CustomBlockMulti");
		GameRegistry.registerBlock(BlockMulti_01, "BlockMulti_01");
		BlockMulti_02 = new BlockMulti_02().setCreativeTab(CustomBlocksMulti).setBlockName("CustomBlockMulti");
		GameRegistry.registerBlock(BlockMulti_02, "BlockMulti_02");
		BlockMulti_03 = new BlockMulti_03().setCreativeTab(CustomBlocksMulti).setBlockName("CustomBlockMulti");
		GameRegistry.registerBlock(BlockMulti_03, "BlockMulti_03");
		BlockMulti_04 = new BlockMulti_04().setCreativeTab(CustomBlocksMulti).setBlockName("CustomBlockMulti");
		GameRegistry.registerBlock(BlockMulti_04, "BlockMulti_04");
		BlockMulti_05 = new BlockMulti_05().setCreativeTab(CustomBlocksMulti).setBlockName("CustomBlockMulti");
		GameRegistry.registerBlock(BlockMulti_05, "BlockMulti_05");
		BlockMulti_06 = new BlockMulti_06().setCreativeTab(CustomBlocksMulti).setBlockName("CustomBlockMulti");
		GameRegistry.registerBlock(BlockMulti_06, "BlockMulti_06");
		BlockMulti_07 = new BlockMulti_07().setCreativeTab(CustomBlocksMulti).setBlockName("CustomBlockMulti");
		GameRegistry.registerBlock(BlockMulti_07, "BlockMulti_07");
		BlockMulti_08 = new BlockMulti_08().setCreativeTab(CustomBlocksMulti).setBlockName("CustomBlockMulti");
		GameRegistry.registerBlock(BlockMulti_08, "BlockMulti_08");
		BlockMulti_09 = new BlockMulti_09().setCreativeTab(CustomBlocksMulti).setBlockName("CustomBlockMulti");
		GameRegistry.registerBlock(BlockMulti_09, "BlockMulti_09");
		BlockMulti_10 = new BlockMulti_10().setCreativeTab(CustomBlocksMulti).setBlockName("CustomBlockMulti");
		GameRegistry.registerBlock(BlockMulti_10, "BlockMulti_10");
		BlockMulti_11 = new BlockMulti_11().setCreativeTab(CustomBlocksMulti).setBlockName("CustomBlockMulti");
		GameRegistry.registerBlock(BlockMulti_11, "BlockMulti_11");
		BlockMulti_12 = new BlockMulti_12().setCreativeTab(CustomBlocksMulti).setBlockName("CustomBlockMulti");
		GameRegistry.registerBlock(BlockMulti_12, "BlockMulti_12");
		BlockMulti_13 = new BlockMulti_13().setCreativeTab(CustomBlocksMulti).setBlockName("CustomBlockMulti");
		GameRegistry.registerBlock(BlockMulti_13, "BlockMulti_13");
		BlockMulti_14 = new BlockMulti_14().setCreativeTab(CustomBlocksMulti).setBlockName("CustomBlockMulti");
		GameRegistry.registerBlock(BlockMulti_14, "BlockMulti_14");
		BlockMulti_15 = new BlockMulti_15().setCreativeTab(CustomBlocksMulti).setBlockName("CustomBlockMulti");
		GameRegistry.registerBlock(BlockMulti_15, "BlockMulti_15");
		BlockMulti_16 = new BlockMulti_16().setCreativeTab(CustomBlocksMulti).setBlockName("CustomBlockMulti");
		GameRegistry.registerBlock(BlockMulti_16, "BlockMulti_16");
		BlockMulti_17 = new BlockMulti_17().setCreativeTab(CustomBlocksMulti).setBlockName("CustomBlockMulti");
		GameRegistry.registerBlock(BlockMulti_17, "BlockMulti_17");
		BlockMulti_18 = new BlockMulti_18().setCreativeTab(CustomBlocksMulti).setBlockName("CustomBlockMulti");
		GameRegistry.registerBlock(BlockMulti_18, "BlockMulti_18");
		BlockMulti_19 = new BlockMulti_19().setCreativeTab(CustomBlocksMulti).setBlockName("CustomBlockMulti");
		GameRegistry.registerBlock(BlockMulti_19, "BlockMulti_19");
		BlockMulti_20 = new BlockMulti_20().setCreativeTab(CustomBlocksMulti).setBlockName("CustomBlockMulti");
		GameRegistry.registerBlock(BlockMulti_20, "BlockMulti_20");
		BlockMulti_21 = new BlockMulti_21().setCreativeTab(CustomBlocksMulti).setBlockName("CustomBlockMulti");
		GameRegistry.registerBlock(BlockMulti_21, "BlockMulti_21");
		BlockMulti_22 = new BlockMulti_22().setCreativeTab(CustomBlocksMulti).setBlockName("CustomBlockMulti");
		GameRegistry.registerBlock(BlockMulti_22, "BlockMulti_22");
		BlockMulti_23 = new BlockMulti_23().setCreativeTab(CustomBlocksMulti).setBlockName("CustomBlockMulti");
		GameRegistry.registerBlock(BlockMulti_23, "BlockMulti_23");
		BlockMulti_24 = new BlockMulti_24().setCreativeTab(CustomBlocksMulti).setBlockName("CustomBlockMulti");
		GameRegistry.registerBlock(BlockMulti_24, "BlockMulti_24");
		BlockMulti_25 = new BlockMulti_25().setCreativeTab(CustomBlocksMulti).setBlockName("CustomBlockMulti");
		GameRegistry.registerBlock(BlockMulti_25, "BlockMulti_25");
		BlockMulti_26 = new BlockMulti_26().setCreativeTab(CustomBlocksMulti).setBlockName("CustomBlockMulti");
		GameRegistry.registerBlock(BlockMulti_26, "BlockMulti_26");
		BlockMulti_27 = new BlockMulti_27().setCreativeTab(CustomBlocksMulti).setBlockName("CustomBlockMulti");
		GameRegistry.registerBlock(BlockMulti_27, "BlockMulti_27");
		
		
		//Blocks-fences
		BlockFence_01 = new CustomBlockFence().setCreativeTab(CustomBlocksFences).setBlockName("CustomBlockFence").setBlockTextureName("customblocks:BlockFence1");
		GameRegistry.registerBlock(BlockFence_01, "BlockFence_01");
		BlockFence_02 = new CustomBlockFence().setCreativeTab(CustomBlocksFences).setBlockName("CustomBlockFence").setBlockTextureName("customblocks:BlockFence2");
		GameRegistry.registerBlock(BlockFence_02, "BlockFence_02");
		BlockFence_03 = new CustomBlockFence().setCreativeTab(CustomBlocksFences).setBlockName("CustomBlockFence").setBlockTextureName("customblocks:BlockFence3");
		GameRegistry.registerBlock(BlockFence_03, "BlockFence_03");
		BlockFence_04 = new CustomBlockFence().setCreativeTab(CustomBlocksFences).setBlockName("CustomBlockFence").setBlockTextureName("customblocks:BlockFence4");
		GameRegistry.registerBlock(BlockFence_04, "BlockFence_04");
		BlockFence_05 = new CustomBlockFence().setCreativeTab(CustomBlocksFences).setBlockName("CustomBlockFence").setBlockTextureName("customblocks:BlockFence5");
		GameRegistry.registerBlock(BlockFence_05, "BlockFence_05");
		BlockFence_06 = new CustomBlockFence().setCreativeTab(CustomBlocksFences).setBlockName("CustomBlockFence").setBlockTextureName("customblocks:BlockFence6");
		GameRegistry.registerBlock(BlockFence_06, "BlockFence_06");
		BlockFence_07 = new CustomBlockFence().setCreativeTab(CustomBlocksFences).setBlockName("CustomBlockFence").setBlockTextureName("customblocks:BlockFence7");
		GameRegistry.registerBlock(BlockFence_07, "BlockFence_07");
		BlockFence_08 = new CustomBlockFence().setCreativeTab(CustomBlocksFences).setBlockName("CustomBlockFence").setBlockTextureName("customblocks:BlockFence8");
		GameRegistry.registerBlock(BlockFence_08, "BlockFence_08");
		BlockFence_09 = new CustomBlockFence().setCreativeTab(CustomBlocksFences).setBlockName("CustomBlockFence").setBlockTextureName("customblocks:BlockFence9");
		GameRegistry.registerBlock(BlockFence_09, "BlockFence_09");
		BlockFence_10 = new CustomBlockFence().setCreativeTab(CustomBlocksFences).setBlockName("CustomBlockFence").setBlockTextureName("customblocks:BlockFence10");
		GameRegistry.registerBlock(BlockFence_10, "BlockFence_10");
		BlockFence_11 = new CustomBlockFence().setCreativeTab(CustomBlocksFences).setBlockName("CustomBlockFence").setBlockTextureName("customblocks:BlockFence11");
		GameRegistry.registerBlock(BlockFence_11, "BlockFence_11");
		BlockFence_12 = new CustomBlockFence().setCreativeTab(CustomBlocksFences).setBlockName("CustomBlockFence").setBlockTextureName("customblocks:BlockFence12");
		GameRegistry.registerBlock(BlockFence_12, "BlockFence_12");
		BlockFence_13 = new CustomBlockFence().setCreativeTab(CustomBlocksFences).setBlockName("CustomBlockFence").setBlockTextureName("customblocks:BlockFence13");
		GameRegistry.registerBlock(BlockFence_13, "BlockFence_13");
		BlockFence_14 = new CustomBlockFence().setCreativeTab(CustomBlocksFences).setBlockName("CustomBlockFence").setBlockTextureName("customblocks:BlockFence14");
		GameRegistry.registerBlock(BlockFence_14, "BlockFence_14");
		BlockFence_15 = new CustomBlockFence().setCreativeTab(CustomBlocksFences).setBlockName("CustomBlockFence").setBlockTextureName("customblocks:BlockFence15");
		GameRegistry.registerBlock(BlockFence_15, "BlockFence_15");
		BlockFence_16 = new CustomBlockFence().setCreativeTab(CustomBlocksFences).setBlockName("CustomBlockFence").setBlockTextureName("customblocks:BlockFence16");
		GameRegistry.registerBlock(BlockFence_16, "BlockFence_16");
		BlockFence_17 = new CustomBlockFence().setCreativeTab(CustomBlocksFences).setBlockName("CustomBlockFence").setBlockTextureName("customblocks:BlockFence17");
		GameRegistry.registerBlock(BlockFence_17, "BlockFence_17");
		BlockFence_18 = new CustomBlockFence().setCreativeTab(CustomBlocksFences).setBlockName("CustomBlockFence").setBlockTextureName("customblocks:BlockFence18");
		GameRegistry.registerBlock(BlockFence_18, "BlockFence_18");
		
		
		//Blocks-webs
		BlockWeb_01 = new CustomBlockWeb().setCreativeTab(CustomBlocksWebs).setBlockName("CustomBlockWeb").setBlockTextureName("customblocks:BlockWeb1");
		GameRegistry.registerBlock(BlockWeb_01, "BlockWeb_01");
		BlockWeb_02 = new CustomBlockWeb().setCreativeTab(CustomBlocksWebs).setBlockName("CustomBlockWeb").setBlockTextureName("customblocks:BlockWeb2");
		GameRegistry.registerBlock(BlockWeb_02, "BlockWeb_02");
		BlockWeb_03 = new CustomBlockWeb().setCreativeTab(CustomBlocksWebs).setBlockName("CustomBlockWeb").setBlockTextureName("customblocks:BlockWeb3");
		GameRegistry.registerBlock(BlockWeb_03, "BlockWeb_03");
		BlockWeb_04 = new CustomBlockWeb().setCreativeTab(CustomBlocksWebs).setBlockName("CustomBlockWeb").setBlockTextureName("customblocks:BlockWeb4");
		GameRegistry.registerBlock(BlockWeb_04, "BlockWeb_04");
		BlockWeb_05 = new CustomBlockWeb().setCreativeTab(CustomBlocksWebs).setBlockName("CustomBlockWeb").setBlockTextureName("customblocks:BlockWeb5");
		GameRegistry.registerBlock(BlockWeb_05, "BlockWeb_05");
		BlockWeb_06 = new CustomBlockWeb().setCreativeTab(CustomBlocksWebs).setBlockName("CustomBlockWeb").setBlockTextureName("customblocks:BlockWeb6");
		GameRegistry.registerBlock(BlockWeb_06, "BlockWeb_06");
		BlockWeb_07 = new CustomBlockWeb().setCreativeTab(CustomBlocksWebs).setBlockName("CustomBlockWeb").setBlockTextureName("customblocks:BlockWeb7");
		GameRegistry.registerBlock(BlockWeb_07, "BlockWeb_07");
		BlockWeb_08 = new CustomBlockWeb().setCreativeTab(CustomBlocksWebs).setBlockName("CustomBlockWeb").setBlockTextureName("customblocks:BlockWeb8");
		GameRegistry.registerBlock(BlockWeb_08, "BlockWeb_08");
		BlockWeb_09 = new CustomBlockWeb().setCreativeTab(CustomBlocksWebs).setBlockName("CustomBlockWeb").setBlockTextureName("customblocks:BlockWeb9");
		GameRegistry.registerBlock(BlockWeb_09, "BlockWeb_09");
		BlockWeb_10 = new CustomBlockWeb().setCreativeTab(CustomBlocksWebs).setBlockName("CustomBlockWeb").setBlockTextureName("customblocks:BlockWeb10");
		GameRegistry.registerBlock(BlockWeb_10, "BlockWeb_10");
		BlockWeb_11 = new CustomBlockWeb().setCreativeTab(CustomBlocksWebs).setBlockName("CustomBlockWeb").setBlockTextureName("customblocks:BlockWeb11");
		GameRegistry.registerBlock(BlockWeb_11, "BlockWeb_11");
		BlockWeb_12 = new CustomBlockWeb().setCreativeTab(CustomBlocksWebs).setBlockName("CustomBlockWeb").setBlockTextureName("customblocks:BlockWeb12");
		GameRegistry.registerBlock(BlockWeb_12, "BlockWeb_12");
		BlockWeb_13 = new CustomBlockWeb().setCreativeTab(CustomBlocksWebs).setBlockName("CustomBlockWeb").setBlockTextureName("customblocks:BlockWeb13");
		GameRegistry.registerBlock(BlockWeb_13, "BlockWeb_13");
		BlockWeb_14 = new CustomBlockWeb().setCreativeTab(CustomBlocksWebs).setBlockName("CustomBlockWeb").setBlockTextureName("customblocks:BlockWeb14");
		GameRegistry.registerBlock(BlockWeb_14, "BlockWeb_14");
		BlockWeb_15 = new CustomBlockWeb().setCreativeTab(CustomBlocksWebs).setBlockName("CustomBlockWeb").setBlockTextureName("customblocks:BlockWeb15");
		GameRegistry.registerBlock(BlockWeb_15, "BlockWeb_15");
		BlockWeb_16 = new CustomBlockWeb().setCreativeTab(CustomBlocksWebs).setBlockName("CustomBlockWeb").setBlockTextureName("customblocks:BlockWeb16");
		GameRegistry.registerBlock(BlockWeb_16, "BlockWeb_16");
		BlockWeb_17 = new CustomBlockWeb().setCreativeTab(CustomBlocksWebs).setBlockName("CustomBlockWeb").setBlockTextureName("customblocks:BlockWeb17");
		GameRegistry.registerBlock(BlockWeb_17, "BlockWeb_17");
		BlockWeb_18 = new CustomBlockWeb().setCreativeTab(CustomBlocksWebs).setBlockName("CustomBlockWeb").setBlockTextureName("customblocks:BlockWeb18");
		GameRegistry.registerBlock(BlockWeb_18, "BlockWeb_18");
		BlockWeb_19 = new CustomBlockWeb().setCreativeTab(CustomBlocksWebs).setBlockName("CustomBlockWeb").setBlockTextureName("customblocks:BlockWeb19");
		GameRegistry.registerBlock(BlockWeb_19, "BlockWeb_19");
		BlockWeb_20 = new CustomBlockWeb().setCreativeTab(CustomBlocksWebs).setBlockName("CustomBlockWeb").setBlockTextureName("customblocks:BlockWeb20");
		GameRegistry.registerBlock(BlockWeb_20, "BlockWeb_20");
		BlockWeb_21 = new CustomBlockWeb().setCreativeTab(CustomBlocksWebs).setBlockName("CustomBlockWeb").setBlockTextureName("customblocks:BlockWeb21");
		GameRegistry.registerBlock(BlockWeb_21, "BlockWeb_21");
		BlockWeb_22 = new CustomBlockWeb().setCreativeTab(CustomBlocksWebs).setBlockName("CustomBlockWeb").setBlockTextureName("customblocks:BlockWeb22");
		GameRegistry.registerBlock(BlockWeb_22, "BlockWeb_22");
		BlockWeb_23 = new CustomBlockWeb().setCreativeTab(CustomBlocksWebs).setBlockName("CustomBlockWeb").setBlockTextureName("customblocks:BlockWeb23");
		GameRegistry.registerBlock(BlockWeb_23, "BlockWeb_23");
		BlockWeb_24 = new CustomBlockWeb().setCreativeTab(CustomBlocksWebs).setBlockName("CustomBlockWeb").setBlockTextureName("customblocks:BlockWeb24");
		GameRegistry.registerBlock(BlockWeb_24, "BlockWeb_24");
		BlockWeb_25 = new CustomBlockWeb().setCreativeTab(CustomBlocksWebs).setBlockName("CustomBlockWeb").setBlockTextureName("customblocks:BlockWeb25");
		GameRegistry.registerBlock(BlockWeb_25, "BlockWeb_25");
		BlockWeb_26 = new CustomBlockWeb().setCreativeTab(CustomBlocksWebs).setBlockName("CustomBlockWeb").setBlockTextureName("customblocks:BlockWeb26");
		GameRegistry.registerBlock(BlockWeb_26, "BlockWeb_26");
		BlockWeb_27 = new CustomBlockWeb().setCreativeTab(CustomBlocksWebs).setBlockName("CustomBlockWeb").setBlockTextureName("customblocks:BlockWeb27");
		GameRegistry.registerBlock(BlockWeb_27, "BlockWeb_27");
		
		
		//Blocks-ladders
		BlockRail_01 = new CustomBlockRail().setCreativeTab(CustomBlocksRails).setBlockName("CustomBlockRail").setBlockTextureName("customblocks:BlockRail1");
		GameRegistry.registerBlock(BlockRail_01, "BlockRail_01");
		BlockRail_02 = new CustomBlockRail().setCreativeTab(CustomBlocksRails).setBlockName("CustomBlockRail").setBlockTextureName("customblocks:BlockRail2");
		GameRegistry.registerBlock(BlockRail_02, "BlockRail_02");
		BlockRail_03 = new CustomBlockRail().setCreativeTab(CustomBlocksRails).setBlockName("CustomBlockRail").setBlockTextureName("customblocks:BlockRail3");
		GameRegistry.registerBlock(BlockRail_03, "BlockRail_03");
		BlockRail_04 = new CustomBlockRail().setCreativeTab(CustomBlocksRails).setBlockName("CustomBlockRail").setBlockTextureName("customblocks:BlockRail4");
		GameRegistry.registerBlock(BlockRail_04, "BlockRail_04");
		BlockRail_05 = new CustomBlockRail().setCreativeTab(CustomBlocksRails).setBlockName("CustomBlockRail").setBlockTextureName("customblocks:BlockRail5");
		GameRegistry.registerBlock(BlockRail_05, "BlockRail_05");
		BlockRail_06 = new CustomBlockRail().setCreativeTab(CustomBlocksRails).setBlockName("CustomBlockRail").setBlockTextureName("customblocks:BlockRail6");
		GameRegistry.registerBlock(BlockRail_06, "BlockRail_06");
		BlockRail_07 = new CustomBlockRail().setCreativeTab(CustomBlocksRails).setBlockName("CustomBlockRail").setBlockTextureName("customblocks:BlockRail7");
		GameRegistry.registerBlock(BlockRail_07, "BlockRail_07");
		BlockRail_08 = new CustomBlockRail().setCreativeTab(CustomBlocksRails).setBlockName("CustomBlockRail").setBlockTextureName("customblocks:BlockRail8");
		GameRegistry.registerBlock(BlockRail_08, "BlockRail_08");
		BlockRail_09 = new CustomBlockRail().setCreativeTab(CustomBlocksRails).setBlockName("CustomBlockRail").setBlockTextureName("customblocks:BlockRail9");
		GameRegistry.registerBlock(BlockRail_09, "BlockRail_09");
		BlockRail_10 = new CustomBlockRail().setCreativeTab(CustomBlocksRails).setBlockName("CustomBlockRail").setBlockTextureName("customblocks:BlockRail10");
		GameRegistry.registerBlock(BlockRail_10, "BlockRail_10");
		BlockRail_11 = new CustomBlockRail().setCreativeTab(CustomBlocksRails).setBlockName("CustomBlockRail").setBlockTextureName("customblocks:BlockRail11");
		GameRegistry.registerBlock(BlockRail_11, "BlockRail_11");
		BlockRail_12 = new CustomBlockRail().setCreativeTab(CustomBlocksRails).setBlockName("CustomBlockRail").setBlockTextureName("customblocks:BlockRail12");
		GameRegistry.registerBlock(BlockRail_12, "BlockRail_12");
		BlockRail_13 = new CustomBlockRail().setCreativeTab(CustomBlocksRails).setBlockName("CustomBlockRail").setBlockTextureName("customblocks:BlockRail13");
		GameRegistry.registerBlock(BlockRail_13, "BlockRail_13");
		BlockRail_14 = new CustomBlockRail().setCreativeTab(CustomBlocksRails).setBlockName("CustomBlockRail").setBlockTextureName("customblocks:BlockRail14");
		GameRegistry.registerBlock(BlockRail_14, "BlockRail_14");
		BlockRail_15 = new CustomBlockRail().setCreativeTab(CustomBlocksRails).setBlockName("CustomBlockRail").setBlockTextureName("customblocks:BlockRail15");
		GameRegistry.registerBlock(BlockRail_15, "BlockRail_15");
		BlockRail_16 = new CustomBlockRail().setCreativeTab(CustomBlocksRails).setBlockName("CustomBlockRail").setBlockTextureName("customblocks:BlockRail16");
		GameRegistry.registerBlock(BlockRail_16, "BlockRail_16");
		BlockRail_17 = new CustomBlockRail().setCreativeTab(CustomBlocksRails).setBlockName("CustomBlockRail").setBlockTextureName("customblocks:BlockRail17");
		GameRegistry.registerBlock(BlockRail_17, "BlockRail_17");
		BlockRail_18 = new CustomBlockRail().setCreativeTab(CustomBlocksRails).setBlockName("CustomBlockRail").setBlockTextureName("customblocks:BlockRail18");
		GameRegistry.registerBlock(BlockRail_18, "BlockRail_18");
		
		
		//Blocks-ladders
		BlockLadder_01 = new CustomBlockLadder().setCreativeTab(CustomBlocksLadders).setBlockName("CustomBlockLadder").setBlockTextureName("customblocks:BlockLadder1");
		GameRegistry.registerBlock(BlockLadder_01, "BlockLadder_01");
		BlockLadder_02 = new CustomBlockLadder().setCreativeTab(CustomBlocksLadders).setBlockName("CustomBlockLadder").setBlockTextureName("customblocks:BlockLadder2");
		GameRegistry.registerBlock(BlockLadder_02, "BlockLadder_02");
		BlockLadder_03 = new CustomBlockLadder().setCreativeTab(CustomBlocksLadders).setBlockName("CustomBlockLadder").setBlockTextureName("customblocks:BlockLadder3");
		GameRegistry.registerBlock(BlockLadder_03, "BlockLadder_03");
		BlockLadder_04 = new CustomBlockLadder().setCreativeTab(CustomBlocksLadders).setBlockName("CustomBlockLadder").setBlockTextureName("customblocks:BlockLadder4");
		GameRegistry.registerBlock(BlockLadder_04, "BlockLadder_04");
		BlockLadder_05 = new CustomBlockLadder().setCreativeTab(CustomBlocksLadders).setBlockName("CustomBlockLadder").setBlockTextureName("customblocks:BlockLadder5");
		GameRegistry.registerBlock(BlockLadder_05, "BlockLadder_05");
		BlockLadder_06 = new CustomBlockLadder().setCreativeTab(CustomBlocksLadders).setBlockName("CustomBlockLadder").setBlockTextureName("customblocks:BlockLadder6");
		GameRegistry.registerBlock(BlockLadder_06, "BlockLadder_06");
		BlockLadder_07 = new CustomBlockLadder().setCreativeTab(CustomBlocksLadders).setBlockName("CustomBlockLadder").setBlockTextureName("customblocks:BlockLadder7");
		GameRegistry.registerBlock(BlockLadder_07, "BlockLadder_07");
		BlockLadder_08 = new CustomBlockLadder().setCreativeTab(CustomBlocksLadders).setBlockName("CustomBlockLadder").setBlockTextureName("customblocks:BlockLadder8");
		GameRegistry.registerBlock(BlockLadder_08, "BlockLadder_08");
		BlockLadder_09 = new CustomBlockLadder().setCreativeTab(CustomBlocksLadders).setBlockName("CustomBlockLadder").setBlockTextureName("customblocks:BlockLadder9");
		GameRegistry.registerBlock(BlockLadder_09, "BlockLadder_9");
		BlockLadder_10 = new CustomBlockLadder().setCreativeTab(CustomBlocksLadders).setBlockName("CustomBlockLadder").setBlockTextureName("customblocks:BlockLadder10");
		GameRegistry.registerBlock(BlockLadder_10, "BlockLadder_10");
		BlockLadder_11 = new CustomBlockLadder().setCreativeTab(CustomBlocksLadders).setBlockName("CustomBlockLadder").setBlockTextureName("customblocks:BlockLadder11");
		GameRegistry.registerBlock(BlockLadder_11, "BlockLadder_11");
		BlockLadder_12 = new CustomBlockLadder().setCreativeTab(CustomBlocksLadders).setBlockName("CustomBlockLadder").setBlockTextureName("customblocks:BlockLadder12");
		GameRegistry.registerBlock(BlockLadder_12, "BlockLadder_12");
		BlockLadder_13 = new CustomBlockLadder().setCreativeTab(CustomBlocksLadders).setBlockName("CustomBlockLadder").setBlockTextureName("customblocks:BlockLadder13");
		GameRegistry.registerBlock(BlockLadder_13, "BlockLadder_13");
		BlockLadder_14 = new CustomBlockLadder().setCreativeTab(CustomBlocksLadders).setBlockName("CustomBlockLadder").setBlockTextureName("customblocks:BlockLadder14");
		GameRegistry.registerBlock(BlockLadder_14, "BlockLadder_14");
		BlockLadder_15 = new CustomBlockLadder().setCreativeTab(CustomBlocksLadders).setBlockName("CustomBlockLadder").setBlockTextureName("customblocks:BlockLadder15");
		GameRegistry.registerBlock(BlockLadder_15, "BlockLadder_15");
		BlockLadder_16 = new CustomBlockLadder().setCreativeTab(CustomBlocksLadders).setBlockName("CustomBlockLadder").setBlockTextureName("customblocks:BlockLadder16");
		GameRegistry.registerBlock(BlockLadder_16, "BlockLadder_16");
		BlockLadder_17 = new CustomBlockLadder().setCreativeTab(CustomBlocksLadders).setBlockName("CustomBlockLadder").setBlockTextureName("customblocks:BlockLadder17");
		GameRegistry.registerBlock(BlockLadder_17, "BlockLadder_17");
		BlockLadder_18 = new CustomBlockLadder().setCreativeTab(CustomBlocksLadders).setBlockName("CustomBlockLadder").setBlockTextureName("customblocks:BlockLadder18");
		GameRegistry.registerBlock(BlockLadder_18, "BlockLadder_18");

		
		//Armors
		SteelHelmet = (ItemArmor) new ItemSteelArmor(ArmorMaterialUtils.AM3, 0).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("SteelHelmet");
    	GameRegistry.registerItem(SteelHelmet, "SteelHelmet");
    	SteelChest = (ItemArmor) new ItemSteelArmor(ArmorMaterialUtils.AM3, 1).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("SteelChest");
    	GameRegistry.registerItem(SteelChest, "SteelChest");
    	SteelLeggins = (ItemArmor) new ItemSteelArmor(ArmorMaterialUtils.AM3, 2).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("SteelLeggins");
    	GameRegistry.registerItem(SteelLeggins, "SteelLeggins");
    	SteelBoots = (ItemArmor) new ItemSteelArmor(ArmorMaterialUtils.AM3, 3).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("SteelBoots");
    	GameRegistry.registerItem(SteelBoots, "SteelBoots");
		DiamondHelmet = (ItemArmor) new ItemDiamondArmor(ArmorMaterialUtils.AM4, 0).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("DiamondHelmet");
    	GameRegistry.registerItem(DiamondHelmet, "DiamondHelmet");
    	DiamondChest = (ItemArmor) new ItemDiamondArmor(ArmorMaterialUtils.AM4, 1).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("DiamondChest");
    	GameRegistry.registerItem(DiamondChest, "DiamondChest");
   	    DiamondLeggins = (ItemArmor) new ItemDiamondArmor(ArmorMaterialUtils.AM4, 2).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("DiamondLeggins");
    	GameRegistry.registerItem(DiamondLeggins, "DiamondLeggins");
    	DiamondBoots = (ItemArmor) new ItemDiamondArmor(ArmorMaterialUtils.AM4, 3).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("DiamondBoots");
    	GameRegistry.registerItem(DiamondBoots, "DiamondBoots");
		EmeraldHelmet = (ItemArmor) new ItemEmeraldArmor(ArmorMaterialUtils.AM26, 0).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("EmeraldHelmet");
    	GameRegistry.registerItem(EmeraldHelmet, "EmeraldHelmet");
    	EmeraldChest = (ItemArmor) new ItemEmeraldArmor(ArmorMaterialUtils.AM26, 1).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("EmeraldChest");
    	GameRegistry.registerItem(EmeraldChest, "EmeraldChest");
    	EmeraldLeggins = (ItemArmor) new ItemEmeraldArmor(ArmorMaterialUtils.AM26, 2).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("EmeraldLeggins");
    	GameRegistry.registerItem(EmeraldLeggins, "EmeraldLeggins");
    	EmeraldBoots = (ItemArmor) new ItemEmeraldArmor(ArmorMaterialUtils.AM26, 3).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("EmeraldBoots");
    	GameRegistry.registerItem(EmeraldBoots, "EmeraldBoots");
    	GoldHelmet = (ItemArmor) new ItemGoldArmor(ArmorMaterialUtils.AM26, 0).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("GoldHelmet");
    	GameRegistry.registerItem(GoldHelmet, "GoldHelmet");
    	GoldChest = (ItemArmor) new ItemGoldArmor(ArmorMaterialUtils.AM26, 1).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("GoldChest");
    	GameRegistry.registerItem(GoldChest, "GoldChest");
    	GoldLeggins = (ItemArmor) new ItemGoldArmor(ArmorMaterialUtils.AM26, 2).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("GoldLeggins");
    	GameRegistry.registerItem(GoldLeggins, "GoldLeggins");
    	GoldBoots = (ItemArmor) new ItemGoldArmor(ArmorMaterialUtils.AM26, 3).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("GoldBoots");
    	GameRegistry.registerItem(GoldBoots, "GoldBoots");
    	CustomHelm = (ItemArmor) new CustomArmor(ArmorMaterialUtils.AM26, 0).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("CustomHelm");
    	GameRegistry.registerItem(CustomHelm, "CustomHelm");
    	CustomChest = (ItemArmor) new CustomArmor(ArmorMaterialUtils.AM26, 1).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("CustomChest");
    	GameRegistry.registerItem(CustomChest, "CustomChest");
    	CustomLegg = (ItemArmor) new CustomArmor(ArmorMaterialUtils.AM26, 2).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("CustomLegg");
    	GameRegistry.registerItem(CustomLegg, "CustomLegg");
    	CustomBoots = (ItemArmor) new CustomArmor(ArmorMaterialUtils.AM26, 3).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("CustomBoots");
    	GameRegistry.registerItem(CustomBoots, "CustomBoots");
    	CustomHelm1 = (ItemArmor) new CustomArmor1(ArmorMaterialUtils.AM26, 0).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("CustomHelm1");
    	GameRegistry.registerItem(CustomHelm1, "CustomHelm1");
    	CustomChest1 = (ItemArmor) new CustomArmor1(ArmorMaterialUtils.AM26, 1).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("CustomChest1");
    	GameRegistry.registerItem(CustomChest1, "CustomChest1");
    	CustomLegg1 = (ItemArmor) new CustomArmor1(ArmorMaterialUtils.AM26, 2).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("CustomLegg1");
    	GameRegistry.registerItem(CustomLegg1, "CustomLegg1");
    	CustomBoots1 = (ItemArmor) new CustomArmor1(ArmorMaterialUtils.AM26, 3).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("CustomBoots1");
    	GameRegistry.registerItem(CustomBoots1, "CustomBoots1");
    	CustomHelm2 = (ItemArmor) new CustomArmor2(ArmorMaterialUtils.AM26, 0).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("CustomHelm2");
    	GameRegistry.registerItem(CustomHelm2, "CustomHelm2");
    	CustomChest2 = (ItemArmor) new CustomArmor2(ArmorMaterialUtils.AM26, 1).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("CustomChest2");
    	GameRegistry.registerItem(CustomChest2, "CustomChest2");
    	CustomLegg2 = (ItemArmor) new CustomArmor2(ArmorMaterialUtils.AM26, 2).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("CustomLegg2");
    	GameRegistry.registerItem(CustomLegg2, "CustomLegg2");
    	CustomBoots2 = (ItemArmor) new CustomArmor2(ArmorMaterialUtils.AM26, 3).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("CustomBoots2");
    	GameRegistry.registerItem(CustomBoots2, "CustomBoots2");
    	CustomHelm3 = (ItemArmor) new CustomArmor3(ArmorMaterialUtils.AM26, 0).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("CustomHelm3");
    	GameRegistry.registerItem(CustomHelm3, "CustomHelm3");
    	CustomChest3 = (ItemArmor) new CustomArmor3(ArmorMaterialUtils.AM26, 1).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("CustomChest3");
    	GameRegistry.registerItem(CustomChest3, "CustomChest3");
    	CustomLegg3 = (ItemArmor) new CustomArmor3(ArmorMaterialUtils.AM26, 2).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("CustomLegg3");
    	GameRegistry.registerItem(CustomLegg3, "CustomLegg3");
    	CustomBoots3 = (ItemArmor) new CustomArmor3(ArmorMaterialUtils.AM26, 3).setCreativeTab(CustomBlocksArmor).setUnlocalizedName("CustomBoots3");
    	GameRegistry.registerItem(CustomBoots3, "CustomBoots3");
    		
    	//Shields
    	WoodShield = new ItemShield(ShieldMaterialUtils.WOOD).setCreativeTab(CustomBlocksShields).setUnlocalizedName("WoodShield").setFull3D().setTextureName("customblocks:shields/WoodShield");
		GameRegistry.registerItem(WoodShield, "WoodShield");
		StoneShield = new ItemShield(ShieldMaterialUtils.STONE).setCreativeTab(CustomBlocksShields).setUnlocalizedName("StoneShield").setFull3D().setTextureName("customblocks:shields/StoneShield");
		GameRegistry.registerItem(StoneShield, "StoneShield");
		BronzeShield = new ItemShield(ShieldMaterialUtils.BRONZE).setCreativeTab(CustomBlocksShields).setUnlocalizedName("BronzeShield").setFull3D().setTextureName("customblocks:shields/BronzeShield");
		GameRegistry.registerItem(BronzeShield, "BronzeShield");
		IronShield = new ItemShield(ShieldMaterialUtils.IRON).setCreativeTab(CustomBlocksShields).setUnlocalizedName("IronShield").setFull3D().setTextureName("customblocks:shields/IronShield");
		GameRegistry.registerItem(IronShield, "IronShield");
		GoldShield = new ItemShield(ShieldMaterialUtils.GOLD).setCreativeTab(CustomBlocksShields).setUnlocalizedName("GoldShield").setFull3D().setTextureName("customblocks:shields/GoldShield");
		GameRegistry.registerItem(GoldShield, "GoldShield");
		DiamondShield = new ItemShield(ShieldMaterialUtils.DIA).setCreativeTab(CustomBlocksShields).setUnlocalizedName("DiamondShield").setFull3D().setTextureName("customblocks:shields/DiamondShield");
		GameRegistry.registerItem(DiamondShield, "DiamondShield");
		EmeraldShield = new ItemShield(ShieldMaterialUtils.EMERALD).setCreativeTab(CustomBlocksShields).setUnlocalizedName("EmeraldShield").setFull3D().setTextureName("customblocks:shields/EmeraldShield");
		GameRegistry.registerItem(EmeraldShield, "EmeraldShield");
    	FullBronzeShield = new ItemRotatedShield(ShieldMaterialUtils.BRONZE).setCreativeTab(CustomBlocksShields).setUnlocalizedName("FullBronzeShield").setFull3D().setTextureName("customblocks:shields/FullBronzeShield");
		GameRegistry.registerItem(FullBronzeShield, "FullBronzeShield");
		FullStoneShield = new ItemRotatedShield(ShieldMaterialUtils.STONE).setCreativeTab(CustomBlocksShields).setUnlocalizedName("FullStoneShield").setFull3D().setTextureName("customblocks:shields/FullStoneShield");
		GameRegistry.registerItem(FullStoneShield, "FullStoneShield");
		FullEmeraldShield = new ItemRotatedShield(ShieldMaterialUtils.EMERALD).setCreativeTab(CustomBlocksShields).setUnlocalizedName("FullEmeraldShield").setFull3D().setTextureName("customblocks:shields/FullEmeraldShield");
		GameRegistry.registerItem(FullEmeraldShield, "FullEmeraldShield");
		FullIronShield = new ItemRotatedShield(ShieldMaterialUtils.IRON).setCreativeTab(CustomBlocksShields).setUnlocalizedName("FullIronShield").setFull3D().setTextureName("customblocks:shields/FullIronShield");
		GameRegistry.registerItem(FullIronShield, "FullIronShield");
		FullGoldShield = new ItemRotatedShield(ShieldMaterialUtils.GOLD).setCreativeTab(CustomBlocksShields).setUnlocalizedName("FullGoldShield").setFull3D().setTextureName("customblocks:shields/FullGoldShield");
		GameRegistry.registerItem(FullGoldShield, "FullGoldShield");
		FullDiamondShield = new ItemRotatedShield(ShieldMaterialUtils.DIA).setCreativeTab(CustomBlocksShields).setUnlocalizedName("FullDiamondShield").setFull3D().setTextureName("customblocks:shields/FullDiamondShield");
		GameRegistry.registerItem(FullDiamondShield, "FullDiamondShield");
		CryscentShield = new ItemShield(ShieldMaterialUtils.IRON).setCreativeTab(CustomBlocksShields).setUnlocalizedName("CryscentShield").setFull3D().setTextureName("customblocks:shields/CryscentShield");
		GameRegistry.registerItem(CryscentShield, "CryscentShield");
		HeaterShield = new ItemShield(ShieldMaterialUtils.IRON).setCreativeTab(CustomBlocksShields).setUnlocalizedName("HeaterShield").setFull3D().setTextureName("customblocks:shields/HeaterShield");
		GameRegistry.registerItem(HeaterShield, "HeaterShield");
		ScutumShield = new ItemShield(ShieldMaterialUtils.IRON).setCreativeTab(CustomBlocksShields).setUnlocalizedName("ScutumShield").setFull3D().setTextureName("customblocks:shields/ScutumShield");
		GameRegistry.registerItem(ScutumShield, "ScutumShield");
		TowerShield = new ItemRotatedShield(ShieldMaterialUtils.IRON).setCreativeTab(CustomBlocksShields).setUnlocalizedName("TowerShield").setFull3D().setTextureName("customblocks:shields/TowerShield");
		GameRegistry.registerItem(TowerShield, "TowerShield");
    	
	}
	
}

package com.dayton.nukacraft.common.foundation.items;

import com.dayton.nukacraft.NukaCraftMod;
import com.dayton.nukacraft.common.foundation.blocks.ModBlocksClass;
import com.dayton.nukacraft.common.foundation.items.custom.*;
import com.dayton.nukacraft.common.foundation.items.custom.frame.FusionCoreItem;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
//Здесь армяне в нарды играют

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NukaCraftMod.MOD_ID);

    ///RAW MATERIALS
    public static final RegistryObject<Item> ACID = ITEMS.register("acid",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> VIOPLEX = ITEMS.register("purple_reagent",
            () -> new VioletReagent(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> ADHESIVE = ITEMS.register("adhesive",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> ANTISEPT = ITEMS.register("antisept",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> FERTILIZER = ITEMS.register("fertilizer",
            () -> new BoneMealItem(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> OIL = ITEMS.register("oil",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));

    public static final RegistryObject<Item> FIBER = ITEMS.register("fiber",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> OPTOFIBER = ITEMS.register("optofiber",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> THREADS = ITEMS.register("threads",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> SCREWS = ITEMS.register("screws",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> SPRINGS = ITEMS.register("spring",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> GEARS = ITEMS.register("gears",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> COMPOSITE = ITEMS.register("composite",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> PLASTIC = ITEMS.register("plastic",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> TEXTILE = ITEMS.register("textile",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> RUBBER = ITEMS.register("rubber",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> ALUMINGOT = ITEMS.register("alumi_ingot",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> BTITANING = ITEMS.register("btitan",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> LEADING = ITEMS.register("lead",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> SILVERING = ITEMS.register("silver",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> STEELING = ITEMS.register("steel",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> ULTRACITE = ITEMS.register("ultracite",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> ALUMINUGG = ITEMS.register("aluminugget",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> BTITANNUGG = ITEMS.register("btitannugget",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> LEADNUGG = ITEMS.register("leadnugget",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> SILVERNUGG = ITEMS.register("silvernugget",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));

    public static final RegistryObject<Item> STEELNUGG = ITEMS.register("steelnugget",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> CERAMIC = ITEMS.register("ceramic",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> ELECTRONUM = ITEMS.register("electronum",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> GLOWMASS = ITEMS.register("glowmass",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> LEATHERHARD = ITEMS.register("leatherhard",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> BBLOODLEAF = ITEMS.register("bbloodleafl",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> QUANTLEAF = ITEMS.register("quantumleaf",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE).tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> GAMMALEAF = ITEMS.register("gammaleaf",
            () -> new Item(new Item.Properties().rarity(Rarity.EPIC).tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> BLOODLEAF = ITEMS.register("nbloodleafi",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> BBLOODLEAF_ = ITEMS.register("bbloodleafl_",
            () -> new ItemNameBlockItem(ModBlocksClass.BBLOODLEAF_BUSH.get(), new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> QUANTLEAF_ = ITEMS.register("quantumleaf_",
            () -> new ItemNameBlockItem(ModBlocksClass.QUANTUMLEAF_BUSH.get(), new Item.Properties().rarity(Rarity.RARE).tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> GAMMALEAF_ = ITEMS.register("gammaleaf_",
            () -> new ItemNameBlockItem(ModBlocksClass.GAMMALEAF_BUSH.get(), new Item.Properties().rarity(Rarity.EPIC).tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> BLOODLEAF_ = ITEMS.register("nbloodleafi_",
            () -> new ItemNameBlockItem(ModBlocksClass.BLOODLEAF_BUSH.get(), new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> PRMT = ITEMS.register("pmt1",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> THISTLE = ITEMS.register("thistle_bud",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> BRAINFUNGUS = ITEMS.register("brainfungus",
            () -> new RadNamedItem( 0.2f, ModBlocksClass.BRAINFUNGUS.get(), new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> MINDFUNGUS = ITEMS.register("mindfungus",
            () -> new RadNamedItem( 0.5f, ModBlocksClass.MINDFUNGUS.get(), new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> ASHDUST = ITEMS.register("ashdust",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> DATURAN_ROOT = ITEMS.register("daturan_root",
            () -> new RadNamedItem( 0.2f, ModBlocksClass.DATURAN.get(), new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.NASTY)));
    public static final RegistryObject<Item> AGAVE = ITEMS.register("agave_fruit",
            () -> new RadNamedItem( 0f, ModBlocksClass.AGAVE.get(), new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.NASTY)));
    public static final RegistryObject<Item> NEOAGAVE = ITEMS.register("neoagave_fruit",
            () -> new RadNamedItem( -0.2f, ModBlocksClass.NEOAGAVE.get(), new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.NASTY)));
    public static final RegistryObject<Item> PUNGA = ITEMS.register("punga_fruit",
            () -> new RadNamedItem( 0.0f, ModBlocksClass.PUNGA.get(), new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.NASTY)));
    public static final RegistryObject<Item> XANDER_ROOT = ITEMS.register("xander_root",
            () -> new RadNamedItem( 0f, ModBlocksClass.ZANDER.get(), new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.NASTY)));
    public static final RegistryObject<Item> NUKAROOT = ITEMS.register("nukaroot",
            () -> new RadNamedItem( -0.2f, ModBlocksClass.NUKAROOT.get(), new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.NASTY)));
    public static final RegistryObject<Item> GINSENG_ROOT = ITEMS.register("ginsengroot",
            () -> new RadNamedItem( 0f, ModBlocksClass.GINSENG.get(), new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.NASTY)));
    public static final RegistryObject<Item> CORAL_LEAF = ITEMS.register("coral_leaf",
            () -> new RadNamedItem( 0f, ModBlocksClass.CORALLEAF.get(), new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> PRISM_LEAF = ITEMS.register("prism_leafs",
            () -> new RadNamedItem( 0f, ModBlocksClass.PRISMLEAF.get(), new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> CAP = ITEMS.register("cap",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> DOGWOOD = ITEMS.register("dogwood",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));

    public static final RegistryObject<Item> NUCMAT = ITEMS.register("nuclear_mat",
            () -> new NuclearMaterialItem(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> PREWARMON = ITEMS.register("prewarmoney",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> RAWURAN = ITEMS.register("rawuran",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> LEADPLATE = ITEMS.register("leadplate",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> FILTER = ITEMS.register("filter",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));

    public static final RegistryObject<Item> RAWALUMI = ITEMS.register("raw_alumi",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> RAWBTITAN = ITEMS.register("raw_btitan",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> RAWLEAD = ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> RAWSILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));

    ///ADVANCED MATERIALS
    public static final RegistryObject<Item> ADVMAG = ITEMS.register("advmag",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> MAG = ITEMS.register("magnet",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> AIPROCC = ITEMS.register("aimproccesor",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> ADCAN = ITEMS.register("adncan",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> URANROD = ITEMS.register("uranrod",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> CERPLATE = ITEMS.register("cerplate",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> ALUMING = ITEMS.register("alumicond",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> COPPERWIRE = ITEMS.register("copperwires",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> LAMP = ITEMS.register("lamp",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> ULTRBAR = ITEMS.register("ultrbar",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> COPPERCOND = ITEMS.register("coppercond",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> REDUCER = ITEMS.register("reducer",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.COMMON)));

    ///FLUX
    public static final RegistryObject<Item> RAWCOBFLUX = ITEMS.register("undcobaltflux",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> COBFLUX = ITEMS.register("cobaltflux",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> CLEANCOBFLUX = ITEMS.register("cleancobaltflux",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> RAWFLUOFLUX = ITEMS.register("undfluorflux",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> FLUOFLUX = ITEMS.register("fluorflux",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> CLEANFLUOFLUX = ITEMS.register("cleanfluorflux",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> RAWSCARFLUX = ITEMS.register("undscarletflux",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> SCARFLUX = ITEMS.register("scarletflux",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> CLEANSCARFLUX = ITEMS.register("cleanscarletflux",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> URANFLUX = ITEMS.register("uraniumflux",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> PUREURANFLUX = ITEMS.register("cleanuraniumflux",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> RAWVIOLFLUX = ITEMS.register("undvioletflux",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> VIOLFLUX = ITEMS.register("violetflux",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> CLEANVIOLFLUX = ITEMS.register("cleanvioletflux",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> BLACKFLUX = ITEMS.register("blackflux",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> GIGAWHEATL = ITEMS.register("gigawheat",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> GIGAWHEAT_SEEDS = ITEMS.register("gigawheat_seeds",
            () -> new ItemNameBlockItem(ModBlocksClass.GIGAWHEAT.get(), (new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.RARE))));

    public static final RegistryObject<Item> ABRAXOCLEANER = ITEMS.register("abraxo_cleaner",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> INDAABRAXOCLEANER = ITEMS.register("inda_abraxo_cleaner",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> PIEZODIVIDE = ITEMS.register("piezonucleic_divider",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> QUARZDIVIDER = ITEMS.register("quartz_divider",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> ULTRDIVIDER = ITEMS.register("ultracite_divider",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> ULTRSHEAT = ITEMS.register("ultracite_sheat",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> WHITEBRICK = ITEMS.register("whitebrick",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> SILICATE = ITEMS.register("silicate",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> QUARZSHEAT = ITEMS.register("quartz_sheat",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> QUARZPIECE = ITEMS.register("quartz_piece",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> QUARZPLATE = ITEMS.register("quartz_plate",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> ARMYCIRCUIT = ITEMS.register("army_circuit",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> ELEDIVIDE = ITEMS.register("electrite_divider",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> ELESHEAT = ITEMS.register("electrite_sheat",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> GILLEAD = ITEMS.register("gilded_lead",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.UNCOMMON)));

    //    ///FOODS
    public static final RegistryObject<Item> NUKACOLA = ITEMS.register("nukacola",
        () -> new NukaColaItem(0.08f, new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.NUKACOLA)));
    public static final RegistryObject<Item> NUKAFRUTTI = ITEMS.register("nukafrutti",
            () -> new NukaColaItem( -0.09f, new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.NUKAFRUTTI)));
    public static final RegistryObject<Item> CRACKBERRY = ITEMS.register("crackberry",
              () -> new RadNamedItem(-0.1f, ModBlocksClass.CRACKBERRY_BUSH.get(), new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.CRACKBERRY)));
    public static final RegistryObject<Item> BOMBBERRY = ITEMS.register("bombberry",
              () -> new RadNamedItem(-0.1f, ModBlocksClass.BOMBBERRY_BUSH.get(),new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.BOMBBERRY)));
    public static final RegistryObject<Item> MUTTFRUIT = ITEMS.register("muttfruit",
              () -> new RadNamedItem( 0.0f, ModBlocksClass.MUTTFRUIT_BUSH.get(),new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.MUTTFRUIT)));
    public static final RegistryObject<Item> FUSFRUIT = ITEMS.register("fusionfruit",
              () -> new RadNamedItem(-0.2f, ModBlocksClass.FUSFRUIT_BUSH.get(),new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.FUSFRUIT)));
    public static final RegistryObject<Item> SITTBEAN = ITEMS.register("sittbean",
              () -> new RadNamedItem( 0.0f, ModBlocksClass.SITTBEAN_BUSH.get(),new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.SITTBEAN)));
    public static final RegistryObject<Item> NEUTRONROD = ITEMS.register("neutronpod",
              () -> new RadNamedItem(0.3f, ModBlocksClass.NEUTRON_BUSH.get(),new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.NEUTRONROD)));
    public static final RegistryObject<Item> WILDTATO = ITEMS.register("wildtato",
              () -> new RadNamedItem( 0.0f, ModBlocksClass.TATO.get(), new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.WILDTATO)));
    public static final RegistryObject<Item> IRRADBEETROOT = ITEMS.register("irrad_beetroot",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(Foods.BEETROOT)));
    public static final RegistryObject<Item> UFCARROT = ITEMS.register("ufcarrot",
            () -> new RadNamedItem(0.2f, ModBlocksClass.UFCARROT.get(), new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.WILDTATO)));
    public static final RegistryObject<Item> IRRADSEED = ITEMS.register("irradb_seed",
            () -> new BlockItem(ModBlocksClass.IRRADROOT.get(), new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL)));
    public static final RegistryObject<Item> SPOILD_TATO = ITEMS.register("spoiled_tato",
            () -> new Item(new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.SPOILED)));
    public static final RegistryObject<Item> STARBERRY = ITEMS.register("starberry",
              () -> new RadNamedItem( 0.0f, ModBlocksClass.STARBERRY.get(),new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.STARBERRY)));
    public static final RegistryObject<Item> CRANBERRY = ITEMS.register("cranberry",
              () -> new RadNamedItem( -0.1f, ModBlocksClass.CRANBERRY.get(),new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.CRANBERRY)));
    public static final RegistryObject<Item> GOLD_CRANBERRY = ITEMS.register("gold_cranberry",
            () -> new RadNamedItem( -0.3f, ModBlocksClass.GOLD_CRANBERRY.get(),new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.CRANBERRY)));
    public static final RegistryObject<Item> APPLESP = ITEMS.register("applesp",
        () -> new RadFoodItem(0.5f, new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.APPLESP)));
    public static final RegistryObject<Item> CRAM = ITEMS.register("cram",
              () -> new RadFoodItem(0.45f, new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.CRAM)));
    public static final RegistryObject<Item> NUKAMEL = ITEMS.register("nukamelon_piece",
            () -> new RadFoodItem(0.55f, new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.NUKAMELON)));
    public static final RegistryObject<Item> CHIPS = ITEMS.register("chips",
            () -> new RadFoodItem(0.35f, new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.CHIPS)));
    public static final RegistryObject<Item> FCAKES = ITEMS.register("fcakes",
            () -> new RadFoodItem(0.4f, new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.FCAKES)));
    public static final RegistryObject<Item> MCCHESSE = ITEMS.register("maccheese",
            () -> new RadFoodItem(0.3f, new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.MCCHESSE)));
    public static final RegistryObject<Item> PURES = ITEMS.register("pures",
            () -> new RadFoodItem(0.2f, new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.PURES)));
    public static final RegistryObject<Item> COTTONCANDY = ITEMS.register("cottoncandy",
            () -> new RadFoodItem( 0.0f, new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.COTTONCANDY)));
    public static final RegistryObject<Item> BUBBLEAPPLE = ITEMS.register("bubbleapple",
            () -> new RadFoodItem( 0.0f, new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.BUBBLEAPPLE)));  //    public static final RegistryObject<Item> ASTER_TEA = ITEMS.register("aster_tea", () -> new TeaItem(new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.TEA)));
    public static final RegistryObject<Item> ASTER_TEA = ITEMS.register("aster_tea",
            () -> new TeaItem(0.14f, new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.TEA)));
    public static final RegistryObject<Item> SWEET_ASTER_TEA = ITEMS.register("sweet_aster_tea",
            () -> new TeaItem( 0.0f, new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.TEA)));
    public static final RegistryObject<Item> ASH_TEA = ITEMS.register("ash_tea",
            () -> new TeaItem(0.1f, new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.TEA)));
    public static final RegistryObject<Item> SWEET_ASH_TEA = ITEMS.register("sweet_ash_tea",
            () -> new TeaItem( 0.0f, new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.TEA)));
    public static final RegistryObject<Item> THISTLE_TEA = ITEMS.register("thistle_tea",
            () -> new TeaItem(0.2f, new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.THISTLE)));
    public static final RegistryObject<Item> SOOT_TEA = ITEMS.register("soot_tea",
            () -> new TeaItem( 0.1f, new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.TEA)));
    public static final RegistryObject<Item> VEGSOUP = ITEMS.register("vegsoup",
            () -> new BowlFoodItem(new Item.Properties().tab(ModItemTabs.NUKA_FOOD).stacksTo(1).food(ModFood.VEGSOUP)));
    public static final RegistryObject<Item> TATOSALAD = ITEMS.register("tato_salad",
            () -> new BowlFoodItem(new Item.Properties().tab(ModItemTabs.NUKA_FOOD).stacksTo(1).food(ModFood.TATOSALAD)));
    public static final RegistryObject<Item> SITTSOUP = ITEMS.register("sittsoup",
            () -> new BowlFoodItem(new Item.Properties().tab(ModItemTabs.NUKA_FOOD).stacksTo(1).food(ModFood.SITTSOUP)));
    public static final RegistryObject<Item> SITTPUREE = ITEMS.register("sittpuree",
            () -> new BowlFoodItem(new Item.Properties().tab(ModItemTabs.NUKA_FOOD).stacksTo(1).food(ModFood.SITTPUREE)));
    public static final RegistryObject<Item> FMSOUP = ITEMS.register("firemushsoup",
            () -> new SpecialSoupItem( 0.0f, new Item.Properties().tab(ModItemTabs.NUKA_FOOD).stacksTo(1).food(ModFood.FMSOUP)));
    public static final RegistryObject<Item> FMPUREE = ITEMS.register("firemushpuree",
            () -> new SpecialSoupItem( 0.0f, new Item.Properties().tab(ModItemTabs.NUKA_FOOD).stacksTo(1).food(ModFood.FMPUREE)));
//
//
//    //MEDICINE ITEMS
    public static final RegistryObject<Item> STIMPAK = ITEMS.register("stimpak",
    () -> new StimpakItem(new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.MED)));
    public static final RegistryObject<Item> SUPER_STIMPAK = ITEMS.register("super_stimpak",
          () -> new StimpakItem(new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.MED)));
    public static final RegistryObject<Item> RADAWAY = ITEMS.register("radaway",
          () -> new MedicineItem( -4.0f, new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.MED)));
    public static final RegistryObject<Item> GLOWBLOOD = ITEMS.register("glowblood",
          () -> new MedicineItem(4.0f, new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.MED)));
    public static final RegistryObject<Item> RADX = ITEMS.register("radx",
          () -> new MedicineItem( 0.0f, new Item.Properties().tab(ModItemTabs.NUKA_FOOD).food(ModFood.MED)));

    //Others
    public static final RegistryObject<Item> PIP_BOY_D = ITEMS.register("pipboy_d",
        () -> new PipBoyItem("pipboy_d", new Item.Properties().tab(ModItemTabs.NUKA_ARMOR).stacksTo(1)));
    public static final RegistryObject<Item> PIMPBOY = ITEMS.register("pimpboy",
            () -> new PipBoyItem("pimpboy", new Item.Properties().tab(ModItemTabs.NUKA_ARMOR).stacksTo(1)));

    public static final RegistryObject<Item> HOLO_1CC = ITEMS.register("holotape_white",
            () -> new ColoredHolotapeItem("white", new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> HOLO_1D2 = ITEMS.register("holotape_green",
            () -> new ColoredHolotapeItem("green", new Item.Properties().tab(ModItemTabs.NUKA_MATERIAL).rarity(Rarity.COMMON)));

    //Power armor
    public static final RegistryObject<Item> FUSION_CONE = ITEMS.register("fusion_core",
            () -> new FusionCoreItem(new Item.Properties()
                    .durability(100000)
                    .tab(ModItemTabs.NUKA_MATERIAL)
            ));

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
}

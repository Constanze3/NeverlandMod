package com.constanzee.neverland.block;

import com.constanzee.neverland.Neverland;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static Block RUNE_BLOCK;

    private static Block register(String id, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(Neverland.MODID, id), block);
    }

    public static void register() {
        RUNE_BLOCK = register("rune_block", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(5.0f, 6.0f)));
    }
}

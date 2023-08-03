package com.dayton.nukacraft.common.items.custom;

import com.dayton.nukacraft.common.blocks.custom.blocks.MutationFloraClass;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class NuclearMaterialItem extends Item {
    public NuclearMaterialItem(Properties p_41383_) {
        super(p_41383_);
    }
    @Override
    public InteractionResult useOn(UseOnContext context) {
        Player player = context.getPlayer();
        Level level = context.getLevel();
        BlockPos posOld = context.getClickedPos();
        BlockState state = level.getBlockState(posOld);
        if (state.getBlock().defaultBlockState().is(BlockTags.create(new ResourceLocation("nukacraft:mutable_plants")))) {
            MutationFloraClass.mutatePlants(state, player, posOld, level);
            if (!player.isCreative()) {player.getMainHandItem().shrink(1);}
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.FAIL;
    }
}

package com.bionicfox.rubymod.init;

import java.util.ArrayList;
import java.util.List;

import com.bionicfox.rubymod.blocks.BlockBase;
import com.bionicfox.rubymod.blocks.RubyBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
  public static final List<Block> BLOCKS = new ArrayList<Block>();
  //import RubyBlock from blocks.RubyBlock
  public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.SAND);
  //BlockBase is the default Block options, if you want to use your own custom stuff 
  //for a block you need to use inheritance
  public static final Block OH_HELL_NO_BLOCK = new BlockBase("oh_hell_no_block", Material.IRON);
}

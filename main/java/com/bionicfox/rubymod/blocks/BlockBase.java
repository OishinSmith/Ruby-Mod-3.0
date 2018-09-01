package com.bionicfox.rubymod.blocks;

import com.bionicfox.rubymod.Main;
import com.bionicfox.rubymod.init.ModBlocks;
import com.bionicfox.rubymod.init.ModItems;
import com.bionicfox.rubymod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
  public BlockBase(String name, Material material) 
  {
  
	super(material);
    setUnlocalizedName(name);
    setRegistryName(name);
    setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	
    ModBlocks.BLOCKS.add(this);
    ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
  }

  @Override
  public void registerModels() 
  {
	  // TODO Auto-generated method stub
	Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
  }
}

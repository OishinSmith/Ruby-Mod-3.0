package com.bionicfox.rubymod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RubyBlock extends BlockBase 
{
//inheritance, taking all the code from "Block base" making RubyBlock inherit (the instructions) it without changing the code in 
//BlockBase and add onto it without changing code in BlockBase
	public RubyBlock(String name, Material material) { //constructor
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(3.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(1.0f);
		//setLightOpacity(1); would allow all light to pass through, would be cool to make a windows/glass objects
		//setBlockUnbreakable();
	}

}

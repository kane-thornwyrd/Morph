package me.ichun.mods.morph.api.ability.type;

import me.ichun.mods.morph.api.ability.Ability;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AbilityFallNegate extends Ability
{
    public static final ResourceLocation iconResource = new ResourceLocation("morph", "textures/icon/fall_negate.png");

    @Override
    public String getType()
    {
        return "fallNegate";
    }

    @Override
    public void tick()
    {
        getParent().fallDistance -= getParent().fallDistance * getStrength();
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getIcon()
    {
        return iconResource;
    }
}

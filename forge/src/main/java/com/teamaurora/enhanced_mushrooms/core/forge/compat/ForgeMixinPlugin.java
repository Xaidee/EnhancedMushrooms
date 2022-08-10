package com.teamaurora.enhanced_mushrooms.core.forge.compat;

import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.util.List;
import java.util.Set;

public class ForgeMixinPlugin implements IMixinConfigPlugin {

    private boolean darkerDepthsLoaded;

    @Override
    public void onLoad(String mixinPackage) {
        this.darkerDepthsLoaded = isModLoaded("com.naterbobber.darkerdepths.DarkerDepths");
    }

    /*
    Forge Mod Loader doesn't seem to generate a Mod List until after Mixins are loaded unlike fabric
    so we have to create our own method that instead checks if a class within the mod we want to see exists
    is loaded. This means we can have mod dependent mixins for compatability without running into issues when
    the mod isn't there.
     */
    protected boolean isModLoaded(String name) {
        try {
            Class.forName(name, false, getClass().getClassLoader());
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    @Override
    public String getRefMapperConfig() {
        return null;
    }

    @Override
    public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
        return this.darkerDepthsLoaded && mixinClassName.equals("com.teamaurora.enhanced_mushrooms.core.mixin.forge.MixinDDHugeGlowshroomFeature");
    }

    @Override
    public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {
    }

    @Override
    public List<String> getMixins() {
        return null;
    }

    @Override
    public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {
    }

    @Override
    public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {
    }
}

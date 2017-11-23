package de.canitzp.registry.elements;

import de.canitzp.registry.registry.IRegistryElement;
import de.canitzp.registry.registry.Registry;
import de.canitzp.registry.util.ResourceLocation;

/**
 * This class represents the Block class of Minecraft
 *
 * @author canitzp
 */
public class Block<T extends Block> implements IRegistryElement<T> {

    private ResourceLocation registryName;

    public Block(ResourceLocation name){
        this.registryName = name;
    }

    public Block(String name){
        this(new ResourceLocation(name));
    }

    @Override
    public ResourceLocation getRegistryName() {
        return this.registryName;
    }

    @Override
    public void onRegistering() {
        new ItemBlock(this).register();
    }

    @Override
    public ResourceLocation getRegistryCategory() {
        return Registry.CATEGORY_BLOCK;
    }
}

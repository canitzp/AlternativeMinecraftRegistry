package de.canitzp.registry.elements;

import de.canitzp.registry.registry.IRegistryElement;
import de.canitzp.registry.registry.Registry;
import de.canitzp.registry.util.ResourceLocation;

/**
 * This class represents the Item class of Minecraft
 *
 * @author canitzp
 */
public class Item<T extends Item> implements IRegistryElement<T> {

    private ResourceLocation registryName;

    public Item(ResourceLocation name){
        this.registryName = name;
    }

    public Item(String name){
        this(new ResourceLocation(name));
    }

    @Override
    public ResourceLocation getRegistryName() {
        return this.registryName;
    }

    @Override
    public ResourceLocation getRegistryCategory() {
        return Registry.CATEGORY_ITEM;
    }

}

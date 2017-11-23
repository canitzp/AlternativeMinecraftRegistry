package de.canitzp.registry.elements;

import de.canitzp.registry.registry.IRegistryElement;
import de.canitzp.registry.registry.Registry;
import de.canitzp.registry.util.ResourceLocation;

/**
 * This is the registry class for TileEntities
 *
 * @author canitzp
 */
public class TileEntityRegistryWrapper<T extends TileEntity> implements IRegistryElement {

    private ResourceLocation registryName;
    private Class<T> tileClass;

    public TileEntityRegistryWrapper(ResourceLocation registryName, Class<T> tileClass){
        this.registryName = registryName;
        this.tileClass = tileClass;
    }

    @Override
    public ResourceLocation getRegistryName() {
        return this.registryName;
    }

    @Override
    public ResourceLocation getRegistryCategory() {
        return Registry.CATEGORY_TILE_ENTITY;
    }

    @Override
    public void onRegistering() {
        // register tileClass to the tile entity registry (or rework how the game gets TileEntities)
    }
}

package de.canitzp.registry.elements;

import de.canitzp.registry.registry.IRegistryElement;
import de.canitzp.registry.registry.Registry;
import de.canitzp.registry.util.ResourceLocation;

/**
 * This is the registry class for entities
 *
 * @author canitzp
 */
public class EntityRegistryWrapper<T extends Entity> implements IRegistryElement {

    private ResourceLocation registryName;
    private Class<T> entityClass;

    public EntityRegistryWrapper(ResourceLocation name, Class<T> entityClass){
        this.registryName = name;
        this.entityClass = entityClass;
    }

    @Override
    public ResourceLocation getRegistryName() {
        return this.registryName;
    }

    @Override
    public ResourceLocation getRegistryCategory() {
        return Registry.CATEGORY_ENTITY;
    }

    @Override
    public void onRegistering() {
        // register entityClass to the EntityList (or rework how the EntityList works)
        // Register spawn eggs if needed
    }
}

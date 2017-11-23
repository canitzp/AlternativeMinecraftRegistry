package de.canitzp.registry.registry;

import de.canitzp.registry.util.ResourceLocation;

import java.util.HashMap;
import java.util.Map;

/**
 * This is the heart of the whole Registry system, the main Registry.
 * Every has a corresponding category and on registering the element it
 * gets add to the corresponding categorized Map.
 *
 * @author canitzp
 */
public class Registry {

    /**
     * The instance of the Registry. It should also be possible to make it completely static
     */
    public static final Registry REGISTRY = new Registry();

    public static final ResourceLocation CATEGORY_BLOCK = new ResourceLocation("block");
    public static final ResourceLocation CATEGORY_ITEM = new ResourceLocation("item");
    public static final ResourceLocation CATEGORY_ENTITY = new ResourceLocation("entity");
    public static final ResourceLocation CATEGORY_TILE_ENTITY = new ResourceLocation("tile_entity");

    /**
     * The main registry Collection. Every category gets its own Element list
     */
    public Map<ResourceLocation, Map<ResourceLocation, IRegistryElement>> ELEMENTS = new HashMap<>();

    /**
     *
     * @param category The category the element should get add to. Normally this is defined inside the IRegistryElement object itself.
     * @param element The IRegistryElement itself.
     * @param <T> The real instance of IRegistryElement
     * @return The registered IRegistryElement
     *
     * @see IRegistryElement
     */
    public <T extends IRegistryElement> T register(ResourceLocation category, T element){
        Map<ResourceLocation, IRegistryElement> categorizedRegistry = ELEMENTS.getOrDefault(category, new HashMap<>());
        categorizedRegistry.put(element.getRegistryName(), element);
        ELEMENTS.put(category, categorizedRegistry);
        element.onRegistering();
        return element;
    }

}

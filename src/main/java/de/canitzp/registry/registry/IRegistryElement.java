package de.canitzp.registry.registry;

import de.canitzp.registry.util.ResourceLocation;

/**
 * This class is a the one class that represents every single element inside the Registry.
 * Every Element that implements this can be registered inside the Registry
 *
 * @author canitzp
 */
public interface IRegistryElement<T extends IRegistryElement> {

    /**
     * @return The name of the element. This has to be unique within the same Category!
     */
    ResourceLocation getRegistryName();

    /**
     * @return The category this element should be associated to
     */
    ResourceLocation getRegistryCategory();

    /**
     * A elements that do special things can do them in here. Like Blocks are registering their corresponding ItemBlocks
     */
    default void onRegistering(){

    }

    /**
     * This is the main method, which adds this IRegistryElement to the corresponding Registry.
     * This shouldn't be overridden normally
     *
     * @return The registered element. Use the one that you get back from the Registry.
     */
    @SuppressWarnings("unchecked")
    default T register(){
        return Registry.REGISTRY.register(this.getRegistryCategory(), (T) this);
    }

}

package de.canitzp.registry.elements;

/**
 * This class represents the ItemBlock class of Minecraft
 *
 * @author canitzp
 */
public class ItemBlock extends Item {

    private Block block;

    public ItemBlock(Block block) {
        super(block.getRegistryName());
        this.block = block;
    }

    public Block getBlock() {
        return block;
    }

}

package me.mattstudios.mfgui.gui.components

import org.bukkit.inventory.ItemStack

class NBTBuilderContainer(private val itemBuilder: ItemBuilder) {

    infix fun String.to(value: String) {
        itemBuilder.setNbt(this, value)
    }
}

class NBTContainer(private val item: ItemStack) {
    operator fun set(key: String, value: String) {
        ItemNBT.setNBTTag(item, key, value)
    }

    operator fun get(key: String): String {
        return ItemNBT.getNBTTag(item, key)
    }
}

val ItemStack.nbt: NBTContainer
    get() = NBTContainer(this)
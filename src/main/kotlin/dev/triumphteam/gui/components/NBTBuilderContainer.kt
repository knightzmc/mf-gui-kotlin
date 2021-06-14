package dev.triumphteam.gui.components

import dev.triumphteam.gui.builder.item.ItemBuilder
import dev.triumphteam.gui.components.util.ItemNbt
import org.bukkit.inventory.ItemStack

class NBTBuilderContainer(private val itemBuilder: ItemBuilder) {

    infix fun String.to(value: String) {
        itemBuilder.setNbt(this, value)
    }
}

class NBTContainer(private val item: ItemStack) {
    operator fun set(key: String, value: String) {
        ItemNbt.setString(item, key, value)
    }

    operator fun get(key: String): String {
        return ItemNbt.getString(item, key)
    }
}

val ItemStack.nbt: NBTContainer
    get() = NBTContainer(this)

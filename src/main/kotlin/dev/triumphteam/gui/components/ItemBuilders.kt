package dev.triumphteam.gui.components

import dev.triumphteam.gui.builder.item.ItemBuilder
import org.bukkit.Material
import org.bukkit.OfflinePlayer
import org.bukkit.inventory.ItemFlag
import org.bukkit.inventory.ItemStack

fun buildItem(type: Material, function: ItemBuilder.() -> Unit = {}): ItemBuilder {
    return ItemBuilder.from(type).apply(function)
}

fun buildItem(type: ItemStack, function: ItemBuilder.() -> Unit = {}): ItemBuilder {
    return ItemBuilder.from(type).apply(function)
}

fun createItem(type: Material, function: ItemBuilder.() -> Unit = {}): ItemStack {
    return buildItem(type, function).build()
}

fun createItem(type: ItemStack, function: ItemBuilder.() -> Unit = {}): ItemStack {
    return buildItem(type, function).build()
}

@Deprecated("in favour of components")
var ItemBuilder.name: String
    get() = throwUOE("name")
    set(value) {
        setName(value)
    }

var ItemBuilder.amount: Int
    get() = throwUOE("amount")
    set(value) {
        amount(value)
    }

@Deprecated("in favour of components")
var ItemBuilder.lore: List<String>
    get() = throwUOE("lore")
    set(value) {
        setLore(value)
    }

var ItemBuilder.flags: List<ItemFlag>
    get() = throwUOE("flags")
    set(value) {
        flags(*value.toTypedArray())
    }

var ItemBuilder.unbreakable: Boolean
    get() = throwUOE("unbreakable")
    set(value) {
        unbreakable(value)
    }

var ItemBuilder.glow: Boolean
    get() = throwUOE("glow")
    set(value) {
        glow(value)
    }

var ItemBuilder.skullTexture: String
    get() = throwUOE("skullTexture")
    set(value) {
        ItemBuilder.skull().texture(value)
    }

var ItemBuilder.skullOwner: OfflinePlayer
    get() = throwUOE("skullOwner")
    set(value) {
        ItemBuilder.skull().owner(value)
    }

fun ItemBuilder.nbt(nbtSetter: NBTBuilderContainer.() -> Unit) {
    NBTBuilderContainer(this).apply(nbtSetter)
}

fun ItemBuilder.enchantments(function: EnchantmentContainer.() -> Unit) {
    EnchantmentContainer(this).apply(function)
}

private fun throwUOE(from: String): Nothing {
    throw UnsupportedOperationException("Cannot access ItemBuilder.$from")
}

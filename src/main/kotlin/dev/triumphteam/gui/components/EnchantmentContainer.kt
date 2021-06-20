package dev.triumphteam.gui.components

import dev.triumphteam.gui.builder.item.ItemBuilder
import org.bukkit.enchantments.Enchantment

class EnchantmentContainer(private val itemBuilder: ItemBuilder) {
    infix fun Enchantment.level(level: Int) {
        itemBuilder.enchant(this, level)
    }

    fun add(enchantment: Enchantment) {
        itemBuilder.enchant(enchantment)
    }
}


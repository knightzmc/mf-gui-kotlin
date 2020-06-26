package me.mattstudios.mfgui.gui.components

import org.bukkit.enchantments.Enchantment

class EnchantmentContainer(private val itemBuilder: ItemBuilder) {
    infix fun Enchantment.level(level: Int) {
        itemBuilder.addEnchantment(this, level)
    }

    fun add(enchantment: Enchantment) {
        itemBuilder.addEnchantment(enchantment)
    }
}


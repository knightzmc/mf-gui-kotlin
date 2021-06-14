package dev.triumphteam.gui.guis

import org.bukkit.event.inventory.InventoryClickEvent
import org.bukkit.inventory.ItemStack

fun ItemStack.toGUIItem(action: (InventoryClickEvent.() -> Unit)? = {}) = GuiItem(this, action)

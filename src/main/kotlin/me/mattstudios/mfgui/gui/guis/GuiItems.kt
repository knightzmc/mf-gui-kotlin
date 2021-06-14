package me.mattstudios.mfgui.gui.guis

import dev.triumphteam.gui.guis.GuiItem
import org.bukkit.event.inventory.InventoryClickEvent
import org.bukkit.inventory.ItemStack

fun ItemStack.toGUIItem(action: (InventoryClickEvent.() -> Unit)? = {}) = GuiItem(this, action)

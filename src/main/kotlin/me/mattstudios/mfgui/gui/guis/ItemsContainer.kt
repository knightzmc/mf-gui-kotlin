package me.mattstudios.mfgui.gui.guis

import dev.triumphteam.gui.guis.BaseGui
import dev.triumphteam.gui.guis.GuiItem

class ItemsContainer(private val gui: BaseGui) {
    operator fun get(slot: Int): GuiItem? {
        return gui.getGuiItem(slot)
    }

    operator fun set(slot: Int, value: GuiItem) {
        gui.setItem(slot, value)
    }

    operator fun set(row: Int, col: Int, value: GuiItem) {
        gui.setItem(row, col, value)
    }

    operator fun plusAssign(value: GuiItem) {
        gui.addItem(value)
    }
}

package me.mattstudios.mfgui.gui.guis

import dev.triumphteam.gui.guis.BaseGui
import dev.triumphteam.gui.guis.Gui
import dev.triumphteam.gui.guis.PaginatedGui
import dev.triumphteam.gui.guis.StorageGui

private const val DEFAULT_ROWS = 1
private fun <T : BaseGui> emptyFunction() = { _: T -> }

fun gui(
    rows: Int = DEFAULT_ROWS,
    title: String,
    apply: Gui.() -> Unit = emptyFunction()
): Gui
{
    return Gui(rows, title).apply(apply)
}

fun paginatedGui(
    rows: Int = DEFAULT_ROWS,
    title: String,
    apply: PaginatedGui.() -> Unit = emptyFunction()
): PaginatedGui
{
    return PaginatedGui(rows, title).apply(apply)
}

fun persistentGui(
    rows: Int = DEFAULT_ROWS,
    title: String,
    apply: StorageGui.() -> Unit = emptyFunction()
): StorageGui {
    return StorageGui(rows, title).apply(apply)
}

val BaseGui.items: ItemsContainer
    get() = ItemsContainer(this)

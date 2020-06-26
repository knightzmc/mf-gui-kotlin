package me.mattstudios.mfgui.gui.guis

import org.bukkit.plugin.Plugin

private const val DEFAULT_ROWS = 1
private fun <T : BaseGui> emptyFunction() = { _: T -> }

fun gui(
    plugin: Plugin,
    rows: Int = DEFAULT_ROWS,
    title: String,
    apply: Gui.() -> Unit = emptyFunction()
): Gui {
    return Gui(plugin, rows, title).apply(apply)
}

fun paginatedGui(
    plugin: Plugin,
    rows: Int = DEFAULT_ROWS,
    title: String,
    apply: PaginatedGui.() -> Unit = emptyFunction()
): PaginatedGui {
    return PaginatedGui(plugin, rows, title).apply(apply)
}

fun persistentGui(
    plugin: Plugin,
    rows: Int = DEFAULT_ROWS,
    title: String,
    apply: PersistentGui.() -> Unit = emptyFunction()
): PersistentGui {
    return PersistentGui(plugin, rows, title).apply(apply)
}

val BaseGui.items: ItemsContainer
    get() = ItemsContainer(this)

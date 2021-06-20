package dev.triumphteam.gui.guis

import net.kyori.adventure.text.Component

private const val DEFAULT_ROWS = 1
private fun <T : BaseGui> emptyFunction() = { _: T -> }

@Deprecated(message = "In favor of components")
fun gui(
    rows: Int = DEFAULT_ROWS,
    title: String,
    apply: Gui.() -> Unit = emptyFunction()
): Gui {
    return Gui(rows, title).apply(apply)
}

fun gui(
    rows: Int = DEFAULT_ROWS,
    title: Component,
    apply: Gui.() -> Unit = emptyFunction()
): Gui {
    return Gui(rows, title).apply(apply)
}

@Deprecated(message = "In favor of components")
fun paginatedGui(
    rows: Int = DEFAULT_ROWS,
    title: String,
    apply: PaginatedGui.() -> Unit = emptyFunction()
): PaginatedGui {
    return PaginatedGui(rows, title).apply(apply)
}

fun paginatedGui(
    rows: Int = DEFAULT_ROWS,
    title: Component,
    apply: PaginatedGui.() -> Unit = emptyFunction()
): PaginatedGui {
    return PaginatedGui(rows, title).apply(apply)
}

@Deprecated(message = "In favor of components")
fun storageGui(
    rows: Int = DEFAULT_ROWS,
    title: String,
    apply: StorageGui.() -> Unit = emptyFunction()
): StorageGui {
    return StorageGui(rows, title).apply(apply)
}

fun storageGui(
    rows: Int = DEFAULT_ROWS,
    title: Component,
    apply: StorageGui.() -> Unit = emptyFunction()
): StorageGui {
    return StorageGui(rows, title).apply(apply)
}

val BaseGui.items: ItemsContainer
    get() = ItemsContainer(this)

package me.mattstudios.mfgui.gui.guis

private const val DEFAULT_ROWS = 1
private fun <T : BaseGui> emptyFunction() = { _: T -> }

fun gui(
    rows: Int = DEFAULT_ROWS,
    title: String,
    apply: Gui.() -> Unit = emptyFunction()
): Gui {
    return Gui(rows, title).apply(apply)
}

fun paginatedGui(
    rows: Int = DEFAULT_ROWS,
    title: String,
    apply: PaginatedGui.() -> Unit = emptyFunction()
): PaginatedGui {
    return PaginatedGui(rows, title).apply(apply)
}

fun persistentGui(
    rows: Int = DEFAULT_ROWS,
    title: String,
    apply: PersistentGui.() -> Unit = emptyFunction()
): PersistentGui {
    return PersistentGui(rows, title).apply(apply)
}

val BaseGui.items: ItemsContainer
    get() = ItemsContainer(this)

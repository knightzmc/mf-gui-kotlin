package me.mattstudios.mfgui.gui.components

fun <T> Collection<T>.repeat(times: Int): List<T> {
    return (0..times).flatMap { this }
}

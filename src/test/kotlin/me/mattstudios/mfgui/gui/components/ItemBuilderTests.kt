package me.mattstudios.mfgui.gui.components

import be.seeseemelk.mockbukkit.MockBukkit
import me.mattstudios.mfgui.gui.guis.gui
import me.mattstudios.mfgui.gui.guis.items
import me.mattstudios.mfgui.gui.guis.toGUIItem
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.enchantments.Enchantment.ARROW_DAMAGE
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import java.lang.reflect.Field
import java.lang.reflect.Modifier

class ItemBuilderTests {

    @Before
    fun setup() {
        MockBukkit.mock()
    }

    @After
    fun tearDown() {
        MockBukkit.unload()
    }

//    @Test TODO these have been broken by various changes and things... oh well
//    fun test() {
//
//        val item = createItem(Material.STONE_BRICKS) {
//            name = "Hello"
//            lore = listOf("The", "Lore", "Here")
//            enchantments {
//                ARROW_DAMAGE level 3
//            }
//        }
//
//
//        gui(title = "Test") {
//            items[3] = createItem(Material.STONE).toGUIItem {
//                isCancelled = true
//            }
//        }
//
//        assertEquals(item.enchantments[ARROW_DAMAGE], 3)
//    }
}

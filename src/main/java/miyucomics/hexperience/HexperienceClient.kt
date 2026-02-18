package miyucomics.hexperience

import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper
import net.minecraft.client.option.KeyBinding
import org.lwjgl.glfw.GLFW

class HexperienceClient : ClientModInitializer {
	override fun onInitializeClient() {
		KeyBindingHelper.registerKeyBinding(OPEN_HEXBOOK)
	}

	companion object {
		@JvmField
		val OPEN_HEXBOOK = KeyBinding("key.hexperience.open_hexbook", GLFW.GLFW_KEY_N, "key.categories.hexperience")
	}
}
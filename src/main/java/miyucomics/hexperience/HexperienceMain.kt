package miyucomics.hexperience

import net.fabricmc.api.ModInitializer
import net.minecraft.util.Identifier

class HexperienceMain : ModInitializer {
	override fun onInitialize() {

	}

	companion object {
		fun id(string: String) = Identifier("hexperience", string)
	}
}

package com.nexomc.protectionlib.compatibilities

import com.mineinabyss.cartridge.region.RegionFlag
import com.mineinabyss.cartridge.region.Regions
import com.nexomc.protectionlib.ProtectionCompatibility
import org.bukkit.Location
import org.bukkit.entity.Player
import org.bukkit.plugin.java.JavaPlugin

// Cartridge regions are part of the server rather than a plugin, so mainPlugin doubles as the compat's plugin
class CartridgeCompat(mainPlugin: JavaPlugin) : ProtectionCompatibility<JavaPlugin>(mainPlugin, mainPlugin) {
    private val regions = Regions.regions()

    override fun canBuild(player: Player, target: Location) = regions.isAllowed(player, target, RegionFlag.BLOCK_PLACE)

    override fun canBreak(player: Player, target: Location) = regions.isAllowed(player, target, RegionFlag.BLOCK_BREAK)

    override fun canInteract(player: Player, target: Location) = regions.isAllowed(player, target, RegionFlag.INTERACT)

    override fun canUse(player: Player, target: Location) = regions.isAllowed(player, target, RegionFlag.USE)
}

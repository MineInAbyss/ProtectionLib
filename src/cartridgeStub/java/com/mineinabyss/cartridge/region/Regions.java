package com.mineinabyss.cartridge.region;

import org.bukkit.Location;
import org.bukkit.entity.Player;

// Compile-time copy of the Cartridge region API subset CartridgeCompat links against, never packaged
public interface Regions {

    static Regions regions() {
        throw new UnsupportedOperationException();
    }

    boolean isAllowed(Player player, Location location, RegionFlag flag);
}

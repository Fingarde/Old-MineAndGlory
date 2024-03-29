package fr.fingarde.mineandglory.utils;

import org.bukkit.Bukkit;
import org.bukkit.Location;

public class LocationSerializer
{
    public static String serialize(Location location)
    {
        String value = location.getWorld().getName() + " " + (location.getBlockX()) + " " + location.getBlockY() + " " + (location.getBlockZ());
        return value;
    }

    public static String serializeCentered(Location location)
    {
        String value = location.getWorld().getName() + " " + (location.getBlockX() + 0.5) + " " + location.getBlockY() + " " + (location.getBlockZ() + 0.5);
        return value;
    }

    public static Location deserialize(String string)
    {
        String[] values = string.split(" ");

        Location loc = new Location(Bukkit.getWorld(values[0]), Double.valueOf(values[1]), Double.valueOf(values[2]), Double.valueOf(values[3]));
        return loc;
    }
}

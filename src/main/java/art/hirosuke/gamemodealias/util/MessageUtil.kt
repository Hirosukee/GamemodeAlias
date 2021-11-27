package art.hirosuke.gamemodealias.util

import org.bukkit.entity.Player

fun Player.sendPrefixedMessage(message: String) {
    sendMessage("§a[GmAlias]§r $message")
}

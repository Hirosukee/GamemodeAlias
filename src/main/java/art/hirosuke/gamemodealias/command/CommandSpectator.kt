package art.hirosuke.gamemodealias.command

import art.hirosuke.gamemodealias.util.sendPrefixedMessage
import org.bukkit.GameMode
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class CommandSpectator : BaseCommand("3") {

    override fun onCommand(sender: CommandSender, label: String, args: Array<out String>) {
        if (sender is Player && sender.hasPermission("gamemodealias.commands.gm") && args.isEmpty()) {
            sender.gameMode = GameMode.SPECTATOR
            sender.sendPrefixedMessage("Gamemode changed to ${sender.gameMode}")
        }
    }

    override fun onTabComplete(sender: CommandSender, label: String, args: Array<out String>): List<String>? {
        TODO("Not yet implemented")
    }
}

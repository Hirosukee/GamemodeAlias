package art.hirosuke.gamemodealias.command

import art.hirosuke.gamemodealias.util.sendPrefixedMessage
import org.bukkit.GameMode
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class CommandGm : BaseCommand("gm") {

    override fun onCommand(sender: CommandSender, label: String, args: Array<out String>) {
        if (sender is Player && sender.hasPermission("gamemodealias.commands.gm") && args.isNotEmpty()) {
            sender.gameMode = GameMode.getByValue(args[0].toInt())
            sender.sendPrefixedMessage("Gamemode changed to ${sender.gameMode}")
        }
    }

    override fun onTabComplete(sender: CommandSender, label: String, args: Array<out String>): List<String>? {
        TODO("Not yet implemented")
    }
}

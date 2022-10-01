package love.chihuyu.commands

import dev.jorel.commandapi.CommandAPICommand
import dev.jorel.commandapi.CommandPermission
import dev.jorel.commandapi.arguments.PlayerArgument
import dev.jorel.commandapi.executors.PlayerCommandExecutor
import org.bukkit.ChatColor
import org.bukkit.GameMode
import org.bukkit.entity.Player

object CommandSurvival {

    val main = CommandAPICommand("0")
        .withPermission("gamemodealias.survival")
        .withAliases("s")
        .executesPlayer(
            PlayerCommandExecutor { sender, args ->
                sender.gameMode = GameMode.SURVIVAL
                sender.sendMessage("Gamemode set to ${ChatColor.UNDERLINE}${sender.gameMode.name}${ChatColor.RESET}.")
            }
        )

    val withTarget = CommandAPICommand("0")
        .withPermission("gamemodealias.survival.others")
        .withAliases("s")
        .withArguments(PlayerArgument("player"))
        .executesPlayer(
            PlayerCommandExecutor { sender, args ->
                val player = args[0] as Player
                player.gameMode = GameMode.SURVIVAL
                sender.sendMessage("Gamemode set to ${ChatColor.UNDERLINE}${player.gameMode.name}${ChatColor.RESET}.")
            }
        )
}
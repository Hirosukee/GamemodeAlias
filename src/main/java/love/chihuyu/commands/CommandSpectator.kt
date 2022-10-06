package love.chihuyu.commands

import dev.jorel.commandapi.CommandAPICommand
import dev.jorel.commandapi.CommandPermission
import dev.jorel.commandapi.arguments.PlayerArgument
import dev.jorel.commandapi.executors.PlayerCommandExecutor
import org.bukkit.ChatColor
import org.bukkit.GameMode
import org.bukkit.entity.Player

object CommandSpectator {

    val main = CommandAPICommand("3")
        .withPermission("gamemodealias.spectator")
        .withAliases("p", "spectator")
        .executesPlayer(
            PlayerCommandExecutor { sender, args ->
                sender.gameMode = GameMode.SPECTATOR
                sender.sendMessage("Gamemode set to ${ChatColor.UNDERLINE}${sender.gameMode.name}${ChatColor.RESET}.")
            }
        )

    val withTarget = CommandAPICommand("3")
        .withPermission("gamemodealias.spectator.others")
        .withAliases("p", "spectator")
        .withArguments(PlayerArgument("player"))
        .executesPlayer(
            PlayerCommandExecutor { sender, args ->
                val player = args[0] as Player
                player.gameMode = GameMode.SPECTATOR
                sender.sendMessage("Gamemode set to ${ChatColor.UNDERLINE}${player.gameMode.name}${ChatColor.RESET}.")
            }
        )
}
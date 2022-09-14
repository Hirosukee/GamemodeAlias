package love.chihuyu.commands

import dev.jorel.commandapi.CommandAPICommand
import dev.jorel.commandapi.CommandPermission
import dev.jorel.commandapi.arguments.PlayerArgument
import dev.jorel.commandapi.executors.PlayerCommandExecutor
import org.bukkit.ChatColor
import org.bukkit.GameMode
import org.bukkit.entity.Player

object CommandCreative {

    val main = CommandAPICommand("1")
        .withPermission("gamemodealias.creative")
        .withPermission(CommandPermission.OP)
        .withAliases("c")
        .executesPlayer(PlayerCommandExecutor { sender, args ->
            sender.gameMode = GameMode.CREATIVE
            sender.sendMessage("Gamemode set to ${ChatColor.UNDERLINE}${sender.gameMode.name}${ChatColor.RESET}.")
        })

    val withTarget = CommandAPICommand("1")
        .withPermission("gamemodealias.creative")
        .withPermission(CommandPermission.OP)
        .withAliases("c")
        .withArguments(PlayerArgument("player"))
        .executesPlayer(PlayerCommandExecutor { sender, args ->
            val player = args[0] as Player
            player.gameMode = GameMode.CREATIVE
            sender.sendMessage("Gamemode set to ${ChatColor.UNDERLINE}${player.gameMode.name}${ChatColor.RESET}.")
        })
}
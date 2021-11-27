package art.hirosuke.gamemodealias

import art.hirosuke.gamemodealias.command.CommandAdventure
import art.hirosuke.gamemodealias.command.CommandCreative
import art.hirosuke.gamemodealias.command.CommandGm
import art.hirosuke.gamemodealias.command.CommandSpectator
import art.hirosuke.gamemodealias.command.CommandSurvival
import org.bukkit.plugin.java.JavaPlugin

class GamemodeAlias : JavaPlugin() {

    companion object {
        lateinit var gm: JavaPlugin
    }

    init {
        gm = this
    }

    override fun onEnable() {
        // Plugin startup logic
        CommandGm().register()
        CommandSurvival().register()
        CommandCreative().register()
        CommandAdventure().register()
        CommandSpectator().register()
        logger.info("plugin has loaded.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("plugin has unloaded.")
    }
}

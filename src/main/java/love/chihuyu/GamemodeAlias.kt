package love.chihuyu

import love.chihuyu.commands.CommandAdventure
import love.chihuyu.commands.CommandCreative
import love.chihuyu.commands.CommandSpectator
import love.chihuyu.commands.CommandSurvival
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin

class GamemodeAlias : JavaPlugin(), Listener {

    companion object {
        lateinit var plugin: JavaPlugin
    }

    init {
        plugin = this
    }

    override fun onEnable() {
        server.pluginManager.registerEvents(this, this)

        CommandSurvival.main.register()
        CommandSurvival.withTarget.register()
        CommandCreative.main.register()
        CommandCreative.withTarget.register()
        CommandAdventure.main.register()
        CommandAdventure.withTarget.register()
        CommandSpectator.main.register()
        CommandSpectator.withTarget.register()
    }
}

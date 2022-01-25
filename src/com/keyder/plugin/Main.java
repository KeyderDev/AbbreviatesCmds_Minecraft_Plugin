package com.keyder.plugin;

import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		
		System.out.println("AbbreviateCmds plugin by Keyder has been correctly started");
		
	}
	@Override
	public void onDisable() {
	
		System.out.println("AbbreviateCmds plugin has been correcty stopped");
		
	}
	


public boolean onCommands(CommandSender sender, Command cmd, String label, String[] args) {
	
	if (cmd.getName().equals("g1")) {
		if (sender instanceof Player) {
			
			Player player = (Player) sender;
			
			player.sendMessage("&etest");
			
			
			
		}else {
			System.out.println("Este comando no puede ser ejecutado en la consola");
		
		
	}
	
	
	   
}
	return false; 

}

}

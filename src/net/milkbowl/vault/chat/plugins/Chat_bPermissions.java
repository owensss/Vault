package net.milkbowl.vault.chat.plugins;

import java.util.logging.Logger;

import org.bukkit.event.Event.Priority;
import org.bukkit.event.Event.Type;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

import net.D3GN.MiracleM4n.mChat.mChatAPI;
import net.milkbowl.vault.Vault;
import net.milkbowl.vault.chat.Chat;

public class Chat_bPermissions extends Chat {
	private static final Logger log = Logger.getLogger("Minecraft");
	private final String name = "bInfo";
	private Vault plugin = null;
	private PluginManager pluginManager = null;
	
	public Chat_bPermissions(Vault plugin) {
		this.plugin = plugin;
		
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getPlayerPrefix(String world, String player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPlayerPrefix(String world, String player, String prefix) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPlayerSuffix(String world, String player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPlayerSuffix(String world, String player, String suffix) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getGroupPrefix(String world, String group) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setGroupPrefix(String world, String group, String prefix) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getGroupSuffix(String world, String group) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setGroupSuffix(String world, String group, String suffix) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPlayerInfoInteger(String world, String player, String node,
			int defaultValue) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPlayerInfoInteger(String world, String player, String node,
			int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getGroupInfoInteger(String world, String group, String node,
			int defaultValue) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setGroupInfoInteger(String world, String group, String node,
			int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getPlayerInfoDouble(String world, String player, String node,
			double defaultValue) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPlayerInfoDouble(String world, String player, String node,
			double value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getGroupInfoDouble(String world, String group, String node,
			double defaultValue) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setGroupInfoDouble(String world, String group, String node,
			double value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getPlayerInfoBoolean(String world, String player,
			String node, boolean defaultValue) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setPlayerInfoBoolean(String world, String player, String node,
			boolean value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getGroupInfoBoolean(String world, String group, String node,
			boolean defaultValue) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setGroupInfoBoolean(String world, String group, String node,
			boolean value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPlayerInfoString(String world, String player, String node,
			String defaultValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPlayerInfoString(String world, String player, String node,
			String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getGroupInfoString(String world, String group, String node,
			String defaultValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setGroupInfoString(String world, String group, String node,
			String value) {
		// TODO Auto-generated method stub
		
	}

}
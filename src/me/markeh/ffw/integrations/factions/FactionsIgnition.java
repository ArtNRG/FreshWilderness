package me.markeh.ffw.integrations.factions;

import org.bukkit.Bukkit;

import me.markeh.ffw.integrations.AbstractEngine;
import me.markeh.ffw.integrations.AbstractIgnition;

public class FactionsIgnition extends AbstractIgnition {

	private static FactionsIgnition i = new FactionsIgnition();
	public static FactionsIgnition get() { return i; }
	
	public FactionsIgnition() {
		this.setPluginName("Factions");
	}
	
	@Override
	public Boolean isEnabled() {
		return Bukkit.getPluginManager().isPluginEnabled("FactionsFramework");
	}

	@Override
	public AbstractEngine getEngine() {
		return null;
	}

}
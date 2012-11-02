package model;

import java.util.LinkedList;

public abstract class Building {
	private LinkedList<Hostage> hostages;
	private int hostageSize;
	private int cost;
	private int defense;
	private int hitPoints;
	
	public Building(){
		hostages = new LinkedList<Hostage>();
		hostageSize = 0;
	}
	
	public boolean dealDamage(Unit unit){
		return true;
	}
	
	public boolean addHostage(Hostage hostage){
		return hostages.add(hostage);
	}
	
	public Hostage removeHostage(Hostage hostage){
		return null;
	}
}

package model;

import java.util.LinkedList;

public class Player {
	private String playerName;
	private LinkedList<Item> items;
	private LinkedList<Unit> units;
	private LinkedList<Hostage> capturedHostages;
	private LinkedList<Building> buildings;
	private int currency;
	
	public Player(String name){
		playerName = name;
		items = new LinkedList<Item>();
		units = new LinkedList<Unit>();
	}
	
	public boolean addItem(Item item){
		items.add(item);
		return true;
	}
	
	public boolean addUnit(Unit unit){
		units.add(unit);
		return true;
	}
	
	public boolean addBuilding(Building building){
		buildings.add(building);
		return true;
	}
	
	public Item removeItem(Item item){
		return null;
	}
	
	public Unit removeUnit(Unit unit){
		return null;
	}
	
	public Building removeBuilding(Building building){
		return null;
	}
}

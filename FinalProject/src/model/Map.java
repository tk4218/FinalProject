package model;

public class Map {
	private String[][] map;
	private int size;
	private String description;
	
	public Map(){
		
	}
	
	public boolean positionUnits(Unit unit, int xCoord, int yCoord){
		return true;
	}
	
	public boolean positionItems(Item item, int xCoord, int yCoord){
		return true;
	}
	
	public boolean positionBuildings(Building building, int xCoord, int yCoord){
		return true;
	}
	
	public Unit removeUnit(Unit unit, int xCoord, int yCoord){
		return null;
	}
	
	public Item removeItem(Item item, int xCoord, int yCoord){
		return null;
	}
	
	public Building removeBuilding(Building building, int xCoord, int yCoord){
		return null;
	}
}

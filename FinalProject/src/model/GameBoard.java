package model;

import java.util.HashMap;

public class GameBoard {
	private Player player;
	private Map map;
	private HashMap<String,Item> items;
	private HashMap<String, Unit> units;
	private HashMap<String, Hostage> hostages;
	private String[][] gameBoard;
	private boolean gameOver;
	
	public GameBoard(Map map, String player){
		this.player = new Player(player);
		this.map = map;
	}
	
	public void addPlayer(String player){
		
	}
	
	public void addMap(Map map){
		
	}
	
	public boolean useItem(Item item){
		return true;
	}
	
	public boolean captureHostage(Hostage hostage){
		return true;
	}
	
}

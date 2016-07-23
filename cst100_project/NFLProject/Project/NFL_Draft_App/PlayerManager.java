

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class PlayerManager {
	
	/**
	 * @param args
	 */
	
	ArrayList<NFLplayer> players = new ArrayList<NFLplayer>();
	
	
	
	

	// Read player data from file. 
	String filename = "PlayerData.csv";
	File file = new File(filename);{
	try {
		Scanner inputStream = new Scanner (file);
		while (inputStream.hasNextLine()){
			String data = inputStream.next();
			String[] players = data.split(",");
			System.out.println(data);
		}
		inputStream.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
	
	

	public void CreatePlayers(String[] args) { }
	
		// TODO use an ArrayList to manage and create players
	
				// Constructor
		/** Create a Player object */
		public PlayerManager(String NFLplayer) {
		}
		

		// Methods
		/** Add a Player to the list */
		public void loadPlayers(Collection<? extends NFLplayer> player) {
			players.addAll(player);
		}

		/** Return Players in an array */
		public String[] getPlayers() {
			String[] a = new String[players.size()];
			return players.toArray(a);
		}

		/** Return number of players */
		public int getAvailable() {
			return players.size();
		}

		/** Return NFLPlayer name 
		 * @param fullName */
		public String getPlayerName(String fullName) {
			return fullName;
		}

		/** Drop a Player */
		public void dropPlayer(String player) {
			players.remove(player);
		}
		
		


		
		}

		


	
		
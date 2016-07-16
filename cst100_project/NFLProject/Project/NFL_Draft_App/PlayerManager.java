import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayerManager {

	/**
	 * @param args
	 */
	public void main(String[] args) { }
	
		// TODO use an ArrayList to manage and create players
		
		//data fields
		private String NFLplayer;
		private ArrayList<String> players;

		// Constructor
		/** Create a Player object */
		public PlayerManager(String NFLplayer) {
			this.NFLplayer = NFLplayer;
			players = new ArrayList<String>();
		}

		// Methods
		/** Add a Player to the list */
		public void loadPlayers(String player) {
			players.add(player);
		}

		/** Return Players in an array */
		public String[] getPlayers() {
			String[] a = new String[players.size()];
			return players.toArray(a);
		}

		/** Return number of players */
		public int getNumberOfPlayers() {
			return players.size();
		}

		/** Return NFLPlayer name */
		public String getPlayerName() {
			return NFLplayer;
		}

		/** Drop a Player */
		public void dropPlayer(String player) {
			players.remove(player);
		}
}
	
		
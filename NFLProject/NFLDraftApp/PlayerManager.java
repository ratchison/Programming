import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Ryan
 *
 */
public class PlayerManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
		public ArrayList<NFLPlayer> listofPlayers;
		
		public PlayerManager() 
		{
			this.listofPlayers = new ArrayList<NFLPlayer>();
			this.CreatePlayers();
		}
		private void CreatePlayers() 
		{
			for (int i = 0; i < 10; i++) 
			{
				NFLPlayer playerNew = new NFLPlayer();
				
				this.listofPlayers.add(playerNew);
			}
	}

}

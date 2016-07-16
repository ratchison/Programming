
public abstract class NFLplayer implements Celebrator{

	/**
	 * @param args
	 */ 
	
	private String firstName; // Index 0
	private String lastName; // Index 1
	private String fullName; // Index 2
	private String height; // Index 3
	private String weight; // Index 4
	private int age; // Index 5
	private String college; // Index 6
	private String experience; // Index 7
	private int touchdowns; // Index 8
	private int yards; // Index 9
	private double rating; // Index 10
	private int totalGames; // Index 11
	private double averagePerGame; // Index 12
	private boolean isSelected; // Index 13
	private String playerPosition; // Index 14
	
	public static void main(String[] args) {	
		
		// TODO Auto-generated method stub
		// 1. Variables
		// 2. Getters and Setters
		// 3. Convert to Abstract class to use inheritance
		//		Create child classes. 
	}
	// Name Information
	public String getFirstName() {return firstName;	}

	public void setFirstName(String firstName) {this.firstName = firstName;	}

	public String getLastName() {return lastName;}

	public void setLastName(String lastName) {this.lastName = lastName;	}
	
	public String getFullName(String firstName, String lastName) {return fullName; }

	public void setFullName(String fullName) {this.fullName = fullName;	}
	// Player Attributes and Experience
	public String getHeight() {	return height;	}

	public void setHeight(String height) {this.height = height;	}

	public String getWeight() {return weight;	}

	public void setWeight(String weight) {this.weight = weight; }

	public int getAge() {return age; }

	public void setAge(int age) {this.age = age; }

	public String getCollege() {return college;}

	public void setCollege(String college) {this.college = college;	}

	public String getExperience() {	return experience; }

	public void setExperience(String experience) {this.experience = experience;	}
	// Player Statistics
	public int getTouchdowns() {return touchdowns;	}

	public void setTouchdowns(int touchdowns) {this.touchdowns = touchdowns; }

	public int getYards() {return yards; }

	public void setYards(int yards) {this.yards = yards;}

	public double getRating() {return rating;}

	public void setRating(double rating) {this.rating = rating;}

	public int getTotalGames() {return totalGames;}

	public void setTotalGames(int totalGames) {this.totalGames = totalGames;}

	public double getAveragePerGame() {
		return averagePerGame;}

	public void setAveragePerGame(double averagePerGame) {this.averagePerGame = averagePerGame;}
	// Player Status
	public boolean isSelected() {return isSelected;}

	public void setSelected(boolean isSelected) {this.isSelected = isSelected;}

	public String getPlayerPosition() {return playerPosition;}

	public void setPlayerPosition(String playerPosition) {this.playerPosition = playerPosition;}
	
	// Set Subclasses Offensive and Defensive
	public abstract String getPosition();
	
	
}

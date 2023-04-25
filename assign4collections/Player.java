package assign4collections;

public class Player implements Comparable<Player> {
	
	String playerName; 
	int total_run ,no_of_wicket,no_of_matches,no_of_century; 
	String country;  
	char Category = ' ';
	
	public Player(String playerName, int total_run, int no_of_wicket, int no_of_matches, int no_of_century,
			String country, char category) {
		
		this.playerName = playerName;
		this.total_run = total_run;
		this.no_of_wicket = no_of_wicket;
		this.no_of_matches = no_of_matches;
		this.no_of_century = no_of_century;
		this.country = country;
		Category = category;
	}

	public String toString() {
		return "Player Name : " + playerName + " Total Runs : " + total_run + " No of Wickets : " + no_of_wicket
				+ " No of Matches : " + no_of_matches + " No of Century " + no_of_century + " Country : " + country
				+ " Category : " + Category ;
	}

	public int compareTo(Player p) {
			
//		if(this.total_run>p.total_run) {
//			return 1; 
//		}else if(this.total_run<p.total_run) {
//			return -1;
//		}
//		else
//			return 0;
//		
		return (this.total_run>=p.total_run)? -1:1;
		
		
		
	}

	
	


}

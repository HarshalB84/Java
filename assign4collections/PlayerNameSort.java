package assign4collections;

import java.util.Comparator;

public class PlayerNameSort implements Comparator<Player>{

	public int compare(Player p1, Player p2) {
		return p1.playerName.compareTo(p2.playerName);
	}

}

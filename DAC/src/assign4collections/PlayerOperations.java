package assign4collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PlayerOperations {

	public void maxRuns(ArrayList<Player> list ) {
		
		
		
		
		
	
	}
	
	public void sortByName(ArrayList<Player> list) {
		
		System.out.println("Before Sorting : ");
		System.out.println(list);
		System.out.println("After Sorting ");
		
		Collections.sort(list, new PlayerNameSort());
		for(Player p : list) {
			System.out.println(p.playerName);
		}
	
	}
	
	public void removePlayer(ArrayList<Player> list) {
		
		Iterator<Player> itr = list.iterator();
		while(itr.hasNext()) {
			Player p =itr.next();
			if(p.total_run<5000) {
				itr.remove();
			}
		}
		
	}
	
	public void updateCategory(ArrayList<Player> list) {
		
		for(Player p : list) {
			if(p.no_of_century>10) {
				p.Category='A';
			}else {
				p.Category='B';
			}
		}
		
	}
	
	
}
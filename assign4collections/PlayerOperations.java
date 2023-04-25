package assign4collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class PlayerOperations {

	public void maxRuns(ArrayList<Player> list ) {
		
		Player p1=list.get(0);
		System.out.println(p1.Category+ " "+p1.country+ " "+p1.no_of_century+" "+ p1.no_of_matches+ " "+p1.no_of_wicket+" "+p1.playerName+" "+p1.total_run);
		
		
	
	
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
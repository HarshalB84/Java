package assign4collections;

import java.util.ArrayList;

import java.util.Collections;

public class PlayerMain {

	public static void main(String[] args) {

		ArrayList<Player> al = new ArrayList<>();
		
		PlayerOperations pop = new PlayerOperations();
		
		Player p1 = new Player("Virat", 12500, 5, 25, 15, "India", ' ');
		Player p2 = new Player("Jadeja", 4500, 75, 25, 5, "India", ' ');
		Player p3 = new Player("Maxwell", 9500, 10, 37, 8, "Australia", ' ');
		Player p4 = new Player("Ben Stokes", 7045, 18, 45, 11, "England", ' ');
		Player p5 = new Player("Jason Holder", 8450, 41, 18, 3, "West Indies", ' ');
//		al.addAll(Arrays.asList(p1,p2,p3,p4,p5));
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		
		System.out.println(al);
		
	//	pop.maxRuns(al);
	//	pop.sortByName(al);
		System.out.println("-----------------------------------------");
	//	pop.removePlayer(al);
	//	pop.updateCategory(al);
		Collections.sort(al);
		pop.maxRuns(al);
		System.out.println(al);
		
		
	}

}

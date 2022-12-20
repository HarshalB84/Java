package arraycontainment;

import java.util.Scanner;



public class MovieTheaterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Theater thea[] = new Theater[2];
		
		for(int i=0;i<thea.length;i++) {
			System.out.println("Enter the Theater id and Theater name : ");
			int tid=sc.nextInt();
			String tname=sc.next();
			Movie mov[]= new Movie[2];
			for(int j=0;j<mov.length;j++) {
			System.out.println("Enter the id, movie name and release year : ");
			int id=sc.nextInt();
			String name=sc.next();
			int release_year=sc.nextInt();
			
			Movie m = new Movie();
			m.setId(id);
			m.setName(name);
			m.setRelease_year(release_year);
			
			mov[j]=m;
			
			}
			Theater t = new Theater();
			t.setId(tid);
			t.setName(tname);
			t.setMovie(mov);
			
			thea[i]=t;
			
		}
		
		for(Theater t: thea ) {
			System.out.println(t);
		}
		
		sc.close();
	}

}

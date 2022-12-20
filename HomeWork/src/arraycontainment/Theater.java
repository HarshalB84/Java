package arraycontainment;

import java.util.Arrays;

public class Theater {

	int id;
	String name;
	Movie movie[];
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Movie[] getMovie() {
		return movie;
	}
	public void setMovie(Movie[] movie) {
		this.movie = movie;
	}
	
	
	public String toString() {
		return id+" "+name+" "+Arrays.toString(movie)+"\n ";
	}
	
}

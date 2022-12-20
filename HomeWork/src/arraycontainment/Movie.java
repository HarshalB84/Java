package arraycontainment;

public class Movie {

	private int id,release_year;
	private String name;
	Movie(){};
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRelease_year() {
		return release_year;
	}
	public void setRelease_year(int release_year) {
		this.release_year = release_year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public String toString() {
		return id+" "+name+" "+release_year;
	}
	
	
}

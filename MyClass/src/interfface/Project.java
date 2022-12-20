package interfface;

public interface Project {

	String cname = "Infosys";
	
	void requirements(); 
	void palanning(); 
	void design();
	void development();
	void testing();
	void deployment();
	void maintainence();
	
	default void feedback() {
		
	}
	
	static void methods() {
		
	}
	
	private void map() {
		
	}
	
}

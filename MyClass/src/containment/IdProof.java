package containment;

public class IdProof {

	int number;
	String name,address;
	
	IdProof(int number,String name,String address){
		this.number=number;
		this.name=name;
		this.address=address;
	}
	
	public String toString() {
		return number+" "+name+" "+address;
	}
	
}

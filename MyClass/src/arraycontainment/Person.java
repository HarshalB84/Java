package arraycontainment;

import java.util.Arrays;

public class Person {

	private int id;
	private String name,address;
	IdProof idProof[];
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public IdProof[] getIdProof() {
		return idProof;
	}
	public void setIdProof(IdProof[] idProof) {
		this.idProof = idProof;
	}
	
	public String toString() {
		return name+" "+address+" "+Arrays.toString(idProof)+" \n";
	}
	
}

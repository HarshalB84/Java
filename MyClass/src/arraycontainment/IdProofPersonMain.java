package arraycontainment;

import java.util.Scanner;

public class IdProofPersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Person per[]= new Person[3];
		
		for(int i=0;i<per.length;i++) {
			System.out.println("Enter the id,name and address : ");
			int pid=sc.nextInt();
			String pname=sc.next();
			String paddress=sc.next();
			IdProof idP[]= new IdProof[3];
			for(int j=0;j<idP.length;j++) {
				System.out.println("Enter the id name and validity : ");
				String iname=sc.next();
				int ivalidity=sc.nextInt();
				
				IdProof id = new IdProof();
				id.setName(iname);
				id.setValidity(ivalidity);
				idP[j]=id;
				
			}
			
			Person p = new Person();
			p.setId(pid);
			p.setName(pname);
			p.setAddress(paddress);
			p.setIdProof(idP);
			
			per[i]=p;
			
		}
		
		for(Person p : per) {
			for(IdProof id : p.getIdProof()) {
				if(id.getName().equalsIgnoreCase("PanCard")) {
					System.out.println(p.getName()+" "+p.getAddress()+" "+id.getName());
				}
			}
		}
		
		

		sc.close();
	}

}

package arraycontainment;

import java.util.Scanner;

public class CompanyDepartmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Company comp[]= new Company[2];
		
		for(int i=0;i<comp.length;i++) {
			Department dep[] = new Department[3];
			System.out.println("Enter the company id,name : ");
			int cid=sc.nextInt();
			String cname=sc.next();
			System.out.println("Enter department details : ");
			for(int j=0;j<dep.length;j++) {
				System.out.println("Enter the dept id,name,no of employees : ");
				int did=sc.nextInt();
				String dname=sc.next();
				int empNo=sc.nextInt();
				
				Department d = new Department();
				d.setId(did);
				d.setName(dname);
				d.setEmpNo(empNo);
				
				dep[j]=d;
				
			}
			
			Company c = new Company();
			c.setId(cid);
			c.setName(cname);
			c.setDept(dep);
			
			comp[i]=c;
			
		}
		
		for(Company c : comp ) {
			System.out.println(c);
		}
		

		sc.close();
	}

}

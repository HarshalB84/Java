package arraycontainment;

import java.util.Scanner;

public class CompanyDepartmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Company comp[]= new Company[2];
		
		
		/* 
		Department dep[] = new Department[3];
		dep[0]=new Department(100,"HR",25);
		dep[1]=new Department(101,"Sales",75);
		dep[2]=new Department(102,"Marketing",52);
		
		Company c1 = new Company(101,"Infosys",dep);
		System.out.println(c1);
		*/
		
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
				dep[j]=new Department(did,dname,empNo);
				
			}
			
			comp[i]= new Company(cid,cname,dep);
			
			
		}
		for(Company c : comp) {
			System.out.println(c);
		}
		
		sc.close();
	}

}

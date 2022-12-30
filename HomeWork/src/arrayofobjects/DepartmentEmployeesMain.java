package arrayofobjects;

import java.util.Scanner;

public class DepartmentEmployeesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Employees emp[] = new Employees[2];
		
		for(int i=0;i<emp.length;i++) {
			System.out.println("Enter employee id,name and salary : ");
			int cid=sc.nextInt();
			String cname=sc.next();
			int csalary=sc.nextInt();
			Department dep[]= new Department[2];
			for(int j=0;j<dep.length;j++) {
				System.out.println("Enter department id and name : ");
				int did=sc.nextInt();
				String dname=sc.next();
				dep[j]=new Department(did,dname);
				
			}
			emp[i]= new Employees(cid,cname,csalary,dep);
		}
		
		for(Employees e : emp) {
			
			for(Department d : e.dept) {
				if(d.name=="HR") {
					System.out.println(e);
				}
			}
		
		}
		
		sc.close();
	}

}

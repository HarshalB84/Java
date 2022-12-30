package variable;

public class VariableArgument {
	
	void add(String name,float...marks) {
		float sum=0;
		System.out.println(name);
		for(int i=0;i<marks.length;i++) {
			sum+=marks[i];
		}
		System.out.println("Percent : "+(sum/marks.length));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VariableArgument v = new VariableArgument();
		
		v.add("Harshal", 87.2f,89,74.5f,92);
	
		
	}
	
}

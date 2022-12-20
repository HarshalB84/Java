package inheritance;

public class DateTimeMain {

	public static void main(String[] args) {
		

		MyTime mt = new MyTime();
		
		mt.setDd(28);
		mt.setMm(11);
		mt.setYy(2022);
		
		mt.setHh(11);
		mt.setMmm(26);
		mt.setSs(50);
		
		System.out.println(mt.getDd()+"/"+mt.getMm()+"/"+mt.getYy()+" \n"+mt.getHh()+":"+mt.getMmm()+":"+mt.getSs());
		
	}

}

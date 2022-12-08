package interfce;

public class MobileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhone s = new SmartPhone();
		
		System.out.println("Smart Phone Features : ");
		s.battery();
		s.calander();
		s.calculator();
		s.calling();
		s.chargerType();
		s.chargr();
		s.earphone();
		s.fM();
		s.keypad();
		s.messaging();
		s.ram();
		
		NormalMobile n = new NormalMobile();
		
		System.out.println("Normal Mobile Phone Features : ");
		n.battery();
		n.calander();
		n.calculator();
		n.calling();
		n.chargerType();
		n.earphone();
		n.fM();
		n.keypad();
		n.messaging();
		n.ram();
		
		
		
		
		
		
		
		
	}

}

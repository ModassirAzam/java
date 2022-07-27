package package_modassir;

class phone{
	public void  Ringing(){
		System.out.println("Ringing....");
	}
	public void  Vibrating(){
		System.out.println("Vibrating...");
	}
}
public class CellPhoneClass {
	public static void main(String[] args) {
		phone Oppo = new phone();
		phone Redmi = new phone();
		Oppo.Ringing();
		Oppo.Vibrating();
		
		Redmi.Ringing();
		Redmi.Vibrating();
	}
}

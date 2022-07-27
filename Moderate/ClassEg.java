package package_modassir;


class mobile{
	 int color;
	 String model;
	int price;
	String remark;
	double ScreenSize;
	
	
public void details() {
	System.out.println("Model is:"+model);
	System.out.println("Price is:"+price);
	System.out.println("Remark is :"+remark);
	System.out.println("Screensize is :"+ScreenSize);
}	
  public int color() {
	return color;
  }	

}

public class ClassEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mobile samsung =new mobile();
		mobile vivo =new mobile();
		samsung.model= "Samsung galaxy M30";
		samsung.price= 11000;
		samsung.remark="good";
		samsung.ScreenSize=5.5;
		samsung.color=1;
		
		
	
		vivo.model= "Vivo S1";
		vivo.price= 20000;
		vivo.remark="Excellent";
		vivo.ScreenSize=5.7;
		vivo.color=5;
		
		vivo.details();
		samsung.details();
		int colo=samsung.color;
		int coloo=vivo.color;
		 System.out.println("Color is :"+colo);
		 System.out.println("Color is :"+coloo);
		
	}
}

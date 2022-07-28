package package_modassir;

class circle{
	int radius;
	
	public double area() {
		return 3.14*radius;
	}
	public double circumference() {
		return 2*3.14*radius*radius;
	}
}
public class AreaUsingClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle cir = new circle();
		
		
		cir.radius=3;
		
		System.out.println("Area : "+cir.area());
		System.out.println("Circumference : "+cir.circumference());
		

	}

}

package package_modassir;

class rectangle{
	int length,breadth;
	
	public int area() {
		return length*breadth;
	}
	public int perimeter() {
		return 2*(length+breadth);
	}
}

public class AreaUsingClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle ar = new rectangle();
		ar.length=3;
		ar.breadth=2;
		
		System.out.println("The area of desired rectangle :" +ar.area());
		System.out.println("The perimeter of desired rectangle :"+ar.perimeter());
		

	}

}

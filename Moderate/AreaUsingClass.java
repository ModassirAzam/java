package package_modassir;

class square{
	int side;
	public int area() {
		return side*side;
	}
	public int perimeter() {
		return 4*side;
	}
}

public class AreaUsingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square sq = new square();
		sq.side=9;
		System.out.println(sq.area());
		System.out.println(sq.perimeter());
	}

}

package package_modassir;
import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double area;
		System.out.println("Enter the radius of circle : ");
		int radius = s.nextInt();
		area=3.14*radius*radius;
		System.out.println("The area of circle = : "+area);

	}

}

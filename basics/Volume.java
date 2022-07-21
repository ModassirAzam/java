package packege_modassir;
import java.util.Scanner;

public class Volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of cuboid");
		int length = s.nextInt();
		System.out.println("Enter the breadth of cuboid");
		int breadth = s.nextInt();
		System.out.println("Enter the height of cuboid");
		int height = s.nextInt();
		int volume = length*breadth*height;
		System.out.println("The volume of given cuboid is :"+volume);

	}

}

package package_modassir;
import java.util.Scanner;

public class MarksToPercent {

	public static void main(String[] args) {
		// All marks are given out to 100
		float per;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the marks scored in science : ");
		float sci = s.nextFloat();
		System.out.println("Enter the marks scored in maths : ");
		float mat = s.nextFloat();
		System.out.println("Enter the marks scored in sst : ");
		float sst = s.nextFloat();
		System.out.println("Enter the marks scored in computer : ");
		float com = s.nextFloat();
		System.out.println("Enter the marks scored in english : ");
		float eng = s.nextFloat();
		per = (sci+mat+sst+com+eng)/500*100;
		System.out.println("The marks of all subjects in percentage is : "+per);
		

	}

}

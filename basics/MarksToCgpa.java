package package_modassir;

import java.util.Scanner;

public class MarksToCgpa {
	public static void main(String[] args) {
		// All marks are given out to 100
		double cgpa;
		float sum;
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
		sum = (sci+mat+sst+com+eng)/500;
		cgpa = sum*9.5;
		System.out.println("The marks of all subjects in CGPA is: "+cgpa);
		

	}

}

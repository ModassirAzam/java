package packege_modassir;

import java.util.Scanner;

public class Circumference {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float pi = 3.14f;
		// TODO Auto-generated method stub
		System.out.println("Enter the value of radius : ");
		int radius = s.nextInt();
		float circumference = 2* pi * radius ;
		System.out.println(" The circumference of desired circle is  : "+circumference);
		
		
		

	}

}

package package_modassir;

//import java.util.Scanner;

public class MultiplicationTable {
	
	static void table(int n) {
		for(int i=1;i<=10;i++) {
			System.out.format("%d * %d = %d\n ",n ,i , n*i);
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the value of n");
		//int a= sc.nextInt();
		//System.out.println(4);
		table(2);
	}

}

package package_modassir;
import java.util.Scanner;


public class Head{
public class Exception2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        try {
        	
        	c=a/b;
        	System.out.println(c);
        }
        catch(ArithmeticException e){
        	System.out.println(e);
        }

	}

}
}
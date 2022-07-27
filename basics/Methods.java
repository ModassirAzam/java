package package_modassir;

public class Methods {
	
	public int logic2(int a, int b) {
		int c;
		c=a+b;
		System.out.println(c);
		return c;
	}
	
	public int logic(int a, int b) {
		int x=0;
		if(a>b) {
			x=a+b;
			System.out.println("the output is"+x);
		}
		else if(a==b) {
			System.out.println("Both are same lol");
		}
		else {
			x=a-b;
			System.out.println("The second output is " +x);
		}
		
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods l=new Methods();
		Methods n=new Methods();
		int m=l.logic(7,7);
		int p=n.logic2(1,1);
	}

}

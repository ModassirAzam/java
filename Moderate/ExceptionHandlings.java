package package_modassir;

public class ExceptionHandlings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int a = 5/0;  //---->ArithematicException
		System.out.println(a);
		
		int arr[]=new int[5]; //-->IndexOutofBoundException
		arr[6]=12;
		System.out.println(arr[6]);
		
	    String b= null; //----->NullPointerException
		System.out.println("The length is "+b.length());
		
		}
	catch(Exception e) {
		System.out.println(e);
		
	}	
	   	}	

			}

package package_modassir;

public class StringMethods {
	
	public static void main(String[] args) {
		String name=new String();
		name="Mod ass  ir";
		System.out.println(name.length()); 
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name.replace("M", "n"));
		
		System.out.println(name.indexOf(" "));
		System.out.println(name.indexOf("   "));
	}
}

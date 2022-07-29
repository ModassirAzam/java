package package_modassir;

class employee{
	String name;
	int id;
	int salary;
	
public employee(String myName, int myId){
	name=myName;
	id=myId;
}	
public employee(int mySalary){
	salary=mySalary;
	
}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
}
public class Constructor2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee Modassir=new employee("Azam",3);
		employee Yawar=new employee(300000);
		System.out.println("Name:"+Modassir.getName());
		System.out.println("Id :"+Modassir.getId());
		System.out.println("Salary of yawar:"+Yawar.getSalary());
	}
}

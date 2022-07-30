package package_modassir;

class animal{
	String animal_name;
	String animal_sound;
	//String animal_color;
	//String animal_breed;
	//int animal_price;
	public String getAnimal_name() {
		return animal_name;
	}
	public void setAnimal_name(String animal_name) {
		this.animal_name = animal_name;
	}
	public String getAnimal_sound() {
		return animal_sound;
	}
	public void setAnimal_sound(String animal_sound) {
		this.animal_sound = animal_sound;
	}
	//public String getAnimal_color() {
		//return animal_color;
	//}
	//public void setAnimal_color(String animal_color) {
		//this.animal_color = animal_color;
	//}
	//public String getAnimal_breed() {
		//return animal_breed;
	//}
	//public void setAnimal_breed(String animal_breed) {
		//this.animal_breed = animal_breed;
	//}
	//public int getAnimal_price() {
		//return animal_price;
	//}
	//public void setAnimal_price(int animal_price) {
		//this.animal_price = animal_price;
	//}
}

class dog extends animal{
	int animal_limbs;

	public int getAnimal_limbs() {
		return animal_limbs;
	}

	public void setAnimal_limbs(int animal_limbs) {
		this.animal_limbs = animal_limbs;
	}
}
public class Inheritance1 {
	public static void main(String[] args) {
		animal a=new animal();
		a.setAnimal_name("dog");
		a.setAnimal_sound("bark");
		System.out.println(a.getAnimal_name());
		System.out.println(a.getAnimal_sound());
		
		
		
	dog d=new dog();
	d.setAnimal_limbs(4);
	System.out.println(d.getAnimal_limbs());
	System.out.println(a.getAnimal_name());	
	System.out.println(a.getAnimal_sound());	
}
  }
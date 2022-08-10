package package_modassir;

class circle2{
	int radius;
	circle2(int r){
		this.radius=r;
		System.out.println("i am a circle paramaterised constructor");
	}
	
	public double area() {
		return Math.PI*this.radius*this.radius;
	}
}
class cylinder extends circle2{
	public int height;
	cylinder(int r,int h){
		super(r);
		this.height=h;
		System.out.println("i am a cylinder paramaterised constructor");
		
	}
	public double volume() {
		return Math.PI*this.radius*this.radius*height;
	}
}

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cylinder obj=new cylinder(3,5);
		//circle2 obj=new circle2(3);
	}

}

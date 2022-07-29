package package_modassir;

class cylinder{
	private int radius;
	private int height;
	
	public int getRadius(){
	 return radius;
			}
	public void setRadius(int r) {
	 System.out.println("Radius :"+r);
	
	}
	public int getHeight() {
	 return height;
	}
	public void setHeight(int h) {
	 System.out.println("Height :"+h);
	}
	
}

public class PropOfCylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cylinder cy=new cylinder();
		cy.setRadius(3);
		cy.setHeight(5);
		//System.out.println("Radius :"+cy.getRadius());
		//System.out.println("Height :"+cy.getHeight());
	}

}

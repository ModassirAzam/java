package package_modassir;

class cube{
	private int edge;
	
	public int volume() {
		return getEdge()*getEdge()*getEdge();
	}

	public int getEdge() {
		return edge;
	}

	public void setEdge(int edge) {
		this.edge = edge;
	}
	
	
}

public class AccessModifierEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cube c1=new cube();
		c1.setEdge(14);
		//c1.volume();
		System.out.println(c1.volume());
	}

}

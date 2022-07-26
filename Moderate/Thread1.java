package package_modassir;
import java.lang.Thread;

public class Thread1 extends Thread {
	@Override
	public void run(){
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(200);
			}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
			System.out.println(i);
		}
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1= new Thread1();
		Thread1 t2= new Thread1();
		Thread1 t3= new Thread1();
		
		t1.start();
		t2.start();
		t3.start();
	}

}

package package_modassir;

public class Thread2 {
	void display(int num) {
		for(int i=0;i<=100;i++) {
			System.out.println(num*i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {}
		}
	}
	
}

class MyThread1 extends Thread{
	Thread2 p;
	MyThread1(Thread2 p){
		p.display(5);
	}
	
}
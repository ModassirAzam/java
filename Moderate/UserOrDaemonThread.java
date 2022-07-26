package package_modassir;



public class UserOrDaemonThread extends Thread {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserOrDaemonThread t1=new UserOrDaemonThread();
		UserOrDaemonThread t2=new UserOrDaemonThread();
		t2.setDaemon(true);
		t1.start();
		System.out.println(t1.getName()+" "+t1.isDaemon());
		System.out.println(t2.getName());
	}
	public void run() {
		System.out.println("User or Daemon");
	}
	

}

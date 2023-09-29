package JavaDeepDive;

public class ThreadByExtending extends Thread{
	@Override
	public void run() {
		
		System.out.println("Extending Thread by creating thread");
	}

	public static void main(String[] args) {
		
		ThreadByExtending Obj = new ThreadByExtending();
		Obj.start();
	}

}

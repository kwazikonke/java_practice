package JavaDeepDive;

public class ThreadByImplementing implements Runnable{
	@Override
	public void run() {
		
		System.out.println("Creating thread by implementing runnable interface");
	}
	
	
	public static void main(String[] args) {
		ThreadByImplementing Obj = new ThreadByImplementing();
		Thread threadObj = new Thread(Obj);
		threadObj.start();

	}

	

}

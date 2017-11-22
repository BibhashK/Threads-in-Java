
public class GameThread extends Thread {
	
	String name;
	
	
	public GameThread(String threadName){
		
		this.name = threadName;
		
	}
	
	public void run(){
		
		System.out.println("Thread 1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GameThread g1 = new GameThread("Thread1");
		GameThread g2 = new GameThread("Thread2");
		
		Thread t1 = new Thread(g1); 
		Thread t2 = new Thread(g2);
		
		t1.setPriority(Thread.MIN_PRIORITY); 
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		
	}

}

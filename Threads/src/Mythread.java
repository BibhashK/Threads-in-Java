
public class Mythread implements Runnable {
	
	
	public void run() {
		
		for(int i=0;i<10;i++){
			
			System.out.println("MyThread: " + i);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mythread fit = new Mythread();
		
		Thread t = new Thread(fit);
		
		t.start();
		
			for(int i = 0;i<100;i++){
				
				System.out.println("MainThread: " + i);
			}
	}

	

}

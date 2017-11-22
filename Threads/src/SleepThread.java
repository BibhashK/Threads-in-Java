
public class SleepThread implements Runnable{
	
	
	
	public void run() {
		
		try{
			
			for(int i=5;i>0;i--){
				
				System.out.println("Child Thread: " + 1);
				Thread.sleep(100);
			}
		}catch(InterruptedException e){
			System.out.println("Child Interuppted");
		}
		System.out.println("Exiting child Thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SleepThread fit = new SleepThread();
		
		Thread t =new Thread(fit);
		
		t.start();
		
				try{
					for(int i = 5;i>0;i--){
						
						System.out.println("Main thread: " + i);
						Thread.sleep(200);
					}
				}catch(InterruptedException e){
					System.out.println("main thread exiting");
				}
	}

	

}

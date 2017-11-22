
public class ThreadSyc extends Thread {

			public synchronized void run(){
				
				System.out.print("[");
				System.out.println(Thread.currentThread().getName());
				
				try{
					Thread.sleep(1000);
				}catch(Exception e){}
				
				System.out.println("]");
									
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ThreadSyc fit = new ThreadSyc();
			Thread  t1 = new Thread(fit);
			Thread  t2 = new Thread(fit);
			Thread  t3 = new Thread(fit);
			t1.start();
			t2.start();
			t3.start();
			
			
	}

}

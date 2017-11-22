
public class ThreadSync implements Runnable{
	
	
	
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public synchronized void run(String name ){
		
		
		System.out.println("current thread name: " + Thread.currentThread().getName());
		
	
	try {
		
		Thread.sleep(1000);
	}catch(Exception e){}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadSync r = new ThreadSync();
		r.run("hello");
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		Thread t3=new Thread(r);
		
		t1.start();
		t2.start();
		t3.start();
	}

	

}

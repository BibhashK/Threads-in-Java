
public class Prior extends Thread{
	
	public void run(){
		
		for(int i=0;i<3;i++){
			
			System.out.println(Thread.currentThread().getPriority()+ " "+ i);
			
			try{
				Thread.sleep(10);
			}catch(Exception e){
				
				e.printStackTrace();
			}
			System.out.println("End of current Thread " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prior fit = new Prior();
		
		Thread t1 = new Thread(fit) ; t1.setPriority(3);
		Thread t2 = new Thread(fit);  t2.setPriority(5);
		Thread t3 = new Thread(fit);  t3.setPriority(1);
		t1.start();
		t2.start();
		t3.start();
	}

}

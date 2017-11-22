
public class PrintNumbersThread extends Thread  {
	
	String name;
	
	public PrintNumbersThread(String threadName){
		
		name = threadName;
	}
	
	public void run(){
		
		for(int i=0;i<=10;i++){
			
			System.out.println("name:" + i);
		}
		
		try{
			Thread.sleep(500);
		}catch(InterruptedException e){
			
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintNumbersThread t1 = new PrintNumbersThread("thread 1");
		
		PrintNumbersThread t2 = new PrintNumbersThread("thread 2");
		
		t1.start();
		t2.start();
	}

}

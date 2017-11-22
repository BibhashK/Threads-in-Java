
public class Myclass extends Thread{
	
	
	public void run(){
		
		for(int i =5;i>0;i--){
			
			System.out.println("Thread: " + i);
		}
	}

	public static void main(String[] args) {
		
		Myclass obj = new Myclass();
		
		//Thread t = new Thread(obj);
		
		obj.start();

	}

}

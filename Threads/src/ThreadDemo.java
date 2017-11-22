
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloThread fit = new HelloThread();
		
		fit.run("lets run, run method");
		
		Thread t = new Thread(fit);
		
		t.start();
	}

}

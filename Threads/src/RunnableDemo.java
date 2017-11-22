
public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 RunnableThread fit = new RunnableThread();
		 fit.run(52);
		Thread t = new Thread(fit);
		
		t.start();
	}

}

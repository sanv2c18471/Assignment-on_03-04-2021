package demo18;

public class Test1 {
public static void main(String[] args) {
	Runnable r = () ->{
		System.out.println("Child thread is running");
	};
	Thread t = new Thread(r);
	t.start();
	
		try {
			t.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	System.out.println("Main thread is running");
}
}

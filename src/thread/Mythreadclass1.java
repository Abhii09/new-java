package thread;

public class Mythreadclass1 extends Thread {
	
	public void run() {

		for(int i=0;i<10;i++) {
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

}

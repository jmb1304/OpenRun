package userInterface;

public class UpdateTimer implements Runnable {
	private Thread t;

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HomeScreen.clock.setText("Loading...");
		while(true){
		String time = timer.Timer.getTime();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HomeScreen.clock.setText(time);
		}
		
	}
	public void start ()
	   {
	      if (t == null)
	      {
	         t = new Thread (this, "timerUpdate");
	         t.start ();
	      }
	   }

}

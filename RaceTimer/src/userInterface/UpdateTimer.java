package userInterface;

public class UpdateTimer implements Runnable {
	private Thread t;

	@Override
	public void run() {
		while(true){
		String time = timer.Timer.getTime();
		userInterface.HomeScreen.clock.setText("Hello World");
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

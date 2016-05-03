package main;

import userInterface.HomeScreen;
import userInterface.UpdateTimer;

public class Main {

	public static void main(String[] args) {
		HomeScreen.main(args);
		UpdateTimer timerThread = new UpdateTimer();
		timerThread.start();
		

	}

}

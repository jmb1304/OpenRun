package userInterface;

import timer.Timer;

public class HomeScreenActions {
	public static void start() {
		Timer.startTimer();
	}
	
    public static void stop() {
    	Timer.stopTimer();
	}
    public static void recordTime(){
    	if (timer.Timer.getTimerRunning()){
    		RecordUI.main(null);
    	}
    	else{
    		Utils.infoBox("The timer is not running! Cannot record time.", "Alert");
    	}
    	
    }

}

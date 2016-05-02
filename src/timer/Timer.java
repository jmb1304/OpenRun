package timer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

import userInterface.HomeScreen;


public class Timer {
	static boolean TimerRunning = false;
	static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
	
	static Date start = new Date();
	static Date stop = start;
	public Timer(){
		
	}
	public static String getTime(){
		sdf.setTimeZone(new SimpleTimeZone(SimpleTimeZone.UTC_TIME, "UTC"));
		
		String curTime = "";
		if(TimerRunning == true){
			Date now = new Date();
			curTime = sdf.format(new Date(now.getTime() - start.getTime()));	
		}
		else{
			curTime = sdf.format(new Date(stop.getTime() - start.getTime()));
		}
		return curTime;
		
	}
	
	public static void startTimer(){
		if (TimerRunning){
			return;
		}
		else{
			start = new Date();
			TimerRunning = true;
			HomeScreen.btnStop.setEnabled(true);
			HomeScreen.btnStart.setEnabled(false);
		}
		
	}
	public static void stopTimer(){
		if(TimerRunning){
			stop = new Date();
			TimerRunning = false;
			HomeScreen.btnStop.setText("Reset");
		}
		else{
			start = new Date();
			stop = start;
			HomeScreen.btnStop.setText("Stop");
			HomeScreen.btnStop.setEnabled(false);
			HomeScreen.btnStart.setEnabled(true);
			
			
		}
		
	}

}

package timer;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Timer {
	static boolean TimerRunning = false;
	static SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
	static Date start = new Date();
	static Date stop = new Date();
	public Timer(){
		
	}
	public static String getTime(){
		Date now = new Date();
		String curTime = "";
		if(TimerRunning == true){
			curTime = sdf.format(new Date(now.getTime() - start.getTime()));	
		}
		else{
			curTime = sdf.format(new Date(stop.getTime() - start.getTime()));
		}
		return curTime;
		
	}
	
	public static void startTimer(){
		start = new Date();
		TimerRunning = true;
	}
	public static void stopTimer(){
		stop = new Date();
		TimerRunning = false;
	}

}

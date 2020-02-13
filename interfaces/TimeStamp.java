package baduren.interfaces;

public class TimeStamp {
	protected long time; 
	protected String timeStamper; 
	
	boolean isInitialised() {
		// TODO
		return true; 
	}
	
	long getTime(){
		return this.time; 
	}
	
	void setTime(long time) {
		this.time=time; 
	}
	
	String getTimeStamper(String timeStamper) {
		return this.timeStamper; 
	}
	
	void setTimeStamper(String timeStamper) {
		this.timeStamper = timeStamper; 
	}
}

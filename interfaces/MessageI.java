package baduren.interfaces;

import java.io.Serializable;

public interface MessageI extends java.io.Serializable{
	public String getuRI(); 
	public TimeStamp getTimeStamp(); 
	public Properties getProperties(); 
	public Serializable getPayload(); 
}

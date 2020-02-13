package baduren.interfaces;

public interface Properties extends java.io.Serializable{
	public void putProp(String name, boolean v);
	public void putProp(String name, byte v); 
	public void putProp(String name, char v); 
	public void putProp(String name, double v); 
	public void putProp(String name, float v); 
	public void putProp(String name, int v); 
	public void putProp(String name, long v); 
	public void putProp(String name, short v); 
	public void putProp(String name, String v); 
	
	public boolean getBooleanProp(String name); 
	public byte getByteProp(String name); 
	public char getCharProp(String name); 
	public double getDoubleProp(String name); 
	public float getFloatProp(String name); 
	public int getIntProp(String name); 
	public long getLongProp(String name); 
	public short getShortProp(String name); 
	public String getStringProp(String name); 
}

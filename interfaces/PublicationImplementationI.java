package baduren.interfaces;

public interface PublicationImplementationI {
	public void publish(MessageI m, String topic); 
	public void publish(MessageI m, String[] topics); 
	public void publish(MessageI[] ms, String topics); 
	public void publish(MessageI[] ms, String[] topics); 

}

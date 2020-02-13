package baduren.ports.outboundPorts;

import baduren.interfaces.ManagementCI;
import baduren.interfaces.MessageI;
import baduren.interfaces.PublicationCI;
import fr.sorbonne_u.components.ComponentI;
import fr.sorbonne_u.components.ports.AbstractOutboundPort;

public class PublicationOutboundPort extends	AbstractOutboundPort implements PublicationCI {

	private static final long serialVersionUID = 1L;
	
	// Constructeurs
	
	public PublicationOutboundPort(String uri, ComponentI owner) throws Exception{
		super(uri, PublicationCI.class, owner) ;
		assert	uri != null && owner != null ;
	}
	
	public PublicationOutboundPort(ComponentI owner) throws Exception{
		super(PublicationCI.class, owner) ;
		assert	uri != null && owner != null ;
	}
	
	// Methodes
	
	
	@Override
	public void publish(MessageI m, String topic) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void publish(MessageI m, String[] topics) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void publish(MessageI[] ms, String topics) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void publish(MessageI[] ms, String[] topics) {
		// TODO Auto-generated method stub
		
	}
	
	// Methodes
	
	
	
}

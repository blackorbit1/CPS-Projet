package baduren.ports.outboundPorts;

import baduren.components.Subscriber;
import baduren.interfaces.MessageI;
import baduren.interfaces.PublicationCI;
import baduren.interfaces.ReceptionCI;
import fr.sorbonne_u.components.ComponentI;
import fr.sorbonne_u.components.ports.AbstractOutboundPort;

public class ReceptionOutboundPort extends		AbstractOutboundPort implements ReceptionCI {

	private static final long serialVersionUID = 1L;
	
	// Constructeurs
	
	public ReceptionOutboundPort(String uri, ComponentI owner) throws Exception{
		super(uri, ReceptionCI.class, owner) ;
		assert	uri != null && owner != null ;
	}
	
	public ReceptionOutboundPort(ComponentI owner) throws Exception{
		super(ReceptionCI.class, owner) ;
		assert	uri != null && owner != null ;
	}
	
	// Methodes

	@Override
	public void acceptMessage(MessageI m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptMessages(MessageI[] ms) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getURI() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getURIs(int numberOfURIs) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}



}

package baduren.ports.inboundPorts;

import baduren.interfaces.MessageI;
import baduren.interfaces.ReceptionCI;
import fr.sorbonne_u.components.ComponentI;
import fr.sorbonne_u.components.ports.AbstractInboundPort;

public class ReceptionInboundPort extends		AbstractInboundPort implements ReceptionCI {

	private static final long serialVersionUID = 1L;

	
	/**
	 * Constructeurs
	 */
	
	public	ReceptionInboundPort(String uri, ComponentI owner) throws Exception{
		// the implemented interface is statically known
		super(uri, ReceptionCI.class, owner) ;
	}
	
	public	ReceptionInboundPort(ComponentI owner) throws Exception{
		// the implemented interface is statically known
		super(ReceptionCI.class, owner) ;
	}

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

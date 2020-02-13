package baduren.ports.outboundPorts;

import baduren.interfaces.ManagementCI;
import baduren.interfaces.MessageFilterI;
import fr.sorbonne_u.components.ComponentI;
import fr.sorbonne_u.components.examples.basic_cs.interfaces.URIConsumerI;
import fr.sorbonne_u.components.ports.AbstractOutboundPort;

public class ManagementOutboundPort extends		AbstractOutboundPort implements ManagementCI {
	
	private static final long serialVersionUID = 1L;

	// Constructeurs
	
	public ManagementOutboundPort(String uri, ComponentI owner) throws Exception{
		super(uri, ManagementCI.class, owner) ;
		assert	uri != null && owner != null ;
	}
	
	public ManagementOutboundPort(ComponentI owner) throws Exception{
		super(ManagementCI.class, owner) ;
		assert	uri != null && owner != null ;
	}
	
	// Methodes

	@Override
	public void subscribe(String topic, String inboundPortURI) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subscribe(String[] topics, String inboundPortURI) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subscribe(String topic, MessageFilterI filter, String inboundPortURI) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyFilter(String topic, MessageFilterI newFilter, String inboundPortURI) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unsubscribe(String topic, String inboundPortUri) {
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

package baduren.ports.inboundPorts;

import baduren.components.Publisher;
import baduren.components.Subscriber;
import baduren.interfaces.ManagementCI;
import baduren.interfaces.MessageFilterI;
import baduren.interfaces.PublicationCI;
import baduren.interfaces.ReceptionCI;
import baduren.ports.outboundPorts.ManagementOutboundPort;
import baduren.ports.outboundPorts.PublicationOutboundPort;
import fr.sorbonne_u.components.ComponentI;
import fr.sorbonne_u.components.examples.basic_cs.components.URIProvider;
import fr.sorbonne_u.components.examples.basic_cs.interfaces.URIConsumerI;
import fr.sorbonne_u.components.examples.basic_cs.interfaces.URIProviderI;
import fr.sorbonne_u.components.ports.AbstractInboundPort;

public class ManagementInboundPort extends	AbstractInboundPort implements ManagementCI {

	public ManagementInboundPort(String uri, ComponentI owner) throws Exception {
		super(uri, ManagementCI.class, owner);
	}
	
	public ManagementInboundPort(ComponentI owner) throws Exception{
		super(ManagementCI.class, owner); 
	}

	private static final long serialVersionUID = 1L;

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



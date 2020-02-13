package baduren.components;

import baduren.ports.inboundPorts.ManagementInboundPort;
import baduren.ports.inboundPorts.PublicationInboundPort;
import baduren.ports.outboundPorts.ReceptionOutboundPort;
import fr.sorbonne_u.components.AbstractComponent;
import fr.sorbonne_u.components.cvm.AbstractCVM;
import fr.sorbonne_u.components.exceptions.ComponentStartException;
import fr.sorbonne_u.components.ports.PortI;

public class Broker extends AbstractComponent {

	protected ReceptionOutboundPort receptionOutboundPort;

	protected Broker (String uri, String managementInboundPortName,
			String publicationInboundPortName, String receptionOutboundPortName) throws Exception {
		super(uri, 1, 0) ;
		PortI managementInboundPort = new ManagementInboundPort(managementInboundPortName, this); 
		PortI publicationInboundPort = new PublicationInboundPort(publicationInboundPortName, this); 
		this.receptionOutboundPort = new ReceptionOutboundPort(receptionOutboundPortName,this); 
		managementInboundPort.publishPort();
		publicationInboundPort.publishPort();
		receptionOutboundPort.publishPort();

		// Pour les logs
		if (AbstractCVM.isDistributed) {
			this.executionLog.setDirectory(System.getProperty("user.dir")) ;
		} else {
			this.executionLog.setDirectory(System.getProperty("user.home")) ;
		}
		this.tracer.setTitle("broker") ;
		this.tracer.setRelativePosition(1, 1) ;
	}


	@Override
	public void			start() throws ComponentStartException
	{
		super.start() ;
		this.logMessage("starting publisher component.") ;
	}

	@Override
	public void			execute() throws Exception
	{
		super.execute() ;


	}

	@Override
	public void			finalise() throws Exception
	{
		super.finalise();
	}



}

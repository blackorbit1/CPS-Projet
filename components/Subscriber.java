package baduren.components;

import baduren.ports.inboundPorts.ReceptionInboundPort;
import baduren.ports.outboundPorts.ManagementOutboundPort;
import fr.sorbonne_u.components.AbstractComponent;
import fr.sorbonne_u.components.cvm.AbstractCVM;
import fr.sorbonne_u.components.exceptions.ComponentStartException;
import fr.sorbonne_u.components.ports.PortI;

public class Subscriber extends	AbstractComponent{


	/**	the outbound port used to call the service.							*/
	protected ManagementOutboundPort managementOutboundPort;
	
	
	
	protected Subscriber(String uri, String receptionInboundPortName, String managementOutboundPortName) 
			throws Exception {
		super(uri, 0, 1); 
		PortI receptionInboundPort = new ReceptionInboundPort(receptionInboundPortName,this); 
		this.managementOutboundPort = new ManagementOutboundPort(managementOutboundPortName, this);
		//PortI managementInboundPort = new ManagementInboundPort(managementInboundPortName, this); 
		receptionInboundPort.publishPort();
		managementOutboundPort.publishPort();
		
		if (AbstractCVM.isDistributed) {
			this.executionLog.setDirectory(System.getProperty("user.dir")) ;
		}else {
			this.executionLog.setDirectory(System.getProperty("user.home")) ;
		}
		this.tracer.setTitle("subscriber") ;
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

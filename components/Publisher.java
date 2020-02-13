package baduren.components;

import baduren.interfaces.MessageI;
import baduren.ports.outboundPorts.ManagementOutboundPort;
import baduren.ports.outboundPorts.PublicationOutboundPort;
import fr.sorbonne_u.components.AbstractComponent;
import fr.sorbonne_u.components.cvm.AbstractCVM;
import fr.sorbonne_u.components.exceptions.ComponentStartException;

public class Publisher extends AbstractComponent {
	

	// ------------------------------------------------------------------------
		// Constructors and instance variables
		// ------------------------------------------------------------------------

		protected String uriPrefix ;
		
		protected ManagementOutboundPort managementOutboundPort;
		protected PublicationOutboundPort publicationOutboundPort;
		
		protected Publisher(String uri, String managementOutboundPortName, String publicationOutboundPortName) 
				throws Exception {
			super(uri, 0, 1); 
			this.uriPrefix = uri;
			
			this.managementOutboundPort = new ManagementOutboundPort(managementOutboundPortName, this); 
			this.publicationOutboundPort = new PublicationOutboundPort(publicationOutboundPortName,this); 
			managementOutboundPort.publishPort();
			publicationOutboundPort.publishPort();
			
			
			if (AbstractCVM.isDistributed) {
				this.executionLog.setDirectory(System.getProperty("user.dir")) ;
			}else {
				this.executionLog.setDirectory(System.getProperty("user.home")) ;
			}
			this.tracer.setTitle("publisher") ;
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
		
		
		public void publish(MessageI m, String topic) {
			
		}
		
		
		
		

}

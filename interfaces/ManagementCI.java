package baduren.interfaces;

import fr.sorbonne_u.components.interfaces.OfferedI;
import fr.sorbonne_u.components.interfaces.RequiredI;

public interface ManagementCI extends SubscriptionImplementationI, RequiredI, OfferedI {
	/**
	 * get a new URI.
	 * 
	 * <p><strong>Contract</strong></p>
	 * 
	 * <pre>
	 * pre	true			// no precondition.
	 * post	ret != null
	 * </pre>
	 *
	 * @return			the requested URI.
	 * @throws Exception	<i>todo.</i>
	 */
	public String		getURI() throws Exception ;

	/**
	 * get several new URIs at once.
	 * 
	 * <p><strong>Contract</strong></p>
	 * 
	 * <pre>
	 * pre	numberOfURIs &gt; 0
	 * post	ret != null and ret.length == numberOfURIs
	 * post	forall i in 0..numberOfURIs-1, ret[i] !! null
	 * </pre>
	 *
	 * @param numberOfURIs	number of requested URIs.
	 * @return				array of URIs.
	 * @throws Exception		<i>todo.</i>
	 */
	public String[]		getURIs(int numberOfURIs) throws Exception ;
}

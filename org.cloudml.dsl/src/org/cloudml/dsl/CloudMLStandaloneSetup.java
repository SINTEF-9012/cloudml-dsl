/*
* generated by Xtext
*/
package org.cloudml.dsl;

import org.eclipse.ocl.ecore.delegate.OCLDelegateDomain;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CloudMLStandaloneSetup extends CloudMLStandaloneSetupGenerated{

	public static void doSetup() {
		new CloudMLStandaloneSetup().createInjectorAndDoEMFRegistration();
		//OCLDelegateDomain.initialize(null,"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
	}
	
}


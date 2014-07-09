package org.cloudml.dsl.scoping

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import cloudml.core.ProvidedPortInstance
import cloudml.core.ComponentInstance
import cloudml.core.CloudMLModel
import org.eclipse.xtext.naming.QualifiedName
import cloudml.core.RequiredPortInstance
import cloudml.core.PortInstance
import cloudml.core.ExecutionPlatformInstance

class CloudmlQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	def qualifiedName(PortInstance port){
		val ci = port.eContainer as ComponentInstance
		val clmodel = ci.eContainer as CloudMLModel
		return QualifiedName.create(ci.name, port.name)
	}
	
	def qualifiedName(ExecutionPlatformInstance platform){
		val ci = platform.eContainer as ComponentInstance
		return QualifiedName.create(ci.name, platform.name)
	}
}
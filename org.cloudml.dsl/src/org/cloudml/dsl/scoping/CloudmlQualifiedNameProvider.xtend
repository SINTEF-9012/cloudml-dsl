package org.cloudml.dsl.scoping

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import cloudml.core.ProvidedPortInstance
import cloudml.core.ComponentInstance
import cloudml.core.CloudMLModel
import org.eclipse.xtext.naming.QualifiedName
import cloudml.core.RequiredPortInstance

class CloudmlQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	def qualifiedName(ProvidedPortInstance port){
		val ci = port.eContainer as ComponentInstance
		val clmodel = ci.eContainer as CloudMLModel
		return QualifiedName.create(ci.name, port.name)
	}
	
	def qualifiedName(RequiredPortInstance port){
		val ci = port.eContainer as ComponentInstance
		val clmodel = ci.eContainer as CloudMLModel
		return QualifiedName.create(ci.name, port.name)
	}
}
package org.cloudml.dsl.scoping;

import cloudml.core.CloudMLModel;
import cloudml.core.ComponentInstance;
import cloudml.core.ProvidedPortInstance;
import cloudml.core.RequiredPortInstance;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

@SuppressWarnings("all")
public class CloudmlQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
  public QualifiedName qualifiedName(final ProvidedPortInstance port) {
    EObject _eContainer = port.eContainer();
    final ComponentInstance ci = ((ComponentInstance) _eContainer);
    EObject _eContainer_1 = ci.eContainer();
    final CloudMLModel clmodel = ((CloudMLModel) _eContainer_1);
    String _name = ci.getName();
    String _name_1 = port.getName();
    return QualifiedName.create(_name, _name_1);
  }
  
  public QualifiedName qualifiedName(final RequiredPortInstance port) {
    EObject _eContainer = port.eContainer();
    final ComponentInstance ci = ((ComponentInstance) _eContainer);
    EObject _eContainer_1 = ci.eContainer();
    final CloudMLModel clmodel = ((CloudMLModel) _eContainer_1);
    String _name = ci.getName();
    String _name_1 = port.getName();
    return QualifiedName.create(_name, _name_1);
  }
}

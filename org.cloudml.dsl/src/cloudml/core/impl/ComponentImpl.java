/**
 */
package cloudml.core.impl;

import cloudml.core.Component;
import cloudml.core.CorePackage;
import cloudml.core.ProvidedExecutionPlatform;
import cloudml.core.ProvidedPort;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cloudml.core.impl.ComponentImpl#getProvidedPorts <em>Provided Ports</em>}</li>
 *   <li>{@link cloudml.core.impl.ComponentImpl#getProvidedExecutionPlatforms <em>Provided Execution Platforms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ComponentImpl extends CloudMLElementWithPropertiesImpl implements Component {
	/**
	 * The cached value of the '{@link #getProvidedPorts() <em>Provided Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedPort> providedPorts;

	/**
	 * The cached value of the '{@link #getProvidedExecutionPlatforms() <em>Provided Execution Platforms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedExecutionPlatforms()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedExecutionPlatform> providedExecutionPlatforms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedPort> getProvidedPorts() {
		if (providedPorts == null) {
			providedPorts = new EObjectContainmentEList<ProvidedPort>(ProvidedPort.class, this, CorePackage.COMPONENT__PROVIDED_PORTS);
		}
		return providedPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedExecutionPlatform> getProvidedExecutionPlatforms() {
		if (providedExecutionPlatforms == null) {
			providedExecutionPlatforms = new EObjectContainmentEList<ProvidedExecutionPlatform>(ProvidedExecutionPlatform.class, this, CorePackage.COMPONENT__PROVIDED_EXECUTION_PLATFORMS);
		}
		return providedExecutionPlatforms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.COMPONENT__PROVIDED_PORTS:
				return ((InternalEList<?>)getProvidedPorts()).basicRemove(otherEnd, msgs);
			case CorePackage.COMPONENT__PROVIDED_EXECUTION_PLATFORMS:
				return ((InternalEList<?>)getProvidedExecutionPlatforms()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.COMPONENT__PROVIDED_PORTS:
				return getProvidedPorts();
			case CorePackage.COMPONENT__PROVIDED_EXECUTION_PLATFORMS:
				return getProvidedExecutionPlatforms();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.COMPONENT__PROVIDED_PORTS:
				getProvidedPorts().clear();
				getProvidedPorts().addAll((Collection<? extends ProvidedPort>)newValue);
				return;
			case CorePackage.COMPONENT__PROVIDED_EXECUTION_PLATFORMS:
				getProvidedExecutionPlatforms().clear();
				getProvidedExecutionPlatforms().addAll((Collection<? extends ProvidedExecutionPlatform>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.COMPONENT__PROVIDED_PORTS:
				getProvidedPorts().clear();
				return;
			case CorePackage.COMPONENT__PROVIDED_EXECUTION_PLATFORMS:
				getProvidedExecutionPlatforms().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.COMPONENT__PROVIDED_PORTS:
				return providedPorts != null && !providedPorts.isEmpty();
			case CorePackage.COMPONENT__PROVIDED_EXECUTION_PLATFORMS:
				return providedExecutionPlatforms != null && !providedExecutionPlatforms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentImpl

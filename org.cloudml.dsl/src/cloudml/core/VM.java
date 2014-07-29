/**
 */
package cloudml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cloudml.core.VM#getProvided <em>Provided</em>}</li>
 *   <li>{@link cloudml.core.VM#getMinRam <em>Min Ram</em>}</li>
 *   <li>{@link cloudml.core.VM#getMaxRam <em>Max Ram</em>}</li>
 *   <li>{@link cloudml.core.VM#getMinCores <em>Min Cores</em>}</li>
 *   <li>{@link cloudml.core.VM#getMaxCores <em>Max Cores</em>}</li>
 *   <li>{@link cloudml.core.VM#getMinStorage <em>Min Storage</em>}</li>
 *   <li>{@link cloudml.core.VM#getMaxStorage <em>Max Storage</em>}</li>
 *   <li>{@link cloudml.core.VM#getOs <em>Os</em>}</li>
 *   <li>{@link cloudml.core.VM#isIs64os <em>Is64os</em>}</li>
 *   <li>{@link cloudml.core.VM#getImageId <em>Image Id</em>}</li>
 *   <li>{@link cloudml.core.VM#getSecurityGroup <em>Security Group</em>}</li>
 *   <li>{@link cloudml.core.VM#getSshKey <em>Ssh Key</em>}</li>
 *   <li>{@link cloudml.core.VM#getPrivateKey <em>Private Key</em>}</li>
 *   <li>{@link cloudml.core.VM#getGroupName <em>Group Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see cloudml.core.CorePackage#getVM()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='VM_Name_Upper Max_Core_Bigger_Than_Min'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG VM_Name_Upper='name.at(1)=name.at(1).toUpperCase()\r\n' Max_Core_Bigger_Than_Min='minCores <=0 or maxCores <=0 or minCores <= maxCores'"
 * @generated
 */
public interface VM extends ExternalComponent {
	/**
	 * Returns the value of the '<em><b>Provided</b></em>' containment reference list.
	 * The list contents are of type {@link cloudml.core.VMPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided</em>' containment reference list.
	 * @see cloudml.core.CorePackage#getVM_Provided()
	 * @model containment="true"
	 * @generated
	 */
	EList<VMPort> getProvided();

	/**
	 * Returns the value of the '<em><b>Min Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Ram</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Ram</em>' attribute.
	 * @see #setMinRam(int)
	 * @see cloudml.core.CorePackage#getVM_MinRam()
	 * @model
	 * @generated
	 */
	int getMinRam();

	/**
	 * Sets the value of the '{@link cloudml.core.VM#getMinRam <em>Min Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Ram</em>' attribute.
	 * @see #getMinRam()
	 * @generated
	 */
	void setMinRam(int value);

	/**
	 * Returns the value of the '<em><b>Max Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Ram</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Ram</em>' attribute.
	 * @see #setMaxRam(int)
	 * @see cloudml.core.CorePackage#getVM_MaxRam()
	 * @model
	 * @generated
	 */
	int getMaxRam();

	/**
	 * Sets the value of the '{@link cloudml.core.VM#getMaxRam <em>Max Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Ram</em>' attribute.
	 * @see #getMaxRam()
	 * @generated
	 */
	void setMaxRam(int value);

	/**
	 * Returns the value of the '<em><b>Min Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Cores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Cores</em>' attribute.
	 * @see #setMinCores(int)
	 * @see cloudml.core.CorePackage#getVM_MinCores()
	 * @model
	 * @generated
	 */
	int getMinCores();

	/**
	 * Sets the value of the '{@link cloudml.core.VM#getMinCores <em>Min Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Cores</em>' attribute.
	 * @see #getMinCores()
	 * @generated
	 */
	void setMinCores(int value);

	/**
	 * Returns the value of the '<em><b>Max Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Cores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Cores</em>' attribute.
	 * @see #setMaxCores(int)
	 * @see cloudml.core.CorePackage#getVM_MaxCores()
	 * @model
	 * @generated
	 */
	int getMaxCores();

	/**
	 * Sets the value of the '{@link cloudml.core.VM#getMaxCores <em>Max Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Cores</em>' attribute.
	 * @see #getMaxCores()
	 * @generated
	 */
	void setMaxCores(int value);

	/**
	 * Returns the value of the '<em><b>Min Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Storage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Storage</em>' attribute.
	 * @see #setMinStorage(int)
	 * @see cloudml.core.CorePackage#getVM_MinStorage()
	 * @model
	 * @generated
	 */
	int getMinStorage();

	/**
	 * Sets the value of the '{@link cloudml.core.VM#getMinStorage <em>Min Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Storage</em>' attribute.
	 * @see #getMinStorage()
	 * @generated
	 */
	void setMinStorage(int value);

	/**
	 * Returns the value of the '<em><b>Max Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Storage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Storage</em>' attribute.
	 * @see #setMaxStorage(int)
	 * @see cloudml.core.CorePackage#getVM_MaxStorage()
	 * @model
	 * @generated
	 */
	int getMaxStorage();

	/**
	 * Sets the value of the '{@link cloudml.core.VM#getMaxStorage <em>Max Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Storage</em>' attribute.
	 * @see #getMaxStorage()
	 * @generated
	 */
	void setMaxStorage(int value);

	/**
	 * Returns the value of the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' attribute.
	 * @see #setOs(String)
	 * @see cloudml.core.CorePackage#getVM_Os()
	 * @model
	 * @generated
	 */
	String getOs();

	/**
	 * Sets the value of the '{@link cloudml.core.VM#getOs <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os</em>' attribute.
	 * @see #getOs()
	 * @generated
	 */
	void setOs(String value);

	/**
	 * Returns the value of the '<em><b>Is64os</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is64os</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is64os</em>' attribute.
	 * @see #setIs64os(boolean)
	 * @see cloudml.core.CorePackage#getVM_Is64os()
	 * @model default="true"
	 * @generated
	 */
	boolean isIs64os();

	/**
	 * Sets the value of the '{@link cloudml.core.VM#isIs64os <em>Is64os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is64os</em>' attribute.
	 * @see #isIs64os()
	 * @generated
	 */
	void setIs64os(boolean value);

	/**
	 * Returns the value of the '<em><b>Image Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Id</em>' attribute.
	 * @see #setImageId(String)
	 * @see cloudml.core.CorePackage#getVM_ImageId()
	 * @model
	 * @generated
	 */
	String getImageId();

	/**
	 * Sets the value of the '{@link cloudml.core.VM#getImageId <em>Image Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Id</em>' attribute.
	 * @see #getImageId()
	 * @generated
	 */
	void setImageId(String value);

	/**
	 * Returns the value of the '<em><b>Security Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Group</em>' attribute.
	 * @see #setSecurityGroup(String)
	 * @see cloudml.core.CorePackage#getVM_SecurityGroup()
	 * @model
	 * @generated
	 */
	String getSecurityGroup();

	/**
	 * Sets the value of the '{@link cloudml.core.VM#getSecurityGroup <em>Security Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Group</em>' attribute.
	 * @see #getSecurityGroup()
	 * @generated
	 */
	void setSecurityGroup(String value);

	/**
	 * Returns the value of the '<em><b>Ssh Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssh Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssh Key</em>' attribute.
	 * @see #setSshKey(String)
	 * @see cloudml.core.CorePackage#getVM_SshKey()
	 * @model
	 * @generated
	 */
	String getSshKey();

	/**
	 * Sets the value of the '{@link cloudml.core.VM#getSshKey <em>Ssh Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh Key</em>' attribute.
	 * @see #getSshKey()
	 * @generated
	 */
	void setSshKey(String value);

	/**
	 * Returns the value of the '<em><b>Private Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private Key</em>' attribute.
	 * @see #setPrivateKey(String)
	 * @see cloudml.core.CorePackage#getVM_PrivateKey()
	 * @model
	 * @generated
	 */
	String getPrivateKey();

	/**
	 * Sets the value of the '{@link cloudml.core.VM#getPrivateKey <em>Private Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Key</em>' attribute.
	 * @see #getPrivateKey()
	 * @generated
	 */
	void setPrivateKey(String value);

	/**
	 * Returns the value of the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Name</em>' attribute.
	 * @see #setGroupName(String)
	 * @see cloudml.core.CorePackage#getVM_GroupName()
	 * @model
	 * @generated
	 */
	String getGroupName();

	/**
	 * Sets the value of the '{@link cloudml.core.VM#getGroupName <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Name</em>' attribute.
	 * @see #getGroupName()
	 * @generated
	 */
	void setGroupName(String value);

} // VM

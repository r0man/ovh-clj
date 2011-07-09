/**
 * ManagerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class ManagerServiceLocator extends org.apache.axis.client.Service implements com.ovh.ManagerService {

    public ManagerServiceLocator() {
    }


    public ManagerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ManagerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for managerPort
    private java.lang.String managerPort_address = "https://www.ovh.com:1664";

    public java.lang.String getmanagerPortAddress() {
        return managerPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String managerPortWSDDServiceName = "managerPort";

    public java.lang.String getmanagerPortWSDDServiceName() {
        return managerPortWSDDServiceName;
    }

    public void setmanagerPortWSDDServiceName(java.lang.String name) {
        managerPortWSDDServiceName = name;
    }

    public com.ovh.ManagerPortType getmanagerPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(managerPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getmanagerPort(endpoint);
    }

    public com.ovh.ManagerPortType getmanagerPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ovh.ManagerBindingStub _stub = new com.ovh.ManagerBindingStub(portAddress, this);
            _stub.setPortName(getmanagerPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setmanagerPortEndpointAddress(java.lang.String address) {
        managerPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ovh.ManagerPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ovh.ManagerBindingStub _stub = new com.ovh.ManagerBindingStub(new java.net.URL(managerPort_address), this);
                _stub.setPortName(getmanagerPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("managerPort".equals(inputPortName)) {
            return getmanagerPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "managerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "managerPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("managerPort".equals(portName)) {
            setmanagerPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

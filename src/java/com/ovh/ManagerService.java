/**
 * ManagerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public interface ManagerService extends javax.xml.rpc.Service {
    public java.lang.String getmanagerPortAddress();

    public com.ovh.ManagerPortType getmanagerPort() throws javax.xml.rpc.ServiceException;

    public com.ovh.ManagerPortType getmanagerPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

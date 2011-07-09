/**
 * DedicatedIpVirtualMacAvailableReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class DedicatedIpVirtualMacAvailableReturn  implements java.io.Serializable {
    private java.lang.String[] ip;

    private java.lang.String[] mac;

    public DedicatedIpVirtualMacAvailableReturn() {
    }

    public DedicatedIpVirtualMacAvailableReturn(
           java.lang.String[] ip,
           java.lang.String[] mac) {
           this.ip = ip;
           this.mac = mac;
    }


    /**
     * Gets the ip value for this DedicatedIpVirtualMacAvailableReturn.
     * 
     * @return ip
     */
    public java.lang.String[] getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this DedicatedIpVirtualMacAvailableReturn.
     * 
     * @param ip
     */
    public void setIp(java.lang.String[] ip) {
        this.ip = ip;
    }


    /**
     * Gets the mac value for this DedicatedIpVirtualMacAvailableReturn.
     * 
     * @return mac
     */
    public java.lang.String[] getMac() {
        return mac;
    }


    /**
     * Sets the mac value for this DedicatedIpVirtualMacAvailableReturn.
     * 
     * @param mac
     */
    public void setMac(java.lang.String[] mac) {
        this.mac = mac;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DedicatedIpVirtualMacAvailableReturn)) return false;
        DedicatedIpVirtualMacAvailableReturn other = (DedicatedIpVirtualMacAvailableReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ip==null && other.getIp()==null) || 
             (this.ip!=null &&
              java.util.Arrays.equals(this.ip, other.getIp()))) &&
            ((this.mac==null && other.getMac()==null) || 
             (this.mac!=null &&
              java.util.Arrays.equals(this.mac, other.getMac())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getIp() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIp());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIp(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMac() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMac());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMac(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DedicatedIpVirtualMacAvailableReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedIpVirtualMacAvailableReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mac");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mac"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

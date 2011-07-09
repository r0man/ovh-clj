/**
 * DedicatedFilterIrcRuleStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class DedicatedFilterIrcRuleStruct  implements java.io.Serializable {
    private java.lang.String fromIp;

    private java.lang.String fromPort;

    private java.lang.String toIp;

    private java.lang.String toPort;

    public DedicatedFilterIrcRuleStruct() {
    }

    public DedicatedFilterIrcRuleStruct(
           java.lang.String fromIp,
           java.lang.String fromPort,
           java.lang.String toIp,
           java.lang.String toPort) {
           this.fromIp = fromIp;
           this.fromPort = fromPort;
           this.toIp = toIp;
           this.toPort = toPort;
    }


    /**
     * Gets the fromIp value for this DedicatedFilterIrcRuleStruct.
     * 
     * @return fromIp
     */
    public java.lang.String getFromIp() {
        return fromIp;
    }


    /**
     * Sets the fromIp value for this DedicatedFilterIrcRuleStruct.
     * 
     * @param fromIp
     */
    public void setFromIp(java.lang.String fromIp) {
        this.fromIp = fromIp;
    }


    /**
     * Gets the fromPort value for this DedicatedFilterIrcRuleStruct.
     * 
     * @return fromPort
     */
    public java.lang.String getFromPort() {
        return fromPort;
    }


    /**
     * Sets the fromPort value for this DedicatedFilterIrcRuleStruct.
     * 
     * @param fromPort
     */
    public void setFromPort(java.lang.String fromPort) {
        this.fromPort = fromPort;
    }


    /**
     * Gets the toIp value for this DedicatedFilterIrcRuleStruct.
     * 
     * @return toIp
     */
    public java.lang.String getToIp() {
        return toIp;
    }


    /**
     * Sets the toIp value for this DedicatedFilterIrcRuleStruct.
     * 
     * @param toIp
     */
    public void setToIp(java.lang.String toIp) {
        this.toIp = toIp;
    }


    /**
     * Gets the toPort value for this DedicatedFilterIrcRuleStruct.
     * 
     * @return toPort
     */
    public java.lang.String getToPort() {
        return toPort;
    }


    /**
     * Sets the toPort value for this DedicatedFilterIrcRuleStruct.
     * 
     * @param toPort
     */
    public void setToPort(java.lang.String toPort) {
        this.toPort = toPort;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DedicatedFilterIrcRuleStruct)) return false;
        DedicatedFilterIrcRuleStruct other = (DedicatedFilterIrcRuleStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fromIp==null && other.getFromIp()==null) || 
             (this.fromIp!=null &&
              this.fromIp.equals(other.getFromIp()))) &&
            ((this.fromPort==null && other.getFromPort()==null) || 
             (this.fromPort!=null &&
              this.fromPort.equals(other.getFromPort()))) &&
            ((this.toIp==null && other.getToIp()==null) || 
             (this.toIp!=null &&
              this.toIp.equals(other.getToIp()))) &&
            ((this.toPort==null && other.getToPort()==null) || 
             (this.toPort!=null &&
              this.toPort.equals(other.getToPort())));
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
        if (getFromIp() != null) {
            _hashCode += getFromIp().hashCode();
        }
        if (getFromPort() != null) {
            _hashCode += getFromPort().hashCode();
        }
        if (getToIp() != null) {
            _hashCode += getToIp().hashCode();
        }
        if (getToPort() != null) {
            _hashCode += getToPort().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DedicatedFilterIrcRuleStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedFilterIrcRuleStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromIp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toIp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toPort"));
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

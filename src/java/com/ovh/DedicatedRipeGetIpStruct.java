/**
 * DedicatedRipeGetIpStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class DedicatedRipeGetIpStruct  implements java.io.Serializable {
    private java.lang.String exclusion;

    private java.lang.String routedTo;

    private java.lang.String ip;

    private java.lang.String netname;

    public DedicatedRipeGetIpStruct() {
    }

    public DedicatedRipeGetIpStruct(
           java.lang.String exclusion,
           java.lang.String routedTo,
           java.lang.String ip,
           java.lang.String netname) {
           this.exclusion = exclusion;
           this.routedTo = routedTo;
           this.ip = ip;
           this.netname = netname;
    }


    /**
     * Gets the exclusion value for this DedicatedRipeGetIpStruct.
     * 
     * @return exclusion
     */
    public java.lang.String getExclusion() {
        return exclusion;
    }


    /**
     * Sets the exclusion value for this DedicatedRipeGetIpStruct.
     * 
     * @param exclusion
     */
    public void setExclusion(java.lang.String exclusion) {
        this.exclusion = exclusion;
    }


    /**
     * Gets the routedTo value for this DedicatedRipeGetIpStruct.
     * 
     * @return routedTo
     */
    public java.lang.String getRoutedTo() {
        return routedTo;
    }


    /**
     * Sets the routedTo value for this DedicatedRipeGetIpStruct.
     * 
     * @param routedTo
     */
    public void setRoutedTo(java.lang.String routedTo) {
        this.routedTo = routedTo;
    }


    /**
     * Gets the ip value for this DedicatedRipeGetIpStruct.
     * 
     * @return ip
     */
    public java.lang.String getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this DedicatedRipeGetIpStruct.
     * 
     * @param ip
     */
    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }


    /**
     * Gets the netname value for this DedicatedRipeGetIpStruct.
     * 
     * @return netname
     */
    public java.lang.String getNetname() {
        return netname;
    }


    /**
     * Sets the netname value for this DedicatedRipeGetIpStruct.
     * 
     * @param netname
     */
    public void setNetname(java.lang.String netname) {
        this.netname = netname;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DedicatedRipeGetIpStruct)) return false;
        DedicatedRipeGetIpStruct other = (DedicatedRipeGetIpStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exclusion==null && other.getExclusion()==null) || 
             (this.exclusion!=null &&
              this.exclusion.equals(other.getExclusion()))) &&
            ((this.routedTo==null && other.getRoutedTo()==null) || 
             (this.routedTo!=null &&
              this.routedTo.equals(other.getRoutedTo()))) &&
            ((this.ip==null && other.getIp()==null) || 
             (this.ip!=null &&
              this.ip.equals(other.getIp()))) &&
            ((this.netname==null && other.getNetname()==null) || 
             (this.netname!=null &&
              this.netname.equals(other.getNetname())));
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
        if (getExclusion() != null) {
            _hashCode += getExclusion().hashCode();
        }
        if (getRoutedTo() != null) {
            _hashCode += getRoutedTo().hashCode();
        }
        if (getIp() != null) {
            _hashCode += getIp().hashCode();
        }
        if (getNetname() != null) {
            _hashCode += getNetname().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DedicatedRipeGetIpStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedRipeGetIpStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exclusion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exclusion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routedTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routedTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netname"));
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

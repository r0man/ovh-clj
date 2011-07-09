/**
 * AllSecondaryDNSStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class AllSecondaryDNSStruct  implements java.io.Serializable {
    private java.lang.String ip;

    private com.ovh.SecondaryDNSStruct[] secondary;

    public AllSecondaryDNSStruct() {
    }

    public AllSecondaryDNSStruct(
           java.lang.String ip,
           com.ovh.SecondaryDNSStruct[] secondary) {
           this.ip = ip;
           this.secondary = secondary;
    }


    /**
     * Gets the ip value for this AllSecondaryDNSStruct.
     * 
     * @return ip
     */
    public java.lang.String getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this AllSecondaryDNSStruct.
     * 
     * @param ip
     */
    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }


    /**
     * Gets the secondary value for this AllSecondaryDNSStruct.
     * 
     * @return secondary
     */
    public com.ovh.SecondaryDNSStruct[] getSecondary() {
        return secondary;
    }


    /**
     * Sets the secondary value for this AllSecondaryDNSStruct.
     * 
     * @param secondary
     */
    public void setSecondary(com.ovh.SecondaryDNSStruct[] secondary) {
        this.secondary = secondary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AllSecondaryDNSStruct)) return false;
        AllSecondaryDNSStruct other = (AllSecondaryDNSStruct) obj;
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
              this.ip.equals(other.getIp()))) &&
            ((this.secondary==null && other.getSecondary()==null) || 
             (this.secondary!=null &&
              java.util.Arrays.equals(this.secondary, other.getSecondary())));
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
            _hashCode += getIp().hashCode();
        }
        if (getSecondary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSecondary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSecondary(), i);
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
        new org.apache.axis.description.TypeDesc(AllSecondaryDNSStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "allSecondaryDNSStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secondary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "secondaryDNSStruct"));
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

/**
 * DomainHostInfoReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class DomainHostInfoReturn  implements java.io.Serializable {
    private java.lang.String hostname;

    private java.lang.String ipv4;

    private java.lang.String ipv6;

    public DomainHostInfoReturn() {
    }

    public DomainHostInfoReturn(
           java.lang.String hostname,
           java.lang.String ipv4,
           java.lang.String ipv6) {
           this.hostname = hostname;
           this.ipv4 = ipv4;
           this.ipv6 = ipv6;
    }


    /**
     * Gets the hostname value for this DomainHostInfoReturn.
     * 
     * @return hostname
     */
    public java.lang.String getHostname() {
        return hostname;
    }


    /**
     * Sets the hostname value for this DomainHostInfoReturn.
     * 
     * @param hostname
     */
    public void setHostname(java.lang.String hostname) {
        this.hostname = hostname;
    }


    /**
     * Gets the ipv4 value for this DomainHostInfoReturn.
     * 
     * @return ipv4
     */
    public java.lang.String getIpv4() {
        return ipv4;
    }


    /**
     * Sets the ipv4 value for this DomainHostInfoReturn.
     * 
     * @param ipv4
     */
    public void setIpv4(java.lang.String ipv4) {
        this.ipv4 = ipv4;
    }


    /**
     * Gets the ipv6 value for this DomainHostInfoReturn.
     * 
     * @return ipv6
     */
    public java.lang.String getIpv6() {
        return ipv6;
    }


    /**
     * Sets the ipv6 value for this DomainHostInfoReturn.
     * 
     * @param ipv6
     */
    public void setIpv6(java.lang.String ipv6) {
        this.ipv6 = ipv6;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DomainHostInfoReturn)) return false;
        DomainHostInfoReturn other = (DomainHostInfoReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostname==null && other.getHostname()==null) || 
             (this.hostname!=null &&
              this.hostname.equals(other.getHostname()))) &&
            ((this.ipv4==null && other.getIpv4()==null) || 
             (this.ipv4!=null &&
              this.ipv4.equals(other.getIpv4()))) &&
            ((this.ipv6==null && other.getIpv6()==null) || 
             (this.ipv6!=null &&
              this.ipv6.equals(other.getIpv6())));
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
        if (getHostname() != null) {
            _hashCode += getHostname().hashCode();
        }
        if (getIpv4() != null) {
            _hashCode += getIpv4().hashCode();
        }
        if (getIpv6() != null) {
            _hashCode += getIpv6().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DomainHostInfoReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "domainHostInfoReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipv4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipv6"));
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

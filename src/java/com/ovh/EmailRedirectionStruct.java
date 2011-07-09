/**
 * EmailRedirectionStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class EmailRedirectionStruct  implements java.io.Serializable {
    private java.lang.String target;

    private java.lang.String local;

    private java.lang.String subdomain;

    private boolean dnsRedirection;

    public EmailRedirectionStruct() {
    }

    public EmailRedirectionStruct(
           java.lang.String target,
           java.lang.String local,
           java.lang.String subdomain,
           boolean dnsRedirection) {
           this.target = target;
           this.local = local;
           this.subdomain = subdomain;
           this.dnsRedirection = dnsRedirection;
    }


    /**
     * Gets the target value for this EmailRedirectionStruct.
     * 
     * @return target
     */
    public java.lang.String getTarget() {
        return target;
    }


    /**
     * Sets the target value for this EmailRedirectionStruct.
     * 
     * @param target
     */
    public void setTarget(java.lang.String target) {
        this.target = target;
    }


    /**
     * Gets the local value for this EmailRedirectionStruct.
     * 
     * @return local
     */
    public java.lang.String getLocal() {
        return local;
    }


    /**
     * Sets the local value for this EmailRedirectionStruct.
     * 
     * @param local
     */
    public void setLocal(java.lang.String local) {
        this.local = local;
    }


    /**
     * Gets the subdomain value for this EmailRedirectionStruct.
     * 
     * @return subdomain
     */
    public java.lang.String getSubdomain() {
        return subdomain;
    }


    /**
     * Sets the subdomain value for this EmailRedirectionStruct.
     * 
     * @param subdomain
     */
    public void setSubdomain(java.lang.String subdomain) {
        this.subdomain = subdomain;
    }


    /**
     * Gets the dnsRedirection value for this EmailRedirectionStruct.
     * 
     * @return dnsRedirection
     */
    public boolean isDnsRedirection() {
        return dnsRedirection;
    }


    /**
     * Sets the dnsRedirection value for this EmailRedirectionStruct.
     * 
     * @param dnsRedirection
     */
    public void setDnsRedirection(boolean dnsRedirection) {
        this.dnsRedirection = dnsRedirection;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmailRedirectionStruct)) return false;
        EmailRedirectionStruct other = (EmailRedirectionStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.local==null && other.getLocal()==null) || 
             (this.local!=null &&
              this.local.equals(other.getLocal()))) &&
            ((this.subdomain==null && other.getSubdomain()==null) || 
             (this.subdomain!=null &&
              this.subdomain.equals(other.getSubdomain()))) &&
            this.dnsRedirection == other.isDnsRedirection();
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
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getLocal() != null) {
            _hashCode += getLocal().hashCode();
        }
        if (getSubdomain() != null) {
            _hashCode += getSubdomain().hashCode();
        }
        _hashCode += (isDnsRedirection() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmailRedirectionStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "emailRedirectionStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("", "target"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("local");
        elemField.setXmlName(new javax.xml.namespace.QName("", "local"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subdomain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subdomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnsRedirection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnsRedirection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

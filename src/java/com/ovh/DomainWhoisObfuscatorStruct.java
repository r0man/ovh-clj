/**
 * DomainWhoisObfuscatorStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class DomainWhoisObfuscatorStruct  implements java.io.Serializable {
    private java.lang.String domain;

    private boolean email;

    private boolean address;

    private boolean phone;

    public DomainWhoisObfuscatorStruct() {
    }

    public DomainWhoisObfuscatorStruct(
           java.lang.String domain,
           boolean email,
           boolean address,
           boolean phone) {
           this.domain = domain;
           this.email = email;
           this.address = address;
           this.phone = phone;
    }


    /**
     * Gets the domain value for this DomainWhoisObfuscatorStruct.
     * 
     * @return domain
     */
    public java.lang.String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this DomainWhoisObfuscatorStruct.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }


    /**
     * Gets the email value for this DomainWhoisObfuscatorStruct.
     * 
     * @return email
     */
    public boolean isEmail() {
        return email;
    }


    /**
     * Sets the email value for this DomainWhoisObfuscatorStruct.
     * 
     * @param email
     */
    public void setEmail(boolean email) {
        this.email = email;
    }


    /**
     * Gets the address value for this DomainWhoisObfuscatorStruct.
     * 
     * @return address
     */
    public boolean isAddress() {
        return address;
    }


    /**
     * Sets the address value for this DomainWhoisObfuscatorStruct.
     * 
     * @param address
     */
    public void setAddress(boolean address) {
        this.address = address;
    }


    /**
     * Gets the phone value for this DomainWhoisObfuscatorStruct.
     * 
     * @return phone
     */
    public boolean isPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this DomainWhoisObfuscatorStruct.
     * 
     * @param phone
     */
    public void setPhone(boolean phone) {
        this.phone = phone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DomainWhoisObfuscatorStruct)) return false;
        DomainWhoisObfuscatorStruct other = (DomainWhoisObfuscatorStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.domain==null && other.getDomain()==null) || 
             (this.domain!=null &&
              this.domain.equals(other.getDomain()))) &&
            this.email == other.isEmail() &&
            this.address == other.isAddress() &&
            this.phone == other.isPhone();
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
        if (getDomain() != null) {
            _hashCode += getDomain().hashCode();
        }
        _hashCode += (isEmail() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAddress() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPhone() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DomainWhoisObfuscatorStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "domainWhoisObfuscatorStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone"));
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

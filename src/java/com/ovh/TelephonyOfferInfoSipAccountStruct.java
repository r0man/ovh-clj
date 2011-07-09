/**
 * TelephonyOfferInfoSipAccountStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyOfferInfoSipAccountStruct  implements java.io.Serializable {
    private java.lang.String username;

    private java.lang.String extension;

    private java.lang.String domain;

    private java.lang.String lastLogin;

    private java.lang.String localAdress;

    private java.lang.String publicAdress;

    public TelephonyOfferInfoSipAccountStruct() {
    }

    public TelephonyOfferInfoSipAccountStruct(
           java.lang.String username,
           java.lang.String extension,
           java.lang.String domain,
           java.lang.String lastLogin,
           java.lang.String localAdress,
           java.lang.String publicAdress) {
           this.username = username;
           this.extension = extension;
           this.domain = domain;
           this.lastLogin = lastLogin;
           this.localAdress = localAdress;
           this.publicAdress = publicAdress;
    }


    /**
     * Gets the username value for this TelephonyOfferInfoSipAccountStruct.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this TelephonyOfferInfoSipAccountStruct.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the extension value for this TelephonyOfferInfoSipAccountStruct.
     * 
     * @return extension
     */
    public java.lang.String getExtension() {
        return extension;
    }


    /**
     * Sets the extension value for this TelephonyOfferInfoSipAccountStruct.
     * 
     * @param extension
     */
    public void setExtension(java.lang.String extension) {
        this.extension = extension;
    }


    /**
     * Gets the domain value for this TelephonyOfferInfoSipAccountStruct.
     * 
     * @return domain
     */
    public java.lang.String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this TelephonyOfferInfoSipAccountStruct.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }


    /**
     * Gets the lastLogin value for this TelephonyOfferInfoSipAccountStruct.
     * 
     * @return lastLogin
     */
    public java.lang.String getLastLogin() {
        return lastLogin;
    }


    /**
     * Sets the lastLogin value for this TelephonyOfferInfoSipAccountStruct.
     * 
     * @param lastLogin
     */
    public void setLastLogin(java.lang.String lastLogin) {
        this.lastLogin = lastLogin;
    }


    /**
     * Gets the localAdress value for this TelephonyOfferInfoSipAccountStruct.
     * 
     * @return localAdress
     */
    public java.lang.String getLocalAdress() {
        return localAdress;
    }


    /**
     * Sets the localAdress value for this TelephonyOfferInfoSipAccountStruct.
     * 
     * @param localAdress
     */
    public void setLocalAdress(java.lang.String localAdress) {
        this.localAdress = localAdress;
    }


    /**
     * Gets the publicAdress value for this TelephonyOfferInfoSipAccountStruct.
     * 
     * @return publicAdress
     */
    public java.lang.String getPublicAdress() {
        return publicAdress;
    }


    /**
     * Sets the publicAdress value for this TelephonyOfferInfoSipAccountStruct.
     * 
     * @param publicAdress
     */
    public void setPublicAdress(java.lang.String publicAdress) {
        this.publicAdress = publicAdress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyOfferInfoSipAccountStruct)) return false;
        TelephonyOfferInfoSipAccountStruct other = (TelephonyOfferInfoSipAccountStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.extension==null && other.getExtension()==null) || 
             (this.extension!=null &&
              this.extension.equals(other.getExtension()))) &&
            ((this.domain==null && other.getDomain()==null) || 
             (this.domain!=null &&
              this.domain.equals(other.getDomain()))) &&
            ((this.lastLogin==null && other.getLastLogin()==null) || 
             (this.lastLogin!=null &&
              this.lastLogin.equals(other.getLastLogin()))) &&
            ((this.localAdress==null && other.getLocalAdress()==null) || 
             (this.localAdress!=null &&
              this.localAdress.equals(other.getLocalAdress()))) &&
            ((this.publicAdress==null && other.getPublicAdress()==null) || 
             (this.publicAdress!=null &&
              this.publicAdress.equals(other.getPublicAdress())));
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
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getExtension() != null) {
            _hashCode += getExtension().hashCode();
        }
        if (getDomain() != null) {
            _hashCode += getDomain().hashCode();
        }
        if (getLastLogin() != null) {
            _hashCode += getLastLogin().hashCode();
        }
        if (getLocalAdress() != null) {
            _hashCode += getLocalAdress().hashCode();
        }
        if (getPublicAdress() != null) {
            _hashCode += getPublicAdress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyOfferInfoSipAccountStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyOfferInfoSipAccountStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extension");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localAdress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localAdress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicAdress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicAdress"));
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

/**
 * TelephonyPlugAndPhoneInfoReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyPlugAndPhoneInfoReturn  implements java.io.Serializable {
    private java.lang.String brand;

    private java.lang.String protocol;

    private java.lang.String mac;

    private int gfKeyCount;

    private int pbLevel;

    private java.lang.String skin;

    public TelephonyPlugAndPhoneInfoReturn() {
    }

    public TelephonyPlugAndPhoneInfoReturn(
           java.lang.String brand,
           java.lang.String protocol,
           java.lang.String mac,
           int gfKeyCount,
           int pbLevel,
           java.lang.String skin) {
           this.brand = brand;
           this.protocol = protocol;
           this.mac = mac;
           this.gfKeyCount = gfKeyCount;
           this.pbLevel = pbLevel;
           this.skin = skin;
    }


    /**
     * Gets the brand value for this TelephonyPlugAndPhoneInfoReturn.
     * 
     * @return brand
     */
    public java.lang.String getBrand() {
        return brand;
    }


    /**
     * Sets the brand value for this TelephonyPlugAndPhoneInfoReturn.
     * 
     * @param brand
     */
    public void setBrand(java.lang.String brand) {
        this.brand = brand;
    }


    /**
     * Gets the protocol value for this TelephonyPlugAndPhoneInfoReturn.
     * 
     * @return protocol
     */
    public java.lang.String getProtocol() {
        return protocol;
    }


    /**
     * Sets the protocol value for this TelephonyPlugAndPhoneInfoReturn.
     * 
     * @param protocol
     */
    public void setProtocol(java.lang.String protocol) {
        this.protocol = protocol;
    }


    /**
     * Gets the mac value for this TelephonyPlugAndPhoneInfoReturn.
     * 
     * @return mac
     */
    public java.lang.String getMac() {
        return mac;
    }


    /**
     * Sets the mac value for this TelephonyPlugAndPhoneInfoReturn.
     * 
     * @param mac
     */
    public void setMac(java.lang.String mac) {
        this.mac = mac;
    }


    /**
     * Gets the gfKeyCount value for this TelephonyPlugAndPhoneInfoReturn.
     * 
     * @return gfKeyCount
     */
    public int getGfKeyCount() {
        return gfKeyCount;
    }


    /**
     * Sets the gfKeyCount value for this TelephonyPlugAndPhoneInfoReturn.
     * 
     * @param gfKeyCount
     */
    public void setGfKeyCount(int gfKeyCount) {
        this.gfKeyCount = gfKeyCount;
    }


    /**
     * Gets the pbLevel value for this TelephonyPlugAndPhoneInfoReturn.
     * 
     * @return pbLevel
     */
    public int getPbLevel() {
        return pbLevel;
    }


    /**
     * Sets the pbLevel value for this TelephonyPlugAndPhoneInfoReturn.
     * 
     * @param pbLevel
     */
    public void setPbLevel(int pbLevel) {
        this.pbLevel = pbLevel;
    }


    /**
     * Gets the skin value for this TelephonyPlugAndPhoneInfoReturn.
     * 
     * @return skin
     */
    public java.lang.String getSkin() {
        return skin;
    }


    /**
     * Sets the skin value for this TelephonyPlugAndPhoneInfoReturn.
     * 
     * @param skin
     */
    public void setSkin(java.lang.String skin) {
        this.skin = skin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyPlugAndPhoneInfoReturn)) return false;
        TelephonyPlugAndPhoneInfoReturn other = (TelephonyPlugAndPhoneInfoReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.brand==null && other.getBrand()==null) || 
             (this.brand!=null &&
              this.brand.equals(other.getBrand()))) &&
            ((this.protocol==null && other.getProtocol()==null) || 
             (this.protocol!=null &&
              this.protocol.equals(other.getProtocol()))) &&
            ((this.mac==null && other.getMac()==null) || 
             (this.mac!=null &&
              this.mac.equals(other.getMac()))) &&
            this.gfKeyCount == other.getGfKeyCount() &&
            this.pbLevel == other.getPbLevel() &&
            ((this.skin==null && other.getSkin()==null) || 
             (this.skin!=null &&
              this.skin.equals(other.getSkin())));
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
        if (getBrand() != null) {
            _hashCode += getBrand().hashCode();
        }
        if (getProtocol() != null) {
            _hashCode += getProtocol().hashCode();
        }
        if (getMac() != null) {
            _hashCode += getMac().hashCode();
        }
        _hashCode += getGfKeyCount();
        _hashCode += getPbLevel();
        if (getSkin() != null) {
            _hashCode += getSkin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyPlugAndPhoneInfoReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyPlugAndPhoneInfoReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brand");
        elemField.setXmlName(new javax.xml.namespace.QName("", "brand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mac");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mac"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gfKeyCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gfKeyCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pbLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pbLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "skin"));
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

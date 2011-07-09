/**
 * DomainCapabilitiesReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class DomainCapabilitiesReturn  implements java.io.Serializable {
    private boolean needAuthInfo;

    private boolean needZoneCheck;

    private boolean owo;

    private boolean hostIPv4;

    private boolean hostIPv6;

    private boolean hostmultiIp;

    private boolean ownerUpdateAllowed;

    private boolean ownerTradeAllowed;

    public DomainCapabilitiesReturn() {
    }

    public DomainCapabilitiesReturn(
           boolean needAuthInfo,
           boolean needZoneCheck,
           boolean owo,
           boolean hostIPv4,
           boolean hostIPv6,
           boolean hostmultiIp,
           boolean ownerUpdateAllowed,
           boolean ownerTradeAllowed) {
           this.needAuthInfo = needAuthInfo;
           this.needZoneCheck = needZoneCheck;
           this.owo = owo;
           this.hostIPv4 = hostIPv4;
           this.hostIPv6 = hostIPv6;
           this.hostmultiIp = hostmultiIp;
           this.ownerUpdateAllowed = ownerUpdateAllowed;
           this.ownerTradeAllowed = ownerTradeAllowed;
    }


    /**
     * Gets the needAuthInfo value for this DomainCapabilitiesReturn.
     * 
     * @return needAuthInfo
     */
    public boolean isNeedAuthInfo() {
        return needAuthInfo;
    }


    /**
     * Sets the needAuthInfo value for this DomainCapabilitiesReturn.
     * 
     * @param needAuthInfo
     */
    public void setNeedAuthInfo(boolean needAuthInfo) {
        this.needAuthInfo = needAuthInfo;
    }


    /**
     * Gets the needZoneCheck value for this DomainCapabilitiesReturn.
     * 
     * @return needZoneCheck
     */
    public boolean isNeedZoneCheck() {
        return needZoneCheck;
    }


    /**
     * Sets the needZoneCheck value for this DomainCapabilitiesReturn.
     * 
     * @param needZoneCheck
     */
    public void setNeedZoneCheck(boolean needZoneCheck) {
        this.needZoneCheck = needZoneCheck;
    }


    /**
     * Gets the owo value for this DomainCapabilitiesReturn.
     * 
     * @return owo
     */
    public boolean isOwo() {
        return owo;
    }


    /**
     * Sets the owo value for this DomainCapabilitiesReturn.
     * 
     * @param owo
     */
    public void setOwo(boolean owo) {
        this.owo = owo;
    }


    /**
     * Gets the hostIPv4 value for this DomainCapabilitiesReturn.
     * 
     * @return hostIPv4
     */
    public boolean isHostIPv4() {
        return hostIPv4;
    }


    /**
     * Sets the hostIPv4 value for this DomainCapabilitiesReturn.
     * 
     * @param hostIPv4
     */
    public void setHostIPv4(boolean hostIPv4) {
        this.hostIPv4 = hostIPv4;
    }


    /**
     * Gets the hostIPv6 value for this DomainCapabilitiesReturn.
     * 
     * @return hostIPv6
     */
    public boolean isHostIPv6() {
        return hostIPv6;
    }


    /**
     * Sets the hostIPv6 value for this DomainCapabilitiesReturn.
     * 
     * @param hostIPv6
     */
    public void setHostIPv6(boolean hostIPv6) {
        this.hostIPv6 = hostIPv6;
    }


    /**
     * Gets the hostmultiIp value for this DomainCapabilitiesReturn.
     * 
     * @return hostmultiIp
     */
    public boolean isHostmultiIp() {
        return hostmultiIp;
    }


    /**
     * Sets the hostmultiIp value for this DomainCapabilitiesReturn.
     * 
     * @param hostmultiIp
     */
    public void setHostmultiIp(boolean hostmultiIp) {
        this.hostmultiIp = hostmultiIp;
    }


    /**
     * Gets the ownerUpdateAllowed value for this DomainCapabilitiesReturn.
     * 
     * @return ownerUpdateAllowed
     */
    public boolean isOwnerUpdateAllowed() {
        return ownerUpdateAllowed;
    }


    /**
     * Sets the ownerUpdateAllowed value for this DomainCapabilitiesReturn.
     * 
     * @param ownerUpdateAllowed
     */
    public void setOwnerUpdateAllowed(boolean ownerUpdateAllowed) {
        this.ownerUpdateAllowed = ownerUpdateAllowed;
    }


    /**
     * Gets the ownerTradeAllowed value for this DomainCapabilitiesReturn.
     * 
     * @return ownerTradeAllowed
     */
    public boolean isOwnerTradeAllowed() {
        return ownerTradeAllowed;
    }


    /**
     * Sets the ownerTradeAllowed value for this DomainCapabilitiesReturn.
     * 
     * @param ownerTradeAllowed
     */
    public void setOwnerTradeAllowed(boolean ownerTradeAllowed) {
        this.ownerTradeAllowed = ownerTradeAllowed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DomainCapabilitiesReturn)) return false;
        DomainCapabilitiesReturn other = (DomainCapabilitiesReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.needAuthInfo == other.isNeedAuthInfo() &&
            this.needZoneCheck == other.isNeedZoneCheck() &&
            this.owo == other.isOwo() &&
            this.hostIPv4 == other.isHostIPv4() &&
            this.hostIPv6 == other.isHostIPv6() &&
            this.hostmultiIp == other.isHostmultiIp() &&
            this.ownerUpdateAllowed == other.isOwnerUpdateAllowed() &&
            this.ownerTradeAllowed == other.isOwnerTradeAllowed();
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
        _hashCode += (isNeedAuthInfo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isNeedZoneCheck() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOwo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHostIPv4() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHostIPv6() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHostmultiIp() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOwnerUpdateAllowed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOwnerTradeAllowed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DomainCapabilitiesReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "domainCapabilitiesReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("needAuthInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "needAuthInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("needZoneCheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "needZoneCheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "owo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostIPv4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostIPv4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostIPv6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostIPv6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostmultiIp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostmultiIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerUpdateAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownerUpdateAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerTradeAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownerTradeAllowed"));
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

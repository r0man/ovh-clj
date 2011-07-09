/**
 * TelephonyToneStatusReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyToneStatusReturn  implements java.io.Serializable {
    private boolean ringback;

    private boolean onhold;

    private boolean onclosure;

    private boolean callwaiting;

    public TelephonyToneStatusReturn() {
    }

    public TelephonyToneStatusReturn(
           boolean ringback,
           boolean onhold,
           boolean onclosure,
           boolean callwaiting) {
           this.ringback = ringback;
           this.onhold = onhold;
           this.onclosure = onclosure;
           this.callwaiting = callwaiting;
    }


    /**
     * Gets the ringback value for this TelephonyToneStatusReturn.
     * 
     * @return ringback
     */
    public boolean isRingback() {
        return ringback;
    }


    /**
     * Sets the ringback value for this TelephonyToneStatusReturn.
     * 
     * @param ringback
     */
    public void setRingback(boolean ringback) {
        this.ringback = ringback;
    }


    /**
     * Gets the onhold value for this TelephonyToneStatusReturn.
     * 
     * @return onhold
     */
    public boolean isOnhold() {
        return onhold;
    }


    /**
     * Sets the onhold value for this TelephonyToneStatusReturn.
     * 
     * @param onhold
     */
    public void setOnhold(boolean onhold) {
        this.onhold = onhold;
    }


    /**
     * Gets the onclosure value for this TelephonyToneStatusReturn.
     * 
     * @return onclosure
     */
    public boolean isOnclosure() {
        return onclosure;
    }


    /**
     * Sets the onclosure value for this TelephonyToneStatusReturn.
     * 
     * @param onclosure
     */
    public void setOnclosure(boolean onclosure) {
        this.onclosure = onclosure;
    }


    /**
     * Gets the callwaiting value for this TelephonyToneStatusReturn.
     * 
     * @return callwaiting
     */
    public boolean isCallwaiting() {
        return callwaiting;
    }


    /**
     * Sets the callwaiting value for this TelephonyToneStatusReturn.
     * 
     * @param callwaiting
     */
    public void setCallwaiting(boolean callwaiting) {
        this.callwaiting = callwaiting;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyToneStatusReturn)) return false;
        TelephonyToneStatusReturn other = (TelephonyToneStatusReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ringback == other.isRingback() &&
            this.onhold == other.isOnhold() &&
            this.onclosure == other.isOnclosure() &&
            this.callwaiting == other.isCallwaiting();
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
        _hashCode += (isRingback() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOnhold() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOnclosure() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCallwaiting() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyToneStatusReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyToneStatusReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ringback");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ringback"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onhold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "onhold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onclosure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "onclosure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callwaiting");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callwaiting"));
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

/**
 * TelephonyTonesOptionsListReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyTonesOptionsListReturn  implements java.io.Serializable {
    private boolean toneRingback;

    private boolean toneOnHold;

    private boolean toneOnClosure;

    private boolean toneOnCallWaiting;

    public TelephonyTonesOptionsListReturn() {
    }

    public TelephonyTonesOptionsListReturn(
           boolean toneRingback,
           boolean toneOnHold,
           boolean toneOnClosure,
           boolean toneOnCallWaiting) {
           this.toneRingback = toneRingback;
           this.toneOnHold = toneOnHold;
           this.toneOnClosure = toneOnClosure;
           this.toneOnCallWaiting = toneOnCallWaiting;
    }


    /**
     * Gets the toneRingback value for this TelephonyTonesOptionsListReturn.
     * 
     * @return toneRingback
     */
    public boolean isToneRingback() {
        return toneRingback;
    }


    /**
     * Sets the toneRingback value for this TelephonyTonesOptionsListReturn.
     * 
     * @param toneRingback
     */
    public void setToneRingback(boolean toneRingback) {
        this.toneRingback = toneRingback;
    }


    /**
     * Gets the toneOnHold value for this TelephonyTonesOptionsListReturn.
     * 
     * @return toneOnHold
     */
    public boolean isToneOnHold() {
        return toneOnHold;
    }


    /**
     * Sets the toneOnHold value for this TelephonyTonesOptionsListReturn.
     * 
     * @param toneOnHold
     */
    public void setToneOnHold(boolean toneOnHold) {
        this.toneOnHold = toneOnHold;
    }


    /**
     * Gets the toneOnClosure value for this TelephonyTonesOptionsListReturn.
     * 
     * @return toneOnClosure
     */
    public boolean isToneOnClosure() {
        return toneOnClosure;
    }


    /**
     * Sets the toneOnClosure value for this TelephonyTonesOptionsListReturn.
     * 
     * @param toneOnClosure
     */
    public void setToneOnClosure(boolean toneOnClosure) {
        this.toneOnClosure = toneOnClosure;
    }


    /**
     * Gets the toneOnCallWaiting value for this TelephonyTonesOptionsListReturn.
     * 
     * @return toneOnCallWaiting
     */
    public boolean isToneOnCallWaiting() {
        return toneOnCallWaiting;
    }


    /**
     * Sets the toneOnCallWaiting value for this TelephonyTonesOptionsListReturn.
     * 
     * @param toneOnCallWaiting
     */
    public void setToneOnCallWaiting(boolean toneOnCallWaiting) {
        this.toneOnCallWaiting = toneOnCallWaiting;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyTonesOptionsListReturn)) return false;
        TelephonyTonesOptionsListReturn other = (TelephonyTonesOptionsListReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.toneRingback == other.isToneRingback() &&
            this.toneOnHold == other.isToneOnHold() &&
            this.toneOnClosure == other.isToneOnClosure() &&
            this.toneOnCallWaiting == other.isToneOnCallWaiting();
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
        _hashCode += (isToneRingback() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isToneOnHold() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isToneOnClosure() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isToneOnCallWaiting() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyTonesOptionsListReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyTonesOptionsListReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toneRingback");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toneRingback"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toneOnHold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toneOnHold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toneOnClosure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toneOnClosure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toneOnCallWaiting");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toneOnCallWaiting"));
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

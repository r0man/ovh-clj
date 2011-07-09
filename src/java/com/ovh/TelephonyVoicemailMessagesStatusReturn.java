/**
 * TelephonyVoicemailMessagesStatusReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyVoicemailMessagesStatusReturn  implements java.io.Serializable {
    private boolean unavailable;

    private boolean busy;

    private boolean temp;

    private boolean greet;

    public TelephonyVoicemailMessagesStatusReturn() {
    }

    public TelephonyVoicemailMessagesStatusReturn(
           boolean unavailable,
           boolean busy,
           boolean temp,
           boolean greet) {
           this.unavailable = unavailable;
           this.busy = busy;
           this.temp = temp;
           this.greet = greet;
    }


    /**
     * Gets the unavailable value for this TelephonyVoicemailMessagesStatusReturn.
     * 
     * @return unavailable
     */
    public boolean isUnavailable() {
        return unavailable;
    }


    /**
     * Sets the unavailable value for this TelephonyVoicemailMessagesStatusReturn.
     * 
     * @param unavailable
     */
    public void setUnavailable(boolean unavailable) {
        this.unavailable = unavailable;
    }


    /**
     * Gets the busy value for this TelephonyVoicemailMessagesStatusReturn.
     * 
     * @return busy
     */
    public boolean isBusy() {
        return busy;
    }


    /**
     * Sets the busy value for this TelephonyVoicemailMessagesStatusReturn.
     * 
     * @param busy
     */
    public void setBusy(boolean busy) {
        this.busy = busy;
    }


    /**
     * Gets the temp value for this TelephonyVoicemailMessagesStatusReturn.
     * 
     * @return temp
     */
    public boolean isTemp() {
        return temp;
    }


    /**
     * Sets the temp value for this TelephonyVoicemailMessagesStatusReturn.
     * 
     * @param temp
     */
    public void setTemp(boolean temp) {
        this.temp = temp;
    }


    /**
     * Gets the greet value for this TelephonyVoicemailMessagesStatusReturn.
     * 
     * @return greet
     */
    public boolean isGreet() {
        return greet;
    }


    /**
     * Sets the greet value for this TelephonyVoicemailMessagesStatusReturn.
     * 
     * @param greet
     */
    public void setGreet(boolean greet) {
        this.greet = greet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyVoicemailMessagesStatusReturn)) return false;
        TelephonyVoicemailMessagesStatusReturn other = (TelephonyVoicemailMessagesStatusReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.unavailable == other.isUnavailable() &&
            this.busy == other.isBusy() &&
            this.temp == other.isTemp() &&
            this.greet == other.isGreet();
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
        _hashCode += (isUnavailable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isBusy() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTemp() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isGreet() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyVoicemailMessagesStatusReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyVoicemailMessagesStatusReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unavailable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unavailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "busy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "temp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("greet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "greet"));
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

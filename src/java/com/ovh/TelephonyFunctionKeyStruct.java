/**
 * TelephonyFunctionKeyStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyFunctionKeyStruct  implements java.io.Serializable {
    private int keyNum;

    private java.lang.String function;

    private java.lang.String relatedNumber;

    public TelephonyFunctionKeyStruct() {
    }

    public TelephonyFunctionKeyStruct(
           int keyNum,
           java.lang.String function,
           java.lang.String relatedNumber) {
           this.keyNum = keyNum;
           this.function = function;
           this.relatedNumber = relatedNumber;
    }


    /**
     * Gets the keyNum value for this TelephonyFunctionKeyStruct.
     * 
     * @return keyNum
     */
    public int getKeyNum() {
        return keyNum;
    }


    /**
     * Sets the keyNum value for this TelephonyFunctionKeyStruct.
     * 
     * @param keyNum
     */
    public void setKeyNum(int keyNum) {
        this.keyNum = keyNum;
    }


    /**
     * Gets the function value for this TelephonyFunctionKeyStruct.
     * 
     * @return function
     */
    public java.lang.String getFunction() {
        return function;
    }


    /**
     * Sets the function value for this TelephonyFunctionKeyStruct.
     * 
     * @param function
     */
    public void setFunction(java.lang.String function) {
        this.function = function;
    }


    /**
     * Gets the relatedNumber value for this TelephonyFunctionKeyStruct.
     * 
     * @return relatedNumber
     */
    public java.lang.String getRelatedNumber() {
        return relatedNumber;
    }


    /**
     * Sets the relatedNumber value for this TelephonyFunctionKeyStruct.
     * 
     * @param relatedNumber
     */
    public void setRelatedNumber(java.lang.String relatedNumber) {
        this.relatedNumber = relatedNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyFunctionKeyStruct)) return false;
        TelephonyFunctionKeyStruct other = (TelephonyFunctionKeyStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.keyNum == other.getKeyNum() &&
            ((this.function==null && other.getFunction()==null) || 
             (this.function!=null &&
              this.function.equals(other.getFunction()))) &&
            ((this.relatedNumber==null && other.getRelatedNumber()==null) || 
             (this.relatedNumber!=null &&
              this.relatedNumber.equals(other.getRelatedNumber())));
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
        _hashCode += getKeyNum();
        if (getFunction() != null) {
            _hashCode += getFunction().hashCode();
        }
        if (getRelatedNumber() != null) {
            _hashCode += getRelatedNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyFunctionKeyStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyFunctionKeyStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keyNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("function");
        elemField.setXmlName(new javax.xml.namespace.QName("", "function"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relatedNumber"));
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

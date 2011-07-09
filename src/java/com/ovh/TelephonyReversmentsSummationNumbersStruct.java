/**
 * TelephonyReversmentsSummationNumbersStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyReversmentsSummationNumbersStruct  implements java.io.Serializable {
    private java.lang.String number;

    private com.ovh.TelephonyReversmentsSummationStruct[] reversementsSummationStruct;

    public TelephonyReversmentsSummationNumbersStruct() {
    }

    public TelephonyReversmentsSummationNumbersStruct(
           java.lang.String number,
           com.ovh.TelephonyReversmentsSummationStruct[] reversementsSummationStruct) {
           this.number = number;
           this.reversementsSummationStruct = reversementsSummationStruct;
    }


    /**
     * Gets the number value for this TelephonyReversmentsSummationNumbersStruct.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this TelephonyReversmentsSummationNumbersStruct.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the reversementsSummationStruct value for this TelephonyReversmentsSummationNumbersStruct.
     * 
     * @return reversementsSummationStruct
     */
    public com.ovh.TelephonyReversmentsSummationStruct[] getReversementsSummationStruct() {
        return reversementsSummationStruct;
    }


    /**
     * Sets the reversementsSummationStruct value for this TelephonyReversmentsSummationNumbersStruct.
     * 
     * @param reversementsSummationStruct
     */
    public void setReversementsSummationStruct(com.ovh.TelephonyReversmentsSummationStruct[] reversementsSummationStruct) {
        this.reversementsSummationStruct = reversementsSummationStruct;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyReversmentsSummationNumbersStruct)) return false;
        TelephonyReversmentsSummationNumbersStruct other = (TelephonyReversmentsSummationNumbersStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.reversementsSummationStruct==null && other.getReversementsSummationStruct()==null) || 
             (this.reversementsSummationStruct!=null &&
              java.util.Arrays.equals(this.reversementsSummationStruct, other.getReversementsSummationStruct())));
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
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getReversementsSummationStruct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReversementsSummationStruct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReversementsSummationStruct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyReversmentsSummationNumbersStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyReversmentsSummationNumbersStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reversementsSummationStruct");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reversementsSummationStruct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyReversmentsSummationStruct"));
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

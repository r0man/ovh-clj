/**
 * TelephonyFaxSummaryStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyFaxSummaryStruct  implements java.io.Serializable {
    private com.ovh.TelephonyFaxSummaryDetailsStruct low;

    private com.ovh.TelephonyFaxSummaryDetailsStruct high;

    public TelephonyFaxSummaryStruct() {
    }

    public TelephonyFaxSummaryStruct(
           com.ovh.TelephonyFaxSummaryDetailsStruct low,
           com.ovh.TelephonyFaxSummaryDetailsStruct high) {
           this.low = low;
           this.high = high;
    }


    /**
     * Gets the low value for this TelephonyFaxSummaryStruct.
     * 
     * @return low
     */
    public com.ovh.TelephonyFaxSummaryDetailsStruct getLow() {
        return low;
    }


    /**
     * Sets the low value for this TelephonyFaxSummaryStruct.
     * 
     * @param low
     */
    public void setLow(com.ovh.TelephonyFaxSummaryDetailsStruct low) {
        this.low = low;
    }


    /**
     * Gets the high value for this TelephonyFaxSummaryStruct.
     * 
     * @return high
     */
    public com.ovh.TelephonyFaxSummaryDetailsStruct getHigh() {
        return high;
    }


    /**
     * Sets the high value for this TelephonyFaxSummaryStruct.
     * 
     * @param high
     */
    public void setHigh(com.ovh.TelephonyFaxSummaryDetailsStruct high) {
        this.high = high;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyFaxSummaryStruct)) return false;
        TelephonyFaxSummaryStruct other = (TelephonyFaxSummaryStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.low==null && other.getLow()==null) || 
             (this.low!=null &&
              this.low.equals(other.getLow()))) &&
            ((this.high==null && other.getHigh()==null) || 
             (this.high!=null &&
              this.high.equals(other.getHigh())));
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
        if (getLow() != null) {
            _hashCode += getLow().hashCode();
        }
        if (getHigh() != null) {
            _hashCode += getHigh().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyFaxSummaryStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyFaxSummaryStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("low");
        elemField.setXmlName(new javax.xml.namespace.QName("", "low"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyFaxSummaryDetailsStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("high");
        elemField.setXmlName(new javax.xml.namespace.QName("", "high"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyFaxSummaryDetailsStruct"));
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

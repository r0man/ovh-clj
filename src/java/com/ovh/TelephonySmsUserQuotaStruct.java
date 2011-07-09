/**
 * TelephonySmsUserQuotaStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonySmsUserQuotaStruct  implements java.io.Serializable {
    private java.lang.String quotaLeft;

    private java.lang.String quotaStatus;

    public TelephonySmsUserQuotaStruct() {
    }

    public TelephonySmsUserQuotaStruct(
           java.lang.String quotaLeft,
           java.lang.String quotaStatus) {
           this.quotaLeft = quotaLeft;
           this.quotaStatus = quotaStatus;
    }


    /**
     * Gets the quotaLeft value for this TelephonySmsUserQuotaStruct.
     * 
     * @return quotaLeft
     */
    public java.lang.String getQuotaLeft() {
        return quotaLeft;
    }


    /**
     * Sets the quotaLeft value for this TelephonySmsUserQuotaStruct.
     * 
     * @param quotaLeft
     */
    public void setQuotaLeft(java.lang.String quotaLeft) {
        this.quotaLeft = quotaLeft;
    }


    /**
     * Gets the quotaStatus value for this TelephonySmsUserQuotaStruct.
     * 
     * @return quotaStatus
     */
    public java.lang.String getQuotaStatus() {
        return quotaStatus;
    }


    /**
     * Sets the quotaStatus value for this TelephonySmsUserQuotaStruct.
     * 
     * @param quotaStatus
     */
    public void setQuotaStatus(java.lang.String quotaStatus) {
        this.quotaStatus = quotaStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonySmsUserQuotaStruct)) return false;
        TelephonySmsUserQuotaStruct other = (TelephonySmsUserQuotaStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.quotaLeft==null && other.getQuotaLeft()==null) || 
             (this.quotaLeft!=null &&
              this.quotaLeft.equals(other.getQuotaLeft()))) &&
            ((this.quotaStatus==null && other.getQuotaStatus()==null) || 
             (this.quotaStatus!=null &&
              this.quotaStatus.equals(other.getQuotaStatus())));
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
        if (getQuotaLeft() != null) {
            _hashCode += getQuotaLeft().hashCode();
        }
        if (getQuotaStatus() != null) {
            _hashCode += getQuotaStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonySmsUserQuotaStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonySmsUserQuotaStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quotaLeft");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quotaLeft"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quotaStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quotaStatus"));
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

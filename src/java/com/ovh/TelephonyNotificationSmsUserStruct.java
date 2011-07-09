/**
 * TelephonyNotificationSmsUserStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyNotificationSmsUserStruct  implements java.io.Serializable {
    private java.lang.String support;

    private java.lang.String alertThreshold;

    private java.lang.String alertNumber;

    public TelephonyNotificationSmsUserStruct() {
    }

    public TelephonyNotificationSmsUserStruct(
           java.lang.String support,
           java.lang.String alertThreshold,
           java.lang.String alertNumber) {
           this.support = support;
           this.alertThreshold = alertThreshold;
           this.alertNumber = alertNumber;
    }


    /**
     * Gets the support value for this TelephonyNotificationSmsUserStruct.
     * 
     * @return support
     */
    public java.lang.String getSupport() {
        return support;
    }


    /**
     * Sets the support value for this TelephonyNotificationSmsUserStruct.
     * 
     * @param support
     */
    public void setSupport(java.lang.String support) {
        this.support = support;
    }


    /**
     * Gets the alertThreshold value for this TelephonyNotificationSmsUserStruct.
     * 
     * @return alertThreshold
     */
    public java.lang.String getAlertThreshold() {
        return alertThreshold;
    }


    /**
     * Sets the alertThreshold value for this TelephonyNotificationSmsUserStruct.
     * 
     * @param alertThreshold
     */
    public void setAlertThreshold(java.lang.String alertThreshold) {
        this.alertThreshold = alertThreshold;
    }


    /**
     * Gets the alertNumber value for this TelephonyNotificationSmsUserStruct.
     * 
     * @return alertNumber
     */
    public java.lang.String getAlertNumber() {
        return alertNumber;
    }


    /**
     * Sets the alertNumber value for this TelephonyNotificationSmsUserStruct.
     * 
     * @param alertNumber
     */
    public void setAlertNumber(java.lang.String alertNumber) {
        this.alertNumber = alertNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyNotificationSmsUserStruct)) return false;
        TelephonyNotificationSmsUserStruct other = (TelephonyNotificationSmsUserStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.support==null && other.getSupport()==null) || 
             (this.support!=null &&
              this.support.equals(other.getSupport()))) &&
            ((this.alertThreshold==null && other.getAlertThreshold()==null) || 
             (this.alertThreshold!=null &&
              this.alertThreshold.equals(other.getAlertThreshold()))) &&
            ((this.alertNumber==null && other.getAlertNumber()==null) || 
             (this.alertNumber!=null &&
              this.alertNumber.equals(other.getAlertNumber())));
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
        if (getSupport() != null) {
            _hashCode += getSupport().hashCode();
        }
        if (getAlertThreshold() != null) {
            _hashCode += getAlertThreshold().hashCode();
        }
        if (getAlertNumber() != null) {
            _hashCode += getAlertNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyNotificationSmsUserStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyNotificationSmsUserStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("support");
        elemField.setXmlName(new javax.xml.namespace.QName("", "support"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alertThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alertNumber"));
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

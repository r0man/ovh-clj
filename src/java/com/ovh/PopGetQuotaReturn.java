/**
 * PopGetQuotaReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class PopGetQuotaReturn  implements java.io.Serializable {
    private int emailCount;

    private int quota;

    private int maxQuota;

    public PopGetQuotaReturn() {
    }

    public PopGetQuotaReturn(
           int emailCount,
           int quota,
           int maxQuota) {
           this.emailCount = emailCount;
           this.quota = quota;
           this.maxQuota = maxQuota;
    }


    /**
     * Gets the emailCount value for this PopGetQuotaReturn.
     * 
     * @return emailCount
     */
    public int getEmailCount() {
        return emailCount;
    }


    /**
     * Sets the emailCount value for this PopGetQuotaReturn.
     * 
     * @param emailCount
     */
    public void setEmailCount(int emailCount) {
        this.emailCount = emailCount;
    }


    /**
     * Gets the quota value for this PopGetQuotaReturn.
     * 
     * @return quota
     */
    public int getQuota() {
        return quota;
    }


    /**
     * Sets the quota value for this PopGetQuotaReturn.
     * 
     * @param quota
     */
    public void setQuota(int quota) {
        this.quota = quota;
    }


    /**
     * Gets the maxQuota value for this PopGetQuotaReturn.
     * 
     * @return maxQuota
     */
    public int getMaxQuota() {
        return maxQuota;
    }


    /**
     * Sets the maxQuota value for this PopGetQuotaReturn.
     * 
     * @param maxQuota
     */
    public void setMaxQuota(int maxQuota) {
        this.maxQuota = maxQuota;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PopGetQuotaReturn)) return false;
        PopGetQuotaReturn other = (PopGetQuotaReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.emailCount == other.getEmailCount() &&
            this.quota == other.getQuota() &&
            this.maxQuota == other.getMaxQuota();
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
        _hashCode += getEmailCount();
        _hashCode += getQuota();
        _hashCode += getMaxQuota();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PopGetQuotaReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "popGetQuotaReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quota");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxQuota");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxQuota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

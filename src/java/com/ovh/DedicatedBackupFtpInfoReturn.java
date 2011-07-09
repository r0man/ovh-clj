/**
 * DedicatedBackupFtpInfoReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class DedicatedBackupFtpInfoReturn  implements java.io.Serializable {
    private java.lang.String ftpBackupName;

    private int quotaUsed;

    private int quotaSize;

    public DedicatedBackupFtpInfoReturn() {
    }

    public DedicatedBackupFtpInfoReturn(
           java.lang.String ftpBackupName,
           int quotaUsed,
           int quotaSize) {
           this.ftpBackupName = ftpBackupName;
           this.quotaUsed = quotaUsed;
           this.quotaSize = quotaSize;
    }


    /**
     * Gets the ftpBackupName value for this DedicatedBackupFtpInfoReturn.
     * 
     * @return ftpBackupName
     */
    public java.lang.String getFtpBackupName() {
        return ftpBackupName;
    }


    /**
     * Sets the ftpBackupName value for this DedicatedBackupFtpInfoReturn.
     * 
     * @param ftpBackupName
     */
    public void setFtpBackupName(java.lang.String ftpBackupName) {
        this.ftpBackupName = ftpBackupName;
    }


    /**
     * Gets the quotaUsed value for this DedicatedBackupFtpInfoReturn.
     * 
     * @return quotaUsed
     */
    public int getQuotaUsed() {
        return quotaUsed;
    }


    /**
     * Sets the quotaUsed value for this DedicatedBackupFtpInfoReturn.
     * 
     * @param quotaUsed
     */
    public void setQuotaUsed(int quotaUsed) {
        this.quotaUsed = quotaUsed;
    }


    /**
     * Gets the quotaSize value for this DedicatedBackupFtpInfoReturn.
     * 
     * @return quotaSize
     */
    public int getQuotaSize() {
        return quotaSize;
    }


    /**
     * Sets the quotaSize value for this DedicatedBackupFtpInfoReturn.
     * 
     * @param quotaSize
     */
    public void setQuotaSize(int quotaSize) {
        this.quotaSize = quotaSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DedicatedBackupFtpInfoReturn)) return false;
        DedicatedBackupFtpInfoReturn other = (DedicatedBackupFtpInfoReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ftpBackupName==null && other.getFtpBackupName()==null) || 
             (this.ftpBackupName!=null &&
              this.ftpBackupName.equals(other.getFtpBackupName()))) &&
            this.quotaUsed == other.getQuotaUsed() &&
            this.quotaSize == other.getQuotaSize();
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
        if (getFtpBackupName() != null) {
            _hashCode += getFtpBackupName().hashCode();
        }
        _hashCode += getQuotaUsed();
        _hashCode += getQuotaSize();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DedicatedBackupFtpInfoReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedBackupFtpInfoReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ftpBackupName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ftpBackupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quotaUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quotaUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quotaSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quotaSize"));
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

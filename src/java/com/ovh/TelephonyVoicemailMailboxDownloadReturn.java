/**
 * TelephonyVoicemailMailboxDownloadReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyVoicemailMailboxDownloadReturn  implements java.io.Serializable {
    private java.lang.String fileName;

    private java.lang.String fileData;

    private java.lang.String md5Sum;

    public TelephonyVoicemailMailboxDownloadReturn() {
    }

    public TelephonyVoicemailMailboxDownloadReturn(
           java.lang.String fileName,
           java.lang.String fileData,
           java.lang.String md5Sum) {
           this.fileName = fileName;
           this.fileData = fileData;
           this.md5Sum = md5Sum;
    }


    /**
     * Gets the fileName value for this TelephonyVoicemailMailboxDownloadReturn.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this TelephonyVoicemailMailboxDownloadReturn.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the fileData value for this TelephonyVoicemailMailboxDownloadReturn.
     * 
     * @return fileData
     */
    public java.lang.String getFileData() {
        return fileData;
    }


    /**
     * Sets the fileData value for this TelephonyVoicemailMailboxDownloadReturn.
     * 
     * @param fileData
     */
    public void setFileData(java.lang.String fileData) {
        this.fileData = fileData;
    }


    /**
     * Gets the md5Sum value for this TelephonyVoicemailMailboxDownloadReturn.
     * 
     * @return md5Sum
     */
    public java.lang.String getMd5Sum() {
        return md5Sum;
    }


    /**
     * Sets the md5Sum value for this TelephonyVoicemailMailboxDownloadReturn.
     * 
     * @param md5Sum
     */
    public void setMd5Sum(java.lang.String md5Sum) {
        this.md5Sum = md5Sum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyVoicemailMailboxDownloadReturn)) return false;
        TelephonyVoicemailMailboxDownloadReturn other = (TelephonyVoicemailMailboxDownloadReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.fileData==null && other.getFileData()==null) || 
             (this.fileData!=null &&
              this.fileData.equals(other.getFileData()))) &&
            ((this.md5Sum==null && other.getMd5Sum()==null) || 
             (this.md5Sum!=null &&
              this.md5Sum.equals(other.getMd5Sum())));
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
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getFileData() != null) {
            _hashCode += getFileData().hashCode();
        }
        if (getMd5Sum() != null) {
            _hashCode += getMd5Sum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyVoicemailMailboxDownloadReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyVoicemailMailboxDownloadReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("md5Sum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "md5sum"));
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

/**
 * DedicatedBackupDateStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class DedicatedBackupDateStruct  implements java.io.Serializable {
    private java.lang.String hour;

    private java.lang.String superBackupName;

    private java.lang.String day;

    private int id;

    private int backupCount;

    public DedicatedBackupDateStruct() {
    }

    public DedicatedBackupDateStruct(
           java.lang.String hour,
           java.lang.String superBackupName,
           java.lang.String day,
           int id,
           int backupCount) {
           this.hour = hour;
           this.superBackupName = superBackupName;
           this.day = day;
           this.id = id;
           this.backupCount = backupCount;
    }


    /**
     * Gets the hour value for this DedicatedBackupDateStruct.
     * 
     * @return hour
     */
    public java.lang.String getHour() {
        return hour;
    }


    /**
     * Sets the hour value for this DedicatedBackupDateStruct.
     * 
     * @param hour
     */
    public void setHour(java.lang.String hour) {
        this.hour = hour;
    }


    /**
     * Gets the superBackupName value for this DedicatedBackupDateStruct.
     * 
     * @return superBackupName
     */
    public java.lang.String getSuperBackupName() {
        return superBackupName;
    }


    /**
     * Sets the superBackupName value for this DedicatedBackupDateStruct.
     * 
     * @param superBackupName
     */
    public void setSuperBackupName(java.lang.String superBackupName) {
        this.superBackupName = superBackupName;
    }


    /**
     * Gets the day value for this DedicatedBackupDateStruct.
     * 
     * @return day
     */
    public java.lang.String getDay() {
        return day;
    }


    /**
     * Sets the day value for this DedicatedBackupDateStruct.
     * 
     * @param day
     */
    public void setDay(java.lang.String day) {
        this.day = day;
    }


    /**
     * Gets the id value for this DedicatedBackupDateStruct.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this DedicatedBackupDateStruct.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the backupCount value for this DedicatedBackupDateStruct.
     * 
     * @return backupCount
     */
    public int getBackupCount() {
        return backupCount;
    }


    /**
     * Sets the backupCount value for this DedicatedBackupDateStruct.
     * 
     * @param backupCount
     */
    public void setBackupCount(int backupCount) {
        this.backupCount = backupCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DedicatedBackupDateStruct)) return false;
        DedicatedBackupDateStruct other = (DedicatedBackupDateStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hour==null && other.getHour()==null) || 
             (this.hour!=null &&
              this.hour.equals(other.getHour()))) &&
            ((this.superBackupName==null && other.getSuperBackupName()==null) || 
             (this.superBackupName!=null &&
              this.superBackupName.equals(other.getSuperBackupName()))) &&
            ((this.day==null && other.getDay()==null) || 
             (this.day!=null &&
              this.day.equals(other.getDay()))) &&
            this.id == other.getId() &&
            this.backupCount == other.getBackupCount();
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
        if (getHour() != null) {
            _hashCode += getHour().hashCode();
        }
        if (getSuperBackupName() != null) {
            _hashCode += getSuperBackupName().hashCode();
        }
        if (getDay() != null) {
            _hashCode += getDay().hashCode();
        }
        _hashCode += getId();
        _hashCode += getBackupCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DedicatedBackupDateStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedBackupDateStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hour");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("superBackupName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "superBackupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("", "day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backupCount"));
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

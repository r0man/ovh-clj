/**
 * DedicatedAllowedDistributionDetailsStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class DedicatedAllowedDistributionDetailsStruct  implements java.io.Serializable {
    private com.ovh.DedicatedAllowedDistributionLanguageStruct[] language;

    private java.lang.String[] languageList;

    private java.lang.String defaultLanguage;

    private com.ovh.DedicatedAllowedDistributionBitFormatStruct[] bitFormat;

    private java.lang.String longName;

    private java.lang.String name;

    public DedicatedAllowedDistributionDetailsStruct() {
    }

    public DedicatedAllowedDistributionDetailsStruct(
           com.ovh.DedicatedAllowedDistributionLanguageStruct[] language,
           java.lang.String[] languageList,
           java.lang.String defaultLanguage,
           com.ovh.DedicatedAllowedDistributionBitFormatStruct[] bitFormat,
           java.lang.String longName,
           java.lang.String name) {
           this.language = language;
           this.languageList = languageList;
           this.defaultLanguage = defaultLanguage;
           this.bitFormat = bitFormat;
           this.longName = longName;
           this.name = name;
    }


    /**
     * Gets the language value for this DedicatedAllowedDistributionDetailsStruct.
     * 
     * @return language
     */
    public com.ovh.DedicatedAllowedDistributionLanguageStruct[] getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this DedicatedAllowedDistributionDetailsStruct.
     * 
     * @param language
     */
    public void setLanguage(com.ovh.DedicatedAllowedDistributionLanguageStruct[] language) {
        this.language = language;
    }


    /**
     * Gets the languageList value for this DedicatedAllowedDistributionDetailsStruct.
     * 
     * @return languageList
     */
    public java.lang.String[] getLanguageList() {
        return languageList;
    }


    /**
     * Sets the languageList value for this DedicatedAllowedDistributionDetailsStruct.
     * 
     * @param languageList
     */
    public void setLanguageList(java.lang.String[] languageList) {
        this.languageList = languageList;
    }


    /**
     * Gets the defaultLanguage value for this DedicatedAllowedDistributionDetailsStruct.
     * 
     * @return defaultLanguage
     */
    public java.lang.String getDefaultLanguage() {
        return defaultLanguage;
    }


    /**
     * Sets the defaultLanguage value for this DedicatedAllowedDistributionDetailsStruct.
     * 
     * @param defaultLanguage
     */
    public void setDefaultLanguage(java.lang.String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
    }


    /**
     * Gets the bitFormat value for this DedicatedAllowedDistributionDetailsStruct.
     * 
     * @return bitFormat
     */
    public com.ovh.DedicatedAllowedDistributionBitFormatStruct[] getBitFormat() {
        return bitFormat;
    }


    /**
     * Sets the bitFormat value for this DedicatedAllowedDistributionDetailsStruct.
     * 
     * @param bitFormat
     */
    public void setBitFormat(com.ovh.DedicatedAllowedDistributionBitFormatStruct[] bitFormat) {
        this.bitFormat = bitFormat;
    }


    /**
     * Gets the longName value for this DedicatedAllowedDistributionDetailsStruct.
     * 
     * @return longName
     */
    public java.lang.String getLongName() {
        return longName;
    }


    /**
     * Sets the longName value for this DedicatedAllowedDistributionDetailsStruct.
     * 
     * @param longName
     */
    public void setLongName(java.lang.String longName) {
        this.longName = longName;
    }


    /**
     * Gets the name value for this DedicatedAllowedDistributionDetailsStruct.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DedicatedAllowedDistributionDetailsStruct.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DedicatedAllowedDistributionDetailsStruct)) return false;
        DedicatedAllowedDistributionDetailsStruct other = (DedicatedAllowedDistributionDetailsStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              java.util.Arrays.equals(this.language, other.getLanguage()))) &&
            ((this.languageList==null && other.getLanguageList()==null) || 
             (this.languageList!=null &&
              java.util.Arrays.equals(this.languageList, other.getLanguageList()))) &&
            ((this.defaultLanguage==null && other.getDefaultLanguage()==null) || 
             (this.defaultLanguage!=null &&
              this.defaultLanguage.equals(other.getDefaultLanguage()))) &&
            ((this.bitFormat==null && other.getBitFormat()==null) || 
             (this.bitFormat!=null &&
              java.util.Arrays.equals(this.bitFormat, other.getBitFormat()))) &&
            ((this.longName==null && other.getLongName()==null) || 
             (this.longName!=null &&
              this.longName.equals(other.getLongName()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getLanguage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLanguage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLanguage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLanguageList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLanguageList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLanguageList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultLanguage() != null) {
            _hashCode += getDefaultLanguage().hashCode();
        }
        if (getBitFormat() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBitFormat());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBitFormat(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLongName() != null) {
            _hashCode += getLongName().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DedicatedAllowedDistributionDetailsStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedAllowedDistributionDetailsStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedAllowedDistributionLanguageStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "languageList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bitFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bitFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedAllowedDistributionBitFormatStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "longName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
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

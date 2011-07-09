/**
 * TelephonyDirectoryWayTypeStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyDirectoryWayTypeStruct  implements java.io.Serializable {
    private java.lang.String abbreviatedName;

    private java.lang.String wayName;

    private java.lang.String tag;

    public TelephonyDirectoryWayTypeStruct() {
    }

    public TelephonyDirectoryWayTypeStruct(
           java.lang.String abbreviatedName,
           java.lang.String wayName,
           java.lang.String tag) {
           this.abbreviatedName = abbreviatedName;
           this.wayName = wayName;
           this.tag = tag;
    }


    /**
     * Gets the abbreviatedName value for this TelephonyDirectoryWayTypeStruct.
     * 
     * @return abbreviatedName
     */
    public java.lang.String getAbbreviatedName() {
        return abbreviatedName;
    }


    /**
     * Sets the abbreviatedName value for this TelephonyDirectoryWayTypeStruct.
     * 
     * @param abbreviatedName
     */
    public void setAbbreviatedName(java.lang.String abbreviatedName) {
        this.abbreviatedName = abbreviatedName;
    }


    /**
     * Gets the wayName value for this TelephonyDirectoryWayTypeStruct.
     * 
     * @return wayName
     */
    public java.lang.String getWayName() {
        return wayName;
    }


    /**
     * Sets the wayName value for this TelephonyDirectoryWayTypeStruct.
     * 
     * @param wayName
     */
    public void setWayName(java.lang.String wayName) {
        this.wayName = wayName;
    }


    /**
     * Gets the tag value for this TelephonyDirectoryWayTypeStruct.
     * 
     * @return tag
     */
    public java.lang.String getTag() {
        return tag;
    }


    /**
     * Sets the tag value for this TelephonyDirectoryWayTypeStruct.
     * 
     * @param tag
     */
    public void setTag(java.lang.String tag) {
        this.tag = tag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyDirectoryWayTypeStruct)) return false;
        TelephonyDirectoryWayTypeStruct other = (TelephonyDirectoryWayTypeStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.abbreviatedName==null && other.getAbbreviatedName()==null) || 
             (this.abbreviatedName!=null &&
              this.abbreviatedName.equals(other.getAbbreviatedName()))) &&
            ((this.wayName==null && other.getWayName()==null) || 
             (this.wayName!=null &&
              this.wayName.equals(other.getWayName()))) &&
            ((this.tag==null && other.getTag()==null) || 
             (this.tag!=null &&
              this.tag.equals(other.getTag())));
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
        if (getAbbreviatedName() != null) {
            _hashCode += getAbbreviatedName().hashCode();
        }
        if (getWayName() != null) {
            _hashCode += getWayName().hashCode();
        }
        if (getTag() != null) {
            _hashCode += getTag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyDirectoryWayTypeStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyDirectoryWayTypeStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abbreviatedName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "abbreviatedName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wayName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tag"));
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

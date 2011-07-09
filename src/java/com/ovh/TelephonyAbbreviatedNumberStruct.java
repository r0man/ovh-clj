/**
 * TelephonyAbbreviatedNumberStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyAbbreviatedNumberStruct  implements java.io.Serializable {
    private java.lang.String abbreviatedNumber;

    private java.lang.String relatedNumber;

    private java.lang.String name;

    private java.lang.String surname;

    public TelephonyAbbreviatedNumberStruct() {
    }

    public TelephonyAbbreviatedNumberStruct(
           java.lang.String abbreviatedNumber,
           java.lang.String relatedNumber,
           java.lang.String name,
           java.lang.String surname) {
           this.abbreviatedNumber = abbreviatedNumber;
           this.relatedNumber = relatedNumber;
           this.name = name;
           this.surname = surname;
    }


    /**
     * Gets the abbreviatedNumber value for this TelephonyAbbreviatedNumberStruct.
     * 
     * @return abbreviatedNumber
     */
    public java.lang.String getAbbreviatedNumber() {
        return abbreviatedNumber;
    }


    /**
     * Sets the abbreviatedNumber value for this TelephonyAbbreviatedNumberStruct.
     * 
     * @param abbreviatedNumber
     */
    public void setAbbreviatedNumber(java.lang.String abbreviatedNumber) {
        this.abbreviatedNumber = abbreviatedNumber;
    }


    /**
     * Gets the relatedNumber value for this TelephonyAbbreviatedNumberStruct.
     * 
     * @return relatedNumber
     */
    public java.lang.String getRelatedNumber() {
        return relatedNumber;
    }


    /**
     * Sets the relatedNumber value for this TelephonyAbbreviatedNumberStruct.
     * 
     * @param relatedNumber
     */
    public void setRelatedNumber(java.lang.String relatedNumber) {
        this.relatedNumber = relatedNumber;
    }


    /**
     * Gets the name value for this TelephonyAbbreviatedNumberStruct.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TelephonyAbbreviatedNumberStruct.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the surname value for this TelephonyAbbreviatedNumberStruct.
     * 
     * @return surname
     */
    public java.lang.String getSurname() {
        return surname;
    }


    /**
     * Sets the surname value for this TelephonyAbbreviatedNumberStruct.
     * 
     * @param surname
     */
    public void setSurname(java.lang.String surname) {
        this.surname = surname;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyAbbreviatedNumberStruct)) return false;
        TelephonyAbbreviatedNumberStruct other = (TelephonyAbbreviatedNumberStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.abbreviatedNumber==null && other.getAbbreviatedNumber()==null) || 
             (this.abbreviatedNumber!=null &&
              this.abbreviatedNumber.equals(other.getAbbreviatedNumber()))) &&
            ((this.relatedNumber==null && other.getRelatedNumber()==null) || 
             (this.relatedNumber!=null &&
              this.relatedNumber.equals(other.getRelatedNumber()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.surname==null && other.getSurname()==null) || 
             (this.surname!=null &&
              this.surname.equals(other.getSurname())));
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
        if (getAbbreviatedNumber() != null) {
            _hashCode += getAbbreviatedNumber().hashCode();
        }
        if (getRelatedNumber() != null) {
            _hashCode += getRelatedNumber().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSurname() != null) {
            _hashCode += getSurname().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyAbbreviatedNumberStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyAbbreviatedNumberStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abbreviatedNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "abbreviatedNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relatedNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "surname"));
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

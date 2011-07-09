/**
 * TelephonyReversmentsSummationStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyReversmentsSummationStruct  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String name;

    private java.lang.String seconds;

    private java.lang.String priceReversed;

    private java.lang.String calls;

    public TelephonyReversmentsSummationStruct() {
    }

    public TelephonyReversmentsSummationStruct(
           java.lang.String type,
           java.lang.String name,
           java.lang.String seconds,
           java.lang.String priceReversed,
           java.lang.String calls) {
           this.type = type;
           this.name = name;
           this.seconds = seconds;
           this.priceReversed = priceReversed;
           this.calls = calls;
    }


    /**
     * Gets the type value for this TelephonyReversmentsSummationStruct.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this TelephonyReversmentsSummationStruct.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the name value for this TelephonyReversmentsSummationStruct.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TelephonyReversmentsSummationStruct.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the seconds value for this TelephonyReversmentsSummationStruct.
     * 
     * @return seconds
     */
    public java.lang.String getSeconds() {
        return seconds;
    }


    /**
     * Sets the seconds value for this TelephonyReversmentsSummationStruct.
     * 
     * @param seconds
     */
    public void setSeconds(java.lang.String seconds) {
        this.seconds = seconds;
    }


    /**
     * Gets the priceReversed value for this TelephonyReversmentsSummationStruct.
     * 
     * @return priceReversed
     */
    public java.lang.String getPriceReversed() {
        return priceReversed;
    }


    /**
     * Sets the priceReversed value for this TelephonyReversmentsSummationStruct.
     * 
     * @param priceReversed
     */
    public void setPriceReversed(java.lang.String priceReversed) {
        this.priceReversed = priceReversed;
    }


    /**
     * Gets the calls value for this TelephonyReversmentsSummationStruct.
     * 
     * @return calls
     */
    public java.lang.String getCalls() {
        return calls;
    }


    /**
     * Sets the calls value for this TelephonyReversmentsSummationStruct.
     * 
     * @param calls
     */
    public void setCalls(java.lang.String calls) {
        this.calls = calls;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyReversmentsSummationStruct)) return false;
        TelephonyReversmentsSummationStruct other = (TelephonyReversmentsSummationStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.seconds==null && other.getSeconds()==null) || 
             (this.seconds!=null &&
              this.seconds.equals(other.getSeconds()))) &&
            ((this.priceReversed==null && other.getPriceReversed()==null) || 
             (this.priceReversed!=null &&
              this.priceReversed.equals(other.getPriceReversed()))) &&
            ((this.calls==null && other.getCalls()==null) || 
             (this.calls!=null &&
              this.calls.equals(other.getCalls())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSeconds() != null) {
            _hashCode += getSeconds().hashCode();
        }
        if (getPriceReversed() != null) {
            _hashCode += getPriceReversed().hashCode();
        }
        if (getCalls() != null) {
            _hashCode += getCalls().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyReversmentsSummationStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyReversmentsSummationStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
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
        elemField.setFieldName("seconds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceReversed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceReversed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calls");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calls"));
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

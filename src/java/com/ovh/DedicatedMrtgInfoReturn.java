/**
 * DedicatedMrtgInfoReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class DedicatedMrtgInfoReturn  implements java.io.Serializable {
    private com.ovh.DedicatedMrtgInfoStruct average;

    private com.ovh.DedicatedMrtgInfoStruct current;

    private com.ovh.DedicatedMrtgInfoStruct max;

    private java.lang.String image;

    public DedicatedMrtgInfoReturn() {
    }

    public DedicatedMrtgInfoReturn(
           com.ovh.DedicatedMrtgInfoStruct average,
           com.ovh.DedicatedMrtgInfoStruct current,
           com.ovh.DedicatedMrtgInfoStruct max,
           java.lang.String image) {
           this.average = average;
           this.current = current;
           this.max = max;
           this.image = image;
    }


    /**
     * Gets the average value for this DedicatedMrtgInfoReturn.
     * 
     * @return average
     */
    public com.ovh.DedicatedMrtgInfoStruct getAverage() {
        return average;
    }


    /**
     * Sets the average value for this DedicatedMrtgInfoReturn.
     * 
     * @param average
     */
    public void setAverage(com.ovh.DedicatedMrtgInfoStruct average) {
        this.average = average;
    }


    /**
     * Gets the current value for this DedicatedMrtgInfoReturn.
     * 
     * @return current
     */
    public com.ovh.DedicatedMrtgInfoStruct getCurrent() {
        return current;
    }


    /**
     * Sets the current value for this DedicatedMrtgInfoReturn.
     * 
     * @param current
     */
    public void setCurrent(com.ovh.DedicatedMrtgInfoStruct current) {
        this.current = current;
    }


    /**
     * Gets the max value for this DedicatedMrtgInfoReturn.
     * 
     * @return max
     */
    public com.ovh.DedicatedMrtgInfoStruct getMax() {
        return max;
    }


    /**
     * Sets the max value for this DedicatedMrtgInfoReturn.
     * 
     * @param max
     */
    public void setMax(com.ovh.DedicatedMrtgInfoStruct max) {
        this.max = max;
    }


    /**
     * Gets the image value for this DedicatedMrtgInfoReturn.
     * 
     * @return image
     */
    public java.lang.String getImage() {
        return image;
    }


    /**
     * Sets the image value for this DedicatedMrtgInfoReturn.
     * 
     * @param image
     */
    public void setImage(java.lang.String image) {
        this.image = image;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DedicatedMrtgInfoReturn)) return false;
        DedicatedMrtgInfoReturn other = (DedicatedMrtgInfoReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.average==null && other.getAverage()==null) || 
             (this.average!=null &&
              this.average.equals(other.getAverage()))) &&
            ((this.current==null && other.getCurrent()==null) || 
             (this.current!=null &&
              this.current.equals(other.getCurrent()))) &&
            ((this.max==null && other.getMax()==null) || 
             (this.max!=null &&
              this.max.equals(other.getMax()))) &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              this.image.equals(other.getImage())));
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
        if (getAverage() != null) {
            _hashCode += getAverage().hashCode();
        }
        if (getCurrent() != null) {
            _hashCode += getCurrent().hashCode();
        }
        if (getMax() != null) {
            _hashCode += getMax().hashCode();
        }
        if (getImage() != null) {
            _hashCode += getImage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DedicatedMrtgInfoReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedMrtgInfoReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("average");
        elemField.setXmlName(new javax.xml.namespace.QName("", "average"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedMrtgInfoStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("current");
        elemField.setXmlName(new javax.xml.namespace.QName("", "current"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedMrtgInfoStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("max");
        elemField.setXmlName(new javax.xml.namespace.QName("", "max"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedMrtgInfoStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("", "image"));
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

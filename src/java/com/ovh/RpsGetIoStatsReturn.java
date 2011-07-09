/**
 * RpsGetIoStatsReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class RpsGetIoStatsReturn  implements java.io.Serializable {
    private com.ovh.RpsGetIOStatsDetailStruct average;

    private com.ovh.RpsGetIOStatsDetailStruct current;

    private com.ovh.RpsGetIOStatsDetailStruct max;

    private java.lang.String image;

    public RpsGetIoStatsReturn() {
    }

    public RpsGetIoStatsReturn(
           com.ovh.RpsGetIOStatsDetailStruct average,
           com.ovh.RpsGetIOStatsDetailStruct current,
           com.ovh.RpsGetIOStatsDetailStruct max,
           java.lang.String image) {
           this.average = average;
           this.current = current;
           this.max = max;
           this.image = image;
    }


    /**
     * Gets the average value for this RpsGetIoStatsReturn.
     * 
     * @return average
     */
    public com.ovh.RpsGetIOStatsDetailStruct getAverage() {
        return average;
    }


    /**
     * Sets the average value for this RpsGetIoStatsReturn.
     * 
     * @param average
     */
    public void setAverage(com.ovh.RpsGetIOStatsDetailStruct average) {
        this.average = average;
    }


    /**
     * Gets the current value for this RpsGetIoStatsReturn.
     * 
     * @return current
     */
    public com.ovh.RpsGetIOStatsDetailStruct getCurrent() {
        return current;
    }


    /**
     * Sets the current value for this RpsGetIoStatsReturn.
     * 
     * @param current
     */
    public void setCurrent(com.ovh.RpsGetIOStatsDetailStruct current) {
        this.current = current;
    }


    /**
     * Gets the max value for this RpsGetIoStatsReturn.
     * 
     * @return max
     */
    public com.ovh.RpsGetIOStatsDetailStruct getMax() {
        return max;
    }


    /**
     * Sets the max value for this RpsGetIoStatsReturn.
     * 
     * @param max
     */
    public void setMax(com.ovh.RpsGetIOStatsDetailStruct max) {
        this.max = max;
    }


    /**
     * Gets the image value for this RpsGetIoStatsReturn.
     * 
     * @return image
     */
    public java.lang.String getImage() {
        return image;
    }


    /**
     * Sets the image value for this RpsGetIoStatsReturn.
     * 
     * @param image
     */
    public void setImage(java.lang.String image) {
        this.image = image;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RpsGetIoStatsReturn)) return false;
        RpsGetIoStatsReturn other = (RpsGetIoStatsReturn) obj;
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
        new org.apache.axis.description.TypeDesc(RpsGetIoStatsReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rpsGetIoStatsReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("average");
        elemField.setXmlName(new javax.xml.namespace.QName("", "average"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rpsGetIOStatsDetailStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("current");
        elemField.setXmlName(new javax.xml.namespace.QName("", "current"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rpsGetIOStatsDetailStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("max");
        elemField.setXmlName(new javax.xml.namespace.QName("", "max"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rpsGetIOStatsDetailStruct"));
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

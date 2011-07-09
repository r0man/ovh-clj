/**
 * RpsGetIOStatsDetailRawStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class RpsGetIOStatsDetailRawStruct  implements java.io.Serializable {
    private java.lang.String raw;

    public RpsGetIOStatsDetailRawStruct() {
    }

    public RpsGetIOStatsDetailRawStruct(
           java.lang.String raw) {
           this.raw = raw;
    }


    /**
     * Gets the raw value for this RpsGetIOStatsDetailRawStruct.
     * 
     * @return raw
     */
    public java.lang.String getRaw() {
        return raw;
    }


    /**
     * Sets the raw value for this RpsGetIOStatsDetailRawStruct.
     * 
     * @param raw
     */
    public void setRaw(java.lang.String raw) {
        this.raw = raw;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RpsGetIOStatsDetailRawStruct)) return false;
        RpsGetIOStatsDetailRawStruct other = (RpsGetIOStatsDetailRawStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.raw==null && other.getRaw()==null) || 
             (this.raw!=null &&
              this.raw.equals(other.getRaw())));
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
        if (getRaw() != null) {
            _hashCode += getRaw().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RpsGetIOStatsDetailRawStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rpsGetIOStatsDetailRawStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("raw");
        elemField.setXmlName(new javax.xml.namespace.QName("", "raw"));
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

/**
 * RpsGetIOStatsDetailIoRequestsStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class RpsGetIOStatsDetailIoRequestsStruct  implements java.io.Serializable {
    private com.ovh.RpsGetIOStatsDetailRawStruct read;

    private com.ovh.RpsGetIOStatsDetailRawStruct write;

    public RpsGetIOStatsDetailIoRequestsStruct() {
    }

    public RpsGetIOStatsDetailIoRequestsStruct(
           com.ovh.RpsGetIOStatsDetailRawStruct read,
           com.ovh.RpsGetIOStatsDetailRawStruct write) {
           this.read = read;
           this.write = write;
    }


    /**
     * Gets the read value for this RpsGetIOStatsDetailIoRequestsStruct.
     * 
     * @return read
     */
    public com.ovh.RpsGetIOStatsDetailRawStruct getRead() {
        return read;
    }


    /**
     * Sets the read value for this RpsGetIOStatsDetailIoRequestsStruct.
     * 
     * @param read
     */
    public void setRead(com.ovh.RpsGetIOStatsDetailRawStruct read) {
        this.read = read;
    }


    /**
     * Gets the write value for this RpsGetIOStatsDetailIoRequestsStruct.
     * 
     * @return write
     */
    public com.ovh.RpsGetIOStatsDetailRawStruct getWrite() {
        return write;
    }


    /**
     * Sets the write value for this RpsGetIOStatsDetailIoRequestsStruct.
     * 
     * @param write
     */
    public void setWrite(com.ovh.RpsGetIOStatsDetailRawStruct write) {
        this.write = write;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RpsGetIOStatsDetailIoRequestsStruct)) return false;
        RpsGetIOStatsDetailIoRequestsStruct other = (RpsGetIOStatsDetailIoRequestsStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.read==null && other.getRead()==null) || 
             (this.read!=null &&
              this.read.equals(other.getRead()))) &&
            ((this.write==null && other.getWrite()==null) || 
             (this.write!=null &&
              this.write.equals(other.getWrite())));
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
        if (getRead() != null) {
            _hashCode += getRead().hashCode();
        }
        if (getWrite() != null) {
            _hashCode += getWrite().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RpsGetIOStatsDetailIoRequestsStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rpsGetIOStatsDetailIoRequestsStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("read");
        elemField.setXmlName(new javax.xml.namespace.QName("", "read"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rpsGetIOStatsDetailRawStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("write");
        elemField.setXmlName(new javax.xml.namespace.QName("", "write"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rpsGetIOStatsDetailRawStruct"));
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

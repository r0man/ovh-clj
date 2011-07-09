/**
 * RtmHddPartitionStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class RtmHddPartitionStruct  implements java.io.Serializable {
    private java.lang.String device;

    private int percentUsed;

    private int percentInodes;

    private java.lang.String mountPoint;

    public RtmHddPartitionStruct() {
    }

    public RtmHddPartitionStruct(
           java.lang.String device,
           int percentUsed,
           int percentInodes,
           java.lang.String mountPoint) {
           this.device = device;
           this.percentUsed = percentUsed;
           this.percentInodes = percentInodes;
           this.mountPoint = mountPoint;
    }


    /**
     * Gets the device value for this RtmHddPartitionStruct.
     * 
     * @return device
     */
    public java.lang.String getDevice() {
        return device;
    }


    /**
     * Sets the device value for this RtmHddPartitionStruct.
     * 
     * @param device
     */
    public void setDevice(java.lang.String device) {
        this.device = device;
    }


    /**
     * Gets the percentUsed value for this RtmHddPartitionStruct.
     * 
     * @return percentUsed
     */
    public int getPercentUsed() {
        return percentUsed;
    }


    /**
     * Sets the percentUsed value for this RtmHddPartitionStruct.
     * 
     * @param percentUsed
     */
    public void setPercentUsed(int percentUsed) {
        this.percentUsed = percentUsed;
    }


    /**
     * Gets the percentInodes value for this RtmHddPartitionStruct.
     * 
     * @return percentInodes
     */
    public int getPercentInodes() {
        return percentInodes;
    }


    /**
     * Sets the percentInodes value for this RtmHddPartitionStruct.
     * 
     * @param percentInodes
     */
    public void setPercentInodes(int percentInodes) {
        this.percentInodes = percentInodes;
    }


    /**
     * Gets the mountPoint value for this RtmHddPartitionStruct.
     * 
     * @return mountPoint
     */
    public java.lang.String getMountPoint() {
        return mountPoint;
    }


    /**
     * Sets the mountPoint value for this RtmHddPartitionStruct.
     * 
     * @param mountPoint
     */
    public void setMountPoint(java.lang.String mountPoint) {
        this.mountPoint = mountPoint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RtmHddPartitionStruct)) return false;
        RtmHddPartitionStruct other = (RtmHddPartitionStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.device==null && other.getDevice()==null) || 
             (this.device!=null &&
              this.device.equals(other.getDevice()))) &&
            this.percentUsed == other.getPercentUsed() &&
            this.percentInodes == other.getPercentInodes() &&
            ((this.mountPoint==null && other.getMountPoint()==null) || 
             (this.mountPoint!=null &&
              this.mountPoint.equals(other.getMountPoint())));
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
        if (getDevice() != null) {
            _hashCode += getDevice().hashCode();
        }
        _hashCode += getPercentUsed();
        _hashCode += getPercentInodes();
        if (getMountPoint() != null) {
            _hashCode += getMountPoint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RtmHddPartitionStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rtmHddPartitionStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("device");
        elemField.setXmlName(new javax.xml.namespace.QName("", "device"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "percentUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentInodes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "percentInodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mountPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mountPoint"));
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

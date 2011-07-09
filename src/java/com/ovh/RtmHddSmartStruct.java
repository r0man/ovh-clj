/**
 * RtmHddSmartStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class RtmHddSmartStruct  implements java.io.Serializable {
    private java.lang.String status;

    private int multizoneErrorRate;

    private int currentPendingSector;

    private int udmaCrcError;

    private int offlineUncorrectable;

    public RtmHddSmartStruct() {
    }

    public RtmHddSmartStruct(
           java.lang.String status,
           int multizoneErrorRate,
           int currentPendingSector,
           int udmaCrcError,
           int offlineUncorrectable) {
           this.status = status;
           this.multizoneErrorRate = multizoneErrorRate;
           this.currentPendingSector = currentPendingSector;
           this.udmaCrcError = udmaCrcError;
           this.offlineUncorrectable = offlineUncorrectable;
    }


    /**
     * Gets the status value for this RtmHddSmartStruct.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RtmHddSmartStruct.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the multizoneErrorRate value for this RtmHddSmartStruct.
     * 
     * @return multizoneErrorRate
     */
    public int getMultizoneErrorRate() {
        return multizoneErrorRate;
    }


    /**
     * Sets the multizoneErrorRate value for this RtmHddSmartStruct.
     * 
     * @param multizoneErrorRate
     */
    public void setMultizoneErrorRate(int multizoneErrorRate) {
        this.multizoneErrorRate = multizoneErrorRate;
    }


    /**
     * Gets the currentPendingSector value for this RtmHddSmartStruct.
     * 
     * @return currentPendingSector
     */
    public int getCurrentPendingSector() {
        return currentPendingSector;
    }


    /**
     * Sets the currentPendingSector value for this RtmHddSmartStruct.
     * 
     * @param currentPendingSector
     */
    public void setCurrentPendingSector(int currentPendingSector) {
        this.currentPendingSector = currentPendingSector;
    }


    /**
     * Gets the udmaCrcError value for this RtmHddSmartStruct.
     * 
     * @return udmaCrcError
     */
    public int getUdmaCrcError() {
        return udmaCrcError;
    }


    /**
     * Sets the udmaCrcError value for this RtmHddSmartStruct.
     * 
     * @param udmaCrcError
     */
    public void setUdmaCrcError(int udmaCrcError) {
        this.udmaCrcError = udmaCrcError;
    }


    /**
     * Gets the offlineUncorrectable value for this RtmHddSmartStruct.
     * 
     * @return offlineUncorrectable
     */
    public int getOfflineUncorrectable() {
        return offlineUncorrectable;
    }


    /**
     * Sets the offlineUncorrectable value for this RtmHddSmartStruct.
     * 
     * @param offlineUncorrectable
     */
    public void setOfflineUncorrectable(int offlineUncorrectable) {
        this.offlineUncorrectable = offlineUncorrectable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RtmHddSmartStruct)) return false;
        RtmHddSmartStruct other = (RtmHddSmartStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            this.multizoneErrorRate == other.getMultizoneErrorRate() &&
            this.currentPendingSector == other.getCurrentPendingSector() &&
            this.udmaCrcError == other.getUdmaCrcError() &&
            this.offlineUncorrectable == other.getOfflineUncorrectable();
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        _hashCode += getMultizoneErrorRate();
        _hashCode += getCurrentPendingSector();
        _hashCode += getUdmaCrcError();
        _hashCode += getOfflineUncorrectable();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RtmHddSmartStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rtmHddSmartStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multizoneErrorRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "multizoneErrorRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentPendingSector");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currentPendingSector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("udmaCrcError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "udmaCrcError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offlineUncorrectable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offlineUncorrectable"));
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

/**
 * RpsGetIOStatsDetailStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class RpsGetIOStatsDetailStruct  implements java.io.Serializable {
    private com.ovh.RpsGetIOStatsDetailRawStruct serviceTime;

    private com.ovh.RpsGetIOStatsDetailIoRequestsStruct ioRequests;

    public RpsGetIOStatsDetailStruct() {
    }

    public RpsGetIOStatsDetailStruct(
           com.ovh.RpsGetIOStatsDetailRawStruct serviceTime,
           com.ovh.RpsGetIOStatsDetailIoRequestsStruct ioRequests) {
           this.serviceTime = serviceTime;
           this.ioRequests = ioRequests;
    }


    /**
     * Gets the serviceTime value for this RpsGetIOStatsDetailStruct.
     * 
     * @return serviceTime
     */
    public com.ovh.RpsGetIOStatsDetailRawStruct getServiceTime() {
        return serviceTime;
    }


    /**
     * Sets the serviceTime value for this RpsGetIOStatsDetailStruct.
     * 
     * @param serviceTime
     */
    public void setServiceTime(com.ovh.RpsGetIOStatsDetailRawStruct serviceTime) {
        this.serviceTime = serviceTime;
    }


    /**
     * Gets the ioRequests value for this RpsGetIOStatsDetailStruct.
     * 
     * @return ioRequests
     */
    public com.ovh.RpsGetIOStatsDetailIoRequestsStruct getIoRequests() {
        return ioRequests;
    }


    /**
     * Sets the ioRequests value for this RpsGetIOStatsDetailStruct.
     * 
     * @param ioRequests
     */
    public void setIoRequests(com.ovh.RpsGetIOStatsDetailIoRequestsStruct ioRequests) {
        this.ioRequests = ioRequests;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RpsGetIOStatsDetailStruct)) return false;
        RpsGetIOStatsDetailStruct other = (RpsGetIOStatsDetailStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceTime==null && other.getServiceTime()==null) || 
             (this.serviceTime!=null &&
              this.serviceTime.equals(other.getServiceTime()))) &&
            ((this.ioRequests==null && other.getIoRequests()==null) || 
             (this.ioRequests!=null &&
              this.ioRequests.equals(other.getIoRequests())));
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
        if (getServiceTime() != null) {
            _hashCode += getServiceTime().hashCode();
        }
        if (getIoRequests() != null) {
            _hashCode += getIoRequests().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RpsGetIOStatsDetailStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rpsGetIOStatsDetailStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rpsGetIOStatsDetailRawStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ioRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IoRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rpsGetIOStatsDetailIoRequestsStruct"));
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

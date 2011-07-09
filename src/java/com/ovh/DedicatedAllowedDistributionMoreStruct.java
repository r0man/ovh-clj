/**
 * DedicatedAllowedDistributionMoreStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class DedicatedAllowedDistributionMoreStruct  implements java.io.Serializable {
    private com.ovh.DedicatedAllowedDistributionDetailsStruct[] basicDistributions;

    private com.ovh.DedicatedAllowedDistributionDetailsStruct[] readyToUse;

    private java.lang.String type;

    public DedicatedAllowedDistributionMoreStruct() {
    }

    public DedicatedAllowedDistributionMoreStruct(
           com.ovh.DedicatedAllowedDistributionDetailsStruct[] basicDistributions,
           com.ovh.DedicatedAllowedDistributionDetailsStruct[] readyToUse,
           java.lang.String type) {
           this.basicDistributions = basicDistributions;
           this.readyToUse = readyToUse;
           this.type = type;
    }


    /**
     * Gets the basicDistributions value for this DedicatedAllowedDistributionMoreStruct.
     * 
     * @return basicDistributions
     */
    public com.ovh.DedicatedAllowedDistributionDetailsStruct[] getBasicDistributions() {
        return basicDistributions;
    }


    /**
     * Sets the basicDistributions value for this DedicatedAllowedDistributionMoreStruct.
     * 
     * @param basicDistributions
     */
    public void setBasicDistributions(com.ovh.DedicatedAllowedDistributionDetailsStruct[] basicDistributions) {
        this.basicDistributions = basicDistributions;
    }


    /**
     * Gets the readyToUse value for this DedicatedAllowedDistributionMoreStruct.
     * 
     * @return readyToUse
     */
    public com.ovh.DedicatedAllowedDistributionDetailsStruct[] getReadyToUse() {
        return readyToUse;
    }


    /**
     * Sets the readyToUse value for this DedicatedAllowedDistributionMoreStruct.
     * 
     * @param readyToUse
     */
    public void setReadyToUse(com.ovh.DedicatedAllowedDistributionDetailsStruct[] readyToUse) {
        this.readyToUse = readyToUse;
    }


    /**
     * Gets the type value for this DedicatedAllowedDistributionMoreStruct.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this DedicatedAllowedDistributionMoreStruct.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DedicatedAllowedDistributionMoreStruct)) return false;
        DedicatedAllowedDistributionMoreStruct other = (DedicatedAllowedDistributionMoreStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.basicDistributions==null && other.getBasicDistributions()==null) || 
             (this.basicDistributions!=null &&
              java.util.Arrays.equals(this.basicDistributions, other.getBasicDistributions()))) &&
            ((this.readyToUse==null && other.getReadyToUse()==null) || 
             (this.readyToUse!=null &&
              java.util.Arrays.equals(this.readyToUse, other.getReadyToUse()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getBasicDistributions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBasicDistributions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBasicDistributions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReadyToUse() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReadyToUse());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReadyToUse(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DedicatedAllowedDistributionMoreStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedAllowedDistributionMoreStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basicDistributions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "basicDistributions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedAllowedDistributionDetailsStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readyToUse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readyToUse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedAllowedDistributionDetailsStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
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

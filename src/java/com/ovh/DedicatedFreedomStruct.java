/**
 * DedicatedFreedomStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class DedicatedFreedomStruct  implements java.io.Serializable {
    private int remaining;

    private int assigned;

    private int total;

    private int preset;

    public DedicatedFreedomStruct() {
    }

    public DedicatedFreedomStruct(
           int remaining,
           int assigned,
           int total,
           int preset) {
           this.remaining = remaining;
           this.assigned = assigned;
           this.total = total;
           this.preset = preset;
    }


    /**
     * Gets the remaining value for this DedicatedFreedomStruct.
     * 
     * @return remaining
     */
    public int getRemaining() {
        return remaining;
    }


    /**
     * Sets the remaining value for this DedicatedFreedomStruct.
     * 
     * @param remaining
     */
    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }


    /**
     * Gets the assigned value for this DedicatedFreedomStruct.
     * 
     * @return assigned
     */
    public int getAssigned() {
        return assigned;
    }


    /**
     * Sets the assigned value for this DedicatedFreedomStruct.
     * 
     * @param assigned
     */
    public void setAssigned(int assigned) {
        this.assigned = assigned;
    }


    /**
     * Gets the total value for this DedicatedFreedomStruct.
     * 
     * @return total
     */
    public int getTotal() {
        return total;
    }


    /**
     * Sets the total value for this DedicatedFreedomStruct.
     * 
     * @param total
     */
    public void setTotal(int total) {
        this.total = total;
    }


    /**
     * Gets the preset value for this DedicatedFreedomStruct.
     * 
     * @return preset
     */
    public int getPreset() {
        return preset;
    }


    /**
     * Sets the preset value for this DedicatedFreedomStruct.
     * 
     * @param preset
     */
    public void setPreset(int preset) {
        this.preset = preset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DedicatedFreedomStruct)) return false;
        DedicatedFreedomStruct other = (DedicatedFreedomStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.remaining == other.getRemaining() &&
            this.assigned == other.getAssigned() &&
            this.total == other.getTotal() &&
            this.preset == other.getPreset();
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
        _hashCode += getRemaining();
        _hashCode += getAssigned();
        _hashCode += getTotal();
        _hashCode += getPreset();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DedicatedFreedomStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedFreedomStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remaining");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preset"));
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

/**
 * DedicatedCapabilitiesStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class DedicatedCapabilitiesStruct  implements java.io.Serializable {
    private java.lang.String hostname;

    private int originalClassicFailover;

    private int originalFailoverRipe;

    private int originalLoadBalancingSlot;

    private int additionalClassicFailover;

    private int additionalFailoverRipe;

    private int usedClassicFailover;

    private int usedFailoverRipe;

    public DedicatedCapabilitiesStruct() {
    }

    public DedicatedCapabilitiesStruct(
           java.lang.String hostname,
           int originalClassicFailover,
           int originalFailoverRipe,
           int originalLoadBalancingSlot,
           int additionalClassicFailover,
           int additionalFailoverRipe,
           int usedClassicFailover,
           int usedFailoverRipe) {
           this.hostname = hostname;
           this.originalClassicFailover = originalClassicFailover;
           this.originalFailoverRipe = originalFailoverRipe;
           this.originalLoadBalancingSlot = originalLoadBalancingSlot;
           this.additionalClassicFailover = additionalClassicFailover;
           this.additionalFailoverRipe = additionalFailoverRipe;
           this.usedClassicFailover = usedClassicFailover;
           this.usedFailoverRipe = usedFailoverRipe;
    }


    /**
     * Gets the hostname value for this DedicatedCapabilitiesStruct.
     * 
     * @return hostname
     */
    public java.lang.String getHostname() {
        return hostname;
    }


    /**
     * Sets the hostname value for this DedicatedCapabilitiesStruct.
     * 
     * @param hostname
     */
    public void setHostname(java.lang.String hostname) {
        this.hostname = hostname;
    }


    /**
     * Gets the originalClassicFailover value for this DedicatedCapabilitiesStruct.
     * 
     * @return originalClassicFailover
     */
    public int getOriginalClassicFailover() {
        return originalClassicFailover;
    }


    /**
     * Sets the originalClassicFailover value for this DedicatedCapabilitiesStruct.
     * 
     * @param originalClassicFailover
     */
    public void setOriginalClassicFailover(int originalClassicFailover) {
        this.originalClassicFailover = originalClassicFailover;
    }


    /**
     * Gets the originalFailoverRipe value for this DedicatedCapabilitiesStruct.
     * 
     * @return originalFailoverRipe
     */
    public int getOriginalFailoverRipe() {
        return originalFailoverRipe;
    }


    /**
     * Sets the originalFailoverRipe value for this DedicatedCapabilitiesStruct.
     * 
     * @param originalFailoverRipe
     */
    public void setOriginalFailoverRipe(int originalFailoverRipe) {
        this.originalFailoverRipe = originalFailoverRipe;
    }


    /**
     * Gets the originalLoadBalancingSlot value for this DedicatedCapabilitiesStruct.
     * 
     * @return originalLoadBalancingSlot
     */
    public int getOriginalLoadBalancingSlot() {
        return originalLoadBalancingSlot;
    }


    /**
     * Sets the originalLoadBalancingSlot value for this DedicatedCapabilitiesStruct.
     * 
     * @param originalLoadBalancingSlot
     */
    public void setOriginalLoadBalancingSlot(int originalLoadBalancingSlot) {
        this.originalLoadBalancingSlot = originalLoadBalancingSlot;
    }


    /**
     * Gets the additionalClassicFailover value for this DedicatedCapabilitiesStruct.
     * 
     * @return additionalClassicFailover
     */
    public int getAdditionalClassicFailover() {
        return additionalClassicFailover;
    }


    /**
     * Sets the additionalClassicFailover value for this DedicatedCapabilitiesStruct.
     * 
     * @param additionalClassicFailover
     */
    public void setAdditionalClassicFailover(int additionalClassicFailover) {
        this.additionalClassicFailover = additionalClassicFailover;
    }


    /**
     * Gets the additionalFailoverRipe value for this DedicatedCapabilitiesStruct.
     * 
     * @return additionalFailoverRipe
     */
    public int getAdditionalFailoverRipe() {
        return additionalFailoverRipe;
    }


    /**
     * Sets the additionalFailoverRipe value for this DedicatedCapabilitiesStruct.
     * 
     * @param additionalFailoverRipe
     */
    public void setAdditionalFailoverRipe(int additionalFailoverRipe) {
        this.additionalFailoverRipe = additionalFailoverRipe;
    }


    /**
     * Gets the usedClassicFailover value for this DedicatedCapabilitiesStruct.
     * 
     * @return usedClassicFailover
     */
    public int getUsedClassicFailover() {
        return usedClassicFailover;
    }


    /**
     * Sets the usedClassicFailover value for this DedicatedCapabilitiesStruct.
     * 
     * @param usedClassicFailover
     */
    public void setUsedClassicFailover(int usedClassicFailover) {
        this.usedClassicFailover = usedClassicFailover;
    }


    /**
     * Gets the usedFailoverRipe value for this DedicatedCapabilitiesStruct.
     * 
     * @return usedFailoverRipe
     */
    public int getUsedFailoverRipe() {
        return usedFailoverRipe;
    }


    /**
     * Sets the usedFailoverRipe value for this DedicatedCapabilitiesStruct.
     * 
     * @param usedFailoverRipe
     */
    public void setUsedFailoverRipe(int usedFailoverRipe) {
        this.usedFailoverRipe = usedFailoverRipe;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DedicatedCapabilitiesStruct)) return false;
        DedicatedCapabilitiesStruct other = (DedicatedCapabilitiesStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostname==null && other.getHostname()==null) || 
             (this.hostname!=null &&
              this.hostname.equals(other.getHostname()))) &&
            this.originalClassicFailover == other.getOriginalClassicFailover() &&
            this.originalFailoverRipe == other.getOriginalFailoverRipe() &&
            this.originalLoadBalancingSlot == other.getOriginalLoadBalancingSlot() &&
            this.additionalClassicFailover == other.getAdditionalClassicFailover() &&
            this.additionalFailoverRipe == other.getAdditionalFailoverRipe() &&
            this.usedClassicFailover == other.getUsedClassicFailover() &&
            this.usedFailoverRipe == other.getUsedFailoverRipe();
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
        if (getHostname() != null) {
            _hashCode += getHostname().hashCode();
        }
        _hashCode += getOriginalClassicFailover();
        _hashCode += getOriginalFailoverRipe();
        _hashCode += getOriginalLoadBalancingSlot();
        _hashCode += getAdditionalClassicFailover();
        _hashCode += getAdditionalFailoverRipe();
        _hashCode += getUsedClassicFailover();
        _hashCode += getUsedFailoverRipe();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DedicatedCapabilitiesStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedCapabilitiesStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalClassicFailover");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originalClassicFailover"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalFailoverRipe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originalFailoverRipe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalLoadBalancingSlot");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originalLoadBalancingSlot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalClassicFailover");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additionalClassicFailover"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalFailoverRipe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additionalFailoverRipe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedClassicFailover");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usedClassicFailover"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedFailoverRipe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usedFailoverRipe"));
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

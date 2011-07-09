/**
 * DomainCheckStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class DomainCheckStruct  implements java.io.Serializable {
    private java.lang.String predicate;

    private boolean value;

    private java.lang.String reason;

    public DomainCheckStruct() {
    }

    public DomainCheckStruct(
           java.lang.String predicate,
           boolean value,
           java.lang.String reason) {
           this.predicate = predicate;
           this.value = value;
           this.reason = reason;
    }


    /**
     * Gets the predicate value for this DomainCheckStruct.
     * 
     * @return predicate
     */
    public java.lang.String getPredicate() {
        return predicate;
    }


    /**
     * Sets the predicate value for this DomainCheckStruct.
     * 
     * @param predicate
     */
    public void setPredicate(java.lang.String predicate) {
        this.predicate = predicate;
    }


    /**
     * Gets the value value for this DomainCheckStruct.
     * 
     * @return value
     */
    public boolean isValue() {
        return value;
    }


    /**
     * Sets the value value for this DomainCheckStruct.
     * 
     * @param value
     */
    public void setValue(boolean value) {
        this.value = value;
    }


    /**
     * Gets the reason value for this DomainCheckStruct.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this DomainCheckStruct.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DomainCheckStruct)) return false;
        DomainCheckStruct other = (DomainCheckStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.predicate==null && other.getPredicate()==null) || 
             (this.predicate!=null &&
              this.predicate.equals(other.getPredicate()))) &&
            this.value == other.isValue() &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason())));
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
        if (getPredicate() != null) {
            _hashCode += getPredicate().hashCode();
        }
        _hashCode += (isValue() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DomainCheckStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "domainCheckStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predicate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "predicate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reason"));
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

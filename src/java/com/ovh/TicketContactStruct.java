/**
 * TicketContactStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TicketContactStruct  implements java.io.Serializable {
    private java.lang.String componentType;

    private com.ovh.TicketContactDomainStruct[] domains;

    public TicketContactStruct() {
    }

    public TicketContactStruct(
           java.lang.String componentType,
           com.ovh.TicketContactDomainStruct[] domains) {
           this.componentType = componentType;
           this.domains = domains;
    }


    /**
     * Gets the componentType value for this TicketContactStruct.
     * 
     * @return componentType
     */
    public java.lang.String getComponentType() {
        return componentType;
    }


    /**
     * Sets the componentType value for this TicketContactStruct.
     * 
     * @param componentType
     */
    public void setComponentType(java.lang.String componentType) {
        this.componentType = componentType;
    }


    /**
     * Gets the domains value for this TicketContactStruct.
     * 
     * @return domains
     */
    public com.ovh.TicketContactDomainStruct[] getDomains() {
        return domains;
    }


    /**
     * Sets the domains value for this TicketContactStruct.
     * 
     * @param domains
     */
    public void setDomains(com.ovh.TicketContactDomainStruct[] domains) {
        this.domains = domains;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TicketContactStruct)) return false;
        TicketContactStruct other = (TicketContactStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.componentType==null && other.getComponentType()==null) || 
             (this.componentType!=null &&
              this.componentType.equals(other.getComponentType()))) &&
            ((this.domains==null && other.getDomains()==null) || 
             (this.domains!=null &&
              java.util.Arrays.equals(this.domains, other.getDomains())));
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
        if (getComponentType() != null) {
            _hashCode += getComponentType().hashCode();
        }
        if (getDomains() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDomains());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDomains(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TicketContactStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "ticketContactStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "componentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domains");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domains"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "ticketContactDomainStruct"));
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

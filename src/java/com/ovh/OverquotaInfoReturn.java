/**
 * OverquotaInfoReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class OverquotaInfoReturn  implements java.io.Serializable {
    private java.lang.String domain;

    private com.ovh.OverquotaInfoStruct[] quota;

    private int capacities;

    private int order;

    public OverquotaInfoReturn() {
    }

    public OverquotaInfoReturn(
           java.lang.String domain,
           com.ovh.OverquotaInfoStruct[] quota,
           int capacities,
           int order) {
           this.domain = domain;
           this.quota = quota;
           this.capacities = capacities;
           this.order = order;
    }


    /**
     * Gets the domain value for this OverquotaInfoReturn.
     * 
     * @return domain
     */
    public java.lang.String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this OverquotaInfoReturn.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }


    /**
     * Gets the quota value for this OverquotaInfoReturn.
     * 
     * @return quota
     */
    public com.ovh.OverquotaInfoStruct[] getQuota() {
        return quota;
    }


    /**
     * Sets the quota value for this OverquotaInfoReturn.
     * 
     * @param quota
     */
    public void setQuota(com.ovh.OverquotaInfoStruct[] quota) {
        this.quota = quota;
    }


    /**
     * Gets the capacities value for this OverquotaInfoReturn.
     * 
     * @return capacities
     */
    public int getCapacities() {
        return capacities;
    }


    /**
     * Sets the capacities value for this OverquotaInfoReturn.
     * 
     * @param capacities
     */
    public void setCapacities(int capacities) {
        this.capacities = capacities;
    }


    /**
     * Gets the order value for this OverquotaInfoReturn.
     * 
     * @return order
     */
    public int getOrder() {
        return order;
    }


    /**
     * Sets the order value for this OverquotaInfoReturn.
     * 
     * @param order
     */
    public void setOrder(int order) {
        this.order = order;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OverquotaInfoReturn)) return false;
        OverquotaInfoReturn other = (OverquotaInfoReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.domain==null && other.getDomain()==null) || 
             (this.domain!=null &&
              this.domain.equals(other.getDomain()))) &&
            ((this.quota==null && other.getQuota()==null) || 
             (this.quota!=null &&
              java.util.Arrays.equals(this.quota, other.getQuota()))) &&
            this.capacities == other.getCapacities() &&
            this.order == other.getOrder();
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
        if (getDomain() != null) {
            _hashCode += getDomain().hashCode();
        }
        if (getQuota() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuota());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuota(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getCapacities();
        _hashCode += getOrder();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OverquotaInfoReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "overquotaInfoReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quota");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "overquotaInfoStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacities");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capacities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order"));
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

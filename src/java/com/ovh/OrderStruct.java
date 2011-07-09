/**
 * OrderStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class OrderStruct  implements java.io.Serializable {
    private int orderId;

    private java.lang.String orderPassword;

    private java.lang.String orderUrl;

    private boolean isPaid;

    private java.lang.String paymentStatus;

    public OrderStruct() {
    }

    public OrderStruct(
           int orderId,
           java.lang.String orderPassword,
           java.lang.String orderUrl,
           boolean isPaid,
           java.lang.String paymentStatus) {
           this.orderId = orderId;
           this.orderPassword = orderPassword;
           this.orderUrl = orderUrl;
           this.isPaid = isPaid;
           this.paymentStatus = paymentStatus;
    }


    /**
     * Gets the orderId value for this OrderStruct.
     * 
     * @return orderId
     */
    public int getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this OrderStruct.
     * 
     * @param orderId
     */
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderPassword value for this OrderStruct.
     * 
     * @return orderPassword
     */
    public java.lang.String getOrderPassword() {
        return orderPassword;
    }


    /**
     * Sets the orderPassword value for this OrderStruct.
     * 
     * @param orderPassword
     */
    public void setOrderPassword(java.lang.String orderPassword) {
        this.orderPassword = orderPassword;
    }


    /**
     * Gets the orderUrl value for this OrderStruct.
     * 
     * @return orderUrl
     */
    public java.lang.String getOrderUrl() {
        return orderUrl;
    }


    /**
     * Sets the orderUrl value for this OrderStruct.
     * 
     * @param orderUrl
     */
    public void setOrderUrl(java.lang.String orderUrl) {
        this.orderUrl = orderUrl;
    }


    /**
     * Gets the isPaid value for this OrderStruct.
     * 
     * @return isPaid
     */
    public boolean isIsPaid() {
        return isPaid;
    }


    /**
     * Sets the isPaid value for this OrderStruct.
     * 
     * @param isPaid
     */
    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }


    /**
     * Gets the paymentStatus value for this OrderStruct.
     * 
     * @return paymentStatus
     */
    public java.lang.String getPaymentStatus() {
        return paymentStatus;
    }


    /**
     * Sets the paymentStatus value for this OrderStruct.
     * 
     * @param paymentStatus
     */
    public void setPaymentStatus(java.lang.String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderStruct)) return false;
        OrderStruct other = (OrderStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.orderId == other.getOrderId() &&
            ((this.orderPassword==null && other.getOrderPassword()==null) || 
             (this.orderPassword!=null &&
              this.orderPassword.equals(other.getOrderPassword()))) &&
            ((this.orderUrl==null && other.getOrderUrl()==null) || 
             (this.orderUrl!=null &&
              this.orderUrl.equals(other.getOrderUrl()))) &&
            this.isPaid == other.isIsPaid() &&
            ((this.paymentStatus==null && other.getPaymentStatus()==null) || 
             (this.paymentStatus!=null &&
              this.paymentStatus.equals(other.getPaymentStatus())));
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
        _hashCode += getOrderId();
        if (getOrderPassword() != null) {
            _hashCode += getOrderPassword().hashCode();
        }
        if (getOrderUrl() != null) {
            _hashCode += getOrderUrl().hashCode();
        }
        _hashCode += (isIsPaid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPaymentStatus() != null) {
            _hashCode += getPaymentStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "orderStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentStatus"));
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

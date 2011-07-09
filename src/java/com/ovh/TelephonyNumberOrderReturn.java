/**
 * TelephonyNumberOrderReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyNumberOrderReturn  implements java.io.Serializable {
    private int orderId;

    private java.lang.String orderPassword;

    private java.lang.String orderUrl;

    private float totalPrice;

    public TelephonyNumberOrderReturn() {
    }

    public TelephonyNumberOrderReturn(
           int orderId,
           java.lang.String orderPassword,
           java.lang.String orderUrl,
           float totalPrice) {
           this.orderId = orderId;
           this.orderPassword = orderPassword;
           this.orderUrl = orderUrl;
           this.totalPrice = totalPrice;
    }


    /**
     * Gets the orderId value for this TelephonyNumberOrderReturn.
     * 
     * @return orderId
     */
    public int getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this TelephonyNumberOrderReturn.
     * 
     * @param orderId
     */
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderPassword value for this TelephonyNumberOrderReturn.
     * 
     * @return orderPassword
     */
    public java.lang.String getOrderPassword() {
        return orderPassword;
    }


    /**
     * Sets the orderPassword value for this TelephonyNumberOrderReturn.
     * 
     * @param orderPassword
     */
    public void setOrderPassword(java.lang.String orderPassword) {
        this.orderPassword = orderPassword;
    }


    /**
     * Gets the orderUrl value for this TelephonyNumberOrderReturn.
     * 
     * @return orderUrl
     */
    public java.lang.String getOrderUrl() {
        return orderUrl;
    }


    /**
     * Sets the orderUrl value for this TelephonyNumberOrderReturn.
     * 
     * @param orderUrl
     */
    public void setOrderUrl(java.lang.String orderUrl) {
        this.orderUrl = orderUrl;
    }


    /**
     * Gets the totalPrice value for this TelephonyNumberOrderReturn.
     * 
     * @return totalPrice
     */
    public float getTotalPrice() {
        return totalPrice;
    }


    /**
     * Sets the totalPrice value for this TelephonyNumberOrderReturn.
     * 
     * @param totalPrice
     */
    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyNumberOrderReturn)) return false;
        TelephonyNumberOrderReturn other = (TelephonyNumberOrderReturn) obj;
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
            this.totalPrice == other.getTotalPrice();
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
        _hashCode += new Float(getTotalPrice()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyNumberOrderReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyNumberOrderReturn"));
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
        elemField.setFieldName("totalPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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

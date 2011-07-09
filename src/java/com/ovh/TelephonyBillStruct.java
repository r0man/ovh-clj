/**
 * TelephonyBillStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyBillStruct  implements java.io.Serializable {
    private java.lang.String date;

    private float price;

    private int orderId;

    private boolean orderPaid;

    private java.lang.String orderUrl;

    public TelephonyBillStruct() {
    }

    public TelephonyBillStruct(
           java.lang.String date,
           float price,
           int orderId,
           boolean orderPaid,
           java.lang.String orderUrl) {
           this.date = date;
           this.price = price;
           this.orderId = orderId;
           this.orderPaid = orderPaid;
           this.orderUrl = orderUrl;
    }


    /**
     * Gets the date value for this TelephonyBillStruct.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this TelephonyBillStruct.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the price value for this TelephonyBillStruct.
     * 
     * @return price
     */
    public float getPrice() {
        return price;
    }


    /**
     * Sets the price value for this TelephonyBillStruct.
     * 
     * @param price
     */
    public void setPrice(float price) {
        this.price = price;
    }


    /**
     * Gets the orderId value for this TelephonyBillStruct.
     * 
     * @return orderId
     */
    public int getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this TelephonyBillStruct.
     * 
     * @param orderId
     */
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderPaid value for this TelephonyBillStruct.
     * 
     * @return orderPaid
     */
    public boolean isOrderPaid() {
        return orderPaid;
    }


    /**
     * Sets the orderPaid value for this TelephonyBillStruct.
     * 
     * @param orderPaid
     */
    public void setOrderPaid(boolean orderPaid) {
        this.orderPaid = orderPaid;
    }


    /**
     * Gets the orderUrl value for this TelephonyBillStruct.
     * 
     * @return orderUrl
     */
    public java.lang.String getOrderUrl() {
        return orderUrl;
    }


    /**
     * Sets the orderUrl value for this TelephonyBillStruct.
     * 
     * @param orderUrl
     */
    public void setOrderUrl(java.lang.String orderUrl) {
        this.orderUrl = orderUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyBillStruct)) return false;
        TelephonyBillStruct other = (TelephonyBillStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            this.price == other.getPrice() &&
            this.orderId == other.getOrderId() &&
            this.orderPaid == other.isOrderPaid() &&
            ((this.orderUrl==null && other.getOrderUrl()==null) || 
             (this.orderUrl!=null &&
              this.orderUrl.equals(other.getOrderUrl())));
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
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        _hashCode += new Float(getPrice()).hashCode();
        _hashCode += getOrderId();
        _hashCode += (isOrderPaid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getOrderUrl() != null) {
            _hashCode += getOrderUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyBillStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyBillStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderUrl"));
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

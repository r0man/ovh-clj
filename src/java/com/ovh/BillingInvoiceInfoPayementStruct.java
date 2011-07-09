/**
 * BillingInvoiceInfoPayementStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class BillingInvoiceInfoPayementStruct  implements java.io.Serializable {
    private java.lang.String finaldate;

    private java.lang.String deposit_date;

    private java.lang.String status;

    private java.lang.String customerid;

    private java.lang.String paymentmean;

    private java.lang.String paymentdate;

    private int orderid;

    public BillingInvoiceInfoPayementStruct() {
    }

    public BillingInvoiceInfoPayementStruct(
           java.lang.String finaldate,
           java.lang.String deposit_date,
           java.lang.String status,
           java.lang.String customerid,
           java.lang.String paymentmean,
           java.lang.String paymentdate,
           int orderid) {
           this.finaldate = finaldate;
           this.deposit_date = deposit_date;
           this.status = status;
           this.customerid = customerid;
           this.paymentmean = paymentmean;
           this.paymentdate = paymentdate;
           this.orderid = orderid;
    }


    /**
     * Gets the finaldate value for this BillingInvoiceInfoPayementStruct.
     * 
     * @return finaldate
     */
    public java.lang.String getFinaldate() {
        return finaldate;
    }


    /**
     * Sets the finaldate value for this BillingInvoiceInfoPayementStruct.
     * 
     * @param finaldate
     */
    public void setFinaldate(java.lang.String finaldate) {
        this.finaldate = finaldate;
    }


    /**
     * Gets the deposit_date value for this BillingInvoiceInfoPayementStruct.
     * 
     * @return deposit_date
     */
    public java.lang.String getDeposit_date() {
        return deposit_date;
    }


    /**
     * Sets the deposit_date value for this BillingInvoiceInfoPayementStruct.
     * 
     * @param deposit_date
     */
    public void setDeposit_date(java.lang.String deposit_date) {
        this.deposit_date = deposit_date;
    }


    /**
     * Gets the status value for this BillingInvoiceInfoPayementStruct.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this BillingInvoiceInfoPayementStruct.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the customerid value for this BillingInvoiceInfoPayementStruct.
     * 
     * @return customerid
     */
    public java.lang.String getCustomerid() {
        return customerid;
    }


    /**
     * Sets the customerid value for this BillingInvoiceInfoPayementStruct.
     * 
     * @param customerid
     */
    public void setCustomerid(java.lang.String customerid) {
        this.customerid = customerid;
    }


    /**
     * Gets the paymentmean value for this BillingInvoiceInfoPayementStruct.
     * 
     * @return paymentmean
     */
    public java.lang.String getPaymentmean() {
        return paymentmean;
    }


    /**
     * Sets the paymentmean value for this BillingInvoiceInfoPayementStruct.
     * 
     * @param paymentmean
     */
    public void setPaymentmean(java.lang.String paymentmean) {
        this.paymentmean = paymentmean;
    }


    /**
     * Gets the paymentdate value for this BillingInvoiceInfoPayementStruct.
     * 
     * @return paymentdate
     */
    public java.lang.String getPaymentdate() {
        return paymentdate;
    }


    /**
     * Sets the paymentdate value for this BillingInvoiceInfoPayementStruct.
     * 
     * @param paymentdate
     */
    public void setPaymentdate(java.lang.String paymentdate) {
        this.paymentdate = paymentdate;
    }


    /**
     * Gets the orderid value for this BillingInvoiceInfoPayementStruct.
     * 
     * @return orderid
     */
    public int getOrderid() {
        return orderid;
    }


    /**
     * Sets the orderid value for this BillingInvoiceInfoPayementStruct.
     * 
     * @param orderid
     */
    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillingInvoiceInfoPayementStruct)) return false;
        BillingInvoiceInfoPayementStruct other = (BillingInvoiceInfoPayementStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.finaldate==null && other.getFinaldate()==null) || 
             (this.finaldate!=null &&
              this.finaldate.equals(other.getFinaldate()))) &&
            ((this.deposit_date==null && other.getDeposit_date()==null) || 
             (this.deposit_date!=null &&
              this.deposit_date.equals(other.getDeposit_date()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.customerid==null && other.getCustomerid()==null) || 
             (this.customerid!=null &&
              this.customerid.equals(other.getCustomerid()))) &&
            ((this.paymentmean==null && other.getPaymentmean()==null) || 
             (this.paymentmean!=null &&
              this.paymentmean.equals(other.getPaymentmean()))) &&
            ((this.paymentdate==null && other.getPaymentdate()==null) || 
             (this.paymentdate!=null &&
              this.paymentdate.equals(other.getPaymentdate()))) &&
            this.orderid == other.getOrderid();
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
        if (getFinaldate() != null) {
            _hashCode += getFinaldate().hashCode();
        }
        if (getDeposit_date() != null) {
            _hashCode += getDeposit_date().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCustomerid() != null) {
            _hashCode += getCustomerid().hashCode();
        }
        if (getPaymentmean() != null) {
            _hashCode += getPaymentmean().hashCode();
        }
        if (getPaymentdate() != null) {
            _hashCode += getPaymentdate().hashCode();
        }
        _hashCode += getOrderid();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillingInvoiceInfoPayementStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "billingInvoiceInfoPayementStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finaldate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "finaldate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deposit_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deposit_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentmean");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentmean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderid"));
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

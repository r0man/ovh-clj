/**
 * TelephonyBillingAccountSummaryReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyBillingAccountSummaryReturn  implements java.io.Serializable {
    private com.ovh.TelephonyBillingAccountSummaryBillingAccountStruct billingAccount;

    private com.ovh.TelephonyBillingAccountSummaryLineStruct[] lines;

    public TelephonyBillingAccountSummaryReturn() {
    }

    public TelephonyBillingAccountSummaryReturn(
           com.ovh.TelephonyBillingAccountSummaryBillingAccountStruct billingAccount,
           com.ovh.TelephonyBillingAccountSummaryLineStruct[] lines) {
           this.billingAccount = billingAccount;
           this.lines = lines;
    }


    /**
     * Gets the billingAccount value for this TelephonyBillingAccountSummaryReturn.
     * 
     * @return billingAccount
     */
    public com.ovh.TelephonyBillingAccountSummaryBillingAccountStruct getBillingAccount() {
        return billingAccount;
    }


    /**
     * Sets the billingAccount value for this TelephonyBillingAccountSummaryReturn.
     * 
     * @param billingAccount
     */
    public void setBillingAccount(com.ovh.TelephonyBillingAccountSummaryBillingAccountStruct billingAccount) {
        this.billingAccount = billingAccount;
    }


    /**
     * Gets the lines value for this TelephonyBillingAccountSummaryReturn.
     * 
     * @return lines
     */
    public com.ovh.TelephonyBillingAccountSummaryLineStruct[] getLines() {
        return lines;
    }


    /**
     * Sets the lines value for this TelephonyBillingAccountSummaryReturn.
     * 
     * @param lines
     */
    public void setLines(com.ovh.TelephonyBillingAccountSummaryLineStruct[] lines) {
        this.lines = lines;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyBillingAccountSummaryReturn)) return false;
        TelephonyBillingAccountSummaryReturn other = (TelephonyBillingAccountSummaryReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billingAccount==null && other.getBillingAccount()==null) || 
             (this.billingAccount!=null &&
              this.billingAccount.equals(other.getBillingAccount()))) &&
            ((this.lines==null && other.getLines()==null) || 
             (this.lines!=null &&
              java.util.Arrays.equals(this.lines, other.getLines())));
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
        if (getBillingAccount() != null) {
            _hashCode += getBillingAccount().hashCode();
        }
        if (getLines() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLines());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLines(), i);
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
        new org.apache.axis.description.TypeDesc(TelephonyBillingAccountSummaryReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyBillingAccountSummaryReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyBillingAccountSummaryBillingAccountStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lines");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyBillingAccountSummaryLineStruct"));
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

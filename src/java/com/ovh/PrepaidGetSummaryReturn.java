/**
 * PrepaidGetSummaryReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class PrepaidGetSummaryReturn  implements java.io.Serializable {
    private java.lang.String contract;

    private int threshold;

    private float balance;

    private java.lang.String md5;

    public PrepaidGetSummaryReturn() {
    }

    public PrepaidGetSummaryReturn(
           java.lang.String contract,
           int threshold,
           float balance,
           java.lang.String md5) {
           this.contract = contract;
           this.threshold = threshold;
           this.balance = balance;
           this.md5 = md5;
    }


    /**
     * Gets the contract value for this PrepaidGetSummaryReturn.
     * 
     * @return contract
     */
    public java.lang.String getContract() {
        return contract;
    }


    /**
     * Sets the contract value for this PrepaidGetSummaryReturn.
     * 
     * @param contract
     */
    public void setContract(java.lang.String contract) {
        this.contract = contract;
    }


    /**
     * Gets the threshold value for this PrepaidGetSummaryReturn.
     * 
     * @return threshold
     */
    public int getThreshold() {
        return threshold;
    }


    /**
     * Sets the threshold value for this PrepaidGetSummaryReturn.
     * 
     * @param threshold
     */
    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }


    /**
     * Gets the balance value for this PrepaidGetSummaryReturn.
     * 
     * @return balance
     */
    public float getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this PrepaidGetSummaryReturn.
     * 
     * @param balance
     */
    public void setBalance(float balance) {
        this.balance = balance;
    }


    /**
     * Gets the md5 value for this PrepaidGetSummaryReturn.
     * 
     * @return md5
     */
    public java.lang.String getMd5() {
        return md5;
    }


    /**
     * Sets the md5 value for this PrepaidGetSummaryReturn.
     * 
     * @param md5
     */
    public void setMd5(java.lang.String md5) {
        this.md5 = md5;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrepaidGetSummaryReturn)) return false;
        PrepaidGetSummaryReturn other = (PrepaidGetSummaryReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contract==null && other.getContract()==null) || 
             (this.contract!=null &&
              this.contract.equals(other.getContract()))) &&
            this.threshold == other.getThreshold() &&
            this.balance == other.getBalance() &&
            ((this.md5==null && other.getMd5()==null) || 
             (this.md5!=null &&
              this.md5.equals(other.getMd5())));
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
        if (getContract() != null) {
            _hashCode += getContract().hashCode();
        }
        _hashCode += getThreshold();
        _hashCode += new Float(getBalance()).hashCode();
        if (getMd5() != null) {
            _hashCode += getMd5().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrepaidGetSummaryReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "prepaidGetSummaryReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contract");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("threshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "threshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("md5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "md5"));
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

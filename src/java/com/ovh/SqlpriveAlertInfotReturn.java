/**
 * SqlpriveAlertInfotReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class SqlpriveAlertInfotReturn  implements java.io.Serializable {
    private java.lang.String email;

    private java.lang.String[] alert;

    private java.lang.String smsNumber;

    private java.lang.String smsAccount;

    public SqlpriveAlertInfotReturn() {
    }

    public SqlpriveAlertInfotReturn(
           java.lang.String email,
           java.lang.String[] alert,
           java.lang.String smsNumber,
           java.lang.String smsAccount) {
           this.email = email;
           this.alert = alert;
           this.smsNumber = smsNumber;
           this.smsAccount = smsAccount;
    }


    /**
     * Gets the email value for this SqlpriveAlertInfotReturn.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this SqlpriveAlertInfotReturn.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the alert value for this SqlpriveAlertInfotReturn.
     * 
     * @return alert
     */
    public java.lang.String[] getAlert() {
        return alert;
    }


    /**
     * Sets the alert value for this SqlpriveAlertInfotReturn.
     * 
     * @param alert
     */
    public void setAlert(java.lang.String[] alert) {
        this.alert = alert;
    }


    /**
     * Gets the smsNumber value for this SqlpriveAlertInfotReturn.
     * 
     * @return smsNumber
     */
    public java.lang.String getSmsNumber() {
        return smsNumber;
    }


    /**
     * Sets the smsNumber value for this SqlpriveAlertInfotReturn.
     * 
     * @param smsNumber
     */
    public void setSmsNumber(java.lang.String smsNumber) {
        this.smsNumber = smsNumber;
    }


    /**
     * Gets the smsAccount value for this SqlpriveAlertInfotReturn.
     * 
     * @return smsAccount
     */
    public java.lang.String getSmsAccount() {
        return smsAccount;
    }


    /**
     * Sets the smsAccount value for this SqlpriveAlertInfotReturn.
     * 
     * @param smsAccount
     */
    public void setSmsAccount(java.lang.String smsAccount) {
        this.smsAccount = smsAccount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SqlpriveAlertInfotReturn)) return false;
        SqlpriveAlertInfotReturn other = (SqlpriveAlertInfotReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.alert==null && other.getAlert()==null) || 
             (this.alert!=null &&
              java.util.Arrays.equals(this.alert, other.getAlert()))) &&
            ((this.smsNumber==null && other.getSmsNumber()==null) || 
             (this.smsNumber!=null &&
              this.smsNumber.equals(other.getSmsNumber()))) &&
            ((this.smsAccount==null && other.getSmsAccount()==null) || 
             (this.smsAccount!=null &&
              this.smsAccount.equals(other.getSmsAccount())));
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
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getAlert() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlert());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlert(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSmsNumber() != null) {
            _hashCode += getSmsNumber().hashCode();
        }
        if (getSmsAccount() != null) {
            _hashCode += getSmsAccount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SqlpriveAlertInfotReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "sqlpriveAlertInfotReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smsNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smsAccount"));
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

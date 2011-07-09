/**
 * AccountSummaryReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class AccountSummaryReturn  implements java.io.Serializable {
    private java.lang.String nic;

    private java.lang.String account;

    private java.lang.String country;

    private java.lang.String description;

    private int balance;

    private int alertThreshold;

    private int limitThreshold;

    private java.lang.String openDate;

    private java.lang.String date;

    private java.lang.String closeDate;

    public AccountSummaryReturn() {
    }

    public AccountSummaryReturn(
           java.lang.String nic,
           java.lang.String account,
           java.lang.String country,
           java.lang.String description,
           int balance,
           int alertThreshold,
           int limitThreshold,
           java.lang.String openDate,
           java.lang.String date,
           java.lang.String closeDate) {
           this.nic = nic;
           this.account = account;
           this.country = country;
           this.description = description;
           this.balance = balance;
           this.alertThreshold = alertThreshold;
           this.limitThreshold = limitThreshold;
           this.openDate = openDate;
           this.date = date;
           this.closeDate = closeDate;
    }


    /**
     * Gets the nic value for this AccountSummaryReturn.
     * 
     * @return nic
     */
    public java.lang.String getNic() {
        return nic;
    }


    /**
     * Sets the nic value for this AccountSummaryReturn.
     * 
     * @param nic
     */
    public void setNic(java.lang.String nic) {
        this.nic = nic;
    }


    /**
     * Gets the account value for this AccountSummaryReturn.
     * 
     * @return account
     */
    public java.lang.String getAccount() {
        return account;
    }


    /**
     * Sets the account value for this AccountSummaryReturn.
     * 
     * @param account
     */
    public void setAccount(java.lang.String account) {
        this.account = account;
    }


    /**
     * Gets the country value for this AccountSummaryReturn.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this AccountSummaryReturn.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the description value for this AccountSummaryReturn.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AccountSummaryReturn.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the balance value for this AccountSummaryReturn.
     * 
     * @return balance
     */
    public int getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this AccountSummaryReturn.
     * 
     * @param balance
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }


    /**
     * Gets the alertThreshold value for this AccountSummaryReturn.
     * 
     * @return alertThreshold
     */
    public int getAlertThreshold() {
        return alertThreshold;
    }


    /**
     * Sets the alertThreshold value for this AccountSummaryReturn.
     * 
     * @param alertThreshold
     */
    public void setAlertThreshold(int alertThreshold) {
        this.alertThreshold = alertThreshold;
    }


    /**
     * Gets the limitThreshold value for this AccountSummaryReturn.
     * 
     * @return limitThreshold
     */
    public int getLimitThreshold() {
        return limitThreshold;
    }


    /**
     * Sets the limitThreshold value for this AccountSummaryReturn.
     * 
     * @param limitThreshold
     */
    public void setLimitThreshold(int limitThreshold) {
        this.limitThreshold = limitThreshold;
    }


    /**
     * Gets the openDate value for this AccountSummaryReturn.
     * 
     * @return openDate
     */
    public java.lang.String getOpenDate() {
        return openDate;
    }


    /**
     * Sets the openDate value for this AccountSummaryReturn.
     * 
     * @param openDate
     */
    public void setOpenDate(java.lang.String openDate) {
        this.openDate = openDate;
    }


    /**
     * Gets the date value for this AccountSummaryReturn.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this AccountSummaryReturn.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the closeDate value for this AccountSummaryReturn.
     * 
     * @return closeDate
     */
    public java.lang.String getCloseDate() {
        return closeDate;
    }


    /**
     * Sets the closeDate value for this AccountSummaryReturn.
     * 
     * @param closeDate
     */
    public void setCloseDate(java.lang.String closeDate) {
        this.closeDate = closeDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountSummaryReturn)) return false;
        AccountSummaryReturn other = (AccountSummaryReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nic==null && other.getNic()==null) || 
             (this.nic!=null &&
              this.nic.equals(other.getNic()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.balance == other.getBalance() &&
            this.alertThreshold == other.getAlertThreshold() &&
            this.limitThreshold == other.getLimitThreshold() &&
            ((this.openDate==null && other.getOpenDate()==null) || 
             (this.openDate!=null &&
              this.openDate.equals(other.getOpenDate()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.closeDate==null && other.getCloseDate()==null) || 
             (this.closeDate!=null &&
              this.closeDate.equals(other.getCloseDate())));
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
        if (getNic() != null) {
            _hashCode += getNic().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += getBalance();
        _hashCode += getAlertThreshold();
        _hashCode += getLimitThreshold();
        if (getOpenDate() != null) {
            _hashCode += getOpenDate().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getCloseDate() != null) {
            _hashCode += getCloseDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountSummaryReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "accountSummaryReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alertThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limitThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "openDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "closeDate"));
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

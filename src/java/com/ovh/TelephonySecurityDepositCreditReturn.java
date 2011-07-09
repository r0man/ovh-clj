/**
 * TelephonySecurityDepositCreditReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonySecurityDepositCreditReturn  implements java.io.Serializable {
    private int orderId;

    private java.lang.String orderPassword;

    private java.lang.String orderUrl;

    private float totalPrice;

    private float vat;

    private float totalPriceWithVat;

    private java.lang.String ribBankCode;

    private java.lang.String ribAgencyCode;

    private java.lang.String ribAccountNumber;

    private java.lang.String ribKey;

    private java.lang.String iban;

    private java.lang.String bic;

    public TelephonySecurityDepositCreditReturn() {
    }

    public TelephonySecurityDepositCreditReturn(
           int orderId,
           java.lang.String orderPassword,
           java.lang.String orderUrl,
           float totalPrice,
           float vat,
           float totalPriceWithVat,
           java.lang.String ribBankCode,
           java.lang.String ribAgencyCode,
           java.lang.String ribAccountNumber,
           java.lang.String ribKey,
           java.lang.String iban,
           java.lang.String bic) {
           this.orderId = orderId;
           this.orderPassword = orderPassword;
           this.orderUrl = orderUrl;
           this.totalPrice = totalPrice;
           this.vat = vat;
           this.totalPriceWithVat = totalPriceWithVat;
           this.ribBankCode = ribBankCode;
           this.ribAgencyCode = ribAgencyCode;
           this.ribAccountNumber = ribAccountNumber;
           this.ribKey = ribKey;
           this.iban = iban;
           this.bic = bic;
    }


    /**
     * Gets the orderId value for this TelephonySecurityDepositCreditReturn.
     * 
     * @return orderId
     */
    public int getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this TelephonySecurityDepositCreditReturn.
     * 
     * @param orderId
     */
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderPassword value for this TelephonySecurityDepositCreditReturn.
     * 
     * @return orderPassword
     */
    public java.lang.String getOrderPassword() {
        return orderPassword;
    }


    /**
     * Sets the orderPassword value for this TelephonySecurityDepositCreditReturn.
     * 
     * @param orderPassword
     */
    public void setOrderPassword(java.lang.String orderPassword) {
        this.orderPassword = orderPassword;
    }


    /**
     * Gets the orderUrl value for this TelephonySecurityDepositCreditReturn.
     * 
     * @return orderUrl
     */
    public java.lang.String getOrderUrl() {
        return orderUrl;
    }


    /**
     * Sets the orderUrl value for this TelephonySecurityDepositCreditReturn.
     * 
     * @param orderUrl
     */
    public void setOrderUrl(java.lang.String orderUrl) {
        this.orderUrl = orderUrl;
    }


    /**
     * Gets the totalPrice value for this TelephonySecurityDepositCreditReturn.
     * 
     * @return totalPrice
     */
    public float getTotalPrice() {
        return totalPrice;
    }


    /**
     * Sets the totalPrice value for this TelephonySecurityDepositCreditReturn.
     * 
     * @param totalPrice
     */
    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }


    /**
     * Gets the vat value for this TelephonySecurityDepositCreditReturn.
     * 
     * @return vat
     */
    public float getVat() {
        return vat;
    }


    /**
     * Sets the vat value for this TelephonySecurityDepositCreditReturn.
     * 
     * @param vat
     */
    public void setVat(float vat) {
        this.vat = vat;
    }


    /**
     * Gets the totalPriceWithVat value for this TelephonySecurityDepositCreditReturn.
     * 
     * @return totalPriceWithVat
     */
    public float getTotalPriceWithVat() {
        return totalPriceWithVat;
    }


    /**
     * Sets the totalPriceWithVat value for this TelephonySecurityDepositCreditReturn.
     * 
     * @param totalPriceWithVat
     */
    public void setTotalPriceWithVat(float totalPriceWithVat) {
        this.totalPriceWithVat = totalPriceWithVat;
    }


    /**
     * Gets the ribBankCode value for this TelephonySecurityDepositCreditReturn.
     * 
     * @return ribBankCode
     */
    public java.lang.String getRibBankCode() {
        return ribBankCode;
    }


    /**
     * Sets the ribBankCode value for this TelephonySecurityDepositCreditReturn.
     * 
     * @param ribBankCode
     */
    public void setRibBankCode(java.lang.String ribBankCode) {
        this.ribBankCode = ribBankCode;
    }


    /**
     * Gets the ribAgencyCode value for this TelephonySecurityDepositCreditReturn.
     * 
     * @return ribAgencyCode
     */
    public java.lang.String getRibAgencyCode() {
        return ribAgencyCode;
    }


    /**
     * Sets the ribAgencyCode value for this TelephonySecurityDepositCreditReturn.
     * 
     * @param ribAgencyCode
     */
    public void setRibAgencyCode(java.lang.String ribAgencyCode) {
        this.ribAgencyCode = ribAgencyCode;
    }


    /**
     * Gets the ribAccountNumber value for this TelephonySecurityDepositCreditReturn.
     * 
     * @return ribAccountNumber
     */
    public java.lang.String getRibAccountNumber() {
        return ribAccountNumber;
    }


    /**
     * Sets the ribAccountNumber value for this TelephonySecurityDepositCreditReturn.
     * 
     * @param ribAccountNumber
     */
    public void setRibAccountNumber(java.lang.String ribAccountNumber) {
        this.ribAccountNumber = ribAccountNumber;
    }


    /**
     * Gets the ribKey value for this TelephonySecurityDepositCreditReturn.
     * 
     * @return ribKey
     */
    public java.lang.String getRibKey() {
        return ribKey;
    }


    /**
     * Sets the ribKey value for this TelephonySecurityDepositCreditReturn.
     * 
     * @param ribKey
     */
    public void setRibKey(java.lang.String ribKey) {
        this.ribKey = ribKey;
    }


    /**
     * Gets the iban value for this TelephonySecurityDepositCreditReturn.
     * 
     * @return iban
     */
    public java.lang.String getIban() {
        return iban;
    }


    /**
     * Sets the iban value for this TelephonySecurityDepositCreditReturn.
     * 
     * @param iban
     */
    public void setIban(java.lang.String iban) {
        this.iban = iban;
    }


    /**
     * Gets the bic value for this TelephonySecurityDepositCreditReturn.
     * 
     * @return bic
     */
    public java.lang.String getBic() {
        return bic;
    }


    /**
     * Sets the bic value for this TelephonySecurityDepositCreditReturn.
     * 
     * @param bic
     */
    public void setBic(java.lang.String bic) {
        this.bic = bic;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonySecurityDepositCreditReturn)) return false;
        TelephonySecurityDepositCreditReturn other = (TelephonySecurityDepositCreditReturn) obj;
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
            this.totalPrice == other.getTotalPrice() &&
            this.vat == other.getVat() &&
            this.totalPriceWithVat == other.getTotalPriceWithVat() &&
            ((this.ribBankCode==null && other.getRibBankCode()==null) || 
             (this.ribBankCode!=null &&
              this.ribBankCode.equals(other.getRibBankCode()))) &&
            ((this.ribAgencyCode==null && other.getRibAgencyCode()==null) || 
             (this.ribAgencyCode!=null &&
              this.ribAgencyCode.equals(other.getRibAgencyCode()))) &&
            ((this.ribAccountNumber==null && other.getRibAccountNumber()==null) || 
             (this.ribAccountNumber!=null &&
              this.ribAccountNumber.equals(other.getRibAccountNumber()))) &&
            ((this.ribKey==null && other.getRibKey()==null) || 
             (this.ribKey!=null &&
              this.ribKey.equals(other.getRibKey()))) &&
            ((this.iban==null && other.getIban()==null) || 
             (this.iban!=null &&
              this.iban.equals(other.getIban()))) &&
            ((this.bic==null && other.getBic()==null) || 
             (this.bic!=null &&
              this.bic.equals(other.getBic())));
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
        _hashCode += new Float(getVat()).hashCode();
        _hashCode += new Float(getTotalPriceWithVat()).hashCode();
        if (getRibBankCode() != null) {
            _hashCode += getRibBankCode().hashCode();
        }
        if (getRibAgencyCode() != null) {
            _hashCode += getRibAgencyCode().hashCode();
        }
        if (getRibAccountNumber() != null) {
            _hashCode += getRibAccountNumber().hashCode();
        }
        if (getRibKey() != null) {
            _hashCode += getRibKey().hashCode();
        }
        if (getIban() != null) {
            _hashCode += getIban().hashCode();
        }
        if (getBic() != null) {
            _hashCode += getBic().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonySecurityDepositCreditReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonySecurityDepositCreditReturn"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPriceWithVat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalPriceWithVat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ribBankCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ribBankCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ribAgencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ribAgencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ribAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ribAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ribKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ribKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iban");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iban"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bic"));
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

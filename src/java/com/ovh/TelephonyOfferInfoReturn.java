/**
 * TelephonyOfferInfoReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyOfferInfoReturn  implements java.io.Serializable {
    private java.lang.String number;

    private java.lang.String description;

    private java.lang.String offer;

    private java.lang.String countryCode;

    private java.lang.String nextBillingDate;

    private int simultaneousLines;

    private com.ovh.TelephonyOfferInfoHardwareStruct hardware;

    private com.ovh.TelephonyOfferInfoSipAccountStruct sipAccount;

    public TelephonyOfferInfoReturn() {
    }

    public TelephonyOfferInfoReturn(
           java.lang.String number,
           java.lang.String description,
           java.lang.String offer,
           java.lang.String countryCode,
           java.lang.String nextBillingDate,
           int simultaneousLines,
           com.ovh.TelephonyOfferInfoHardwareStruct hardware,
           com.ovh.TelephonyOfferInfoSipAccountStruct sipAccount) {
           this.number = number;
           this.description = description;
           this.offer = offer;
           this.countryCode = countryCode;
           this.nextBillingDate = nextBillingDate;
           this.simultaneousLines = simultaneousLines;
           this.hardware = hardware;
           this.sipAccount = sipAccount;
    }


    /**
     * Gets the number value for this TelephonyOfferInfoReturn.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this TelephonyOfferInfoReturn.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the description value for this TelephonyOfferInfoReturn.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TelephonyOfferInfoReturn.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the offer value for this TelephonyOfferInfoReturn.
     * 
     * @return offer
     */
    public java.lang.String getOffer() {
        return offer;
    }


    /**
     * Sets the offer value for this TelephonyOfferInfoReturn.
     * 
     * @param offer
     */
    public void setOffer(java.lang.String offer) {
        this.offer = offer;
    }


    /**
     * Gets the countryCode value for this TelephonyOfferInfoReturn.
     * 
     * @return countryCode
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this TelephonyOfferInfoReturn.
     * 
     * @param countryCode
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the nextBillingDate value for this TelephonyOfferInfoReturn.
     * 
     * @return nextBillingDate
     */
    public java.lang.String getNextBillingDate() {
        return nextBillingDate;
    }


    /**
     * Sets the nextBillingDate value for this TelephonyOfferInfoReturn.
     * 
     * @param nextBillingDate
     */
    public void setNextBillingDate(java.lang.String nextBillingDate) {
        this.nextBillingDate = nextBillingDate;
    }


    /**
     * Gets the simultaneousLines value for this TelephonyOfferInfoReturn.
     * 
     * @return simultaneousLines
     */
    public int getSimultaneousLines() {
        return simultaneousLines;
    }


    /**
     * Sets the simultaneousLines value for this TelephonyOfferInfoReturn.
     * 
     * @param simultaneousLines
     */
    public void setSimultaneousLines(int simultaneousLines) {
        this.simultaneousLines = simultaneousLines;
    }


    /**
     * Gets the hardware value for this TelephonyOfferInfoReturn.
     * 
     * @return hardware
     */
    public com.ovh.TelephonyOfferInfoHardwareStruct getHardware() {
        return hardware;
    }


    /**
     * Sets the hardware value for this TelephonyOfferInfoReturn.
     * 
     * @param hardware
     */
    public void setHardware(com.ovh.TelephonyOfferInfoHardwareStruct hardware) {
        this.hardware = hardware;
    }


    /**
     * Gets the sipAccount value for this TelephonyOfferInfoReturn.
     * 
     * @return sipAccount
     */
    public com.ovh.TelephonyOfferInfoSipAccountStruct getSipAccount() {
        return sipAccount;
    }


    /**
     * Sets the sipAccount value for this TelephonyOfferInfoReturn.
     * 
     * @param sipAccount
     */
    public void setSipAccount(com.ovh.TelephonyOfferInfoSipAccountStruct sipAccount) {
        this.sipAccount = sipAccount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyOfferInfoReturn)) return false;
        TelephonyOfferInfoReturn other = (TelephonyOfferInfoReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.offer==null && other.getOffer()==null) || 
             (this.offer!=null &&
              this.offer.equals(other.getOffer()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.nextBillingDate==null && other.getNextBillingDate()==null) || 
             (this.nextBillingDate!=null &&
              this.nextBillingDate.equals(other.getNextBillingDate()))) &&
            this.simultaneousLines == other.getSimultaneousLines() &&
            ((this.hardware==null && other.getHardware()==null) || 
             (this.hardware!=null &&
              this.hardware.equals(other.getHardware()))) &&
            ((this.sipAccount==null && other.getSipAccount()==null) || 
             (this.sipAccount!=null &&
              this.sipAccount.equals(other.getSipAccount())));
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
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getOffer() != null) {
            _hashCode += getOffer().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getNextBillingDate() != null) {
            _hashCode += getNextBillingDate().hashCode();
        }
        _hashCode += getSimultaneousLines();
        if (getHardware() != null) {
            _hashCode += getHardware().hashCode();
        }
        if (getSipAccount() != null) {
            _hashCode += getSipAccount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyOfferInfoReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyOfferInfoReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "number"));
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
        elemField.setFieldName("offer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextBillingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextBillingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simultaneousLines");
        elemField.setXmlName(new javax.xml.namespace.QName("", "simultaneousLines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardware");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hardware"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyOfferInfoHardwareStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyOfferInfoSipAccountStruct"));
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

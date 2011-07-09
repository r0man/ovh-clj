/**
 * TelephonyLineSwitchOldOfferStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyLineSwitchOldOfferStruct  implements java.io.Serializable {
    private java.lang.String number;

    private com.ovh.TelephonyLineSwitchPossibilityPriceStruct[] offers;

    public TelephonyLineSwitchOldOfferStruct() {
    }

    public TelephonyLineSwitchOldOfferStruct(
           java.lang.String number,
           com.ovh.TelephonyLineSwitchPossibilityPriceStruct[] offers) {
           this.number = number;
           this.offers = offers;
    }


    /**
     * Gets the number value for this TelephonyLineSwitchOldOfferStruct.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this TelephonyLineSwitchOldOfferStruct.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the offers value for this TelephonyLineSwitchOldOfferStruct.
     * 
     * @return offers
     */
    public com.ovh.TelephonyLineSwitchPossibilityPriceStruct[] getOffers() {
        return offers;
    }


    /**
     * Sets the offers value for this TelephonyLineSwitchOldOfferStruct.
     * 
     * @param offers
     */
    public void setOffers(com.ovh.TelephonyLineSwitchPossibilityPriceStruct[] offers) {
        this.offers = offers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyLineSwitchOldOfferStruct)) return false;
        TelephonyLineSwitchOldOfferStruct other = (TelephonyLineSwitchOldOfferStruct) obj;
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
            ((this.offers==null && other.getOffers()==null) || 
             (this.offers!=null &&
              java.util.Arrays.equals(this.offers, other.getOffers())));
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
        if (getOffers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOffers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOffers(), i);
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
        new org.apache.axis.description.TypeDesc(TelephonyLineSwitchOldOfferStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyLineSwitchOldOfferStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyLineSwitchPossibilityPriceStruct"));
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

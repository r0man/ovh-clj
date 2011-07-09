/**
 * TelephonySpecialNumberCustomListReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonySpecialNumberCustomListReturn  implements java.io.Serializable {
    private java.lang.String[] easyNumbers;

    private java.lang.String[] staticAttributionRange;

    private java.lang.String[] proposedNumbers;

    public TelephonySpecialNumberCustomListReturn() {
    }

    public TelephonySpecialNumberCustomListReturn(
           java.lang.String[] easyNumbers,
           java.lang.String[] staticAttributionRange,
           java.lang.String[] proposedNumbers) {
           this.easyNumbers = easyNumbers;
           this.staticAttributionRange = staticAttributionRange;
           this.proposedNumbers = proposedNumbers;
    }


    /**
     * Gets the easyNumbers value for this TelephonySpecialNumberCustomListReturn.
     * 
     * @return easyNumbers
     */
    public java.lang.String[] getEasyNumbers() {
        return easyNumbers;
    }


    /**
     * Sets the easyNumbers value for this TelephonySpecialNumberCustomListReturn.
     * 
     * @param easyNumbers
     */
    public void setEasyNumbers(java.lang.String[] easyNumbers) {
        this.easyNumbers = easyNumbers;
    }


    /**
     * Gets the staticAttributionRange value for this TelephonySpecialNumberCustomListReturn.
     * 
     * @return staticAttributionRange
     */
    public java.lang.String[] getStaticAttributionRange() {
        return staticAttributionRange;
    }


    /**
     * Sets the staticAttributionRange value for this TelephonySpecialNumberCustomListReturn.
     * 
     * @param staticAttributionRange
     */
    public void setStaticAttributionRange(java.lang.String[] staticAttributionRange) {
        this.staticAttributionRange = staticAttributionRange;
    }


    /**
     * Gets the proposedNumbers value for this TelephonySpecialNumberCustomListReturn.
     * 
     * @return proposedNumbers
     */
    public java.lang.String[] getProposedNumbers() {
        return proposedNumbers;
    }


    /**
     * Sets the proposedNumbers value for this TelephonySpecialNumberCustomListReturn.
     * 
     * @param proposedNumbers
     */
    public void setProposedNumbers(java.lang.String[] proposedNumbers) {
        this.proposedNumbers = proposedNumbers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonySpecialNumberCustomListReturn)) return false;
        TelephonySpecialNumberCustomListReturn other = (TelephonySpecialNumberCustomListReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.easyNumbers==null && other.getEasyNumbers()==null) || 
             (this.easyNumbers!=null &&
              java.util.Arrays.equals(this.easyNumbers, other.getEasyNumbers()))) &&
            ((this.staticAttributionRange==null && other.getStaticAttributionRange()==null) || 
             (this.staticAttributionRange!=null &&
              java.util.Arrays.equals(this.staticAttributionRange, other.getStaticAttributionRange()))) &&
            ((this.proposedNumbers==null && other.getProposedNumbers()==null) || 
             (this.proposedNumbers!=null &&
              java.util.Arrays.equals(this.proposedNumbers, other.getProposedNumbers())));
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
        if (getEasyNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEasyNumbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEasyNumbers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStaticAttributionRange() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStaticAttributionRange());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStaticAttributionRange(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProposedNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProposedNumbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProposedNumbers(), i);
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
        new org.apache.axis.description.TypeDesc(TelephonySpecialNumberCustomListReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonySpecialNumberCustomListReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("easyNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "easyNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staticAttributionRange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "staticAttributionRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposedNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proposedNumbers"));
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

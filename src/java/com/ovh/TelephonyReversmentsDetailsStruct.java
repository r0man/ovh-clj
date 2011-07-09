/**
 * TelephonyReversmentsDetailsStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyReversmentsDetailsStruct  implements java.io.Serializable {
    private java.lang.String date;

    private java.lang.String connectionDuration;

    private java.lang.String callingNumber;

    private java.lang.String priceReversed;

    private java.lang.String operatorCode;

    public TelephonyReversmentsDetailsStruct() {
    }

    public TelephonyReversmentsDetailsStruct(
           java.lang.String date,
           java.lang.String connectionDuration,
           java.lang.String callingNumber,
           java.lang.String priceReversed,
           java.lang.String operatorCode) {
           this.date = date;
           this.connectionDuration = connectionDuration;
           this.callingNumber = callingNumber;
           this.priceReversed = priceReversed;
           this.operatorCode = operatorCode;
    }


    /**
     * Gets the date value for this TelephonyReversmentsDetailsStruct.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this TelephonyReversmentsDetailsStruct.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the connectionDuration value for this TelephonyReversmentsDetailsStruct.
     * 
     * @return connectionDuration
     */
    public java.lang.String getConnectionDuration() {
        return connectionDuration;
    }


    /**
     * Sets the connectionDuration value for this TelephonyReversmentsDetailsStruct.
     * 
     * @param connectionDuration
     */
    public void setConnectionDuration(java.lang.String connectionDuration) {
        this.connectionDuration = connectionDuration;
    }


    /**
     * Gets the callingNumber value for this TelephonyReversmentsDetailsStruct.
     * 
     * @return callingNumber
     */
    public java.lang.String getCallingNumber() {
        return callingNumber;
    }


    /**
     * Sets the callingNumber value for this TelephonyReversmentsDetailsStruct.
     * 
     * @param callingNumber
     */
    public void setCallingNumber(java.lang.String callingNumber) {
        this.callingNumber = callingNumber;
    }


    /**
     * Gets the priceReversed value for this TelephonyReversmentsDetailsStruct.
     * 
     * @return priceReversed
     */
    public java.lang.String getPriceReversed() {
        return priceReversed;
    }


    /**
     * Sets the priceReversed value for this TelephonyReversmentsDetailsStruct.
     * 
     * @param priceReversed
     */
    public void setPriceReversed(java.lang.String priceReversed) {
        this.priceReversed = priceReversed;
    }


    /**
     * Gets the operatorCode value for this TelephonyReversmentsDetailsStruct.
     * 
     * @return operatorCode
     */
    public java.lang.String getOperatorCode() {
        return operatorCode;
    }


    /**
     * Sets the operatorCode value for this TelephonyReversmentsDetailsStruct.
     * 
     * @param operatorCode
     */
    public void setOperatorCode(java.lang.String operatorCode) {
        this.operatorCode = operatorCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyReversmentsDetailsStruct)) return false;
        TelephonyReversmentsDetailsStruct other = (TelephonyReversmentsDetailsStruct) obj;
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
            ((this.connectionDuration==null && other.getConnectionDuration()==null) || 
             (this.connectionDuration!=null &&
              this.connectionDuration.equals(other.getConnectionDuration()))) &&
            ((this.callingNumber==null && other.getCallingNumber()==null) || 
             (this.callingNumber!=null &&
              this.callingNumber.equals(other.getCallingNumber()))) &&
            ((this.priceReversed==null && other.getPriceReversed()==null) || 
             (this.priceReversed!=null &&
              this.priceReversed.equals(other.getPriceReversed()))) &&
            ((this.operatorCode==null && other.getOperatorCode()==null) || 
             (this.operatorCode!=null &&
              this.operatorCode.equals(other.getOperatorCode())));
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
        if (getConnectionDuration() != null) {
            _hashCode += getConnectionDuration().hashCode();
        }
        if (getCallingNumber() != null) {
            _hashCode += getCallingNumber().hashCode();
        }
        if (getPriceReversed() != null) {
            _hashCode += getPriceReversed().hashCode();
        }
        if (getOperatorCode() != null) {
            _hashCode += getOperatorCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyReversmentsDetailsStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyReversmentsDetailsStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "connectionDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceReversed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceReversed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operatorCode"));
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

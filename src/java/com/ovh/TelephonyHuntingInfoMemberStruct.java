/**
 * TelephonyHuntingInfoMemberStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyHuntingInfoMemberStruct  implements java.io.Serializable {
    private java.lang.String number;

    private java.lang.String status;

    private boolean logged;

    private int noReplyTimer;

    public TelephonyHuntingInfoMemberStruct() {
    }

    public TelephonyHuntingInfoMemberStruct(
           java.lang.String number,
           java.lang.String status,
           boolean logged,
           int noReplyTimer) {
           this.number = number;
           this.status = status;
           this.logged = logged;
           this.noReplyTimer = noReplyTimer;
    }


    /**
     * Gets the number value for this TelephonyHuntingInfoMemberStruct.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this TelephonyHuntingInfoMemberStruct.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the status value for this TelephonyHuntingInfoMemberStruct.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TelephonyHuntingInfoMemberStruct.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the logged value for this TelephonyHuntingInfoMemberStruct.
     * 
     * @return logged
     */
    public boolean isLogged() {
        return logged;
    }


    /**
     * Sets the logged value for this TelephonyHuntingInfoMemberStruct.
     * 
     * @param logged
     */
    public void setLogged(boolean logged) {
        this.logged = logged;
    }


    /**
     * Gets the noReplyTimer value for this TelephonyHuntingInfoMemberStruct.
     * 
     * @return noReplyTimer
     */
    public int getNoReplyTimer() {
        return noReplyTimer;
    }


    /**
     * Sets the noReplyTimer value for this TelephonyHuntingInfoMemberStruct.
     * 
     * @param noReplyTimer
     */
    public void setNoReplyTimer(int noReplyTimer) {
        this.noReplyTimer = noReplyTimer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyHuntingInfoMemberStruct)) return false;
        TelephonyHuntingInfoMemberStruct other = (TelephonyHuntingInfoMemberStruct) obj;
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
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            this.logged == other.isLogged() &&
            this.noReplyTimer == other.getNoReplyTimer();
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        _hashCode += (isLogged() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getNoReplyTimer();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyHuntingInfoMemberStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyHuntingInfoMemberStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "number"));
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
        elemField.setFieldName("logged");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noReplyTimer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noReplyTimer"));
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

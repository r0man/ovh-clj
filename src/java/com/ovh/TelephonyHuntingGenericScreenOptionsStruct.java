/**
 * TelephonyHuntingGenericScreenOptionsStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyHuntingGenericScreenOptionsStruct  implements java.io.Serializable {
    private java.lang.String callForward;

    private java.lang.String voicemail;

    private java.lang.String index;

    private java.lang.String timeout;

    public TelephonyHuntingGenericScreenOptionsStruct() {
    }

    public TelephonyHuntingGenericScreenOptionsStruct(
           java.lang.String callForward,
           java.lang.String voicemail,
           java.lang.String index,
           java.lang.String timeout) {
           this.callForward = callForward;
           this.voicemail = voicemail;
           this.index = index;
           this.timeout = timeout;
    }


    /**
     * Gets the callForward value for this TelephonyHuntingGenericScreenOptionsStruct.
     * 
     * @return callForward
     */
    public java.lang.String getCallForward() {
        return callForward;
    }


    /**
     * Sets the callForward value for this TelephonyHuntingGenericScreenOptionsStruct.
     * 
     * @param callForward
     */
    public void setCallForward(java.lang.String callForward) {
        this.callForward = callForward;
    }


    /**
     * Gets the voicemail value for this TelephonyHuntingGenericScreenOptionsStruct.
     * 
     * @return voicemail
     */
    public java.lang.String getVoicemail() {
        return voicemail;
    }


    /**
     * Sets the voicemail value for this TelephonyHuntingGenericScreenOptionsStruct.
     * 
     * @param voicemail
     */
    public void setVoicemail(java.lang.String voicemail) {
        this.voicemail = voicemail;
    }


    /**
     * Gets the index value for this TelephonyHuntingGenericScreenOptionsStruct.
     * 
     * @return index
     */
    public java.lang.String getIndex() {
        return index;
    }


    /**
     * Sets the index value for this TelephonyHuntingGenericScreenOptionsStruct.
     * 
     * @param index
     */
    public void setIndex(java.lang.String index) {
        this.index = index;
    }


    /**
     * Gets the timeout value for this TelephonyHuntingGenericScreenOptionsStruct.
     * 
     * @return timeout
     */
    public java.lang.String getTimeout() {
        return timeout;
    }


    /**
     * Sets the timeout value for this TelephonyHuntingGenericScreenOptionsStruct.
     * 
     * @param timeout
     */
    public void setTimeout(java.lang.String timeout) {
        this.timeout = timeout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyHuntingGenericScreenOptionsStruct)) return false;
        TelephonyHuntingGenericScreenOptionsStruct other = (TelephonyHuntingGenericScreenOptionsStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.callForward==null && other.getCallForward()==null) || 
             (this.callForward!=null &&
              this.callForward.equals(other.getCallForward()))) &&
            ((this.voicemail==null && other.getVoicemail()==null) || 
             (this.voicemail!=null &&
              this.voicemail.equals(other.getVoicemail()))) &&
            ((this.index==null && other.getIndex()==null) || 
             (this.index!=null &&
              this.index.equals(other.getIndex()))) &&
            ((this.timeout==null && other.getTimeout()==null) || 
             (this.timeout!=null &&
              this.timeout.equals(other.getTimeout())));
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
        if (getCallForward() != null) {
            _hashCode += getCallForward().hashCode();
        }
        if (getVoicemail() != null) {
            _hashCode += getVoicemail().hashCode();
        }
        if (getIndex() != null) {
            _hashCode += getIndex().hashCode();
        }
        if (getTimeout() != null) {
            _hashCode += getTimeout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyHuntingGenericScreenOptionsStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyHuntingGenericScreenOptionsStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callForward");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callForward"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voicemail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "voicemail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("index");
        elemField.setXmlName(new javax.xml.namespace.QName("", "index"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeout"));
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

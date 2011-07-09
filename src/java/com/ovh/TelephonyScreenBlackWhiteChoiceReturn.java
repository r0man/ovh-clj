/**
 * TelephonyScreenBlackWhiteChoiceReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyScreenBlackWhiteChoiceReturn  implements java.io.Serializable {
    private java.lang.String incomingScreenlist;

    private java.lang.String outgoingScreenlist;

    private java.lang.String outgoingCodeUnlock;

    public TelephonyScreenBlackWhiteChoiceReturn() {
    }

    public TelephonyScreenBlackWhiteChoiceReturn(
           java.lang.String incomingScreenlist,
           java.lang.String outgoingScreenlist,
           java.lang.String outgoingCodeUnlock) {
           this.incomingScreenlist = incomingScreenlist;
           this.outgoingScreenlist = outgoingScreenlist;
           this.outgoingCodeUnlock = outgoingCodeUnlock;
    }


    /**
     * Gets the incomingScreenlist value for this TelephonyScreenBlackWhiteChoiceReturn.
     * 
     * @return incomingScreenlist
     */
    public java.lang.String getIncomingScreenlist() {
        return incomingScreenlist;
    }


    /**
     * Sets the incomingScreenlist value for this TelephonyScreenBlackWhiteChoiceReturn.
     * 
     * @param incomingScreenlist
     */
    public void setIncomingScreenlist(java.lang.String incomingScreenlist) {
        this.incomingScreenlist = incomingScreenlist;
    }


    /**
     * Gets the outgoingScreenlist value for this TelephonyScreenBlackWhiteChoiceReturn.
     * 
     * @return outgoingScreenlist
     */
    public java.lang.String getOutgoingScreenlist() {
        return outgoingScreenlist;
    }


    /**
     * Sets the outgoingScreenlist value for this TelephonyScreenBlackWhiteChoiceReturn.
     * 
     * @param outgoingScreenlist
     */
    public void setOutgoingScreenlist(java.lang.String outgoingScreenlist) {
        this.outgoingScreenlist = outgoingScreenlist;
    }


    /**
     * Gets the outgoingCodeUnlock value for this TelephonyScreenBlackWhiteChoiceReturn.
     * 
     * @return outgoingCodeUnlock
     */
    public java.lang.String getOutgoingCodeUnlock() {
        return outgoingCodeUnlock;
    }


    /**
     * Sets the outgoingCodeUnlock value for this TelephonyScreenBlackWhiteChoiceReturn.
     * 
     * @param outgoingCodeUnlock
     */
    public void setOutgoingCodeUnlock(java.lang.String outgoingCodeUnlock) {
        this.outgoingCodeUnlock = outgoingCodeUnlock;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyScreenBlackWhiteChoiceReturn)) return false;
        TelephonyScreenBlackWhiteChoiceReturn other = (TelephonyScreenBlackWhiteChoiceReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.incomingScreenlist==null && other.getIncomingScreenlist()==null) || 
             (this.incomingScreenlist!=null &&
              this.incomingScreenlist.equals(other.getIncomingScreenlist()))) &&
            ((this.outgoingScreenlist==null && other.getOutgoingScreenlist()==null) || 
             (this.outgoingScreenlist!=null &&
              this.outgoingScreenlist.equals(other.getOutgoingScreenlist()))) &&
            ((this.outgoingCodeUnlock==null && other.getOutgoingCodeUnlock()==null) || 
             (this.outgoingCodeUnlock!=null &&
              this.outgoingCodeUnlock.equals(other.getOutgoingCodeUnlock())));
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
        if (getIncomingScreenlist() != null) {
            _hashCode += getIncomingScreenlist().hashCode();
        }
        if (getOutgoingScreenlist() != null) {
            _hashCode += getOutgoingScreenlist().hashCode();
        }
        if (getOutgoingCodeUnlock() != null) {
            _hashCode += getOutgoingCodeUnlock().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyScreenBlackWhiteChoiceReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyScreenBlackWhiteChoiceReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incomingScreenlist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "incomingScreenlist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outgoingScreenlist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outgoingScreenlist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outgoingCodeUnlock");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outgoingCodeUnlock"));
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

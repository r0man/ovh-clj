/**
 * AutomatedMailGetStateReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class AutomatedMailGetStateReturn  implements java.io.Serializable {
    private int bounce;

    private int sent;

    private java.lang.String _return;

    private java.lang.String state;

    public AutomatedMailGetStateReturn() {
    }

    public AutomatedMailGetStateReturn(
           int bounce,
           int sent,
           java.lang.String _return,
           java.lang.String state) {
           this.bounce = bounce;
           this.sent = sent;
           this._return = _return;
           this.state = state;
    }


    /**
     * Gets the bounce value for this AutomatedMailGetStateReturn.
     * 
     * @return bounce
     */
    public int getBounce() {
        return bounce;
    }


    /**
     * Sets the bounce value for this AutomatedMailGetStateReturn.
     * 
     * @param bounce
     */
    public void setBounce(int bounce) {
        this.bounce = bounce;
    }


    /**
     * Gets the sent value for this AutomatedMailGetStateReturn.
     * 
     * @return sent
     */
    public int getSent() {
        return sent;
    }


    /**
     * Sets the sent value for this AutomatedMailGetStateReturn.
     * 
     * @param sent
     */
    public void setSent(int sent) {
        this.sent = sent;
    }


    /**
     * Gets the _return value for this AutomatedMailGetStateReturn.
     * 
     * @return _return
     */
    public java.lang.String get_return() {
        return _return;
    }


    /**
     * Sets the _return value for this AutomatedMailGetStateReturn.
     * 
     * @param _return
     */
    public void set_return(java.lang.String _return) {
        this._return = _return;
    }


    /**
     * Gets the state value for this AutomatedMailGetStateReturn.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this AutomatedMailGetStateReturn.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutomatedMailGetStateReturn)) return false;
        AutomatedMailGetStateReturn other = (AutomatedMailGetStateReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.bounce == other.getBounce() &&
            this.sent == other.getSent() &&
            ((this._return==null && other.get_return()==null) || 
             (this._return!=null &&
              this._return.equals(other.get_return()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState())));
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
        _hashCode += getBounce();
        _hashCode += getSent();
        if (get_return() != null) {
            _hashCode += get_return().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutomatedMailGetStateReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "automatedMailGetStateReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bounce");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bounce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_return");
        elemField.setXmlName(new javax.xml.namespace.QName("", "return"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
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

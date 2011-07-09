/**
 * TelephonyPendingActionStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyPendingActionStruct  implements java.io.Serializable {
    private java.lang.String dateTodo;

    private java.lang.String offer;

    private java.lang.String action;

    public TelephonyPendingActionStruct() {
    }

    public TelephonyPendingActionStruct(
           java.lang.String dateTodo,
           java.lang.String offer,
           java.lang.String action) {
           this.dateTodo = dateTodo;
           this.offer = offer;
           this.action = action;
    }


    /**
     * Gets the dateTodo value for this TelephonyPendingActionStruct.
     * 
     * @return dateTodo
     */
    public java.lang.String getDateTodo() {
        return dateTodo;
    }


    /**
     * Sets the dateTodo value for this TelephonyPendingActionStruct.
     * 
     * @param dateTodo
     */
    public void setDateTodo(java.lang.String dateTodo) {
        this.dateTodo = dateTodo;
    }


    /**
     * Gets the offer value for this TelephonyPendingActionStruct.
     * 
     * @return offer
     */
    public java.lang.String getOffer() {
        return offer;
    }


    /**
     * Sets the offer value for this TelephonyPendingActionStruct.
     * 
     * @param offer
     */
    public void setOffer(java.lang.String offer) {
        this.offer = offer;
    }


    /**
     * Gets the action value for this TelephonyPendingActionStruct.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this TelephonyPendingActionStruct.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyPendingActionStruct)) return false;
        TelephonyPendingActionStruct other = (TelephonyPendingActionStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateTodo==null && other.getDateTodo()==null) || 
             (this.dateTodo!=null &&
              this.dateTodo.equals(other.getDateTodo()))) &&
            ((this.offer==null && other.getOffer()==null) || 
             (this.offer!=null &&
              this.offer.equals(other.getOffer()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction())));
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
        if (getDateTodo() != null) {
            _hashCode += getDateTodo().hashCode();
        }
        if (getOffer() != null) {
            _hashCode += getOffer().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyPendingActionStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyPendingActionStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTodo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateTodo"));
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
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
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

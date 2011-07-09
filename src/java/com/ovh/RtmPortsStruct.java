/**
 * RtmPortsStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class RtmPortsStruct  implements java.io.Serializable {
    private com.ovh.RtmPortsIfaceStruct[] listening;

    public RtmPortsStruct() {
    }

    public RtmPortsStruct(
           com.ovh.RtmPortsIfaceStruct[] listening) {
           this.listening = listening;
    }


    /**
     * Gets the listening value for this RtmPortsStruct.
     * 
     * @return listening
     */
    public com.ovh.RtmPortsIfaceStruct[] getListening() {
        return listening;
    }


    /**
     * Sets the listening value for this RtmPortsStruct.
     * 
     * @param listening
     */
    public void setListening(com.ovh.RtmPortsIfaceStruct[] listening) {
        this.listening = listening;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RtmPortsStruct)) return false;
        RtmPortsStruct other = (RtmPortsStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listening==null && other.getListening()==null) || 
             (this.listening!=null &&
              java.util.Arrays.equals(this.listening, other.getListening())));
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
        if (getListening() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListening());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListening(), i);
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
        new org.apache.axis.description.TypeDesc(RtmPortsStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rtmPortsStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listening");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listening"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rtmPortsIfaceStruct"));
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

/**
 * TelephonyLineListReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyLineListReturn  implements java.io.Serializable {
    private com.ovh.TelephonyLineStruct[] link;

    private com.ovh.TelephonyLineStruct[] alias;

    public TelephonyLineListReturn() {
    }

    public TelephonyLineListReturn(
           com.ovh.TelephonyLineStruct[] link,
           com.ovh.TelephonyLineStruct[] alias) {
           this.link = link;
           this.alias = alias;
    }


    /**
     * Gets the link value for this TelephonyLineListReturn.
     * 
     * @return link
     */
    public com.ovh.TelephonyLineStruct[] getLink() {
        return link;
    }


    /**
     * Sets the link value for this TelephonyLineListReturn.
     * 
     * @param link
     */
    public void setLink(com.ovh.TelephonyLineStruct[] link) {
        this.link = link;
    }


    /**
     * Gets the alias value for this TelephonyLineListReturn.
     * 
     * @return alias
     */
    public com.ovh.TelephonyLineStruct[] getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TelephonyLineListReturn.
     * 
     * @param alias
     */
    public void setAlias(com.ovh.TelephonyLineStruct[] alias) {
        this.alias = alias;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyLineListReturn)) return false;
        TelephonyLineListReturn other = (TelephonyLineListReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.link==null && other.getLink()==null) || 
             (this.link!=null &&
              java.util.Arrays.equals(this.link, other.getLink()))) &&
            ((this.alias==null && other.getAlias()==null) || 
             (this.alias!=null &&
              java.util.Arrays.equals(this.alias, other.getAlias())));
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
        if (getLink() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLink());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLink(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAlias() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlias());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlias(), i);
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
        new org.apache.axis.description.TypeDesc(TelephonyLineListReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyLineListReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("link");
        elemField.setXmlName(new javax.xml.namespace.QName("", "link"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyLineStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyLineStruct"));
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

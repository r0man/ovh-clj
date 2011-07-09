/**
 * TelephonyReversmentsDetailsStructReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyReversmentsDetailsStructReturn  implements java.io.Serializable {
    private float totalRecords;

    private com.ovh.TelephonyReversmentsDetailsStruct[] reversementsDetailsStruct;

    public TelephonyReversmentsDetailsStructReturn() {
    }

    public TelephonyReversmentsDetailsStructReturn(
           float totalRecords,
           com.ovh.TelephonyReversmentsDetailsStruct[] reversementsDetailsStruct) {
           this.totalRecords = totalRecords;
           this.reversementsDetailsStruct = reversementsDetailsStruct;
    }


    /**
     * Gets the totalRecords value for this TelephonyReversmentsDetailsStructReturn.
     * 
     * @return totalRecords
     */
    public float getTotalRecords() {
        return totalRecords;
    }


    /**
     * Sets the totalRecords value for this TelephonyReversmentsDetailsStructReturn.
     * 
     * @param totalRecords
     */
    public void setTotalRecords(float totalRecords) {
        this.totalRecords = totalRecords;
    }


    /**
     * Gets the reversementsDetailsStruct value for this TelephonyReversmentsDetailsStructReturn.
     * 
     * @return reversementsDetailsStruct
     */
    public com.ovh.TelephonyReversmentsDetailsStruct[] getReversementsDetailsStruct() {
        return reversementsDetailsStruct;
    }


    /**
     * Sets the reversementsDetailsStruct value for this TelephonyReversmentsDetailsStructReturn.
     * 
     * @param reversementsDetailsStruct
     */
    public void setReversementsDetailsStruct(com.ovh.TelephonyReversmentsDetailsStruct[] reversementsDetailsStruct) {
        this.reversementsDetailsStruct = reversementsDetailsStruct;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyReversmentsDetailsStructReturn)) return false;
        TelephonyReversmentsDetailsStructReturn other = (TelephonyReversmentsDetailsStructReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.totalRecords == other.getTotalRecords() &&
            ((this.reversementsDetailsStruct==null && other.getReversementsDetailsStruct()==null) || 
             (this.reversementsDetailsStruct!=null &&
              java.util.Arrays.equals(this.reversementsDetailsStruct, other.getReversementsDetailsStruct())));
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
        _hashCode += new Float(getTotalRecords()).hashCode();
        if (getReversementsDetailsStruct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReversementsDetailsStruct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReversementsDetailsStruct(), i);
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
        new org.apache.axis.description.TypeDesc(TelephonyReversmentsDetailsStructReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyReversmentsDetailsStructReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reversementsDetailsStruct");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reversementsDetailsStruct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyReversmentsDetailsStruct"));
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

/**
 * TelephonyFaxCampaignStructReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyFaxCampaignStructReturn  implements java.io.Serializable {
    private float totalRecords;

    private com.ovh.TelephonyFaxCampaignStruct[] telephonyfaxCampaignStruct;

    public TelephonyFaxCampaignStructReturn() {
    }

    public TelephonyFaxCampaignStructReturn(
           float totalRecords,
           com.ovh.TelephonyFaxCampaignStruct[] telephonyfaxCampaignStruct) {
           this.totalRecords = totalRecords;
           this.telephonyfaxCampaignStruct = telephonyfaxCampaignStruct;
    }


    /**
     * Gets the totalRecords value for this TelephonyFaxCampaignStructReturn.
     * 
     * @return totalRecords
     */
    public float getTotalRecords() {
        return totalRecords;
    }


    /**
     * Sets the totalRecords value for this TelephonyFaxCampaignStructReturn.
     * 
     * @param totalRecords
     */
    public void setTotalRecords(float totalRecords) {
        this.totalRecords = totalRecords;
    }


    /**
     * Gets the telephonyfaxCampaignStruct value for this TelephonyFaxCampaignStructReturn.
     * 
     * @return telephonyfaxCampaignStruct
     */
    public com.ovh.TelephonyFaxCampaignStruct[] getTelephonyfaxCampaignStruct() {
        return telephonyfaxCampaignStruct;
    }


    /**
     * Sets the telephonyfaxCampaignStruct value for this TelephonyFaxCampaignStructReturn.
     * 
     * @param telephonyfaxCampaignStruct
     */
    public void setTelephonyfaxCampaignStruct(com.ovh.TelephonyFaxCampaignStruct[] telephonyfaxCampaignStruct) {
        this.telephonyfaxCampaignStruct = telephonyfaxCampaignStruct;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyFaxCampaignStructReturn)) return false;
        TelephonyFaxCampaignStructReturn other = (TelephonyFaxCampaignStructReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.totalRecords == other.getTotalRecords() &&
            ((this.telephonyfaxCampaignStruct==null && other.getTelephonyfaxCampaignStruct()==null) || 
             (this.telephonyfaxCampaignStruct!=null &&
              java.util.Arrays.equals(this.telephonyfaxCampaignStruct, other.getTelephonyfaxCampaignStruct())));
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
        if (getTelephonyfaxCampaignStruct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTelephonyfaxCampaignStruct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTelephonyfaxCampaignStruct(), i);
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
        new org.apache.axis.description.TypeDesc(TelephonyFaxCampaignStructReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyFaxCampaignStructReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephonyfaxCampaignStruct");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telephonyfaxCampaignStruct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyFaxCampaignStruct"));
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

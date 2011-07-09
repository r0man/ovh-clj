/**
 * TelephonyCallsSummaryStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyCallsSummaryStruct  implements java.io.Serializable {
    private com.ovh.TelephonyCallsSummaryDetailsStruct pricePlan;

    private com.ovh.TelephonyCallsSummaryDetailsStruct outPlan;

    public TelephonyCallsSummaryStruct() {
    }

    public TelephonyCallsSummaryStruct(
           com.ovh.TelephonyCallsSummaryDetailsStruct pricePlan,
           com.ovh.TelephonyCallsSummaryDetailsStruct outPlan) {
           this.pricePlan = pricePlan;
           this.outPlan = outPlan;
    }


    /**
     * Gets the pricePlan value for this TelephonyCallsSummaryStruct.
     * 
     * @return pricePlan
     */
    public com.ovh.TelephonyCallsSummaryDetailsStruct getPricePlan() {
        return pricePlan;
    }


    /**
     * Sets the pricePlan value for this TelephonyCallsSummaryStruct.
     * 
     * @param pricePlan
     */
    public void setPricePlan(com.ovh.TelephonyCallsSummaryDetailsStruct pricePlan) {
        this.pricePlan = pricePlan;
    }


    /**
     * Gets the outPlan value for this TelephonyCallsSummaryStruct.
     * 
     * @return outPlan
     */
    public com.ovh.TelephonyCallsSummaryDetailsStruct getOutPlan() {
        return outPlan;
    }


    /**
     * Sets the outPlan value for this TelephonyCallsSummaryStruct.
     * 
     * @param outPlan
     */
    public void setOutPlan(com.ovh.TelephonyCallsSummaryDetailsStruct outPlan) {
        this.outPlan = outPlan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyCallsSummaryStruct)) return false;
        TelephonyCallsSummaryStruct other = (TelephonyCallsSummaryStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pricePlan==null && other.getPricePlan()==null) || 
             (this.pricePlan!=null &&
              this.pricePlan.equals(other.getPricePlan()))) &&
            ((this.outPlan==null && other.getOutPlan()==null) || 
             (this.outPlan!=null &&
              this.outPlan.equals(other.getOutPlan())));
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
        if (getPricePlan() != null) {
            _hashCode += getPricePlan().hashCode();
        }
        if (getOutPlan() != null) {
            _hashCode += getOutPlan().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyCallsSummaryStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyCallsSummaryStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricePlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pricePlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyCallsSummaryDetailsStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyCallsSummaryDetailsStruct"));
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

/**
 * TelephonyFaxSummaryDetailsStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyFaxSummaryDetailsStruct  implements java.io.Serializable {
    private int count;

    private int pages;

    private float priceWithoutVAT;

    public TelephonyFaxSummaryDetailsStruct() {
    }

    public TelephonyFaxSummaryDetailsStruct(
           int count,
           int pages,
           float priceWithoutVAT) {
           this.count = count;
           this.pages = pages;
           this.priceWithoutVAT = priceWithoutVAT;
    }


    /**
     * Gets the count value for this TelephonyFaxSummaryDetailsStruct.
     * 
     * @return count
     */
    public int getCount() {
        return count;
    }


    /**
     * Sets the count value for this TelephonyFaxSummaryDetailsStruct.
     * 
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }


    /**
     * Gets the pages value for this TelephonyFaxSummaryDetailsStruct.
     * 
     * @return pages
     */
    public int getPages() {
        return pages;
    }


    /**
     * Sets the pages value for this TelephonyFaxSummaryDetailsStruct.
     * 
     * @param pages
     */
    public void setPages(int pages) {
        this.pages = pages;
    }


    /**
     * Gets the priceWithoutVAT value for this TelephonyFaxSummaryDetailsStruct.
     * 
     * @return priceWithoutVAT
     */
    public float getPriceWithoutVAT() {
        return priceWithoutVAT;
    }


    /**
     * Sets the priceWithoutVAT value for this TelephonyFaxSummaryDetailsStruct.
     * 
     * @param priceWithoutVAT
     */
    public void setPriceWithoutVAT(float priceWithoutVAT) {
        this.priceWithoutVAT = priceWithoutVAT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyFaxSummaryDetailsStruct)) return false;
        TelephonyFaxSummaryDetailsStruct other = (TelephonyFaxSummaryDetailsStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.count == other.getCount() &&
            this.pages == other.getPages() &&
            this.priceWithoutVAT == other.getPriceWithoutVAT();
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
        _hashCode += getCount();
        _hashCode += getPages();
        _hashCode += new Float(getPriceWithoutVAT()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyFaxSummaryDetailsStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyFaxSummaryDetailsStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("", "count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceWithoutVAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceWithoutVAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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

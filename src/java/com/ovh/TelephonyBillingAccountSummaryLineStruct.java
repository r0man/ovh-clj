/**
 * TelephonyBillingAccountSummaryLineStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyBillingAccountSummaryLineStruct  implements java.io.Serializable {
    private java.lang.String line;

    private java.lang.String phoneNumber;

    private com.ovh.TelephonyCallsSummaryStruct fixe;

    private com.ovh.TelephonyCallsSummaryStruct special;

    private com.ovh.TelephonyCallsSummaryStruct mobile;

    private com.ovh.TelephonyFaxSummaryStruct fax;

    public TelephonyBillingAccountSummaryLineStruct() {
    }

    public TelephonyBillingAccountSummaryLineStruct(
           java.lang.String line,
           java.lang.String phoneNumber,
           com.ovh.TelephonyCallsSummaryStruct fixe,
           com.ovh.TelephonyCallsSummaryStruct special,
           com.ovh.TelephonyCallsSummaryStruct mobile,
           com.ovh.TelephonyFaxSummaryStruct fax) {
           this.line = line;
           this.phoneNumber = phoneNumber;
           this.fixe = fixe;
           this.special = special;
           this.mobile = mobile;
           this.fax = fax;
    }


    /**
     * Gets the line value for this TelephonyBillingAccountSummaryLineStruct.
     * 
     * @return line
     */
    public java.lang.String getLine() {
        return line;
    }


    /**
     * Sets the line value for this TelephonyBillingAccountSummaryLineStruct.
     * 
     * @param line
     */
    public void setLine(java.lang.String line) {
        this.line = line;
    }


    /**
     * Gets the phoneNumber value for this TelephonyBillingAccountSummaryLineStruct.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this TelephonyBillingAccountSummaryLineStruct.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the fixe value for this TelephonyBillingAccountSummaryLineStruct.
     * 
     * @return fixe
     */
    public com.ovh.TelephonyCallsSummaryStruct getFixe() {
        return fixe;
    }


    /**
     * Sets the fixe value for this TelephonyBillingAccountSummaryLineStruct.
     * 
     * @param fixe
     */
    public void setFixe(com.ovh.TelephonyCallsSummaryStruct fixe) {
        this.fixe = fixe;
    }


    /**
     * Gets the special value for this TelephonyBillingAccountSummaryLineStruct.
     * 
     * @return special
     */
    public com.ovh.TelephonyCallsSummaryStruct getSpecial() {
        return special;
    }


    /**
     * Sets the special value for this TelephonyBillingAccountSummaryLineStruct.
     * 
     * @param special
     */
    public void setSpecial(com.ovh.TelephonyCallsSummaryStruct special) {
        this.special = special;
    }


    /**
     * Gets the mobile value for this TelephonyBillingAccountSummaryLineStruct.
     * 
     * @return mobile
     */
    public com.ovh.TelephonyCallsSummaryStruct getMobile() {
        return mobile;
    }


    /**
     * Sets the mobile value for this TelephonyBillingAccountSummaryLineStruct.
     * 
     * @param mobile
     */
    public void setMobile(com.ovh.TelephonyCallsSummaryStruct mobile) {
        this.mobile = mobile;
    }


    /**
     * Gets the fax value for this TelephonyBillingAccountSummaryLineStruct.
     * 
     * @return fax
     */
    public com.ovh.TelephonyFaxSummaryStruct getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this TelephonyBillingAccountSummaryLineStruct.
     * 
     * @param fax
     */
    public void setFax(com.ovh.TelephonyFaxSummaryStruct fax) {
        this.fax = fax;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyBillingAccountSummaryLineStruct)) return false;
        TelephonyBillingAccountSummaryLineStruct other = (TelephonyBillingAccountSummaryLineStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.line==null && other.getLine()==null) || 
             (this.line!=null &&
              this.line.equals(other.getLine()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.fixe==null && other.getFixe()==null) || 
             (this.fixe!=null &&
              this.fixe.equals(other.getFixe()))) &&
            ((this.special==null && other.getSpecial()==null) || 
             (this.special!=null &&
              this.special.equals(other.getSpecial()))) &&
            ((this.mobile==null && other.getMobile()==null) || 
             (this.mobile!=null &&
              this.mobile.equals(other.getMobile()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax())));
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
        if (getLine() != null) {
            _hashCode += getLine().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getFixe() != null) {
            _hashCode += getFixe().hashCode();
        }
        if (getSpecial() != null) {
            _hashCode += getSpecial().hashCode();
        }
        if (getMobile() != null) {
            _hashCode += getMobile().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyBillingAccountSummaryLineStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyBillingAccountSummaryLineStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new javax.xml.namespace.QName("", "line"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fixe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyCallsSummaryStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("special");
        elemField.setXmlName(new javax.xml.namespace.QName("", "special"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyCallsSummaryStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyCallsSummaryStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyFaxSummaryStruct"));
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

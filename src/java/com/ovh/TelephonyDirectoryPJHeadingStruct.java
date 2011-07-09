/**
 * TelephonyDirectoryPJHeadingStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyDirectoryPJHeadingStruct  implements java.io.Serializable {
    private java.lang.String codePJ;

    private java.lang.String labelPJ;

    private java.lang.String isAssociatedWithAPE;

    public TelephonyDirectoryPJHeadingStruct() {
    }

    public TelephonyDirectoryPJHeadingStruct(
           java.lang.String codePJ,
           java.lang.String labelPJ,
           java.lang.String isAssociatedWithAPE) {
           this.codePJ = codePJ;
           this.labelPJ = labelPJ;
           this.isAssociatedWithAPE = isAssociatedWithAPE;
    }


    /**
     * Gets the codePJ value for this TelephonyDirectoryPJHeadingStruct.
     * 
     * @return codePJ
     */
    public java.lang.String getCodePJ() {
        return codePJ;
    }


    /**
     * Sets the codePJ value for this TelephonyDirectoryPJHeadingStruct.
     * 
     * @param codePJ
     */
    public void setCodePJ(java.lang.String codePJ) {
        this.codePJ = codePJ;
    }


    /**
     * Gets the labelPJ value for this TelephonyDirectoryPJHeadingStruct.
     * 
     * @return labelPJ
     */
    public java.lang.String getLabelPJ() {
        return labelPJ;
    }


    /**
     * Sets the labelPJ value for this TelephonyDirectoryPJHeadingStruct.
     * 
     * @param labelPJ
     */
    public void setLabelPJ(java.lang.String labelPJ) {
        this.labelPJ = labelPJ;
    }


    /**
     * Gets the isAssociatedWithAPE value for this TelephonyDirectoryPJHeadingStruct.
     * 
     * @return isAssociatedWithAPE
     */
    public java.lang.String getIsAssociatedWithAPE() {
        return isAssociatedWithAPE;
    }


    /**
     * Sets the isAssociatedWithAPE value for this TelephonyDirectoryPJHeadingStruct.
     * 
     * @param isAssociatedWithAPE
     */
    public void setIsAssociatedWithAPE(java.lang.String isAssociatedWithAPE) {
        this.isAssociatedWithAPE = isAssociatedWithAPE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyDirectoryPJHeadingStruct)) return false;
        TelephonyDirectoryPJHeadingStruct other = (TelephonyDirectoryPJHeadingStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codePJ==null && other.getCodePJ()==null) || 
             (this.codePJ!=null &&
              this.codePJ.equals(other.getCodePJ()))) &&
            ((this.labelPJ==null && other.getLabelPJ()==null) || 
             (this.labelPJ!=null &&
              this.labelPJ.equals(other.getLabelPJ()))) &&
            ((this.isAssociatedWithAPE==null && other.getIsAssociatedWithAPE()==null) || 
             (this.isAssociatedWithAPE!=null &&
              this.isAssociatedWithAPE.equals(other.getIsAssociatedWithAPE())));
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
        if (getCodePJ() != null) {
            _hashCode += getCodePJ().hashCode();
        }
        if (getLabelPJ() != null) {
            _hashCode += getLabelPJ().hashCode();
        }
        if (getIsAssociatedWithAPE() != null) {
            _hashCode += getIsAssociatedWithAPE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyDirectoryPJHeadingStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyDirectoryPJHeadingStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codePJ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codePJ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelPJ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "labelPJ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAssociatedWithAPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isAssociatedWithAPE"));
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

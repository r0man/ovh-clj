/**
 * DedicatedBasicInstallProgressReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class DedicatedBasicInstallProgressReturn  implements java.io.Serializable {
    private com.ovh.DedicatedBasicInstallProgressStruct[] progress;

    public DedicatedBasicInstallProgressReturn() {
    }

    public DedicatedBasicInstallProgressReturn(
           com.ovh.DedicatedBasicInstallProgressStruct[] progress) {
           this.progress = progress;
    }


    /**
     * Gets the progress value for this DedicatedBasicInstallProgressReturn.
     * 
     * @return progress
     */
    public com.ovh.DedicatedBasicInstallProgressStruct[] getProgress() {
        return progress;
    }


    /**
     * Sets the progress value for this DedicatedBasicInstallProgressReturn.
     * 
     * @param progress
     */
    public void setProgress(com.ovh.DedicatedBasicInstallProgressStruct[] progress) {
        this.progress = progress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DedicatedBasicInstallProgressReturn)) return false;
        DedicatedBasicInstallProgressReturn other = (DedicatedBasicInstallProgressReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.progress==null && other.getProgress()==null) || 
             (this.progress!=null &&
              java.util.Arrays.equals(this.progress, other.getProgress())));
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
        if (getProgress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProgress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProgress(), i);
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
        new org.apache.axis.description.TypeDesc(DedicatedBasicInstallProgressReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedBasicInstallProgressReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "progress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedBasicInstallProgressStruct"));
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

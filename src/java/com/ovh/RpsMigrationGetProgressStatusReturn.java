/**
 * RpsMigrationGetProgressStatusReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class RpsMigrationGetProgressStatusReturn  implements java.io.Serializable {
    private com.ovh.RpsMigrationGetProgressStatusStepStruct step1;

    private com.ovh.RpsMigrationGetProgressStatusStepStruct step2;

    private com.ovh.RpsMigrationGetProgressStatusStepStruct step3;

    private com.ovh.RpsMigrationGetProgressStatusStepStruct step4;

    public RpsMigrationGetProgressStatusReturn() {
    }

    public RpsMigrationGetProgressStatusReturn(
           com.ovh.RpsMigrationGetProgressStatusStepStruct step1,
           com.ovh.RpsMigrationGetProgressStatusStepStruct step2,
           com.ovh.RpsMigrationGetProgressStatusStepStruct step3,
           com.ovh.RpsMigrationGetProgressStatusStepStruct step4) {
           this.step1 = step1;
           this.step2 = step2;
           this.step3 = step3;
           this.step4 = step4;
    }


    /**
     * Gets the step1 value for this RpsMigrationGetProgressStatusReturn.
     * 
     * @return step1
     */
    public com.ovh.RpsMigrationGetProgressStatusStepStruct getStep1() {
        return step1;
    }


    /**
     * Sets the step1 value for this RpsMigrationGetProgressStatusReturn.
     * 
     * @param step1
     */
    public void setStep1(com.ovh.RpsMigrationGetProgressStatusStepStruct step1) {
        this.step1 = step1;
    }


    /**
     * Gets the step2 value for this RpsMigrationGetProgressStatusReturn.
     * 
     * @return step2
     */
    public com.ovh.RpsMigrationGetProgressStatusStepStruct getStep2() {
        return step2;
    }


    /**
     * Sets the step2 value for this RpsMigrationGetProgressStatusReturn.
     * 
     * @param step2
     */
    public void setStep2(com.ovh.RpsMigrationGetProgressStatusStepStruct step2) {
        this.step2 = step2;
    }


    /**
     * Gets the step3 value for this RpsMigrationGetProgressStatusReturn.
     * 
     * @return step3
     */
    public com.ovh.RpsMigrationGetProgressStatusStepStruct getStep3() {
        return step3;
    }


    /**
     * Sets the step3 value for this RpsMigrationGetProgressStatusReturn.
     * 
     * @param step3
     */
    public void setStep3(com.ovh.RpsMigrationGetProgressStatusStepStruct step3) {
        this.step3 = step3;
    }


    /**
     * Gets the step4 value for this RpsMigrationGetProgressStatusReturn.
     * 
     * @return step4
     */
    public com.ovh.RpsMigrationGetProgressStatusStepStruct getStep4() {
        return step4;
    }


    /**
     * Sets the step4 value for this RpsMigrationGetProgressStatusReturn.
     * 
     * @param step4
     */
    public void setStep4(com.ovh.RpsMigrationGetProgressStatusStepStruct step4) {
        this.step4 = step4;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RpsMigrationGetProgressStatusReturn)) return false;
        RpsMigrationGetProgressStatusReturn other = (RpsMigrationGetProgressStatusReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.step1==null && other.getStep1()==null) || 
             (this.step1!=null &&
              this.step1.equals(other.getStep1()))) &&
            ((this.step2==null && other.getStep2()==null) || 
             (this.step2!=null &&
              this.step2.equals(other.getStep2()))) &&
            ((this.step3==null && other.getStep3()==null) || 
             (this.step3!=null &&
              this.step3.equals(other.getStep3()))) &&
            ((this.step4==null && other.getStep4()==null) || 
             (this.step4!=null &&
              this.step4.equals(other.getStep4())));
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
        if (getStep1() != null) {
            _hashCode += getStep1().hashCode();
        }
        if (getStep2() != null) {
            _hashCode += getStep2().hashCode();
        }
        if (getStep3() != null) {
            _hashCode += getStep3().hashCode();
        }
        if (getStep4() != null) {
            _hashCode += getStep4().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RpsMigrationGetProgressStatusReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rpsMigrationGetProgressStatusReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("step1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "step1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rpsMigrationGetProgressStatusStepStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("step2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "step2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rpsMigrationGetProgressStatusStepStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("step3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "step3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rpsMigrationGetProgressStatusStepStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("step4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "step4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rpsMigrationGetProgressStatusStepStruct"));
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

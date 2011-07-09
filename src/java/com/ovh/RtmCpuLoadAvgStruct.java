/**
 * RtmCpuLoadAvgStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class RtmCpuLoadAvgStruct  implements java.io.Serializable {
    private java.lang.String loadavg1;

    private java.lang.String loadavg5;

    private java.lang.String loadavg15;

    public RtmCpuLoadAvgStruct() {
    }

    public RtmCpuLoadAvgStruct(
           java.lang.String loadavg1,
           java.lang.String loadavg5,
           java.lang.String loadavg15) {
           this.loadavg1 = loadavg1;
           this.loadavg5 = loadavg5;
           this.loadavg15 = loadavg15;
    }


    /**
     * Gets the loadavg1 value for this RtmCpuLoadAvgStruct.
     * 
     * @return loadavg1
     */
    public java.lang.String getLoadavg1() {
        return loadavg1;
    }


    /**
     * Sets the loadavg1 value for this RtmCpuLoadAvgStruct.
     * 
     * @param loadavg1
     */
    public void setLoadavg1(java.lang.String loadavg1) {
        this.loadavg1 = loadavg1;
    }


    /**
     * Gets the loadavg5 value for this RtmCpuLoadAvgStruct.
     * 
     * @return loadavg5
     */
    public java.lang.String getLoadavg5() {
        return loadavg5;
    }


    /**
     * Sets the loadavg5 value for this RtmCpuLoadAvgStruct.
     * 
     * @param loadavg5
     */
    public void setLoadavg5(java.lang.String loadavg5) {
        this.loadavg5 = loadavg5;
    }


    /**
     * Gets the loadavg15 value for this RtmCpuLoadAvgStruct.
     * 
     * @return loadavg15
     */
    public java.lang.String getLoadavg15() {
        return loadavg15;
    }


    /**
     * Sets the loadavg15 value for this RtmCpuLoadAvgStruct.
     * 
     * @param loadavg15
     */
    public void setLoadavg15(java.lang.String loadavg15) {
        this.loadavg15 = loadavg15;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RtmCpuLoadAvgStruct)) return false;
        RtmCpuLoadAvgStruct other = (RtmCpuLoadAvgStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.loadavg1==null && other.getLoadavg1()==null) || 
             (this.loadavg1!=null &&
              this.loadavg1.equals(other.getLoadavg1()))) &&
            ((this.loadavg5==null && other.getLoadavg5()==null) || 
             (this.loadavg5!=null &&
              this.loadavg5.equals(other.getLoadavg5()))) &&
            ((this.loadavg15==null && other.getLoadavg15()==null) || 
             (this.loadavg15!=null &&
              this.loadavg15.equals(other.getLoadavg15())));
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
        if (getLoadavg1() != null) {
            _hashCode += getLoadavg1().hashCode();
        }
        if (getLoadavg5() != null) {
            _hashCode += getLoadavg5().hashCode();
        }
        if (getLoadavg15() != null) {
            _hashCode += getLoadavg15().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RtmCpuLoadAvgStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rtmCpuLoadAvgStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadavg1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loadavg1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadavg5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loadavg5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadavg15");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loadavg15"));
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

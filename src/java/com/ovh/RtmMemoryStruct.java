/**
 * RtmMemoryStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class RtmMemoryStruct  implements java.io.Serializable {
    private int memusage;

    private int swapusage;

    private com.ovh.RtmMemoryModuleStruct[] modules;

    public RtmMemoryStruct() {
    }

    public RtmMemoryStruct(
           int memusage,
           int swapusage,
           com.ovh.RtmMemoryModuleStruct[] modules) {
           this.memusage = memusage;
           this.swapusage = swapusage;
           this.modules = modules;
    }


    /**
     * Gets the memusage value for this RtmMemoryStruct.
     * 
     * @return memusage
     */
    public int getMemusage() {
        return memusage;
    }


    /**
     * Sets the memusage value for this RtmMemoryStruct.
     * 
     * @param memusage
     */
    public void setMemusage(int memusage) {
        this.memusage = memusage;
    }


    /**
     * Gets the swapusage value for this RtmMemoryStruct.
     * 
     * @return swapusage
     */
    public int getSwapusage() {
        return swapusage;
    }


    /**
     * Sets the swapusage value for this RtmMemoryStruct.
     * 
     * @param swapusage
     */
    public void setSwapusage(int swapusage) {
        this.swapusage = swapusage;
    }


    /**
     * Gets the modules value for this RtmMemoryStruct.
     * 
     * @return modules
     */
    public com.ovh.RtmMemoryModuleStruct[] getModules() {
        return modules;
    }


    /**
     * Sets the modules value for this RtmMemoryStruct.
     * 
     * @param modules
     */
    public void setModules(com.ovh.RtmMemoryModuleStruct[] modules) {
        this.modules = modules;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RtmMemoryStruct)) return false;
        RtmMemoryStruct other = (RtmMemoryStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.memusage == other.getMemusage() &&
            this.swapusage == other.getSwapusage() &&
            ((this.modules==null && other.getModules()==null) || 
             (this.modules!=null &&
              java.util.Arrays.equals(this.modules, other.getModules())));
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
        _hashCode += getMemusage();
        _hashCode += getSwapusage();
        if (getModules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModules(), i);
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
        new org.apache.axis.description.TypeDesc(RtmMemoryStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rtmMemoryStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memusage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "memusage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swapusage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "swapusage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modules");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rtmMemoryModuleStruct"));
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
